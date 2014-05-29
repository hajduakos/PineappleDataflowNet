package hu.bme.mit.mdsd.pineapple.ui.buttons.handlers;

import hu.bme.mit.pineapple.mdsd.dataflownet.validation.Constraints;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.HasNoParentMatch;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.IllegalAccessToFiringRuleMatch;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.InvalidTokenForFiringRuleOnChannelMatch;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.InvalidTransitionBetweenStatesMatch;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.NameInvalidJavaMatch;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.NameUniquenessInASystemMatch;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.ReferenceNotOwnedOrIOChannelsMatch;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.TypeNameInvalidJavaMatch;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.WrongBooleanValueMatch;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.WrongDoubleValueMatch;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.WrongIntegerValueMatch;
import hu.bme.mit.pineapple.mdsd.dataflownet.validation.WrongTokenValueNumberSimpleMatch;

import java.util.Collection;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import dataflownet.DataflowSystem;

public class ValidateModelHandler extends AbstractDataflowNetHandler {

    @Override
    protected void handleFile(ExecutionEvent event, IFile file) {

        String path = file.getLocation().toOSString();

        ResourceSet resourceSet = new ResourceSetImpl();
        final Resource resource = resourceSet.getResource(URI.createFileURI(path), true);

        EObject content = resource.getContents().get(0);

        if (content instanceof DataflowSystem) {
            DataflowSystem dataflowSystem = (DataflowSystem) content;

            Diagnostic diagnostic = Diagnostician.INSTANCE.validate(dataflowSystem);
            boolean isValidDefault = diagnostic.getSeverity() == Diagnostic.OK;

            boolean isValidIncQuery = false;
            if (isValidDefault) {
                isValidIncQuery = validateModelWithIncQuery(dataflowSystem);
            }

            Shell activeShell = HandlerUtil.getActiveShell(event);

            int style = 0;
            String title = "Validation results";
            String message;
            if (isValidDefault && isValidIncQuery) {
                style = SWT.ICON_INFORMATION | SWT.OK;
                message = "Both the inbuilt EMF validation and the IncQuery aided validation are completed succesfully.";
            } else {
                style = SWT.ICON_ERROR | SWT.OK;
                if (!isValidDefault && isValidIncQuery) {
                    message = "The inbuilt EMF validation failed, but the IncQuery aided validation completed succesfully.";
                } else if (isValidDefault && !isValidIncQuery) {
                    message = "The inbuilt EMF validation shows no errors, but the IncQuery aided validation returned with errors.";
                } else {
                    message = "Both the inbuilt EMF validation and the IncQuery aided validation returned errors.";
                }
            }

            MessageBox dialog = new MessageBox(activeShell, style);
            dialog.setText(title);
            dialog.setMessage(message);
            dialog.open();

        } else {
            // TODO indicate error - however this should never happen, while the command only appears on .dataflownet
            // files.
        }

    }

    @SuppressWarnings("unchecked")
    public static boolean validateModelWithIncQuery(DataflowSystem dataflowSystem) {

        IncQueryEngine engine = null;
        try {
            engine = IncQueryEngine.on(dataflowSystem);
        } catch (IncQueryException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Constraints constraints = null;
		try {
			constraints = Constraints.instance();
		} catch (IncQueryException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        Collection allMatches = null;

        try {
        	allMatches = constraints.getDuplicateNamesOfSiblings(engine).getAllMatches();
            Collection<HasNoParentMatch> allMatches3 = constraints.getHasNoParent(engine).getAllMatches();
            allMatches.addAll(allMatches3);
            Collection<IllegalAccessToFiringRuleMatch> allMatches4 = constraints.getIllegalAccessToFiringRule(engine).getAllMatches();
            allMatches.addAll(allMatches4);
            Collection<InvalidTokenForFiringRuleOnChannelMatch> allMatches5 = constraints.getInvalidTokenForFiringRuleOnChannel(engine).getAllMatches();
            allMatches.addAll(allMatches5);
            Collection<InvalidTransitionBetweenStatesMatch> allMatches6 = constraints.getInvalidTransitionBetweenStates(engine).getAllMatches();
            allMatches.addAll(allMatches6);
            Collection<NameUniquenessInASystemMatch> allMatches7 = constraints.getNameUniquenessInASystem(engine).getAllMatches();
            allMatches.addAll(allMatches7);
            Collection<ReferenceNotOwnedOrIOChannelsMatch> allMatches8 = constraints.getReferenceNotOwnedOrIOChannels(engine).getAllMatches();
            allMatches.addAll(allMatches8);
            Collection<WrongBooleanValueMatch> allMatches9 = constraints.getWrongBooleanValue(engine).getAllMatches();
            allMatches.addAll(allMatches9);
            Collection<WrongDoubleValueMatch> allMatches10 = constraints.getWrongDoubleValue(engine).getAllMatches();
            allMatches.addAll(allMatches10);
            Collection<WrongIntegerValueMatch> allMatches11 = constraints.getWrongIntegerValue(engine).getAllMatches();
            allMatches.addAll(allMatches11);
            Collection<WrongTokenValueNumberSimpleMatch> allMatches12 = constraints.getWrongTokenValueNumberSimple(engine).getAllMatches();
            allMatches.addAll(allMatches12);
            Collection<NameInvalidJavaMatch> allMatches13 = constraints.getNameInvalidJava(engine).getAllMatches();
            allMatches.addAll(allMatches13);
            Collection<TypeNameInvalidJavaMatch> allMatches14 = constraints.getTypeNameInvalidJava(engine).getAllMatches();
            allMatches.addAll(allMatches14); 

        } catch (IncQueryException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return allMatches.size() == 0;
    }

}
