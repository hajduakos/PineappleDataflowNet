package hu.bme.mit.mdsd.pineapple.dataflownet.graphml.resources.generator


import org.eclipse.emf.ecore.resource.Resource
import dataflownet.DataflowSystem
import dataflownet.DataflowNet
import dataflownet.StateMachine
import hu.bme.mit.mdsd.pineapple.dataflownet.graphml.resources.GraphMLHelper
import typehierarchy.ComplexType
import typehierarchy.Type
import dataflownet.StateMachineState
import dataflownet.Node
import dataflownet.Channel
import java.util.Set
import java.util.HashSet
import dataflownet.StateMachineTransition
import dataflownet.FiringRule

class DataflowNetGenerator {
	
	/**
	 * Main function for generating GraphML file from a DataflowSystem
	 */
	def generate(Resource res) {
		var content = res.contents.get(0);
		if (content instanceof DataflowSystem){
			var ds = content as DataflowSystem;
			GraphMLHelper.createFile(res, ds.name,ds.asGraphML);
		}
	}
	
	/**
	 * Generate DataflowSystem
	 */
	def CharSequence asGraphML(DataflowSystem system)'''
		<?xml version="1.0" encoding="UTF-8" standalone="no"?>
		<graphml xmlns="http://graphml.graphdrawing.org/xmlns"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xmlns:y="http://www.yworks.com/xml/graphml"
			xmlns:yed="http://www.yworks.com/xml/yed/3"
			xsi:schemaLocation="http://graphml.graphdrawing.org/xmlns http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd">
		<key for="node" id="d6" yfiles.type="nodegraphics"/>
		<key for="edge" id="d10" yfiles.type="edgegraphics"/>
		<graph edgedefault="directed" id="G">
			<!-- DataflowSystem [«system.name»] begin -->
			<node id="«system.name»">
				<data key="d6"> <y:ProxyAutoBoundsNode><y:Realizers active="0"><y:GroupNode>
					<y:NodeLabel modelName="internal" modelPosition="t">SYS «system.name»</y:NodeLabel>
					<y:Fill color="#999999" transparent="false"/><y:Shape type="rectangle"/></y:GroupNode></y:Realizers></y:ProxyAutoBoundsNode>
				</data>
				<graph edgedefault="directed" id="«system.name»:">
					«FOR type : system.types.map[asGraphML(system,it)]»
					«type»
					«ENDFOR»
					«FOR net : system.nets.map[asGraphML]»
					«net»
					«ENDFOR»
					«FOR chan : system.channels.map[asGraphML]»
					«chan»
					«ENDFOR»
				</graph>
			</node>
			<!-- DataflowSystem [«system.name»] end -->
		</graph>
		</graphml>
	'''
	
	/**
	 * Generate Type
	 */
	def CharSequence asGraphML(DataflowSystem system, Type type)'''
		<node id="«system.name»::«type.name»"><data key="d6"><y:ShapeNode><y:Fill color="#0099FF" transparent="false"/><y:NodeLabel>«type.name»</y:NodeLabel><y:Shape type="rectangle"/></y:ShapeNode></data></node>
		«IF type instanceof ComplexType»
		«FOR subType : (type as ComplexType).containedTypes»
		«createEdge(system.name+"::"+type.name,system.name+"::"+subType.name,"")»
		«ENDFOR»
		«ENDIF»
		'''
	/**
	 * Generate channel
	 */
	def CharSequence asGraphML(Channel chan)'''
	<node id="«chan.fqn»"><data key="d6"><y:ShapeNode><y:NodeLabel>«chan.name»: «chan.type.name»</y:NodeLabel><y:Fill color="#339966" transparent="false"/><y:Shape type="rectangle"/></y:ShapeNode></data></node>
	'''	 
	
	/**
	 * Generate DataflowNet
	 */
	def CharSequence asGraphML(DataflowNet net)'''
	<!-- DataflowNet [«net.name»] begin -->
	<node id="«net.fqn»">
		<data key="d6"> <y:ProxyAutoBoundsNode><y:Realizers active="0"><y:GroupNode>
			<y:NodeLabel modelName="internal" modelPosition="t">DFN «net.label»</y:NodeLabel>
			<y:Fill color="#999999" transparent="false"/><y:Shape type="rectangle"/></y:GroupNode></y:Realizers></y:ProxyAutoBoundsNode>
		</data>
		<graph edgedefault="directed" id="«net.fqn»:">
			«FOR node : net.nodes.filter(typeof(DataflowNet)).map[asGraphML]»
			«node»
			«ENDFOR»
			«FOR node : net.nodes.filter(typeof(StateMachine)).map[asGraphML]»
			«node»
			«ENDFOR»
			«FOR chan : net.ownChannels.map[asGraphML]»
			«chan»
			«ENDFOR»
		</graph>
	</node>
	«FOR chan : net.inputChannels»
	«createEdge(chan.fqn,net.fqn,"")»
	«ENDFOR»
	«FOR chan : net.outputChannels»
	«createEdge(net.fqn,chan.fqn,"")»
	«ENDFOR»
	<!-- DataflowNet [«net.name»] end -->
	'''
	
