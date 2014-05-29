package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;


import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import akka.actor.UntypedActor;

public class AkkaOutputChannel <T extends Comparable<T>> extends UntypedActor implements Channel<T> {
	
	private List<Token<T>> fifoStorage;
	private String name;
	private Class<T> clazz;
	
	public AkkaOutputChannel(String name, Class<T> clazz) {
		
		fifoStorage = new LinkedList<Token<T>>();
		this.name = name;
		this.clazz = clazz;
		
	}

	@Override
	public void put(Token<T> token) {
		synchronized (this) {
			fifoStorage.add(token);
			System.out.println("Channel [" + name
					+ "] received a token with value [" + token.getValue()
					+ "]");
		}
		
	}

	@Override
	public void putBack(Token<T> token) {
		synchronized (this) {
			fifoStorage.add(0, token);
		}
		
	}

	@Override
	public Token<T> get() {
		synchronized (this) {
			if (!fifoStorage.isEmpty()) {
				return fifoStorage.remove(0);
			}
			return null;
		}
	}

	@Override
	public void onReceive(Object message) throws Exception {
		
		ByteArrayInputStream b = new ByteArrayInputStream((byte[])message);
		ObjectInputStream o = new ObjectInputStream(b);
		Object value = o.readObject();
		
		if (clazz.isInstance(value)) {
			this.put(new Token<T>(clazz.cast(value)));
		}
		
	}
	
	@Override
	public Class<T> getClazz() {
		return clazz;
	}

	@Override
	public void put(Object tokenValue) {
		
	}

	@Override
	public String getName() {
		return name;
	}

}
