package it.polimi.isgroup.secbpmn2bc.model.infer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import it.polimi.isgroup.secbpmn2bc.model.*;
import it.polimi.isgroup.secbpmn2bc.model.Process;
import it.polimi.isgroup.secbpmn2bc.model.util.ModelNavigator;
import it.unitn.disi.sweng.gmt.model.GMTNode;
import it.unitn.disi.sweng.secbpmn.model.TaskType;

public class InferBCProperties {
	
	private List<ConsoleMessage> inferElement(GMTNode element, HashMap<String, List<Combination>> result){
		List<ConsoleMessage> messages = new ArrayList<ConsoleMessage>();
		
		SeparationOfDutyInference sdi = new SeparationOfDutyInference();
		AvailabilityInference ai = new AvailabilityInference();
		IntegrityInference ii = new IntegrityInference();
		PrivityInference pi = new PrivityInference();
		FlowEnforceabilityInference fei = new FlowEnforceabilityInference();
		GatewayEnforceabilityInference gei = new GatewayEnforceabilityInference(); 
		
		sdi.infer(element, result, messages);
    	ii.infer(element, result, messages);
    	ai.infer(element, result, messages);
    	pi.infer(element, result, messages);
    	fei.infer(element, result, messages);
    	gei.infer(element, result, messages);
    	
    	return messages;
	}
	
	private List<ConsoleMessage> determineAdmissibleCombinations(Definitions def,
			HashMap<String, List<Combination>> sets) {
		List<ConsoleMessage> messages = new ArrayList<ConsoleMessage>();
		propagateUp((GMTNode) def, sets, messages);
		propagateDown((GMTNode) def, sets, messages);
		return messages;
	}
	
	public List<ConsoleMessage> inferResource(Resource resource){
		Definitions def = (Definitions) resource.getContents().get(0);
		List<ConsoleMessage> messages = new ArrayList<ConsoleMessage> ();
		HashMap<String, List<Combination>> result = new HashMap<String, List<Combination>>();
	    
		List<GMTNode> nodes = ModelNavigator.getChildNodes(def);
		
		System.out.println(nodes.toString());
	    System.out.println("a test");
	    
	    for (GMTNode node : nodes){
	    	System.out.println(node.toString());
	    	messages.addAll(inferElement(node,result));
	    }
	    
	    if(checkForErrors(messages)){
	    	messages.add(new ConsoleMessage(Severity.ERROR, null, "Errors were found evaluating security annotations"));
		    System.out.println("Errors were found evaluating security annotations");
	    	System.out.println(result);
		    return messages;
	    }
	    
	    messages.add(new ConsoleMessage(Severity.INFORMATION, null, "Finished evaluating security annotations"));
	    System.out.println("Finished evaluating security annotations");
	    System.out.println(result);
	    
	    messages.addAll(determineAdmissibleCombinations(def,result));
	    
	    if(checkForErrors(messages)){
	    	messages.add(new ConsoleMessage(Severity.ERROR, null, "Errors were found determining admissible properties"));
		    System.out.println("Errors were found determining admissible properties");
	    	System.out.println(result);
		    return messages;
	    }
	    
	    messages.add(new ConsoleMessage(Severity.INFORMATION, null, "Finished determining admissible properties"));
	    System.out.println("Finished determining admissible properties");
	    System.out.println(result);
	    
	    setBCProperties(nodes,result);
	    
	    return messages;
	}

