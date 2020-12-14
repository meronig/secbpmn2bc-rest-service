package it.polimi.isgroup.secbpmn2bc.model.infer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import it.polimi.isgroup.secbpmn2bc.model.BlockchainType;
import it.polimi.isgroup.secbpmn2bc.model.Task;
import it.unitn.disi.sweng.gmt.model.GMTNode;
import it.unitn.disi.sweng.secbpmn.model.NonDelegation;
import it.unitn.disi.sweng.secbpmn.model.TaskType;

public class NonDelegationInference implements SecurityAnnotationInference {

	private List<Combination> getTaskCombinations(Task task){
		List<Combination> result = new ArrayList<Combination>();
		//taskexec false, bc any, model any, possible enf
		result.add(new Combination(false, BlockchainType.PUBLIC, false, Enforcement.POSSIBLE));
		result.add(new Combination(false, BlockchainType.PRIVATE, false, Enforcement.POSSIBLE));
		result.add(new Combination(false, BlockchainType.PUBLIC, true, Enforcement.POSSIBLE));
		result.add(new Combination(false, BlockchainType.PRIVATE, true, Enforcement.POSSIBLE));
		
		if(task.getType() != TaskType.MANUAL && task.getType() != TaskType.USER) {
			//taskexec true, bc any, model any, native enf
			result.add(new Combination(true, BlockchainType.PUBLIC, false, Enforcement.NATIVE));
			result.add(new Combination(true, BlockchainType.PRIVATE, false, Enforcement.NATIVE));
			result.add(new Combination(true, BlockchainType.PUBLIC, true, Enforcement.NATIVE));
			result.add(new Combination(true, BlockchainType.PRIVATE, true, Enforcement.NATIVE));
		}
		
		return result;
	}
	
	@Override
	public void infer(GMTNode node, HashMap<String, List<Combination>> inferredValues, List<ConsoleMessage> messages) {
		if (node instanceof NonDelegation) {
			GMTNode element = node.getParent();
			List<Combination> result = null;
			if (element instanceof Task) {
				result = getTaskCombinations((Task) element);
			} else {
				return;
			}
			inferredValues.merge(element.getUuid(), result, mergeProperties);
			if(result.size() == 0){
				messages.add(new ConsoleMessage(Severity.ERROR, element.getUuid(), "Conflicting privacy constraints hold for element "));
			}
		}
	}

}
