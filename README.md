Pineapple Dataflow Net Modeler
==============================

What is it?
-----------

It is a Dataflow Net modeler tool created at the Fault Tolerant Systems Research Group (http://www.inf.mit.bme.hu/en) at the Budapest University of Technology and Economics. It was developed as a homework for the course "Model Driven Software Development". It can be used to model Dataflow Nets and generate GraphML visualization and Java simulation code.

Technologies used
-----------------

* Eclipse Modeling Framework 2.0.2 for creating the metamodel
* EMF IncQuery 0.8.0 (http://viatra.inf.mit.bme.hu/incquery) for validation
* Xtext 2.5.3 for creating textual language
* Xtend 2.5.3 for generating GraphML and Java code
* yED 3.12.2 for visualization (http://www.yworks.com/en/products_yed_about.html)
* Akka 2.2.2 (http://akka.io/) and Paho 0.4.0 (http://www.eclipse.org/paho/) for remote communication

How to use it
-------------

1. Clone the repository and load the projects into the workspace.
2. Open the sample model (TODO).
3. Right click on the .dn model file and click on "Convert textual dataflow net to XMI" to get a .dataflownet file.
3. Right click on the .dataflownet file and click on "Generate GraphML Representation" to generate the GraphML file.
4. Open the GraphML file in yED and layout the graph.
5. Right click on the .dataflownet file and click on "Generate Java Simulation Code" to generate the Java files into the project (TODO).
5. Right click on the .dataflownet file and click on "Generate Java UI Code" to generate the Java UI files into the project (TODO).
6. Open the product "DataflowNetProduct" in the project (TODO) and export the Eclipse RCP.
7. Run the Eclipse application. The only argument is the name of the process (TODO or TODO in the expample).

Roadmap
-------

Extension plans:
* Implement new protocols for remote communication
* Improve the UI