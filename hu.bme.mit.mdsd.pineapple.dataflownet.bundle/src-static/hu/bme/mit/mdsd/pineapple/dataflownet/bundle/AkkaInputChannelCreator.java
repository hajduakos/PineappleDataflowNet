package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

import akka.japi.Creator;

public class AkkaInputChannelCreator <T extends Comparable<T>> implements Creator<AkkaInputChannel> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String remoteHost;
	private String actorname;
	private int port;
	private String remoteSystem;
	private Class<T> clazz;
	private String name;
	
	private AkkaInputChannel<T> channel;
	
	public AkkaInputChannelCreator(String name, String remoteHost,
			String actorname, int port, String remoteSystem, Class<T> clazz) {
		this.name = name;
		this.remoteHost = remoteHost;
		this.actorname = actorname;
		this.port = port;
		this.remoteSystem = remoteSystem;
		this.clazz = clazz;
	}
	
	public AkkaInputChannel<T> getChannel(){
		return channel;
	}


	@Override public AkkaInputChannel<T> create() {
		channel = new AkkaInputChannel<T>(name, remoteHost, actorname, port, remoteSystem, clazz);
		return channel;
	}
}
