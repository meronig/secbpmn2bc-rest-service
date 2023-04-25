package it.polimi.isgroup.secbpmn2bc.model.importer;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SecBPMNImporter {

	public void importDiagram(String diagramPath, String newModel){
		String secbpmn2bcns = "http://it.polimi.isgroup.secbpmn2bc.model/1.0";
		String secbpmn2bcprefix = "secbpmn2bc";
		String secbpmnns = "http://it.unitn.disi.sweng.secbpmn.model/1.0";
		String secbpmnprefix = "secbpmn";
		String xsins = "http://www.w3.org/2001/XMLSchema-instance";
		String xsiprefix = "xsi";
		String xmlns = "http://www.w3.org/2000/xmlns/";
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    try {
	    	File inputDiagram = new File(diagramPath);
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputDiagram);
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			Element originalDocumentElement = doc.getDocumentElement();
			Element newDocumentElement = doc.createElementNS(secbpmn2bcns, "Definitions");
			newDocumentElement.setPrefix(secbpmn2bcprefix);
			newDocumentElement.setAttributeNS(xmlns, "xmlns:"+secbpmnprefix, secbpmnns);
			newDocumentElement.setAttributeNS(xmlns, "xmlns:"+xsiprefix, xsins);
			NodeList list = originalDocumentElement.getChildNodes();
			while(list.getLength()!=0) {
			    newDocumentElement.appendChild(list.item(0));
			}
			// Replace the original element
			doc.replaceChild(newDocumentElement, originalDocumentElement);
			
			list = doc.getElementsByTagName("nodes");
			for (int i = 0; i < list.getLength(); i++) {
			    Element ele = (Element) list.item(i);
			    System.out.println(ele.getAttribute("name"));
		    	System.out.println(ele.getAttribute("xsi:type"));
		    	if (ele.getAttribute("xsi:type").equals("secbpmn:Process")) {
			    	ele.setAttribute("xsi:type", "secbpmn2bc:Process");
			    	System.out.println(ele.getAttribute("xsi:type"));
			    } else if (ele.getAttribute("xsi:type").equals("secbpmn:DataItems")) {
			    	ele.setAttribute("xsi:type", "secbpmn2bc:DataItems");
			    	System.out.println(ele.getAttribute("xsi:type"));
			    } else if (ele.getAttribute("xsi:type").equals("secbpmn:Task")) {
			    	ele.setAttribute("xsi:type", "secbpmn2bc:Task");
			    	System.out.println(ele.getAttribute("xsi:type"));
			    } else if (ele.getAttribute("xsi:type").equals("secbpmn:DataStore")) {
			    	ele.setAttribute("xsi:type", "secbpmn2bc:DataStore");
			    	System.out.println(ele.getAttribute("xsi:type"));
			    } else if (ele.getAttribute("xsi:type").equals("secbpmn:DataObject")) {
			    	ele.setAttribute("xsi:type", "secbpmn2bc:DataObject");
			    	System.out.println(ele.getAttribute("xsi:type"));
			    } else if (ele.getAttribute("xsi:type").equals("secbpmn:DataInput")) {
			    	ele.setAttribute("xsi:type", "secbpmn2bc:DataInput");
			    	System.out.println(ele.getAttribute("xsi:type"));
			    } else if (ele.getAttribute("xsi:type").equals("secbpmn:DataOutput")) {
			    	ele.setAttribute("xsi:type", "secbpmn2bc:DataOutput");
			    	System.out.println(ele.getAttribute("xsi:type"));
			    } else if (ele.getAttribute("xsi:type").equals("secbpmn:Message")) {
			    	ele.setAttribute("xsi:type", "secbpmn2bc:Message");
			    	System.out.println(ele.getAttribute("xsi:type"));
			    } else if (ele.getAttribute("xsi:type").equals("secbpmn:MessageRef")) {
			    	ele.setAttribute("xsi:type", "secbpmn2bc:MessageRef");
			    	System.out.println(ele.getAttribute("xsi:type"));
			    } else if (ele.getAttribute("xsi:type").equals("secbpmn:SubProcess")) {
			    	ele.setAttribute("xsi:type", "secbpmn2bc:SubProcess");
			    	System.out.println(ele.getAttribute("xsi:type"));
			    }
			}
			
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			Result output = new StreamResult(new File(newModel));
			Source input = new DOMSource(doc);

			transformer.transform(input, output);
			
		} catch (ParserConfigurationException | SAXException | IOException | TransformerConfigurationException | TransformerFactoryConfigurationError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
}
