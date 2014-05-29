package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

public abstract class NamedElement {

	protected String name;
	
	
	
	public NamedElement(String name) {
		this.name = name;
	}



	public String getName() {
		return name;
	}
	
}
