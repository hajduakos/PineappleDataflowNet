package hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator

import dataflownet.DataflowSystem
import dataflownet.DataflowNet
import java.util.List
import dataflownet.Channel
import dataflownet.StateMachine
import dataflownet.StateMachineState
import dataflownet.FiringRule
import java.util.Map
import dataflownet.StateMachineTransition
import dataflownet.Process
import hu.bme.mit.mdsd.pineapple.dataflownet.resources.GeneratorHelper
import java.util.Set
import dataflownet.Protocol

class DataflowNetSystemBuilder {

	val Map<Channel, String> channels = newHashMap;
	val Map<StateMachine, String> stateMachines = newHashMap;
	val Map<Channel, String> topChannels = newHashMap;
	val Set<Channel> inputRemoteChannels = newHashSet;
	val Set<Channel> outputRemoteChannels = newHashSet;
	
	var Process proc;
	
	var RemoteChannelGenerator channelGenerator;

	def generateDataflowNetSystem(DataflowSystem ds, String projectName, String namespace) {
		
		if(ds.protocol.equals(Protocol.AKKA)){
			channelGenerator = new AkkaChannelGenerator;
			
		}
		if(ds.protocol.equals(Protocol.PAHO)){
			channelGenerator = new PahoChannelGenerator;
			
		}

		var processes = collectProcesses(ds);

		for (Process process : processes.keySet) {

			channels.clear;
			stateMachines.clear;
			topChannels.clear;
			inputRemoteChannels.clear;
			outputRemoteChannels.clear;
			
			proc = process;

			var int channelCounter = 0;
			var int stateMachineCouner = 0;

			for (channel : ds.collectChannels(processes.get(process))) {
				channelCounter = channelCounter + 1;
				var name = "channel" + "_" + channelCounter + "_" + channel.name;

				channels.put(channel, name);

			}

			for (channel : ds.collectTopLevelChannels(processes.get(process))) {
				channelCounter = channelCounter + 1;
				var name = "channel" + "_" + channelCounter + "_" + channel.name;

				topChannels.put(channel, name);

			}

			for (machine : ds.collectStateMachines(processes.get(process))) {
				stateMachineCouner = stateMachineCouner + 1;
				var name = "sm" + "_" + stateMachineCouner + "_" + machine.name;

				stateMachines.put(machine, name);
			}
			
			inputRemoteChannels.addAll(process.collectInputRemoteChannelsForProcess(ds));
			outputRemoteChannels.addAll(process.collectOutputRemoteChannelsForProcess(ds));
			
			var processName = process.name.toFirstUpper;
			GeneratorHelper.createJavaFile(projectName, namespace, processName+"SystemBuilder", true, generateCode(namespace, processName, ds));

		}

	}

	//DATAFLOWNETS AND PROCESSES
	/**
	 * Get the main dataflow nets
	 */
	private def Map<Process, List<DataflowNet>> collectProcesses(DataflowSystem ds) {
		val Map<Process, List<DataflowNet>> processes = newHashMap;

		ds.processes.forEach[
			{
				val List<DataflowNet> nets = newArrayList;
				val p = it;

				ds.nets.filter[it.process.identityEquals(p)].forEach[nets.add(it)];

				processes.put(it, nets);
			}]

		return processes;
	}
	
	private def Set<Channel> collectOutputRemoteChannelsForProcess(Process p, DataflowSystem ds){
		
		val List<DataflowNet> nets = newArrayList;
		val Set<Channel> channels = newHashSet;
		
		ds.processes.forEach[
			{
				ds.nets.filter[it.process.identityEquals(p)].forEach[nets.add(it)];
			}]
			
		nets.forEach[it.outputChannels.filter[it.eContainer instanceof DataflowSystem].forEach[channels.add(it)]]
			
		return channels
	}
	
