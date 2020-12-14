# Welcome to the SecBPMN2BC page!

SecBPMN2BC is a method created to support the design of *secure business processes* to be executed in blockchain. It is composed of a modelling language, a suggested workflow and a software tool that partially support the workflow by identifying conflicts and the part of the busines process that can be executed in blockchain.

This is the repository of SecBPMN2BC software tool, that supports the SecBPMN2BC medoth in identifing security and privity conflicts, and generating blockchain-related  properties for SecBPMN2 elements.

## Repository content
This repostory contains
* this guide
* the compiled version of the software tool 
* source code of the software tool
* compiled library of STS-Tool

## Installation instruction 
Download the SecBPMN2BC.jar file from this repository.
Navigate with your shell to the folder containing the downloaded file, and execute `java -jar SecBPMN2BC.jar`


## Usage
The tool is a java-based application. 
To correctly use it we suggest to follow these steps:

1. Create a SecBPMN2 model usiong STS-Tool with the SecBPMN2 plugin. STS-Tool and SecBPMN2 plugin can be downloaded [here](https://www.sts-tool.eu). 
2. Export the XML file by navigating in the workspace of STS-Tool.
3. Start the SecBPMN2BC software and load the SecBPMn2 model. the following interface will appear:
![initial interface](https://github.com/MattiaSalnitri/SecBPMN2BC/blob/main/documentation/images/1-initialModel.png)
4. To enrich the model with blockchain-related properties, clicjkn the **SecBPMn2BC Editor** and **annotate with BC properties**.
![SecBPMN2BC menu](https://github.com/MattiaSalnitri/SecBPMN2BC/blob/main/documentation/images/2-openMenu.png)
5. Once the analisys is completed, a pop-up will confirm that the analysis is complete
![analysis complete](https://github.com/MattiaSalnitri/SecBPMN2BC/blob/main/documentation/images/3-completedOk.png)
6. By selecting an element on the structure of the process in the main pane, the lower pane will its the properties. 
![Element properies](https://github.com/MattiaSalnitri/SecBPMN2BC/blob/main/documentation/images/4-annotatedModel.png)


