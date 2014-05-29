package hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator

import hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator.RemoteChannelGenerator
import dataflownet.Channel
import dataflownet.Process
import dataflownet.DataflowSystem
import java.util.Map
import hu.bme.mit.mdsd.pineapple.dataflownet.incquery.GeneratorIncQueryHelper

class AkkaChannelGenerator implements RemoteChannelGenerator {
	
	val Map<Channel, Map<String,String>> channelProperties = newHashMap;
	
	var int actPort = 2552;
	
	override generateOutputRemoteChannel(Channel channel, Process p, DataflowSystem ds) {
		if(!channel.channelCollected){
			channel.collectChannelProperties;
		}
		
		var Map<String,String> props = channelProperties.get(channel);
		
		var initFunc = "init_" + channel.name;
		
		var remoteProc = GeneratorIncQueryHelper.getRemoteInputEnding(ds, channel);
		
		return 
		'''
		private AkkaInputChannel<«DataflowNetTypeHelper.mapTypes(channel.type)»> «channel.name»;
		public  Channel<«DataflowNetTypeHelper.mapTypes(channel.type)»> get«channel.name.toFirstUpper»() {
					return «channel.name»;
				}
		
		public void «initFunc» (){
			«getConfig(p.host, Integer.parseInt(props.get("inputPort")))»
			
			final ActorSystem system = ActorSystem.create("«props.get("inputASName")»",
			        ConfigFactory.parseString(config));
			AkkaInputChannelCreator<«DataflowNetTypeHelper.mapTypes(channel.type)»> creator = new AkkaInputChannelCreator<>("«channel.name»", "«remoteProc.host»", "«props.get("outputActorName")»", «Integer.parseInt(props.get("outputPort"))», "«props.get("outputASName")»", «DataflowNetTypeHelper.mapTypes(channel.type)».class);
		 	system.actorOf(Props.create(creator), "«props.get("inputActorName")»");
		 	
		 	try {
			Thread.sleep(5000);
		 	} catch (InterruptedException e) {
			
		 	}
		 
		 	«channel.name» = creator.getChannel();
		}
		'''
	}
	
	override generateInputRemoteChannel(Channel channel, Process p, DataflowSystem ds) {
		if(!channel.channelCollected){
			channel.collectChannelProperties;
		}
		
		var Map<String,String> props = channelProperties.get(channel);
		
		var initFunc = "init_" + channel.name;
		
		return 
		'''
		private AkkaOutputChannel<«DataflowNetTypeHelper.mapTypes(channel.type)»> «channel.name»;
		public  Channel<«DataflowNetTypeHelper.mapTypes(channel.type)»> get«channel.name.toFirstUpper»() {
					return «channel.name»;
				}
		
		public void «initFunc» (){
			«getConfig(p.host, Integer.parseInt(props.get("outputPort")))»
			
			final ActorSystem system = ActorSystem.create("«props.get("outputASName")»",
			        ConfigFactory.parseString(config));
			AkkaOutputChannelCreator<«DataflowNetTypeHelper.mapTypes(channel.type)»> creator = new AkkaOutputChannelCreator<>("«channel.name»", «DataflowNetTypeHelper.mapTypes(channel.type)».class);
		 	system.actorOf(Props.create(creator), "«props.get("outputActorName")»");
		 	
		 	try {
			Thread.sleep(5000);
		 	} catch (InterruptedException e) {
			
		 	}
		 	
		 	«channel.name» = creator.getChannel();
		}
		'''
	}
	
	private def collectChannelProperties(Channel ch){
		var Map<String,String> props = newHashMap;
		props.put("outputPort", actPort.toString);
		props.put("inputPort", (actPort+1).toString);
		props.put("inputASName", ch.name.toFirstUpper.replace("_", "-") + "InputSystem");
		props.put("outputASName", ch.name.toFirstUpper.replace("_", "-") + "OutputSystem");
		props.put("inputActorName", ch.name.replace("_", "-") + "-input");
		props.put("outputActorName", ch.name.replace("_", "-") + "-output");
		
		channelProperties.put(ch, props);
		
		actPort = actPort + 2;
	}
	
	private def boolean isChannelCollected(Channel ch){
		return channelProperties.containsKey(ch);
	}
	
	private def CharSequence getConfig(String ip, int port){
		return 
		'''
		String config = "akka {\r\n" + 
		 		"\r\n" + 
		 		"  actor {\r\n" + 
		 		"    provider = \"akka.remote.RemoteActorRefProvider\"\r\n" + 
		 		"  }\r\n" + 
		 		"\r\n" + 
		 		"  remote {\r\n" + 
		 		"    netty.tcp {\r\n" + 
		 		"      hostname = \"«ip»\"\r\n" + 
		 		"      port = «port»\r\n" + 
		 		"    }\r\n" + 
		 		"  }\r\n" + 
		 		"\r\n" + 
		 		"}";
		'''
	}
	
}