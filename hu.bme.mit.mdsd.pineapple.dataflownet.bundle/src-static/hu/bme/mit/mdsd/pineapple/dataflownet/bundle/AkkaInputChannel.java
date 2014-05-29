package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import scala.concurrent.duration.Duration;
import akka.actor.ActorIdentity;
import akka.actor.ActorRef;
import akka.actor.Identify;
import akka.actor.ReceiveTimeout;
import akka.actor.UntypedActor;


public class AkkaInputChannel <T extends Comparable<T>> extends UntypedActor implements Channel<T> {
	
	private ActorRef remotePair = null;
	private String path;
	private String name;
	private Class<T> clazz;

	public AkkaInputChannel(String name, String remoteHost, String actorname, int port, String remoteSystem, Class<T> clazz) {
		this.clazz = clazz;
		this.name = name;
		
		path = "akka.tcp://"+remoteSystem+"@" + remoteHost + ":" + port + "/user/" + actorname;
		
		sendIdentifyRequest();
	}
	
	private void sendIdentifyRequest() {
	    getContext().actorSelection(path).tell(new Identify(path), getSelf());
	    getContext()
	        .system()
	        .scheduler()
	        .scheduleOnce(Duration.create(3, SECONDS), getSelf(),
	            ReceiveTimeout.getInstance(), getContext().dispatcher(), getSelf());
	  }

	@Override
	public void put(Token<T> token) {
		if (remotePair != null) {
			ByteArrayOutputStream b = new ByteArrayOutputStream();
	        ObjectOutputStream o = null;
			try {
				o = new ObjectOutputStream(b);
				o.writeObject(token.getValue());
			} catch (IOException e) {
				
			}
	        
			remotePair.tell(b.toByteArray(), getSelf());
			
			try {
				o.close();
				b.close();
			} catch (IOException e) {
				
			}
	    	
		}
	}

	@Override
	public void putBack(Token<T> token) {
		
	}

	@Override
	public Token<T> get() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onReceive(Object message) throws Exception {
		if (message instanceof ActorIdentity) {
		    remotePair = ((ActorIdentity) message).getRef();
			if (remotePair == null) {
			   System.out.println("Remote actor not available: " + path);
			} else {
			   getContext().watch(remotePair);
			}

		} else if (message instanceof ReceiveTimeout) {
		    sendIdentifyRequest();

		} else {
		    System.out.println("Not ready yet");
		}	
	}
	
	@Override
	public Class<T> getClazz() {
		return clazz;
	}

	@Override
	public void put(Object tokenValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return name;
	}


}