	private void setBCProperties(List<GMTNode> nodes, HashMap<String, List<Combination>> result) {
		for (GMTNode node : nodes){
			Combination c = null;
			List<Combination> list = result.get(node.getUuid());
			if (list!=null){
				if (list.size()> 0)
					c = list.get(0);
				else
					//empty set, so a conflict exists
					return;
			} else
				c = new Combination(null,null);
			if (node instanceof Definitions){
				if (c.blockchainType!=null)
					((Definitions) node).setBlockchainType(c.blockchainType);
				else
					((Definitions) node).setBlockchainType(BlockchainType.PUBLIC);
				
				if (c.onChainModel!=null)
					((Definitions) node).setOnChainModel(c.onChainModel);
				else
					((Definitions) node).setOnChainModel(true);
				
			} else if (node instanceof Process) {
				
				if (c.onChainModel!=null)
					((Process) node).setOnChainModel(c.onChainModel);
				else
					((Process) node).setOnChainModel(true);
			
			} else if (node instanceof SubProcess) {
				
				if (c.onChainModel!=null)
					((SubProcess) node).setOnChainModel(c.onChainModel);
				else
					((SubProcess) node).setOnChainModel(true);
			
			} else if (node instanceof DataItems) {
				
				if (c.onChainData!=null)
					((DataItems) node).setOnChainData(c.onChainData);
				else
					((DataItems) node).setOnChainData(OnChainData.UNENCRYPTED);
			
			} else if (node instanceof Task) {
				
				if (c.onChainExecution!=null)
					((Task) node).setOnChainExecution(c.onChainExecution);
				else
					if (((Task) node).getType()!=TaskType.MANUAL && ((Task) node).getType()!=TaskType.USER)
						((Task) node).setOnChainExecution(true);
					else
						((Task) node).setOnChainExecution(false);
			
			}
		}
		
	}

	public boolean checkForErrors(List<ConsoleMessage> messages) {
		for (ConsoleMessage m : messages){
			if (m.severity == Severity.ERROR){
				return true;
			}
		}
		return false;
	}

	public boolean checkForWarnings(List<ConsoleMessage> messages) {
		for (ConsoleMessage m : messages){
			if (m.severity == Severity.WARNING){
				return true;
			}
		}
		return false;
	}
	
	private List<Combination> propagateUp(GMTNode node, HashMap<String, List<Combination>> sets,
			List<ConsoleMessage> messages) {
		
		List<Combination> parentCombinations = null; 
		//node has local combinations
		List<Combination> localCombinations = sets.get(node.getUuid()); 
		if(localCombinations!=null){
			parentCombinations = new ArrayList<Combination>();
			for (Combination c : localCombinations){
				if (node instanceof Task || node instanceof DataItems){
					//select attributes not specific for a task or dataitem
					parentCombinations.add(new Combination(c.blockchainType,c.onChainModel,c.enforcement));
				} else if (node instanceof Process || node instanceof SubProcess){
					//select attributes not specific for a process or subprocess
					parentCombinations.add(new Combination(c.blockchainType,c.enforcement));
				} else if (!(node instanceof Definitions)) {
					//select all attributes
					parentCombinations.add(new Combination(c));
				}
			}
		}
		for (GMTNode child : node.getNodes()){
			List<Combination> parentConstraints = new ArrayList<Combination>();
			List<Combination> localConstraints = new ArrayList<Combination>();
			List<Combination> childConstraints = propagateUp(child, sets, messages); 
			if(childConstraints != null){
				//compute constraints list
				for (Combination cc : childConstraints){
					if (node instanceof Process || node instanceof SubProcess){
						//local attribute is onChainModel
						localConstraints.add(new Combination(cc.blockchainType,cc.onChainModel,cc.enforcement));
						//parent attribute is blockchainType
						parentConstraints.add(new Combination(cc.blockchainType,cc.enforcement));
					} else if (node instanceof Definitions) {
						//local attribute is blockchainType
						localConstraints.add(new Combination(cc.blockchainType,cc.enforcement)); 
					} else if (node instanceof Task) {
						//local attribute is onChainExecution
						localConstraints.add(new Combination(cc.onChainExecution,cc.blockchainType,cc.onChainModel,cc.enforcement));
						//parent attributes are blockchainType and onChainModel
						parentConstraints.add(new Combination(cc.blockchainType,cc.onChainModel,cc.enforcement));
					} else if (node instanceof DataItems) {
						//local attribute is onChainData
						localConstraints.add(new Combination(cc.onChainData,cc.blockchainType,cc.onChainModel,cc.enforcement));
						//parent attributes are blockchainType and onChainModel
						parentConstraints.add(new Combination(cc.blockchainType,cc.onChainModel,cc.enforcement));
					} else {
						//all attributes must be propagated
						parentConstraints.add(new Combination(cc));
					}
				}
				//current node has some combinations
				if(localCombinations!=null){
					constrain(localCombinations,localConstraints);
					//a conflict exists among local constraints
					if(localCombinations.size()==0){
						System.out.println("Errors were found evaluating security annotations");
						messages.add(new ConsoleMessage(Severity.ERROR, node.getUuid(), "Conflicting privacy constraints hold for element "));
					}
				//child has some local constraints
				} else if (localConstraints.size()>0){
					localCombinations = factorize(localConstraints);
					sets.put(node.getUuid(), localCombinations);
				}
				//a combination for the parent node already exists
				if(parentCombinations!=null){
					constrain(parentCombinations,parentConstraints);
//					//a conflict exists among parent constraints
//					if(parentCombinations.size()==0){
//						NON DOVREBBE CAPITARE MAI
//					}
				//no parent node combination has been defined yet
				} else {
					parentCombinations = new ArrayList<Combination>();
					parentCombinations.addAll(parentConstraints);
				}
			}
		}
		System.out.println("Analyzing: "+node.getUuid());
		System.out.println("Parent combinations: "+parentCombinations);
		System.out.println("Local combinations: "+sets.get(node.getUuid()));
		return parentCombinations;
	}
	
