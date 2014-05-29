package hu.bme.mit.mdsd.pineapple.ui.buttons.handlers;

import hu.bme.mit.mdsd.pineapple.dataflownet.graphml.resources.generator.DataflowNetGenerator;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import dataflownet.DataflowSystem;

public class GenerateGraphMLRepresentationHandler extends AbstractDataflowNetHandler {

    @Override
    protected void handleFile(ExecutionEvent event, IFile file) {
        String path = file.getLocation().toOSString();

        ResourceSet resourceSet = new ResourceSetImpl();
        final Resource resource = resourceSet.getResource(URI.createFileURI(path), true);
        final DataflowNetGenerator generator = new DataflowNetGenerator();

        DataflowSystem dataflowSystem = (DataflowSystem) resource.getContents().get(0);
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(dataflowSystem);
        boolean isValidDefault = diagnostic.getSeverity() == Diagnostic.OK;
        boolean isSuccessfullyValidatedModelWithIncQuery = false;
        if (isValidDefault) {
            isSuccessfullyValidatedModelWithIncQuery = ValidateModelHandler.validateModelWithIncQuery(dataflowSystem);
        }

        if (isSuccessfullyValidatedModelWithIncQuery && isValidDefault) {

            Job job = new Job("Generating Java code for model file " + file.getName() + "...") {
                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    try {
                        generator.generate(resource);
                    } catch (Exception e) {
                        System.err.println("Error occured while generating graphML. Error message: " + e.getMessage());
                    }

                    return Status.OK_STATUS;
                }
            };

            job.setUser(true);
            job.schedule();
        } else {
            Shell activeShell = HandlerUtil.getActiveShell(event);
            int style = SWT.ICON_ERROR | SWT.OK;
            String title = "Validation results";
            String message = "The graphML generation cannot be started while the model is not valid.";

            MessageBox dialog = new MessageBox(activeShell, style);
            dialog.setText(title);
            dialog.setMessage(message);
            dialog.open();
        }
    }

}
