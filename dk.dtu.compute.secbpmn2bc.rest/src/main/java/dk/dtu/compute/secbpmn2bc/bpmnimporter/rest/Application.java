package dk.dtu.compute.secbpmn2bc.bpmnimporter.rest;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import dk.dtu.compute.secbpmn2bc.bpmnimporter.files.Bpmn2secbpmnbc;
import it.polimi.isgroup.secbpmn2bc.model.infer.ConsoleMessage;
import it.polimi.isgroup.secbpmn2bc.model.infer.InferBCProperties;
import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;
import it.polimi.isgroup.secbpmn2bc.model.util.SecBPMN2BCResourceFactoryImpl;


@SpringBootApplication
@CrossOrigin(maxAge = 3600)
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostMapping(value="/convert", produces=MediaType.APPLICATION_XML_VALUE)
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
	}return null;
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
	public String annotate(@RequestParam("file") MultipartFile file) throws IOException {
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

		list = infer.annotate(resource, true);
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		resource.save(outputStream, null);
		resource.unload();
		resource.delete(null);
		
		if(!infer.checkForErrors(list)){
			return outputStream.toString();
		} else {
			return list.toString();
		}
		
	}
	
	private void updateModel(Document input, Document result){
		XPathFactory xpathFactory = XPathFactory.newInstance();
	    XPath xpath = xpathFactory.newXPath();
	    
	    try {

	      XPathExpression expr = xpath.compile("//*");
	      NodeList nodes = (NodeList) expr.evaluate(result, XPathConstants.NODESET);
	      for (int i = 0; i < nodes.getLength(); i++) {

	        
	       //Customize the code to fetch the value based on the node type and hierarchy 
	        
	      }
	    } catch (XPathExpressionException e) {
	      e.printStackTrace();
	    }
	}
}
