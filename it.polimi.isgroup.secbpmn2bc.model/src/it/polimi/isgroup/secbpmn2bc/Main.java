package it.polimi.isgroup.secbpmn2bc;

import it.polimi.isgroup.secbpmn2bc.model.Process;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EMFModelLoad loader = new EMFModelLoad();
		Process proc = loader.load();
		System.out.println(proc.getName());
	}

}
