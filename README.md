# Welcome to the SecBPMN2BC page!

SecBPMN2BC is a method created to support the design of *secure business processes* to be executed in blockchain. It is composed of a modelling language, a suggested workflow and a software tool that partially support the workflow by identifying conflicts and the part of the busines process that can be executed in blockchain.

This is the repository of SecBPMN2BC software tool, that supports the SecBPMN2BC medoth in identifing security and privity conflicts, and generating blockchain-related  properties for SecBPMN2 elements. This tool is based, and uses part of the libraries of on (STS-Tool)(https://www.sts-tool.eu).

## Repository content
This repostory contains:
* this guide
* the compiled version of the software tool 
* source code of the software tool
* compiled library of [STS-Tool](https://www.sts-tool.eu)
* a SecBPMn2BC example file, that can be used to try the tool.


## Requirements
This is the software configuration tested. Other software versions or operative systems are not supported.
* Eclispe 4.5.2
* Java 8
* Windows 10

## Installation and set-up instructions 
1. Download the jar files from the *binaries* folder.
2. Copy the juar files in the *dropin* folder of your eclipse installation
3. Start Eclipse
4. check if the plugin is installed: verify (do not click) if in the *File* -> *New* exists an element *SecBPMn2BD model*
5. Open SecBPMN2BC *Window* -> *Perscetive* ->  *Open Perspective * -> *Other* -> *Secbpmn2bceclipse


## Usage
The tool is a java-based application. 
To correctly use it we suggest to follow these steps:

1. Create a SecBPMN2 model usiong STS-Tool with the SecBPMN2 plugin. STS-Tool and SecBPMN2 plugin can be downloaded [here](https://www.sts-tool.eu). 
2. Export the XML file by navigating in the workspace of STS-Tool.
3. Open eclipse with SecBNPMN2BC plugin installed.
4. Open the SecBPMN2 exported file: *File* -> *Open File* and shose the SecBPMN2BC file. 
You can use the example files that you can find in */documentation/examples*. 
A similar interface will appear.
![initial interface](https://github.com/MattiaSalnitri/SecBPMN2BC/blob/main/documentation/images/1-initialModel.png)
5. If the console pane is not open in Eclipse, open it: *SecBPMN2BC Editor* -> *Show console*.
6. Enrich the model with blockchain-related properties: *SecBPMn2BC Editor* -> *annotate with BC properties*.
![SecBPMN2BC menu](https://github.com/MattiaSalnitri/SecBPMN2BC/blob/main/documentation/images/2-openMenu.png)
5. Once the analisys is completed, a pop-up will confirm that the analysis is complete.
![analysis complete](https://github.com/MattiaSalnitri/SecBPMN2BC/blob/main/documentation/images/3-completedOk.png)
6. By selecting an element on the structure of the process in the main pane, the lower pane will its the properties. 
![Element properies](https://github.com/MattiaSalnitri/SecBPMN2BC/blob/main/documentation/images/4-annotatedModel.png)


