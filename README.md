# Welcome to the SecBPMN2BC page!

SecBPMN2BC is a method created to support the design of secure business processes to be executed in blockchain. It is composed of a modelling language, a suggested workflow and a software tool that partially support the workflow by identifying conflicts and the part of the busines process that can be executed in blockchain.

This repository contains the source code and the compiled executables of the software tool of SecBPMN2BC method.

## Usage
The tool is a java-based application. 
To correctly use it we suggest to follow these steps:

1. Create a SecBPMN2 model usiong STS-Tool with the SecBPMN2 plugin. STS-Tool and SecBPMN2 plugin can be downloaded [here](https://www.sts-tool.eu). 
2. Export the XML file by navigating in the workspace of STS-Tool.
3. Start the SecBPMN2BC software and load the SecBPMn2 model. the following interface will appear:
![initial interface](image.jpg)
4. To enrich the model with blockchain-related properties, clicjkn the **SecBPMn2BC Editor** and **annotate with BC properties**.
![SecBPMN2BC menu](image.jpg)
5. Once the analisys is completed, a pop-up will confirm that the analysis is complete
![analysis complete](image.jpg)
6. By selecting an element on the structure of the process in the main pane, the lower pane will its the properties. 
![Element properies](image.jpg)

## Installation instruction 
Download the repository, navigate to the man folder and execute
`java java`

