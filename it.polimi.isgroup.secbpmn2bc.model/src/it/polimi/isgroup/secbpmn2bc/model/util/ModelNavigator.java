package it.polimi.isgroup.secbpmn2bc.model.util;

import java.util.ArrayList;
import java.util.List;

import it.unitn.disi.sweng.gmt.model.GMTNode;

public class ModelNavigator {

	public static List<GMTNode> getChildNodes(GMTNode node){
		List<GMTNode> childNodes = new ArrayList<GMTNode>();
		childNodes.add(node);
		for (GMTNode child : node.getNodes()){
			childNodes.addAll(getChildNodes(child));
		}
		return childNodes;
	}
	
}