	private void propagateDown(GMTNode node, HashMap<String, List<Combination>> sets,
			List<ConsoleMessage> messages) {
		//parent vincolato, figlio vincolato -> calcola
		//parent libero, figlio vincolato -> non fare nulla
		//parent vincolato, figlio libero -> vincola figlio
		//parent libero, figlio libero -> non fare nulla
		
		List<Combination> nodeCombinations = sets.get(node.getUuid());
		if(node.getParent()!=null){
			List<Combination> parentCombinations = sets.get(node.getParent().getUuid());
			//some combinations exist for parent node
			if (parentCombinations != null)
				//some combinations exist for current node
				if(nodeCombinations != null)
					constrain(nodeCombinations,parentCombinations);
				//no combinations exist for current node
				else
					nodeCombinations = parentCombinations;
			
			
		//no combinations exist for parent node, do nothing
		}
		Combination best = getBestCombination(nodeCombinations);
		if (best!=null)
			sets.put(node.getUuid(), new ArrayList<Combination>(Arrays.asList(best)));
		
		System.out.println();
		System.out.println("Analyzing: "+node.getUuid());
		System.out.println("Local combinations: "+nodeCombinations);
		System.out.println("Best combination: "+sets.get(node.getUuid()));
		
		for(GMTNode child : node.getNodes())
			propagateDown(child,sets,messages);		
	}

	private Combination getBestCombination(List<Combination> nodeCombinations) {
		Combination c = getSubSet(nodeCombinations,Enforcement.NATIVE);
		if (c!=null)
			return c;
		c = getSubSet(nodeCombinations,Enforcement.POSSIBLE);
		if (c!=null)
			return c;
		c = getSubSet(nodeCombinations,Enforcement.NO_ENFORCEMENT);
		return c;
	}

	private Combination getSubSet(List<Combination> nodeCombinations, Enforcement enforcement) {
		for (Combination c : nodeCombinations){
			if(c.enforcement==enforcement)
				return c;
		}
		return null;
	}

	private void constrain(List<Combination> list, List<Combination> constraints) {
		List<Combination> toRemove = new ArrayList<Combination>();
		for(Combination i : list){
			Boolean found = false;
			for(Combination c : constraints){
				if(i.satisfies(c)){
					found = true;
					break;
				}
			}
			if(!(found)){
				toRemove.add(i);
			}
		}
		for (Combination deleted: toRemove){
			list.remove(deleted);
		}
	}

	private List<Combination> factorize(List<Combination> combinations) {
		List<Combination> newSet = new ArrayList<Combination>();
		for (Combination oldC: combinations){
			boolean keep = true;
			//check if a compatible combination is already present in new set
			for (Combination newC: newSet){
				Combination moreStringent = oldC.compareTo(newC);
				if (moreStringent!=null){
					//replace current combination with more stringen one
					newC = moreStringent;
					keep=false;
				}
			}
			//combination not present yet, add it
			if(keep){
				newSet.add(oldC);
			}
		}
		return newSet;
	}
}
