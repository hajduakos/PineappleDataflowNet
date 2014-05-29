package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;


public interface Channel <T extends Comparable<T>> {
	
public void put(Token<T> token);
	
	public void put(Object tokenValue);
	
	public void putBack(Token<T> token);
	
	public Token<T> get();
	
	public Class<T> getClazz();

	public String getName();
}
