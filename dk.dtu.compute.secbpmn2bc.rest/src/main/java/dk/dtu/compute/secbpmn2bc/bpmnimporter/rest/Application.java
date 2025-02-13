/*
 *
 * Copyright © 2024 Technical University of Denmark
 * 
 * This version of the software was developed by Giovanni Meroni, Assistant Professor, DTU Compute 
 *
 */
package dk.dtu.compute.secbpmn2bc.bpmnimporter.rest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Paths;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import dk.dtu.compute.secbpmn2bc.bpmnimporter.files.Bpmn2secbpmnbc;
import it.polimi.isgroup.secbpmn2bc.model.infer.ConsoleMessage;
import it.polimi.isgroup.secbpmn2bc.model.infer.InferBCProperties;
import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;
import it.polimi.isgroup.secbpmn2bc.model.util.SecBPMN2BCResourceFactoryImpl;

@SpringBootApplication
@CrossOrigin
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostMapping(value = "/convert", produces = MediaType.APPLICATION_XML_VALUE)
	public String convert(@RequestParam("file") MultipartFile file) {
		try {
			Bpmn2secbpmnbc runner = new Bpmn2secbpmnbc();
			runner.loadModels(file.getInputStream());
			runner.doBpmn2secbpmnbc(new NullProgressMonitor());
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			runner.saveModels(outputStream);
			return outputStream.toString();
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ATLExecutionException e) {
			e.printStackTrace();
		}
		return null;
	}

	@PostMapping("/check")
	public String check(@RequestParam("file") MultipartFile file) throws IOException {
		InferBCProperties infer = new InferBCProperties();
		java.nio.file.Path path = Paths.get("temp.secbpmn2bc");
		file.transferTo(path);

		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new SecBPMN2BCResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(SecBPMN2BCPackage.eNS_URI, SecBPMN2BCPackage.eINSTANCE);

		Resource resource = resourceSet.getResource(URI.createFileURI(path.toAbsolutePath().toString()), true);

		List<ConsoleMessage> list = null;

		list = infer.checkConstraint(resource);

		resource.unload();
		resource.delete(null);

		return list.toString();

	}

	@PostMapping("/annotate")
	public String annotate(@RequestParam("file") MultipartFile file, @RequestParam(value = "override", required = false) boolean override) throws IOException {
		InferBCProperties infer = new InferBCProperties();
		java.nio.file.Path path = Paths.get("temp.secbpmn2bc");
		file.transferTo(path);

		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file
		// extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new SecBPMN2BCResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(SecBPMN2BCPackage.eNS_URI, SecBPMN2BCPackage.eINSTANCE);

		Resource resource = resourceSet.getResource(URI.createFileURI(path.toAbsolutePath().toString()), true);

		List<ConsoleMessage> list = null;

		System.out.println(override);
		list = infer.annotate(resource, override);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		resource.save(outputStream, null);
		resource.unload();
		resource.delete(null);

		if (!infer.checkForErrors(list)) {
			return outputStream.toString();
		} else {
			return list.toString();
		}

	}

	@PostMapping("/updateModel")
	public String updateModel(@RequestParam("bpmnfile") MultipartFile bpmnfile,
			@RequestParam("secbpmnfile") MultipartFile secbpmnfile)
			throws ParserConfigurationException, IOException, SAXException, TransformerException {
		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();

		java.nio.file.Path secbpmnpath = Paths.get("temp.secbpmn2bc");
		secbpmnfile.transferTo(secbpmnpath);
		Document secbpmndoc = db.parse(secbpmnpath.toFile());
		
		java.nio.file.Path bpmnpath = Paths.get("temp.bpmn");
		bpmnfile.transferTo(bpmnpath);
		Document bpmndoc = db.parse(bpmnpath.toFile());

		try {
			
			/* Handle blockchainType property */
			XPathExpression expr = xpath.compile("//*[@BlockchainType]");
			NodeList srcnodes = (NodeList) expr.evaluate(secbpmndoc, XPathConstants.NODESET);
			for (int i = 0; i < srcnodes.getLength(); i++) {
				System.out.println("update invoked");
				System.out.println("Found " + srcnodes.item(i).getAttributes().getNamedItem("uuid").getNodeValue());
				XPathExpression expr2 = xpath.compile("//*[local-name()='collaboration']");
				NodeList tnodes = (NodeList) expr2.evaluate(bpmndoc, XPathConstants.NODESET);
				for (int j = 0; j < tnodes.getLength(); j++) {
					System.out.println("Found " + tnodes.item(j).getAttributes().getNamedItem("id").getNodeValue());
					Element telem = (Element) tnodes.item(j);
					telem.setAttribute("sec:blockchainType", srcnodes.item(i).getAttributes().getNamedItem("BlockchainType").getNodeValue());
				}
			}
			/* Handle onChainModel for definitions */
			expr = xpath.compile("//*[@OnChainModel][local-name()='Definitions']");
			srcnodes = (NodeList) expr.evaluate(secbpmndoc, XPathConstants.NODESET);
			for (int i = 0; i < srcnodes.getLength(); i++) {
				System.out.println("Found " + srcnodes.item(i).getAttributes().getNamedItem("uuid").getNodeValue());
				XPathExpression expr2 = xpath.compile("//*[local-name()='collaboration']");
				NodeList tnodes = (NodeList) expr2.evaluate(bpmndoc, XPathConstants.NODESET);
				for (int j = 0; j < tnodes.getLength(); j++) {
					System.out.println("Found " + tnodes.item(j).getAttributes().getNamedItem("id").getNodeValue());
					Element telem = (Element) tnodes.item(j);
					telem.setAttribute("sec:onChainModel", srcnodes.item(i).getAttributes().getNamedItem("OnChainModel").getNodeValue());
				}
			}
			/* Handle onChainModel for processes */
			expr = xpath.compile("//*[@OnChainModel][@type='secbpmn2bc:Process']");
			srcnodes = (NodeList) expr.evaluate(secbpmndoc, XPathConstants.NODESET);
			for (int i = 0; i < srcnodes.getLength(); i++) {
				System.out.println("Found " + srcnodes.item(i).getAttributes().getNamedItem("uuid").getNodeValue());
				XPathExpression expr2 = xpath.compile("//*[@processRef='" + srcnodes.item(i).getAttributes().getNamedItem("uuid").getNodeValue() + "']");
				NodeList tnodes = (NodeList) expr2.evaluate(bpmndoc, XPathConstants.NODESET);
				for (int j = 0; j < tnodes.getLength(); j++) {
					System.out.println("Found " + tnodes.item(j).getAttributes().getNamedItem("id").getNodeValue());
					Element telem = (Element) tnodes.item(j);
					telem.setAttribute("sec:onChainModel", srcnodes.item(i).getAttributes().getNamedItem("OnChainModel").getNodeValue());
				}
			}
			/* Handle onChainModel for subprocesses */
			expr = xpath.compile("//*[@OnChainModel][@type='secbpmn2bc:SubProcess']");
			srcnodes = (NodeList) expr.evaluate(secbpmndoc, XPathConstants.NODESET);
			for (int i = 0; i < srcnodes.getLength(); i++) {
				System.out.println("Found " + srcnodes.item(i).getAttributes().getNamedItem("uuid").getNodeValue());
				XPathExpression expr2 = xpath.compile("//*[@id='" + srcnodes.item(i).getAttributes().getNamedItem("uuid").getNodeValue() + "']");
				NodeList tnodes = (NodeList) expr2.evaluate(bpmndoc, XPathConstants.NODESET);
				for (int j = 0; j < tnodes.getLength(); j++) {
					System.out.println("Found " + tnodes.item(j).getAttributes().getNamedItem("id").getNodeValue());
					Element telem = (Element) tnodes.item(j);
					telem.setAttribute("sec:onChainModel", srcnodes.item(i).getAttributes().getNamedItem("OnChainModel").getNodeValue());
				}
			}
			/* Handle onChainExecution */
			expr = xpath.compile("//*[@OnChainExecution]");
			srcnodes = (NodeList) expr.evaluate(secbpmndoc, XPathConstants.NODESET);
			for (int i = 0; i < srcnodes.getLength(); i++) {
				System.out.println("Found " + srcnodes.item(i).getAttributes().getNamedItem("uuid").getNodeValue());
				XPathExpression expr2 = xpath.compile("//*[@id='" + srcnodes.item(i).getAttributes().getNamedItem("uuid").getNodeValue() + "']");
				NodeList tnodes = (NodeList) expr2.evaluate(bpmndoc, XPathConstants.NODESET);
				for (int j = 0; j < tnodes.getLength(); j++) {
					System.out.println("Found " + tnodes.item(j).getAttributes().getNamedItem("id").getNodeValue());
					Element telem = (Element) tnodes.item(j);
					telem.setAttribute("sec:onChainExecution", srcnodes.item(i).getAttributes().getNamedItem("OnChainExecution").getNodeValue());
				}
			}
			/* Handle onChainData for data objects */
			expr = xpath.compile("//*[@OnChainData][@type='secbpmn2bc:DataObject']");
			srcnodes = (NodeList) expr.evaluate(secbpmndoc, XPathConstants.NODESET);
			for (int i = 0; i < srcnodes.getLength(); i++) {
				System.out.println("Found " + srcnodes.item(i).getAttributes().getNamedItem("uuid").getNodeValue());
				XPathExpression expr2 = xpath.compile("//*[@id='" + srcnodes.item(i).getAttributes().getNamedItem("uuid").getNodeValue() + "']");
				NodeList tnodes = (NodeList) expr2.evaluate(bpmndoc, XPathConstants.NODESET);
				for (int j = 0; j < tnodes.getLength(); j++) {
					System.out.println("Found " + tnodes.item(j).getAttributes().getNamedItem("id").getNodeValue());
					Element telem = (Element) tnodes.item(j);
					telem.setAttribute("sec:onChainData", srcnodes.item(i).getAttributes().getNamedItem("OnChainData").getNodeValue());
				}
			}
			/* Handle onChainData for messages */
			expr = xpath.compile("//*[@OnChainData][@type='secbpmn2bc:MessageRef']");
			srcnodes = (NodeList) expr.evaluate(secbpmndoc, XPathConstants.NODESET);
			for (int i = 0; i < srcnodes.getLength(); i++) {
				System.out.println("Found " + srcnodes.item(i).getAttributes().getNamedItem("uuid").getNodeValue());
				System.out.println("Parent is " + srcnodes.item(i).getParentNode().getAttributes().getNamedItem("uuid").getNodeValue());
				XPathExpression expr2 = xpath.compile("//*[@id='" + srcnodes.item(i).getParentNode().getAttributes().getNamedItem("uuid").getNodeValue() + "']");
				NodeList tnodes = (NodeList) expr2.evaluate(bpmndoc, XPathConstants.NODESET);
				for (int j = 0; j < tnodes.getLength(); j++) {
					System.out.println("Found " + tnodes.item(j).getAttributes().getNamedItem("id").getNodeValue());
					Element telem = (Element) tnodes.item(j);
					telem.setAttribute("sec:onChainData", srcnodes.item(i).getAttributes().getNamedItem("OnChainData").getNodeValue());
				}
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		StringWriter writer = new StringWriter();
		transformer.transform(new DOMSource(bpmndoc), new StreamResult(writer));
		
		return writer.getBuffer().toString();
	}
}
