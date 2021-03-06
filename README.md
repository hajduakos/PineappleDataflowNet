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

How much time it took
---------------------

The homework was done in 4 phases. The table shows our work hours in each phase.

| Name         | Phase 1 | Phase 2 | Phase 3 | Phase 4 | Total |
|--------------|---------|---------|---------|---------|-------|
| Ákos Hajdu   |      11 |      26 |      18 |      22 |    77 |
| József Makai |    11.5 |      35 |      31 |      14 |  91.5 |
| Márton Búr   |       9 |      28 |    26.5 |    16.5 |    80 |

Roadmap
-------

Extension plans:
* Implement new protocols for remote communication
* Improve the state machine graph layout

Related projects
----------------

Go Model Railway Project - a homework for the same MDSD course next year (a railway modeler, https://github.com/benedekh/gomrp).
