package hu.bme.mit.mdsd.pineapple.ui.buttons.handlers;

import hu.bme.mit.mdsd.pineapple.language.DNLanguageStandaloneSetup;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.EcoreUtil2;

import dataflownet.DataflowSystem;

public class ModelConverter extends AbstractDataflowNetHandler {

    @Override
    protected void handleFile(ExecutionEvent event, IFile file) {
        String path = file.getLocation().toOSString();

        new DNLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();

        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.getResource(URI.createFileURI(path), true);

        EcoreUtil.resolveAll(resource);

        EObject eobject = resource.getContents().get(0);
        EObject eobject2 = EcoreUtil2.copy(eobject);

        DataflowSystem dataflowSystem = (DataflowSystem) eobject2;

        // Registering a resource factory for the extension "dataflownet"
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("dataflownet", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet saveResourceSet = new ResourceSetImpl();

        // Set the save name
        URI dstURI = URI.createFileURI(path).trimFileExtension().appendFileExtension("dataflownet");

        // Create a resource then add the model to it
        Resource saveResource = saveResourceSet.createResource(dstURI);
        saveResource.getContents().add(dataflowSystem);

        try {
            // Now save the model with the added content.
            saveResource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            throw new RuntimeException("Exception occurred while saving model!", e);
        }

    }

}
