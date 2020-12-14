package it.polimi.isgroup.secbpmn2bc.model.infer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;

import it.unitn.disi.sweng.gmt.model.GMTNode;

public interface SecurityAnnotationInference {

	
	public void infer(GMTNode node, HashMap<String, List<Combination>> inferredValues, List<ConsoleMessage> messages);
	
	BiFunction <List<Combination>,List<Combination>,List<Combination>> mergeProperties = 
			(oldVal, newVal) -> mergeProperties(oldVal, newVal);
	
	static List<Combination> mergeProperties(List<Combination> oldList, List<Combination> newList){
		//no constaint previously defined, return new list
		if(oldList == null) {
			return newList;
		} else {
			//a violation was detected, return old list
			if (oldList.size() == 0){
				return oldList;
			//compute the intersection of both lists
			} else {
				List<Combination> result = new ArrayList<Combination>();
				for (Combination item : oldList){
					Combination newItem = isPresent(item,newList);
					if (newItem != null){
						result.add(newItem);
					}
				}
				return result;
			}
		}
	}
	
	public static Combination isPresent(Combination item, List<Combination> newList) {
		for (Combination newItem: newList){
			//item found
			Combination present = item.compareTo(newItem);
			if(present!=null)
				return present;
//			if(item.onChainExecution == newItem.onChainExecution && 
//					item.onChainModel == newItem.onChainModel &&
//					item.onChainData == newItem.onChainData &&
//					item.blockchainType == newItem.blockchainType){
//				//old item more stringent or equal than new one
//				if(item.enforcement.compareTo(newItem.enforcement) >= 0){
//					return item;
//				//new item more stringent than old one
//				} else {
//					return newItem;
//				}
//			}
		}
		return null;
	}
	
}
