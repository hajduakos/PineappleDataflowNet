Pineapple Dataflow Net Modeler
==============================

What is it?
-----------

It is a Dataflow Net modeler tool created at the Fault Tolerant Systems Research Group (http://www.inf.mit.bme.hu/en) at the Budapest University of Technology and Economics. It was developed as a homework for the course "Model Driven Software Development". It can be used to model Dataflow Nets and generate GraphML visualization and Java simulation code.

Technologies used
-----------------

* Eclipse Modeling Framework 2.0.2 for creating the metamodel (Has to be installed in Eclipse)
* EMF IncQuery 0.8.0 (http://viatra.inf.mit.bme.hu/incquery) for validation (Has to be installed in Eclipse)
* Xtext 2.5.3 for creating textual language (Has to be installed in Eclipse)
* Xtend 2.5.3 for generating GraphML and Java code (Has to be installed in Eclipse)
* yED 3.12.2 for visualization (http://www.yworks.com/en/products_yed_about.html)
* Akka 2.2.2 (http://akka.io/) and Paho 0.4.0 (http://www.eclipse.org/paho/) for remote communication (Included as dependecies)

How to use it
-------------

1. Clone the repository and load the projects into the workspace.
2. Generate the metamodels.
2.1. Generate typehierarchy (hu.bme.mit.mdsd.pineapple project, TypeHierarchy.genmodel).
2.2. Generate dataflownet (hu.bme.mit.mdsd.pineapple project, DataflowNet.genmodel).
3. Generate language (hu.bme.mit.mdsd.pineapple.language, run GenerateDNLanguage.mwe2 as MWE2 workflow).
4. Run as Eclipse application (proceed with the error: Dispatcher missing).
5. Link the project "hu.bme.mit.mdsd.pineapple.dataflownet.bundle" into the runtime Eclipse workspace.
6. Open the project "hu.bme.mit.mdsd.pineapple.sample", the sample instance model is in the file "house_v9.dn".
7. Right click the "house_v9.dn" and click "Convert textual dataflownet to XMI" to get the "house_v9.dataflownet" file.
8. Right click on the "house_v9.dataflownet" file and generete the following:
8.1. Generate GraphML representation using the button "Generate GraphML Representation". Open the GraphML file in yED and use some layout.
8.2. Generate Java code using the button "Generate Java Simulation Code".
8.3. Generate UI using the button "Generate Java UI Code".
9. Link the generated project "hu.bme.mit.mdsd.pineapple.dataflownet.process.ui" into the host Eclipse application.
10. Implement the unimplemented methods of the custom complex types in the "src" folder of the project "hu.bme.mit.mdsd.pineapple.dataflownet.bundle".
11. Export the RCP using the "DataflowNetApplication.product".
12. Run the RCP in two instances:
12.1. Run with parameters "local -clearPersistedState". ("local" is the name of the first process in the instance model.)
12.2. Run with parameters "remote -clearPersistedState". ("remote" is the name of the second process in the instance model.)
13. You can enter the values of tokens as a string in the textboxes and push them on the channels using the buttons.

Roadmap
-------

Extension plans:
* Implement new protocols for remote communication
* Improve the state machine graph layout