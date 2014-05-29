package hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator

import dataflownet.DataflowSystem

class DataflowNetDispatcher {
	
	def generateDispatcher(DataflowSystem system)'''
	package hu.bme.mit.mdsd.pineapple.dataflownet.process;
	
	import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.SystemBuilder;
	
	public class Dispatcher {
	
		public static SystemBuilder buildSystem(String processID){
			SystemBuilder instance;
			switch (processID) {
			«FOR process : system.processes»
			case "«process.name»":
				instance = «process.name.toFirstUpper»SystemBuilder.getInstance();			
				break;
			«ENDFOR»
			default:
				throw new RuntimeException(String.format("Invalid program argument. The parameter '%s' could not be dispatched.",processID) );
			}
			return instance;
		}
	}
		
	'''
	
}