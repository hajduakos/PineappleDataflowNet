package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

import java.util.HashSet;
import java.util.Set;

public class StateMachineTransition extends NamedElement {

	private StateMachineState toState;
	private int priority;
	
	private Set<FiringRule<? extends Comparable<?>>> inputs;
	private Set<FiringRule<? extends Comparable<?>>> outputs;

	public StateMachineTransition(String name, StateMachineState toState,
			int priority) {
		super(name);
		this.toState = toState;
		this.priority = priority;
		
		inputs = new HashSet<>();
		outputs = new HashSet<>();
	}
	
	public int getPriority() {
		return priority;
	}
	
	public StateMachineState getToState() {
		return toState;
	}
	
	public void addInputFiringRule(FiringRule<? extends Comparable<?>> input){
		inputs.add(input);
	}

	public void addOutputFiringRule(FiringRule<? extends Comparable<?>> output){
		outputs.add(output);
	}
	
	public boolean canFire(){
		
		for (FiringRule<? extends Comparable<?>> inputRule : inputs) {
			if (!inputRule.evaluate()) {
				return false;
			}
		}
		
		return true;
	}
	
	public void fire(){
		//System.out.println("Transition [" + name + "] fires");
		for (FiringRule<? extends Comparable<?>> outputRule : outputs) {
			outputRule.fire();
		}
	}
	
	public String getLabel(){
		String label = "";
		for(FiringRule<? extends Comparable<?>> fr : inputs) label += fr.getLabel();
		label += " / ";
		for(FiringRule<? extends Comparable<?>> fr : outputs) label += fr.getLabel();
		return label;
	}
}
