package hu.bme.mit.mdsd.pineapple.dataflownet.graphml;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class DataflowNetGeneratorPlugin implements BundleActivator{

	private static BundleContext context;
	
	public final static String PLUGIN_ID="hu.bme.mit.mdsd.pineapple.dataflownet.graphml.generator";

	static BundleContext getContext() {
		return context;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		DataflowNetGeneratorPlugin.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		DataflowNetGeneratorPlugin.context = null;
	}


}
