package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.AkkaOutputChannel;
import akka.japi.Creator;

public class AkkaOutputChannelCreator <T extends Comparable<T>> implements Creator<AkkaOutputChannel> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Class<T> clazz;
	
	private AkkaOutputChannel<T> channel;
	
	public AkkaOutputChannelCreator(String name, Class<T> clazz) {
		this.name = name;
		this.clazz = clazz;
	}
	
	public AkkaOutputChannel<T> getChannel(){
		return channel;
	}


	@Override public AkkaOutputChannel<T> create() {
		channel = new AkkaOutputChannel<T>(name, clazz);
		return channel;
	}
}