	private def Set<Channel> collectInputRemoteChannelsForProcess(Process p, DataflowSystem ds){
		
		val List<DataflowNet> nets = newArrayList;
		val Set<Channel> channels = newHashSet;
		
		ds.processes.forEach[
			{
				ds.nets.filter[it.process.identityEquals(p)].forEach[nets.add(it)];
			}]
			
		nets.forEach[it.inputChannels.filter[it.eContainer instanceof DataflowSystem].forEach[channels.add(it)]]
			
		return channels
	}

	//	 ____ _                            _     
	//  / ___| |__   __ _ _ __  _ __   ___| |___ 
	// | |   | '_ \ / _` | '_ \| '_ \ / _ \ / __|
	// | |___| | | | (_| | | | | | | |  __/ \__ \
	//  \____|_| |_|\__,_|_| |_|_| |_|\___|_|___/
	/**
	 * Collecting ordinary channels
	 */
	private def List<Channel> collectChannels(DataflowSystem ds, List<DataflowNet> nets) {
		val channels = newArrayList;
		ds.nets.filter[nets.contains(it)].forEach[
			it.nodes.filter(DataflowNet).forEach[channels.addAll(it.getChannels)]]
		return channels
	}

	private def List<Channel> getChannels(DataflowNet dn) {
		val List<Channel> channels = newArrayList;
		dn.ownChannels.forEach[channels.add(it)]
		dn.nodes.filter(DataflowNet).forEach[channels.addAll(it.getChannels)]
		return channels
	}

	/**
	 * Collecting top level channels
	 */
	private def List<Channel> collectTopLevelChannels(DataflowSystem ds, List<DataflowNet> nets) {
		val channels = newArrayList;

		ds.nets.filter[nets.contains(it)].forEach[it.ownChannels.forEach[channels.add(it)]]

		return channels
	}
	

	//  ____  _        _                              _     _                 
	// / ___|| |_ __ _| |_ ___   _ __ ___   __ _  ___| |__ (_)_ __   ___  ___ 
	// \___ \| __/ _` | __/ _ \ | '_ ` _ \ / _` |/ __| '_ \| | '_ \ / _ \/ __|
	//  ___) | || (_| | ||  __/ | | | | | | (_| | (__| | | | | | | |  __/\__ \
	// |____/ \__\__,_|\__\___| |_| |_| |_|\__,_|\___|_| |_|_|_| |_|\___||___/
	
	private def List<StateMachine> collectStateMachines(DataflowSystem ds, List<DataflowNet> nets) {
		val List<StateMachine> stateMachines = newArrayList;

		ds.nets.filter[nets.contains(it)].forEach[stateMachines.addAll(it.getStateMachines)]

		return stateMachines
	}

	private def List<StateMachine> getStateMachines(DataflowNet dn) {
		val List<StateMachine> stateMachines = newArrayList;

		dn.nodes.filter(StateMachine).forEach[stateMachines.add(it)]
		dn.nodes.filter(DataflowNet).forEach[stateMachines.addAll(it.getStateMachines)]

		return stateMachines
	}

	private def CharSequence generateStateMachineCode(StateMachine machine, String variableName) {
		var Map<StateMachineState, String> states = newHashMap;
		val Map<FiringRule, String> firingRules = newHashMap;
		var int stateCounter = 0;
		var int ruleCounter = 0;

		for (state : machine.collectStateMachineState) {
			stateCounter = stateCounter + 1;
			var name = machine.name + "_state_" + stateCounter + "_" + state.name;
			states.put(state, name);
		}

		for (rule : machine.collectFiringRules) {
			ruleCounter = ruleCounter + 1;
			var name = machine.name + "_state_" + ruleCounter + "_" + rule.name;
			firingRules.put(rule, name)
		}

		var body = '''
			public void init_«variableName»(){
				
		'''

		body = body + '''
			
				// Generating state machine «variableName»
				StateMachine «machine.name» = new StateMachine (this,"«machine.name»");
				stateMachines.add(«machine.name»);
		'''

		body = body + '''
			«FOR state : states.keySet»
				«state.generateStateMachineStateStub(states.get(state))»
			«ENDFOR»
			
		'''

		body = body + '''
				// Firing rules
				«FOR rule : firingRules.keySet»
				«rule.generateFiringRuleCode(firingRules.get(rule))»
				«ENDFOR»
			
				«FOR state : states.keySet»
					«state.generateStateMachineStateCode(states.get(state), states, firingRules)»
					
					«machine.name».addState(«states.get(state)»);
				«ENDFOR»
				«machine.name».addInitialState(«states.get(machine.initialState)»);
				
				}
		'''

		return body;
	}

