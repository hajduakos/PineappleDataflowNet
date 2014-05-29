package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

public class Token <T extends Comparable<T>> {
	
	private T value;
	
	public Token (T value){
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public boolean Equal(Token<T> token){
		return value.compareTo(token.getValue()) == 0;
	}
	
	public boolean NotEqual(Token<T> token){
		return !(value.compareTo(token.getValue()) == 0);
	}
	
	public boolean Less(Token<T> token){
		return value.compareTo(token.getValue()) == -1;
	}
	
	public boolean Greater(Token<T> token){
		return value.compareTo(token.getValue()) == 1;
	}
	
}
