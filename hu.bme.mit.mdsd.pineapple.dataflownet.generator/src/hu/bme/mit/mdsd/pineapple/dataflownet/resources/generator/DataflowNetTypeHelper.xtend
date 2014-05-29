package hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator

import typehierarchy.BoolType
import typehierarchy.DoubleType
import typehierarchy.IntType
import typehierarchy.StringType
import typehierarchy.UserType
import typehierarchy.Type
import typehierarchy.ComplexType
import dataflownet.Token
import typehierarchy.SimpleType

class DataflowNetTypeHelper {
	
	def static CharSequence mapTypes(Type type){
		switch type {
			case type instanceof BoolType : return "Boolean"
			case type instanceof DoubleType: return "Double"
			case type instanceof IntType : return "Integer"
			case type instanceof StringType : return "String"
			case type instanceof UserType : return type.name.toFirstUpper
			case type instanceof ComplexType : return type.name.toFirstUpper
		}
	}
	
	/**
	 * Validate if a value is applicable for a simple type
	 */
	private static def boolean validateType(SimpleType type, String value){
		switch type {
			case type instanceof BoolType : {
				return (value.contentEquals("true") || value.contentEquals("false"))
			}
			case type instanceof DoubleType: {
				try{
					Double.parseDouble(value)
					return true
				}catch (NumberFormatException ex){
					return false
				}
			}
			case type instanceof IntType : {
				try{
					Integer.parseInt(value)
					return true
				}catch (NumberFormatException ex){
					return false
				}
			}
			case type instanceof StringType : {
				return true
			}
			case type instanceof UserType : {
				var userType = type as UserType;
				if(!userType.domain.contains(value)){
					return false
				}
				return true
			}
			default : return false
		}
	}
	
	def static String generateTypes(Token token, String variableName){
		
		var definition = "";
		
		switch token.type {
			case token.type instanceof BoolType : {
				definition = "Boolean " + variableName + " = new Boolean(" + token.value.get(0) + ");"
				return definition;
			}
			case token.type instanceof DoubleType: {
				definition = "Double " + variableName + " = new Double(" + token.value.get(0) + ");"
				return definition;
			}
			case token.type instanceof IntType : {
				definition = "Integer " + variableName + " = new Integer(" + token.value.get(0) + ");"
				return definition;
			}
			case token.type instanceof StringType : {
				definition = "String " + variableName + " = \"" + token.value.get(0) + "\";"
				return definition;
			}
			case token.type instanceof UserType : {
				var type = token.type as UserType;
				var value = token.value.get(0)
				
				if(!type.validateType(value)){
					throw new DataflowNetGenerationException("The value of the token " + value + " is not applicable for UserType " + type.name + ".")
				}
				
				definition = mapTypes(type) + " " + variableName + " = " + mapTypes(type) + "." + token.value.get(0) + ";"
				
				return definition;
			}
			case token.type instanceof ComplexType : {
				val type = token.type as ComplexType
				val values = token.value
				
				val StringBuilder stringBuilder = StringBuilder.newInstance
				
				if(type.containedTypes.size != values.size){
					throw new DataflowNetGenerationException("A Complex type should have as many values as contained simple types!")
				}
				
				type.containedTypes.forEach[sType, i| {if(!sType.validateType(values.get(i)))
					throw new DataflowNetGenerationException("The Complex type " + type.name + " has not applicable value " + values.get(i) + " for type " + sType.name)
				}]
				
				definition = mapTypes(type) + " " + variableName + " = new " + mapTypes(type) +"("
				
				stringBuilder.append(definition)
				
				type.containedTypes.forEach[sType, i| {
					if(sType instanceof StringType){
						stringBuilder.append("\"" + values.get(i) + "\", ")
					}
					else if(sType instanceof UserType){
						stringBuilder.append(mapTypes(sType) + "." + values.get(i) +", ")
					}
					else{
						stringBuilder.append(values.get(i) + ", ")
					}
				}]
				
				stringBuilder.setLength(stringBuilder.length - 2) // remove last ", " shit
				stringBuilder.append(");")
				return stringBuilder.toString;
			}
		}
		
	}
	
}