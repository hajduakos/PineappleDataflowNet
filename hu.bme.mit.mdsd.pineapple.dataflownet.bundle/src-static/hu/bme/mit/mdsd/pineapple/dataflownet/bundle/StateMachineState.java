package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

import java.util.HashSet;
import java.util.Set;

public class StateMachineState extends NamedElement {
	
	private Set<StateMachineTransition> outputTransitions;

	public StateMachineState(String name) {
		super(name);
		outputTransitions = new HashSet<>();
	}

	public void addTransition(StateMachineTransition transition){
		outputTransitions.add(transition);
	}
	
	public StateMachineTransition transitionToFire() throws NoFireableTransitionException{
		
		Set<StateMachineTransition> activatedTransitions = activateTransitions();
		
		if (activatedTransitions.size() == 0) {
			throw new NoFireableTransitionException();
		}
		
		StateMachineTransition maxPriorityTransition = null;
		int maxPriority = Integer.MIN_VALUE;
		
		for (StateMachineTransition stateMachineTransition : activatedTransitions) {
			if (stateMachineTransition.getPriority() > maxPriority) {
				maxPriorityTransition = stateMachineTransition;
				maxPriority = stateMachineTransition.getPriority();
			}
		}
		
		return maxPriorityTransition;
		
	}
	
	private Set<StateMachineTransition> activateTransitions(){
		
		Set<StateMachineTransition> activatedTransitions = new HashSet<>();
		
		for (StateMachineTransition transition : outputTransitions) {
			if (transition.canFire()) {
				activatedTransitions.add(transition);
			}
		}
		
		return activatedTransitions;
		
	}
	
	public Set<StateMachineTransition> getOutputTransitions() {
		return outputTransitions;
	}
	
}
