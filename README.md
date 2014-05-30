Pineapple Dataflow Net Modeler
==============================

What is it?
-----------

It is a Dataflow Net modeler tool created at the Fault Tolerant Systems Research Group (http://www.inf.mit.bme.hu/en) at the Budapest University of Technology and Economics. It was developed as a homework for the course "Model Driven Software Development" by Ákos Hajdu, József Makai and Márton Búr. It can be used to model Dataflow Nets and generate GraphML visualization and Java simulation code.

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

Clone the repository, a detailed guide can be found in the root directory.

Roadmap
-------

Extension plans:
* Implement new protocols for remote communication
* Improve the state machine graph layout