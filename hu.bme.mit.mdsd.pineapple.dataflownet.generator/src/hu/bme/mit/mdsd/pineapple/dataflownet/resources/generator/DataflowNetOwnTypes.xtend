package hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator

import org.eclipse.emf.common.util.EList
import typehierarchy.ComplexType
import javax.swing.text.StyledEditorKit.ForegroundAction
import typehierarchy.BoolType
import typehierarchy.IntType
import typehierarchy.SimpleType
import typehierarchy.DoubleType
import typehierarchy.StringType

class DataflowNetOwnTypes {
	
	int variableCounter = 0;
	var types = newArrayList;
	var counters = newArrayList;
	
	def CharSequence generateUserType(String namespace, String name, EList<String> domain)'''
	package «namespace»;
	
	public enum «name» {
		«FOR value : domain»
		«value»,
		
		«ENDFOR»
	}
	
	'''
	
	def CharSequence generateComplexTypeAbstract(String namespace, String name, ComplexType type)'''
	package «namespace»;
	
	import java.io.Serializable;
	
	public abstract class «name» implements Serializable {
		protected static final long serialVersionUID = 1L;
		
		«generateComplexTypeClassBody(type, name)»
	}
	'''
	
	def generateComplexTypeClassBody( ComplexType type, String name ) {
		
		variableCounter = 0;
		types.clear;
		counters.clear;
		
		var body = '''''';
		
		for (attribute : type.containedTypes){
			variableCounter = variableCounter + 1;
			
			types.add(DataflowNetTypeHelper.mapTypes(attribute));
			counters.add(variableCounter);
		}
		
		for(Integer i : 0..types.size - 1){
			body = body +
			'''
			protected «types.get(i)» value«counters.get(i)»;
				
			public «types.get(i)» getValue«counters.get(i)»(){
				return value«counters.get(i)»;
			}
			
			'''
		}
			
		return body;
	}
	
	def CharSequence generateComplexType(String namespace, String name, String superClass, ComplexType type)'''
	package «namespace»;
	
	import java.lang.UnsupportedOperationException;
	import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.TypeVerifier;
	import hu.bme.mit.mdsd.pineapple.dataflownet.bundle.TypeVerificationException;
	
	public class «name» extends «superClass» implements Comparable<«name»> {
		
		«generateConstructor(name)»
		
		@Override
		public int compareTo(«name» «name.toFirstLower») {
			throw new UnsupportedOperationException("TODO: auto-generated method stub");
		}
		
		@Override
		public String toString(){
			throw new UnsupportedOperationException("TODO: How your object will be written to the output");
		}
		
		public static «name» convertTo(String value) {
			«type.createConvertTo(name)»
		}
	}
	'''
	
	private def CharSequence createConvertTo(ComplexType type, String name){
		
		var body = 
		'''
		String[] split = value.split(" ");
		
		try{
		'''
		
		for (Integer i : 0..type.containedTypes.size - 1){
			var SimpleType sType = type.containedTypes.get(i);
			
			body = body +
			'''
				«IF sType instanceof StringType»
				
					String convertValue«i» = split[«i»];
				«ENDIF»
				«IF sType instanceof BoolType»
				
					boolean convertValue«i» = TypeVerifier.canBeBoolean(split[«i»]);
				«ENDIF»
				«IF sType instanceof IntType»
				
					int convertValue«i» = TypeVerifier.canBeInteger(split[«i»]);
				«ENDIF»
				«IF sType instanceof DoubleType»
				
					double convertValue«i» = TypeVerifier.canBeDouble(split[«i»]);
				«ENDIF»
			'''
		}
		
		body = body + 
		'''
		
			return new «name»('''
		
		for (Integer i : 0..type.containedTypes.size - 2){
			body = body + '''convertValue«i», '''
		}
		
		body = body + '''convertValue«type.containedTypes.size - 1»);'''
		
		body = body + 
		'''
		
		}catch (TypeVerificationException ex){
			return null;
		}
		
		'''
		
		return body;
	}
	
	def generateConstructor(String name){
		var body = '''''';
		
		body = body + '''public «name» ( ''';

		for(Integer i : 0..types.size - 2){
			body = body + '''«types.get(i)» value«counters.get(i)», ''';
		}
		
		body = body + '''«types.get(types.size - 1)» value«counters.get(types.size - 1)» ) {
			'''; // last is special to avoid syntax error
		
		for(Integer i : 0..types.size - 1){
			body = body + 
			'''	this.value«counters.get(i)» = value«counters.get(i)»;
			''';
		}
		
		body = body + 
		'''
		}
		''';
		
		return body;
	}
	
}