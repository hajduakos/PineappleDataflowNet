package hu.bme.mit.mdsd.pineapple.dataflownet.ui.generator.helper;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;


/**
 * A helper class with static methods for file and folder creation for the templates.
 * 
 * @author burm
 */
public class GeneratorHelper {

    private static final String EXPORT_PACKAGE = "hu.bme.mit.mdsd.pineapple.dataflownet.process.ui";
	private static final String LAST_ADDED_DEPENDENCY = "hu.bme.mit.mdsd.pineapple.dataflownet.bundle";
    private static final String SOURCE_FOLDER_NAME = "src";
    private static final String DERIVED_SOURCE_FOLDER_NAME = "src-gen";
    
	private static final Collection<String> REQUIRED_BUNDLES;
	static{
		REQUIRED_BUNDLES = new ArrayList<>();
		REQUIRED_BUNDLES.add("org.eclipse.ui");
		REQUIRED_BUNDLES.add("org.eclipse.core.runtime");
		//REQUIRED_BUNDLES.add("hu.bme.mit.mdsd.pineapple.dataflownet.process");
	}

    /**
     * Creates a java file into the project that the parameter <code>nextTo</code> is in. The file is placed into the
     * folder named <code>src</code>, which is expected to be exist. It creates the folder composition from the
     * namespace hiearchy, so for example the namespace <code>hu.bme.mit.jpadatagenerator.helper</code> creates the
     * <code>src/hu/bme/mit/jpadatagenerator/helper</code> folder if it isn't existed previously. The java file named
     * <code>&lt;name&gt;.java</code> will be placed into this folder with the content defined by the
     * <code>content</code> parameter, where <code>&lt;name&gt;</code> comes from the parameter <code>name</code>. The
     * method only replaces a derived file.
     * 
     * @param nextTo
     *            A resource which defines the target project of the file creation.
     * @param namespace
     *            The namespace of the new java document.
     * @param name
     *            The name of the new java document and the new file.
     * @param derived
     *            The derived property of the new file.
     * @param content
     *            The content of the new file.
     * @return Returns with the created file.
     * @throws CoreException
     *             If the folder named src doesn't exists or one of the folder or the java file itself can not be
     *             created.
     */
    public static IFile createJavaFile(String projectName, String namespace, String name, Boolean derived,
            CharSequence content) throws CoreException {
        // Getting the project from the name described in the URI of the resource
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
         
        
        checkOrCreateSourceFolders(project);
        // Getting the default source folder in the project called "src" or "src-gen"

        IFolder targetFolder;
        if (derived) {
            targetFolder = project.getFolder(DERIVED_SOURCE_FOLDER_NAME);
        } else {
            targetFolder = project.getFolder(SOURCE_FOLDER_NAME);
        }

        // The namespace hierarchy compiled into folder composition:
        // Every element in the namespace generates a new folder.
        String[] namespaceElements = namespace.split("\\.");
        for (String namespaceElement : namespaceElements) {
            targetFolder = getOrCreateFolder(targetFolder, namespaceElement);
        }

        // At the end a new java file is created in the target folder.
        return createFile(targetFolder, name + ".java", derived, content);
    }


    /**
     * Returns a folder with the same name as <code>newFolder</code> located in <code>newFolder</code>. The function
     * create such folder if it is necessary.
     * 
     * @param container
     *            The container folder.
     * @param newFolder
     *            The name of the folder needed.
     * @return A folder in the <code>container</code> named <code>newFolder</code>.
     * @throws CoreException
     *             If the folder can not be created.
     */
    public static IFolder getOrCreateFolder(IFolder container, String newFolder) throws CoreException {
        // Referring a folder by a relative name.
        IFolder folder = container.getFolder(newFolder);

        // If the folder doesn't exists create it.
        if (!folder.exists()) {
            IProgressMonitor monitor = new NullProgressMonitor();
            folder.create(true, true, monitor);
        }

        // Return with the folder.
        return folder;
    }

    /**
     * Creates a file named <code>name</code> into the folder <code>folder</code>with the content <code>content</code>
     * and sets the derived. It overwrites only derived files and it doesn't delete anything editable by the user.
     * 
     * @param folder
     *            The target folder.
     * @param name
     *            The name of the new file.
     * @param derived
     *            The derived property of the new file.
     * @param content
     *            The content of the new file.
     * @return The new file.
     * @throws CoreException
     *             If an existing file can not be deleted, the new file can not be created or the derived property can
     *             not be set.
     */
    public static IFile createFile(IFolder folder, String name, boolean derived, CharSequence content)
            throws CoreException {
        // Referring a file by a relative name.
        IFile file = folder.getFile(name);

        // If the file existed before, and it is not editable, it should be
        // deleted
        IProgressMonitor monitor = new NullProgressMonitor();
        if (file.exists() && file.isDerived())
            file.delete(true, monitor);

        // Create the file if it is to exists.
        if (!file.exists()) {
            file.create(new ByteArrayInputStream(content.toString().getBytes()), true, monitor);

            // Setting the properties of the file.
            if (derived)
                file.setDerived(true, monitor);
        }

        // Return with the file.
        return file;
    }



