# Welcome to the secbpmn2bc-rest-service page!

secbpmn2bc-rest-service is a RESTful web service that exposes many of the features of the SecBPMN2BC Eclipse plugin (https://github.com/MattiaSalnitri/SecBPMN2BC). 

In particular, given a SecBPMN2BC process model, it allows to identify security and privity conflicts, and to generate blockchain-related properties.

## Requirements

This is the software configuration tested. Other software versions or operative systems are not supported.
* Eclispe 4.5.2
* Eclipse OpenJ9
* Windows 10 or 11

## Build instructions

1. Copy the library files located in the prerequisites folder inside Eclipse plugin folder
2. Start Eclipse and create a new workspace
3. Import the repository in the workspace you just created
4. Export the project dk.dtu.compute.secbpmn2bc.bpmnimporter as a Runnable JAR file.

# Acknowledgements

Copyright © 2023 - 2025 Technical University of Denmark.

Modules it.polimi.* copyright © 2020 - 2021 Giovanni Meroni, Politecnico di Milano.

Prerequisite library files copyright © 2020 University of Trento.

secbpmn2bc-rest-service has been developed as part of the project "Improving Business Processes with Blockchain: Model-driven Generation of Secure Smart Contract Code", funded by Copenhagen Fintech: https://www.copenhagenfintech.dk/projects/improving-business-processes-with-blockchain

