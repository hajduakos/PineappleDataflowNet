package hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator

class DataflowNetPredefinedClasses {

	def CharSequence generateToken(String namespace) '''
	package «namespace»;

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
	'''
	
	def CharSequence generateChannel(String namespace)'''
	package «namespace»;

	import java.util.LinkedList;
	import java.util.List;
	
	public class Channel <T extends Comparable<T>> extends NamedElement {
	
		List<Token<T>> fifoStorage;
	
		public Channel(String name) {
			super(name);
			
			fifoStorage = new LinkedList<Token<T>>();
			
		}
		
		public synchronized void put(Token<T> token){
			fifoStorage.add(token);
			System.out.println("Channel [" + name + "] received a token with value [" + token.getValue()+ "]");
		}
		
		public synchronized void putBack(Token<T> token){
			fifoStorage.add(0, token);
		}
		
		public synchronized Token<T> get(){
			if (! fifoStorage.isEmpty()) {
				return fifoStorage.remove(0);
			}
			return null;
		}
	
	}
	'''
	
	def CharSequence generateFiringRule(String namespace)'''
	package «namespace»;

	public class FiringRule <T extends Comparable<T>> extends NamedElement {

		private Comparation compType;
		private Channel<T> channel;
		private Token<T> token;
		
		public FiringRule(String name, Comparation compType, Channel<T> channel, T value) {
			super(name);
			this.compType = compType;
			this.channel = channel;
			this.token = new Token<T>(value);
		}
	
		public boolean evaluate(){
			switch (compType) {
				case Equal:
				{
					Token<T> channelToken =channel.get();
					boolean ok = false;
					if (channelToken != null) {
						ok = channelToken.Equal(token);
					} 
					if(!ok && channelToken != null) channel.putBack(channelToken);
					return ok;
				}
				
				case NotEqual:
				{
					Token<T> channelToken =channel.get();
					boolean ok = false;
					if (channelToken != null) {
						ok = channelToken.NotEqual(token);
					} 
					if(!ok && channelToken != null) channel.putBack(channelToken);
					return ok;
				}
					
				case Less:
				{
					Token<T> channelToken =channel.get();
					boolean ok = false;
					if (channelToken != null) {
						ok = channelToken.Less(token);
					} 
					if(!ok && channelToken != null) channel.putBack(channelToken);
					return ok;
				}
					
				case Greater:
				{
					Token<T> channelToken =channel.get();
					boolean ok = false;
					if (channelToken != null) {
						ok = channelToken.Greater(token);
					} 
					if(!ok && channelToken != null) channel.putBack(channelToken);
					return ok;
				}
					
				default:
					return false;
		
			}
		}
		
		public void fire(){
			System.out.println("\tFiringRule [" + name + "] fires");
			channel.put(token);
		}
		
	}
	'''
	
	def CharSequence generateNamedElement(String namespace)'''
	package «namespace»;

	public abstract class NamedElement {
	
		protected String name;
		
		
		
		public NamedElement(String name) {
			this.name = name;
		}
	
	
	
		public String getName() {
			return name;
		}
		
	}
	'''

	def CharSequence generateComparation(String namespace)'''
	package «namespace»;

	public enum Comparation {
	
		Equal, NotEqual, Less, Greater, None
		
	}
	'''
	
	def CharSequence generateNoFireableTransitionException(String namespace)'''
	package «namespace»;

	public class NoFireableTransitionException extends Exception {
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 7925283164313291620L;
	
	}
	'''
	
	def CharSequence generateStateMachine(String namespace)'''
	package «namespace»;

	import java.util.HashSet;
	import java.util.Set;
	
	public class StateMachine extends NamedElement implements Runnable{
		
		private Set<StateMachineState> nodes;
		private StateMachineState currentState;
		private volatile boolean isStopped = false;
	
		public StateMachine(String name) {
			super(name);
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
				System.out.println("StateMachine [" + name + "] changed state to [" + currentState.getName() + "]");
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
	}
	'''
	
	def CharSequence generateStateMachineState(String namespace)'''
	package «namespace»;

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
		
	}
	'''
	
	def generateStateMachineTransition(String namespace)'''
	package «namespace»;

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
			System.out.println("Transition [" + name + "] fires");
			for (FiringRule<? extends Comparable<?>> outputRule : outputs) {
				outputRule.fire();
			}
		}
	}
	'''

}
