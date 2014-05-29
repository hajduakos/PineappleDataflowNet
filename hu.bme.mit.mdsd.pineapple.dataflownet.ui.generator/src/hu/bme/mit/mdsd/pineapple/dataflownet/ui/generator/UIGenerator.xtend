package hu.bme.mit.mdsd.pineapple.dataflownet.ui.generator

import dataflownet.DataflowSystem
import hu.bme.mit.mdsd.pineapple.dataflownet.ui.generator.helper.GeneratorHelper
import org.eclipse.emf.ecore.resource.Resource
import typehierarchy.UserType
import typehierarchy.ComplexType

class UIGenerator {
	
			
	def generate(Resource res) { 
		var content = res.contents.get(0);
		if (content instanceof DataflowSystem){
			var ds = content as DataflowSystem;
			var namespace = "hu.bme.mit.mdsd.pineapple.dataflownet.process.ui";
			
			GeneratorHelper.createProject(namespace);
			GeneratorHelper.createJavaFile(namespace, namespace, "ChannelMediator", false, ds.generateChannelMediator);

		}
	}
	
	def CharSequence generateChannelMediator(DataflowSystem ds){
		return 
		'''
		package hu.bme.mit.mdsd.pineapple.dataflownet.process.ui;

		import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.Channel;
		import hu.bme.mit.mdsd.pineapple.dataflownet.process.*;
		
		public class ChannelMediator {
			
			public static boolean putToChannel(Channel<? extends Comparable<?>> channel, String valueString){
				
				if(channel.getClazz() == String.class){
					channel.put(valueString);
				} 
				else if (channel.getClazz() == Integer.class) {
					try{
						Integer intValue = Integer.parseInt(valueString);
						channel.put(intValue);
					} catch (NumberFormatException ex){
						return false;
					}
				} 
				else if (channel.getClazz() == Double.class) {
					try{
						Double doubleValue = Double.parseDouble(valueString);
						channel.put(doubleValue);
					} catch (NumberFormatException ex){
						return false;
					}
				} 
				else if (channel.getClazz() == Boolean.class) {
					if (!valueString.toLowerCase().equals("true") && !valueString.toLowerCase().equals("false"))return false;
					boolean boolValue = Boolean.parseBoolean(valueString);
					channel.put(boolValue);
				}
				«FOR userType : ds.types.filter(UserType)»
				else if (channel.getClazz() == «userType.name.toFirstUpper».class) {
					try {
						«userType.name.toFirstUpper» enumValue = «userType.name.toFirstUpper».valueOf(valueString);
						channel.put(enumValue);
					}catch(IllegalArgumentException ex) {
						
					}
				}
				«ENDFOR»
				«FOR complexType : ds.types.filter(ComplexType)»
				else if (channel.getClazz() == «complexType.name.toFirstUpper».class) {
					«complexType.name.toFirstUpper» complexValue = «complexType.name.toFirstUpper».convertTo(valueString);
					if(complexValue != null){
						channel.put(complexValue);
					} else {
						return false;
					}
				}
				«ENDFOR»
				return true;
				
			}
		
		}
		''';
	}
	
	
}