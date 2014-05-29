package hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator

import hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator.RemoteChannelGenerator
import dataflownet.Channel
import hu.bme.mit.mdsd.pineapple.dataflownet.incquery.GeneratorIncQueryHelper
import dataflownet.DataflowSystem
import dataflownet.Process

class PahoChannelGenerator implements RemoteChannelGenerator {
	val url = "tcp://m2m.eclipse.org:1883";
	
	override generateOutputRemoteChannel(Channel channel, Process p, DataflowSystem ds) {
		var remoteProc = GeneratorIncQueryHelper.getRemoteInputEnding(ds, channel);
		var localName = channel.name + "_" + p.name;
		var remoteName = channel.name + "_" + remoteProc.name;
		
		return 
		'''
		private Channel<«DataflowNetTypeHelper.mapTypes(channel.type)»> «channel.name» = new PahoChannel<>("«channel.name»", "«url»", "«localName»", "«remoteName»", «DataflowNetTypeHelper.mapTypes(channel.type)».class);
		public  Channel<«DataflowNetTypeHelper.mapTypes(channel.type)»> get«channel.name.toFirstUpper»() {
					return «channel.name»;
				}
		'''
	}
	
	override generateInputRemoteChannel(Channel channel, Process p, DataflowSystem ds) {
		var remoteProc = GeneratorIncQueryHelper.getRemoteOutputEnding(ds, channel);
		var localName = channel.name + "_" + p.name;
		var remoteName = channel.name + "_" + remoteProc.name;
		
		return 
		'''
		private Channel<«DataflowNetTypeHelper.mapTypes(channel.type)»> «channel.name» = new PahoChannel<>("«channel.name»", "«url»", "«localName»", "«remoteName»", «DataflowNetTypeHelper.mapTypes(channel.type)».class);
		public  Channel<«DataflowNetTypeHelper.mapTypes(channel.type)»> get«channel.name.toFirstUpper»() {
					return «channel.name»;
				}
		'''
	}
	
	
	
}