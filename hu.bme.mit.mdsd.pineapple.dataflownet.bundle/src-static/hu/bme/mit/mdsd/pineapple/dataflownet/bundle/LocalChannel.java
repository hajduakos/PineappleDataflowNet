package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.Token;

import java.util.LinkedList;
import java.util.List;

public class LocalChannel <T extends Comparable<T>> extends NamedElement implements Channel<T> {
	
	private List<Token<T>> fifoStorage;
	
	private Class<T> clazz;

	public LocalChannel(String name, Class<T> clazz) {
		super(name);
		this.clazz = clazz;
		
		fifoStorage = new LinkedList<Token<T>>();
		
	}
	
	public void put(Token<T> token){
		synchronized (this) {
			fifoStorage.add(token);
			System.out.println("Channel [" + name
					+ "] received a token with value [" + token.getValue()
					+ "]");
		}
	}
	
	public void putBack(Token<T> token){
		synchronized (this) {
			fifoStorage.add(0, token);
		}
	}
	
	public Token<T> get(){
		synchronized (this) {
			if (!fifoStorage.isEmpty()) {
				return fifoStorage.remove(0);
			}
			return null;
		}
	}

	@Override
	public Class<T> getClazz() {
		return clazz;
	}

	@Override
	public void put(Object tokenValue) {
		if (clazz.isInstance(tokenValue)) {
			this.put(new Token<T>(clazz.cast(tokenValue)));
		}
		
	}

}
