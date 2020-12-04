package it.polimi.isgroup.secbpmn2bc;
import it.polimi.isgroup.secbpmn2bc.model.Process;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EMFModelLoad {
	public Process load() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("secbpmn2bc", new XMIResourceFactoryImpl());
	    ResourceSet resSet = new ResourceSetImpl();
	    Resource resource = resSet.getResource(URI
	            .createURI("test.secbpmn2bc"), true);
	    Process proc = (Process) resource.getContents().get(0);
	    return proc;
	}
}