	//  ____  _        _                              _     _                  _        _            
	// / ___|| |_ __ _| |_ ___   _ __ ___   __ _  ___| |__ (_)_ __   ___   ___| |_ __ _| |_ ___  ___ 
	// \___ \| __/ _` | __/ _ \ | '_ ` _ \ / _` |/ __| '_ \| | '_ \ / _ \ / __| __/ _` | __/ _ \/ __|
	//  ___) | || (_| | ||  __/ | | | | | | (_| | (__| | | | | | | |  __/ \__ \ || (_| | ||  __/\__ \
	// |____/ \__\__,_|\__\___| |_| |_| |_|\__,_|\___|_| |_|_|_| |_|\___| |___/\__\__,_|\__\___||___/
	def List<StateMachineState> collectStateMachineState(StateMachine machine) {
		val List<StateMachineState> states = newArrayList;

		machine.nodes.forEach[states.add(it)]

		return states;
	}

	/**
	 * To avoid undefined errors in the code because of tree traversal
	 */
	private def CharSequence generateStateMachineStateStub(StateMachineState state, String variableName) {
		var body = '''
			
				// StateMachineState definitions
				StateMachineState «variableName» = new StateMachineState("«state.name»");
		'''

		return body
	}

	private def CharSequence generateStateMachineStateCode(
		StateMachineState state,
		String variableName,
		Map<StateMachineState, String> states,
		Map<FiringRule, String> firingRules
	) {

		val Map<StateMachineTransition, String> transitions = newHashMap;
		var int transitionCounter = 0;

		for (transition : state.collectTransitions) {
			transitionCounter = transitionCounter + 1;
			var name = variableName + "_transition_" + transitionCounter + "_" + transition.name;
			transitions.put(transition, name)
		}

		var body = '''
			stateMachineStates.add(«variableName»);
			// Generating transitions
			«FOR transition : transitions.keySet»
				«transition.generateStateMachineTransitionCode(transitions.get(transition), states, firingRules)»
				«variableName».addTransition(«transitions.get(transition)»);
			«ENDFOR»
			
		'''

		return body;
	}

	// (                                                       
	// )\ )                                        (           
	//(()/(  (   (   (          (  (    (      (   )\   (      
	// /(_)) )\  )(  )\   (     )\))(   )(    ))\ ((_) ))\ (   
	//(_))_|((_)(()\((_)  )\ ) ((_))\  (()\  /((_) _  /((_))\  
	//| |_   (_) ((_)(_) _(_/(  (()(_)  ((_)(_))( | |(_)) ((_) 
	//| __|  | || '_|| || ' \))/ _` |  | '_|| || || |/ -_)(_-< 
	//|_|    |_||_|  |_||_||_| \__, |  |_|   \_,_||_|\___|/__/ 
	//                         |___/    
	private def List<FiringRule> collectFiringRules(StateMachine machine) {
		val List<FiringRule> rules = newArrayList;

		machine.firingRules.forEach[rules.add(it)]

		return rules;
	}