	/**
	 * Generate StateMachine
	 */
	def CharSequence asGraphML(StateMachine sm)'''
	<!-- StateMachine [«sm.name»] begin -->
	<node id="«sm.fqn»">
		<data key="d6"> <y:ProxyAutoBoundsNode><y:Realizers active="0"><y:GroupNode>
			<y:NodeLabel modelName="internal" modelPosition="t">SM «sm.name»</y:NodeLabel>
			<y:Fill color="#FFFFFF" transparent="false"/><y:Shape type="rectangle"/></y:GroupNode></y:Realizers></y:ProxyAutoBoundsNode>
		</data>
		<graph edgedefault="directed" id="«sm.fqn»:">
			«FOR state : sm.nodes.map[asGraphML(sm,it)]»
			«state»
			«ENDFOR»
		</graph>
	</node>
	«FOR chan : sm.inputs»
	«createEdge(chan.fqn,sm.fqn,"")»
	«ENDFOR»
	«FOR chan : sm.outputs»
	«createEdge(sm.fqn,chan.fqn,"")»
	«ENDFOR»
	<!-- StateMachine [«sm.name»] end -->
	'''
	
	/**
	 * Generate state
	 */
	def CharSequence asGraphML(StateMachine sm, StateMachineState state)'''
		<node id="«sm.fqn»::«state.name»"><data key="d6"><y:ShapeNode><y:NodeLabel>«state.name»</y:NodeLabel><y:Fill color="#FFCC00" transparent="false"/><y:Shape type="ellipse"/>«IF state == sm.initialState»<y:BorderStyle type="dotted"/>«ENDIF»</y:ShapeNode></data></node>
		«FOR trans : state.outputTransitions»
		«createEdge(sm.fqn+"::"+state.name,sm.fqn+"::"+trans.toState.name,trans.label)»
		«ENDFOR»
	'''
	
	/**
	 * Generate edge
	 */
	 def CharSequence createEdge(String from, String to, String label)'''
	 <edge id="«nextID»" source="«from»" target="«to»"><data key="d10"><y:PolyLineEdge><y:Arrows source="none" target="standard"/><y:EdgeLabel>«label»</y:EdgeLabel></y:PolyLineEdge></data></edge>
	 '''
	 
	 
	 
	 
	 /**
	  * ID
	  */
	 int id = -1;
	 
	 /**
	  * Get next ID
	  */
	 def int nextID(){
	 	id=id+1
	 	id
	 }
	 
	 /**
	  * Get fully qualified name for a node
	  */
	 def String fqn(Node node){
	 	var tmpNode = node;
	 	var fqn = node.name;
	 	while(tmpNode.parent != null){
	 		fqn = tmpNode.parent.name + "::" + fqn;
	 		tmpNode = tmpNode.parent
	 	}
	 	(tmpNode.eContainer as DataflowSystem).name + "::" + fqn
	 }
	 
	 /**
	  * Get fully qualified name for a channel
	  */
	 def String fqn(Channel chan){
	 	if(chan.eContainer instanceof DataflowSystem){
	 		return (chan.eContainer as DataflowSystem).name + "::" + chan.name;
	 	} else {
	 		return (chan.eContainer as DataflowNet).fqn + "::" + chan.name;
	 	}
	 }
	 
	 /**
	  * Get input channels of a state machine
	  */
	 def Set<Channel> inputs(StateMachine sm){
	 	var channels = new HashSet<Channel>();
	 	for(StateMachineState smst : sm.nodes)
	 		for(StateMachineTransition smtr : smst.outputTransitions)
	 			for(FiringRule fr : smtr.inputs)
	 				if(fr.channel.eContainer == sm.parent)
	 					channels.add(fr.channel);
	 	channels
	 }
	 
	 /**
	  * Get output channels of a state machine
	  */
	 def Set<Channel> outputs(StateMachine sm){
	 	var channels = new HashSet<Channel>();
	 	for(StateMachineState smst : sm.nodes)
	 		for(StateMachineTransition smtr : smst.outputTransitions)
	 			for(FiringRule fr : smtr.outputs)
	 				if(fr.channel.eContainer == sm.parent)
	 					channels.add(fr.channel);
	 	channels
	 }
	 
	 /**
	  * Get label for a transition
	  */
	 def String label(StateMachineTransition transition){
	 	var label = "";
	 	for(FiringRule in : transition.inputs){
	 		label = label + in.channel.name + " " + in.operator;
	 		for(String v : in.tokens.value) label = label + " " + v;
	 	}
	 	label = label + " / ";
	 	for(FiringRule out : transition.outputs){
	 		label = label + out.channel.name + " " + out.operator;
	 		for(String v : out.tokens.value) label = label + " " + v;
	 	}
	 	label
	 }
	 
	 /**
	  * Get operator of a firing rule
	  */
	 def String operator(FiringRule fr){
	 	switch(fr.compType){
	 		case EQUAL: return "="
	 		case GREATER: return "&gt;"
	 		case LESS: return "&lt;"
	 		case NOT_EQUAL: return "!="
	 	}
	 	return ""
	 }
	 
	 /**
	  * Get label for a dataflownet
	  */
	  def String label(DataflowNet net){
	  	if(net.process != null){
	  		return net.name + " (" + net.process.host + ")";
	  	} else {
	  		return net.name;
	  	}
	  }
}