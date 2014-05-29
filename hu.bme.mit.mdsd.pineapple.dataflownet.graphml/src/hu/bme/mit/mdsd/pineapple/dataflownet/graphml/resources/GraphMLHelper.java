package hu.bme.mit.mdsd.pineapple.dataflownet.graphml.resources;

import hu.bme.mit.mdsd.pineapple.dataflownet.resources.GeneratorHelper;

import java.io.File;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;


/**
 * Helper class for GraphML generation
 * @author Ákos
 *
 */
public class GraphMLHelper {
	
	/**
	 * Output directory
	 */
	private static final String OUTPUT = "output";
	/**
	 * Extension for the GrapML file
	 */
	private static final String EXTENSION = ".graphml";

	/**
	 * Create file in a directory called 'output' at the root of the project of the resource
	 * @param original Resource
	 * @param name Filename
	 * @param content File content
	 * @throws CoreException
	 */
	public static void createFile(Resource original, String name, CharSequence content) throws CoreException{

		String projName = original.getURI().toString().substring(ResourcesPlugin.getWorkspace().getRoot().getLocationURI().toString().length()+1);
		projName = projName.substring(0,projName.indexOf('/'));

		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projName);
		IPath location = project.getLocation();
        File sourceDir = new File(location.append(OUTPUT).toOSString());
        if(!sourceDir.exists()){
            sourceDir.mkdir();
        }
        project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		IFolder outFolder = project.getFolder(OUTPUT);
				
		GeneratorHelper.createFile(outFolder, name + EXTENSION, false, content);
	}
}
