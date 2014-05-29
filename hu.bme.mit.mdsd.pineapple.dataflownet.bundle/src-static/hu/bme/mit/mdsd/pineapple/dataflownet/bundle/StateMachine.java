package hu.bme.mit.mdsd.pineapple.dataflownet.bundle;

import java.util.HashSet;
import java.util.Set;

public class StateMachine extends NamedElement implements Runnable{
	
	private Set<StateMachineState> nodes;
	private StateMachineState currentState;
	private volatile boolean isStopped = false;
	private SystemBuilder builder;

	public StateMachineState getCurrentState(){
		return currentState;
	}
	
	public StateMachine(SystemBuilder builder, String name) {
		super(name);
		this.builder = builder;
		nodes = new HashSet<>();
	}

	public void addInitialState(StateMachineState initialState){
		currentState = initialState;
	}
	
	public void addState(StateMachineState state){
		nodes.add(state);
	}
	
	private void process(){
		try {
			StateMachineTransition transition = currentState.transitionToFire();
			transition.fire();
			currentState = transition.getToState();
			builder.stateMachineStateChanged(this, currentState);
			//System.out.println("StateMachine [" + name + "] changed state to [" + currentState.getName() + "]");
		} catch (NoFireableTransitionException e) {}
	}
	
	public void stop(){
		isStopped = true;
	}

	@Override
	public void run() {
		
		while (!isStopped) {
			process();
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				
			}
		}
		
	}
	
	public Set<StateMachineState> getStateMachineStates() {
		return nodes;
	}
}
