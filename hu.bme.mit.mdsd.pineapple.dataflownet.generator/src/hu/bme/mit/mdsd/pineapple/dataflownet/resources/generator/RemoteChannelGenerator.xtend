package hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator

import dataflownet.Channel
import dataflownet.DataflowSystem
import dataflownet.Process

interface RemoteChannelGenerator {
	def CharSequence generateOutputRemoteChannel (Channel channel, Process p, DataflowSystem ds);
	def CharSequence generateInputRemoteChannel (Channel channel, Process p, DataflowSystem ds);
}