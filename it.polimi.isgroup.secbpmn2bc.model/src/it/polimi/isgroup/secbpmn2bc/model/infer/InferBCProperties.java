package it.polimi.isgroup.secbpmn2bc.model.infer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import it.polimi.isgroup.secbpmn2bc.model.*;
import it.polimi.isgroup.secbpmn2bc.model.Process;
import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCFactory;

//TODO: implementare i seguenti controlli:
// Separation of duties
// Privity Spheres (Public/Strong Dynamic)
// Enforceability of gateways (Public)
// Integrity
// Availability

public class InferBCProperties {
	public String inferResource(Resource resource){
		SecBPMN2BCFactory factory = SecBPMN2BCFactory.eINSTANCE;
		System.out.println(resource);
		System.out.println(resource.getContents());
		for (EObject e : resource.getContents()) {
			System.out.println(e);
		}
	    Definitions def = (Definitions) resource.getContents().get(0);
		System.out.println(def);
	    System.out.println(def.getName());
	    System.out.println(def.getUuid());
	    System.out.println(def.getNodes().get(0));
	    //System.out.println(proc.getNodes().get(0).getIncomingConnections());
	    //Task t = factory.createTask();
	    //t.setName("AddedTask");
	    //proc.getNodes().add(t);
	    return "Done";
	}
}