	private def CharSequence generateFiringRuleCode(FiringRule rule, String variableName) {

		var channelName = channels.get(rule.channel);
		if (channelName.nullOrEmpty) {
			channelName = topChannels.get(rule.channel);
		}
		if (channelName.nullOrEmpty && inputRemoteChannels.contains(rule.channel)) {
			channelName = inputRemoteChannels.filter[it.identityEquals(rule.channel)].head.name;
		}
		if (channelName.nullOrEmpty && outputRemoteChannels.contains(rule.channel)) {
			channelName = outputRemoteChannels.filter[it.identityEquals(rule.channel)].head.name;
		}
		if (channelName.nullOrEmpty) {
			channelName = "null";
		}

		var ruleTokenValue = variableName + "_" + "value"

		var body = '''
			«DataflowNetTypeHelper.generateTypes(rule.tokens, ruleTokenValue)»
			FiringRule<«DataflowNetTypeHelper.mapTypes(rule.tokens.type)»> «variableName» = new FiringRule<«DataflowNetTypeHelper.
				mapTypes(rule.tokens.type)»>(
						"«rule.name»", Comparation.«rule.compType.getName», «channelName», «ruleTokenValue»
						);
			rules.add(«variableName»);
			
		'''

		return body;
	}

	//  ___ _        _                       _    _            _                    _ _   _             
	// / __| |_ __ _| |_ ___   _ __  __ _ __| |_ (_)_ _  ___  | |_ _ _ __ _ _ _  __(_) |_(_)___ _ _  ___
	// \__ \  _/ _` |  _/ -_) | '  \/ _` / _| ' \| | ' \/ -_) |  _| '_/ _` | ' \(_-< |  _| / _ \ ' \(_-<
	// |___/\__\__,_|\__\___| |_|_|_\__,_\__|_||_|_|_||_\___|  \__|_| \__,_|_||_/__/_|\__|_\___/_||_/__/
	private def List<StateMachineTransition> collectTransitions(StateMachineState state) {
		val List<StateMachineTransition> transitions = newArrayList;

		state.outputTransitions.forEach[transitions.add(it)]

		return transitions;
	}

	private def CharSequence generateStateMachineTransitionCode(StateMachineTransition transition, String variableName,
		Map<StateMachineState, String> states, Map<FiringRule, String> firingRules) {
		var toState = states.get(transition.toState)
		if (toState.nullOrEmpty) {
			toState = "null";
		}

		var body = '''
			StateMachineTransition «variableName» = new StateMachineTransition("«transition.name»", «toState», «transition.
				priority»);
			«FOR inputRule : transition.inputs»
				«variableName».addInputFiringRule(«firingRules.get(inputRule)»);
			«ENDFOR»
			«FOR outputRule : transition.outputs»
				«variableName».addOutputFiringRule(«firingRules.get(outputRule)»);
			«ENDFOR»
			stateMachineTransitions.add(«variableName»);
			
		'''

		return body
	}

