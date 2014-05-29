package hu.bme.mit.mdsd.pineapple.dataflownet.resources.generator

import dataflownet.DataflowSystem
import hu.bme.mit.mdsd.pineapple.dataflownet.resources.GeneratorHelper
import org.eclipse.emf.ecore.resource.Resource
import typehierarchy.Type
import typehierarchy.UserType
import typehierarchy.ComplexType


class DataflowNetGenerator {
		
	def generate(Resource res) {
		var content = res.contents.get(0);
		if (content instanceof DataflowSystem){
			var ds = content as DataflowSystem;
			var projectName = "hu.bme.mit.mdsd.pineapple.dataflownet.bundle";
			var namespace = "hu.bme.mit.mdsd.pineapple.dataflownet.process";
			
//			GeneratorHelper.createProject(namespace);
			
			var exists = GeneratorHelper.isProjectExists(projectName);
			if(!exists){
				GeneratorHelper.showError("The project 'hu.bme.mit.mdsd.pineapple.dataflownet.bundle' was not found. Please import it first.");
				return;
			}
			var srcExists = GeneratorHelper.isFolderExists(projectName,"src") || GeneratorHelper.isFolderExists(projectName,"src-gen")
			if(!srcExists){
				GeneratorHelper.showSrcError("The source folders 'src' and 'src-gen' were not found. Create them first in the 'hu.bme.mit.mdsd.pineapple.dataflownet.bundle' project.");
				return;
			}
			
			
			
			var builder = DataflowNetSystemBuilder.newInstance;
			builder.generateDataflowNetSystem(ds, projectName, namespace);
			
			var dispatcher = DataflowNetDispatcher.newInstance;
			GeneratorHelper.createJavaFile(projectName, namespace, "Dispatcher", true, 
						dispatcher.generateDispatcher(ds)
					);
			
			generateOwnTypes(ds, projectName, namespace);
			
		}
		
	}

	
	def generateOwnTypes(DataflowSystem ds, String projectName, String namespace){
		
		var types = ds.types;
		var ownTypesGenerator = DataflowNetOwnTypes.newInstance;
		
			for(Type type : types){
				if(type instanceof UserType){
					var userType = type as UserType;
					
					var name = userType.name.toFirstUpper;
					
					GeneratorHelper.createJavaFile(projectName, namespace,name, true, 
						ownTypesGenerator.generateUserType(namespace, name, userType.domain)
					);
				}
				
				if(type instanceof ComplexType){
					var complexType = type as ComplexType;
					
					var name = complexType.name.toFirstUpper;
					var superName = name + "Abstract";
					
					GeneratorHelper.createJavaFile(projectName, namespace, superName, true, 
						ownTypesGenerator.generateComplexTypeAbstract(namespace, superName, complexType)
					);
					
					GeneratorHelper.createJavaFile(projectName, namespace, name, false, 
						ownTypesGenerator.generateComplexType(namespace, name, superName, complexType)
					);
				}
				
			}
			
	}
	
	
}