    private static void checkOrCreateSourceFolders(IProject project) {
        // src folder is created if not present
        IPath location = project.getLocation();
        File sourceDir = new File(location.append(SOURCE_FOLDER_NAME).toOSString());
        if(!sourceDir.exists()){
            sourceDir.mkdir();
        }
        
        // src-gen folder is created if not present
        File generatedSourceDir = new File(location.append(DERIVED_SOURCE_FOLDER_NAME).toOSString());
        if(!generatedSourceDir.exists()){
            generatedSourceDir.mkdir();
        }
    }

//    
//    private static void setClasspathInformation(IProject project) {
//        try {
//            IPath location = project.getLocation();
//            File classpath = new File(location.append(".classpath").toOSString());
//            classpath.createNewFile();
//            PrintWriter pw = new PrintWriter(classpath);
//            pw.write(CLASSPATH);
//            pw.close();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//    }
 
    
    ////////////////////////////////////////////
    ////////////////////////////////////////////
    ////////////////////////////////////////////
    ////////////////////////////////////////////
    ////////////////////////////////////////////
    
    
    /**
     * 
     * @param name
     * @return
     * @throws CoreException
     */
    public static IProject createProject(final String projectName) throws CoreException {
        // Referring a project in the workspace by it's name
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

        IProgressMonitor monitor = new NullProgressMonitor();

        if (project.exists())
            return project;
        
//        // Clean up any old project information.
//        if (project.exists()) {
//            final boolean[] result = new boolean[1];
//            PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
//                public void run() {
//                    result[0] = MessageDialog.openQuestion(Display.getDefault().getActiveShell(), "Project exists",
//                            "Do you want to overwrite the project " + projectName + "?");
//                }
//            });
//            if (result[0]) {
//                project.delete(true, true, monitor);
//            } else
//                return null;
//        }
        
        // If the project does not exist it will be created.
        IProjectDescription projectDescription = ResourcesPlugin.getWorkspace().newProjectDescription(projectName);
        projectDescription.setLocation(null);
        project.create(projectDescription,monitor);
        final IJavaProject javaProject = JavaCore.create(project);

        // The project should be opened.
        project.open(IResource.DEPTH_INFINITE, monitor);
        
        // TODO removed, check to see if OK
//        checkOrCreateSourceFolders(project);
        
        // Add referenced projects
        final List<IProject> referencedProjects = new ArrayList<>();
//        referencedProjects.add(ResourcesPlugin.getWorkspace().getRoot().getProject("hu.bme.mit.mdsd.pineapple.dataflownet.bundle.dependencies"));

        // Create classpath entries
        final List<IClasspathEntry> classpathEntries = new ArrayList<IClasspathEntry>();

        
        if (referencedProjects.size() != 0) {
            projectDescription.setReferencedProjects(referencedProjects.toArray(new IProject[referencedProjects.size()]));
                for (final IProject referencedProject : referencedProjects) {
                        final IClasspathEntry referencedProjectClasspathEntry = JavaCore.newProjectEntry(referencedProject.getFullPath());
                        classpathEntries.add(referencedProjectClasspathEntry);
                }
        }
        
        projectDescription.setNatureIds(new String[] { JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature"});
        
        
        
        final ICommand java = projectDescription.newCommand();
        java.setBuilderName(JavaCore.BUILDER_ID);

        final ICommand manifest = projectDescription.newCommand();
        manifest.setBuilderName("org.eclipse.pde.ManifestBuilder");

        final ICommand schema = projectDescription.newCommand();
        schema.setBuilderName("org.eclipse.pde.SchemaBuilder");

        
        projectDescription.setBuildSpec(new ICommand[] { java, manifest, schema });

        project.open(IResource.DEPTH_INFINITE, monitor);
        project.setDescription(projectDescription, monitor);

        final List<String> srcFolders = new ArrayList<>();
        srcFolders.add("src");
        srcFolders.add("src-gen");
        
        Collections.reverse(srcFolders);
        for (final String src : srcFolders) {
                final IFolder srcContainer = project.getFolder(src);
                if (!srcContainer.exists()) {
                        srcContainer.create(false, true, monitor);
                }
                final IClasspathEntry srcClasspathEntry = JavaCore.newSourceEntry(srcContainer.getFullPath());
                classpathEntries.add(0, srcClasspathEntry);
        }

        classpathEntries.add(JavaCore.newContainerEntry(
                new Path("org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/J2SE-1.5")));
        classpathEntries.add(JavaCore.newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")));
        
        javaProject.setRawClasspath(classpathEntries.toArray(new IClasspathEntry[classpathEntries.size()]),monitor);
        final Set<String> requiredBundles = new HashSet<>();
        requiredBundles.addAll(REQUIRED_BUNDLES);
        final List<String> exportedPackages = new ArrayList<>();
        exportedPackages.add(EXPORT_PACKAGE);
        javaProject.setOutputLocation(new Path("/" + projectName + "/bin"), monitor);
        createManifest(projectName, requiredBundles, exportedPackages, monitor, project);
        createBuildProps(monitor, project, srcFolders);
        
        
        // TODO check to see if OK when removed
//        setClasspathInformation(project);
        
        // The project should be refreshed.
        project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
        
        return project;
    }
    
    private static void createBuildProps(final IProgressMonitor progressMonitor, final IProject project,
            final List<String> srcFolders) {
        final StringBuilder bpContent = new StringBuilder("source.. = ");
        for (final Iterator<String> iterator = srcFolders.iterator(); iterator.hasNext();) {
            bpContent.append(iterator.next()).append('/');
            if (iterator.hasNext()) {
                bpContent.append(",");
            }
        }
        bpContent.append("\n");
        bpContent.append("bin.includes = META-INF/,.\n");
        createFileInternal("build.properties", project, bpContent.toString(), progressMonitor);
    }

    private static void createManifest(final String projectName, final Set<String> requiredBundles,
            final List<String> exportedPackages, final IProgressMonitor progressMonitor, final IProject project)
            throws CoreException {
        final StringBuilder maniContent = new StringBuilder("Manifest-Version: 1.0\n");
        maniContent.append("Bundle-ManifestVersion: 2\n");
        maniContent.append("Bundle-Name: " + projectName + "\n");
        maniContent.append("Bundle-SymbolicName: " + projectName + "; singleton:=true\n");
        maniContent.append("Bundle-Version: 1.0.0\n");
        // maniContent.append("Bundle-Localization: plugin\n");
        maniContent.append("Require-Bundle: ");
        requiredBundles.remove(LAST_ADDED_DEPENDENCY);
        for (final String entry : requiredBundles) {
            maniContent.append(" " + entry + ",\n");
        }
        maniContent.append(" " + LAST_ADDED_DEPENDENCY + "\n");

        if (exportedPackages != null && !exportedPackages.isEmpty()) {
            maniContent.append("Export-Package: " + exportedPackages.get(0));
            for (int i = 1, x = exportedPackages.size(); i < x; i++) {
                maniContent.append(",\n " + exportedPackages.get(i));
            }
            maniContent.append("\n");
        }
        maniContent.append("Bundle-RequiredExecutionEnvironment: JavaSE-1.7\r\n");

        final IFolder metaInf = project.getFolder("META-INF");
        metaInf.create(false, true, new SubProgressMonitor(progressMonitor, 1));
        createFileInternal("MANIFEST.MF", metaInf, maniContent.toString(), progressMonitor);
    }

    /**
     * @param name
     *            of the destination file
     * @param container
     *            directory containing the the destination file
     * @param contentUrl
     *            Url pointing to the src of the content
     * @param progressMonitor
     *            used to interact with and show the user the current operation status
     * @return
     */
    public static IFile createFile(final String name, final IContainer container, final URL contentUrl,
            final IProgressMonitor progressMonitor) {

        final IFile file = container.getFile(new Path(name));
        InputStream inputStream = null;
        try {
            inputStream = contentUrl.openStream();
            if (file.exists()) {
                file.setContents(inputStream, true, true, progressMonitor);
            } else {
                file.create(inputStream, true, progressMonitor);
            }
            inputStream.close();
        } catch (final Exception e) {
        } finally {
            if (null != inputStream) {
                try {
                    inputStream.close();
                } catch (final IOException e) {
                }
            }
        }
        progressMonitor.worked(1);

        return file;
    }

    private static IFile createFileInternal(final String name, final IContainer container, final String content,
            final IProgressMonitor progressMonitor) {
        final IFile file = container.getFile(new Path(name));
        assertExist(file.getParent());
        try {
            final InputStream stream = new ByteArrayInputStream(content.getBytes(file.getCharset()));
            if (file.exists()) {
                file.setContents(stream, true, true, progressMonitor);
            } else {
                file.create(stream, true, progressMonitor);
            }
            stream.close();
        } catch (final Exception e) {
        }
        progressMonitor.worked(1);

        return file;
    }

    public static IFile createFile(final String name, final IContainer container, final String content,
            final String charSet, final IProgressMonitor progressMonitor) throws CoreException {
        final IFile file = createFileInternal(name, container, content, progressMonitor);
        if (file != null && charSet != null) {
            file.setCharset(charSet, progressMonitor);
        }

        return file;
    }

    private static void assertExist(final IContainer c) {
        if (!c.exists()) {
            if (!c.getParent().exists()) {
                assertExist(c.getParent());
            }
            if (c instanceof IFolder) {
                try {
                    ((IFolder) c).create(false, true, new NullProgressMonitor());
                } catch (final CoreException e) {

                }
            }
        }
    }
    
}