	/*
 * Code generator part
 */
	private def CharSequence generateCode(String namespace, String processName, DataflowSystem ds) '''
		package «namespace»;
		
		import java.util.ArrayList;
		import java.util.List;
		import java.util.HashMap;
		import java.util.Map;
		import java.util.Set;
		«IF ds.protocol.equals(Protocol.AKKA) »
		import com.typesafe.config.ConfigFactory;
		import akka.actor.ActorSystem;
		import akka.actor.Props;
		«ENDIF»
		import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.*;
		
		public class «processName»SystemBuilder implements SystemBuilder {
			
			private List<StateMachine> stateMachines;
			private List<StateMachineState> stateMachineStates;
			private List<StateMachineTransition> stateMachineTransitions;
			private List<FiringRule<? extends Comparable<?>>> rules;
			private List<IDataflowNetView> listeners;
			private Map<String, Channel<? extends Comparable<?>>> channels;
			
			protected static «processName»SystemBuilder instance = new «processName»SystemBuilder();
			protected «processName»SystemBuilder(){
				stateMachines = new ArrayList<StateMachine>();
				stateMachineStates = new ArrayList<StateMachineState>();
				rules = new ArrayList<FiringRule<? extends Comparable<?>>>();
				stateMachineTransitions = new ArrayList<StateMachineTransition>();
				listeners = new ArrayList<IDataflowNetView>();
				channels = new HashMap<String, Channel<? extends Comparable<?>>>();
				
				«FOR channel : topChannels.keySet»
				channels.put("«channel.name»", «topChannels.get(channel)»);
				«ENDFOR»
			}
			
			public static «processName»SystemBuilder getInstance(){
				return instance;
			}
			
			// Add listeners
			public void addListener(IDataflowNetView view){
				this.listeners.add(view);
			}
			
			// Remove listener
			public void removeListener(IDataflowNetView view){
				this.listeners.remove(view);
			}
			
			// Notify listeners
			public void stateMachineStateChanged(StateMachine sm, StateMachineState sms){
				for(IDataflowNetView view : listeners){
					view.stateMachineStateChanged(sm, sms);
				}
			}
			
			// Channels
			«FOR channel : topChannels.keySet»
				// Generating channel «topChannels.get(channel)»
				private Channel<«DataflowNetTypeHelper.mapTypes(channel.type)»> «topChannels.get(channel)» = new LocalChannel<«DataflowNetTypeHelper.mapTypes(channel.type)»>("«channel.name»", «DataflowNetTypeHelper.mapTypes(channel.type)».class);
				public  Channel<«DataflowNetTypeHelper.mapTypes(channel.type)»> get«topChannels.get(channel).toFirstUpper»() {
					return «topChannels.get(channel)»;
				}
				
			«ENDFOR»
			«FOR channel : channels.keySet»
				// Generating channel «channels.get(channel)»
				private Channel<«DataflowNetTypeHelper.mapTypes(channel.type)»> «channels.get(channel)» = new LocalChannel<«DataflowNetTypeHelper.mapTypes(channel.type)»>("«channel.name»", «DataflowNetTypeHelper.mapTypes(channel.type)».class);
			«ENDFOR»
			
			// Generating input remote channels
			«FOR channel : inputRemoteChannels»
			
			«channelGenerator.generateInputRemoteChannel(channel, proc, ds)»
			«ENDFOR»
			
			// Generating output remote channels
			«FOR channel : outputRemoteChannels»
			
			«channelGenerator.generateOutputRemoteChannel(channel, proc, ds)»
			«ENDFOR»
			
			// State machines
			«FOR machine : stateMachines.keySet»
				
				«machine.generateStateMachineCode(stateMachines.get(machine))»
					
			«ENDFOR»
			
			public void init(){
				
				«IF ds.protocol.equals(Protocol.AKKA)»
				«FOR channel : inputRemoteChannels»
					init_«channel.name»();
					
				«ENDFOR»
				«FOR channel : outputRemoteChannels»
					init_«channel.name»();
					
				«ENDFOR»
				«ENDIF»
				«FOR machine : stateMachines.keySet»
					
					init_«stateMachines.get(machine)»();
					
				«ENDFOR»
				
			}
			
			public List<StateMachine> getStateMachines(){
				return stateMachines;
			}
			
			public void startStateMachines(){
				for (StateMachine machine : stateMachines){
					Thread thread = new Thread(machine);
					thread.start();
				}
			}
			
			public void stopStateMachines(){
				for (StateMachine machine : stateMachines){
					machine.stop();
				}
				«IF ds.protocol.equals(Protocol.AKKA)»
				«FOR channel : inputRemoteChannels»
				«channel.name».context().stop(«channel.name».context().self());
				«channel.name».context().system().shutdown();
				«ENDFOR»
				«FOR channel : outputRemoteChannels»
				«channel.name».context().stop(«channel.name».context().self());
				«channel.name».context().system().shutdown();
				«ENDFOR»
				«ENDIF»
			}
			
			public Channel<? extends Comparable<?>> getChannelByName(String name){
				return channels.get(name);
			}
			
			public Set<String> getChannelNames(){
				return channels.keySet();
			}
		}
	'''

}
