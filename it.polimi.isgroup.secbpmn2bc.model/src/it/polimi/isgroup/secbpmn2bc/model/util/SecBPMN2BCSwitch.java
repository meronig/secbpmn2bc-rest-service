/**
 */
package it.polimi.isgroup.secbpmn2bc.model.util;

import it.polimi.isgroup.secbpmn2bc.model.DataItems;
import it.polimi.isgroup.secbpmn2bc.model.Definitions;
import it.polimi.isgroup.secbpmn2bc.model.Enforceability;
import it.polimi.isgroup.secbpmn2bc.model.Group;
import it.polimi.isgroup.secbpmn2bc.model.PrivitySphere;
import it.polimi.isgroup.secbpmn2bc.model.Task;
import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;

import it.unitn.disi.sweng.gmt.model.GMTElement;
import it.unitn.disi.sweng.gmt.model.GMTNamedNode;
import it.unitn.disi.sweng.gmt.model.GMTNode;

import it.unitn.disi.sweng.secbpmn.model.Activity;
import it.unitn.disi.sweng.secbpmn.model.FlowNode;
import it.unitn.disi.sweng.secbpmn.model.SecBpmnElement;
import it.unitn.disi.sweng.secbpmn.model.SecurityAnnotation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage
 * @generated
 */
public class SecBPMN2BCSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecBPMN2BCPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecBPMN2BCSwitch() {
		if (modelPackage == null) {
			modelPackage = SecBPMN2BCPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case SecBPMN2BCPackage.PRIVITY_SPHERE: {
			PrivitySphere privitySphere = (PrivitySphere) theEObject;
			T result = casePrivitySphere(privitySphere);
			if (result == null)
				result = caseSecurityAnnotation(privitySphere);
			if (result == null)
				result = caseGMTNode(privitySphere);
			if (result == null)
				result = caseSecBpmnElement(privitySphere);
			if (result == null)
				result = caseGMTElement(privitySphere);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.ENFORCEABILITY: {
			Enforceability enforceability = (Enforceability) theEObject;
			T result = caseEnforceability(enforceability);
			if (result == null)
				result = caseSecurityAnnotation(enforceability);
			if (result == null)
				result = caseGMTNode(enforceability);
			if (result == null)
				result = caseSecBpmnElement(enforceability);
			if (result == null)
				result = caseGMTElement(enforceability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.PROCESS: {
			it.polimi.isgroup.secbpmn2bc.model.Process process = (it.polimi.isgroup.secbpmn2bc.model.Process) theEObject;
			T result = caseProcess(process);
			if (result == null)
				result = caseSecBPMN_Process(process);
			if (result == null)
				result = caseGMTNamedNode(process);
			if (result == null)
				result = caseSecBpmnElement(process);
			if (result == null)
				result = caseGMTNode(process);
			if (result == null)
				result = caseGMTElement(process);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.DATA_ITEMS: {
			DataItems dataItems = (DataItems) theEObject;
			T result = caseDataItems(dataItems);
			if (result == null)
				result = caseSecBPMN_DataItems(dataItems);
			if (result == null)
				result = caseGMTNamedNode(dataItems);
			if (result == null)
				result = caseSecBpmnElement(dataItems);
			if (result == null)
				result = caseGMTNode(dataItems);
			if (result == null)
				result = caseGMTElement(dataItems);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = caseSecBPMN_Task(task);
			if (result == null)
				result = caseActivity(task);
			if (result == null)
				result = caseFlowNode(task);
			if (result == null)
				result = caseGMTNamedNode(task);
			if (result == null)
				result = caseSecBpmnElement(task);
			if (result == null)
				result = caseGMTNode(task);
			if (result == null)
				result = caseGMTElement(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.GROUP: {
			Group group = (Group) theEObject;
			T result = caseGroup(group);
			if (result == null)
				result = caseSecBPMN_Group(group);
			if (result == null)
				result = caseGMTNamedNode(group);
			if (result == null)
				result = caseSecBpmnElement(group);
			if (result == null)
				result = caseGMTNode(group);
			if (result == null)
				result = caseGMTElement(group);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.DEFINITIONS: {
			Definitions definitions = (Definitions) theEObject;
			T result = caseDefinitions(definitions);
			if (result == null)
				result = caseGMTNamedNode(definitions);
			if (result == null)
				result = caseGMTNode(definitions);
			if (result == null)
				result = caseGMTElement(definitions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privity Sphere</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privity Sphere</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivitySphere(PrivitySphere object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enforceability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enforceability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnforceability(Enforceability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(it.polimi.isgroup.secbpmn2bc.model.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataItems(DataItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitions(Definitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGMTElement(GMTElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGMTNode(GMTNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sec Bpmn Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sec Bpmn Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBpmnElement(SecBpmnElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityAnnotation(SecurityAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGMTNamedNode(GMTNamedNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBPMN_Process(it.unitn.disi.sweng.secbpmn.model.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBPMN_DataItems(it.unitn.disi.sweng.secbpmn.model.DataItems object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlowNode(FlowNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBPMN_Task(it.unitn.disi.sweng.secbpmn.model.Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBPMN_Group(it.unitn.disi.sweng.secbpmn.model.Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SecBPMN2BCSwitch
