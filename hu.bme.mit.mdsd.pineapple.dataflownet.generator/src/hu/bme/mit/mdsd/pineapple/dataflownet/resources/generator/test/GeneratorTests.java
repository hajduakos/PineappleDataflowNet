package hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator.test;

import hu.bme.mit.mdsd.pineapple.dataflownet.resources.GeneratorHelper;
import hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator.DataflowNetGenerator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Ignore;
import org.junit.Test;

public class GeneratorTests {

	
	// TODO write model path here
	private static final String MODELPATH = "D:\\workspaces\\runtime-New_configuration\\mdsd\\house_v6_proba.dataflownet";

    private static final String PROJECT_NAME = "Hello";

    
	@Test
	public void testGenerator() {

		// load resource
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createFileURI(MODELPATH), true);
		
		DataflowNetGenerator generator = new DataflowNetGenerator();
		generator.generate(resource);
	}
	
	@Ignore
    @Test
    public void testHelper() throws CoreException {
        GeneratorHelper.createProject(PROJECT_NAME);
        GeneratorHelper.createJavaFile(PROJECT_NAME, "hu.bme.mit", "test", false, "// TODO");
        GeneratorHelper.createJavaFile(PROJECT_NAME, "hu.bme.mit", "test_derived", true, "// TODO");
    }
	
}
