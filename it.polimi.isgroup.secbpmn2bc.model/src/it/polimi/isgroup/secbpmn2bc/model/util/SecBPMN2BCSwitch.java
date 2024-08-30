/**
 */
package it.polimi.isgroup.secbpmn2bc.model.util;

import it.polimi.isgroup.secbpmn2bc.model.DataInput;
import it.polimi.isgroup.secbpmn2bc.model.DataItems;
import it.polimi.isgroup.secbpmn2bc.model.DataObject;
import it.polimi.isgroup.secbpmn2bc.model.DataOutput;
import it.polimi.isgroup.secbpmn2bc.model.DataStore;
import it.polimi.isgroup.secbpmn2bc.model.Definitions;
import it.polimi.isgroup.secbpmn2bc.model.Enforceability;
import it.polimi.isgroup.secbpmn2bc.model.Message;
import it.polimi.isgroup.secbpmn2bc.model.MessageRef;
import it.polimi.isgroup.secbpmn2bc.model.PrivitySphere;
import it.polimi.isgroup.secbpmn2bc.model.SubProcess;
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
		case SecBPMN2BCPackage.DATA_STORE: {
			DataStore dataStore = (DataStore) theEObject;
			T result = caseDataStore(dataStore);
			if (result == null)
				result = caseSecBPMN_DataStore(dataStore);
			if (result == null)
				result = caseDataItems(dataStore);
			if (result == null)
				result = caseSecBPMN_DataItems(dataStore);
			if (result == null)
				result = caseGMTNamedNode(dataStore);
			if (result == null)
				result = caseSecBpmnElement(dataStore);
			if (result == null)
				result = caseGMTNode(dataStore);
			if (result == null)
				result = caseGMTElement(dataStore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.DATA_OBJECT: {
			DataObject dataObject = (DataObject) theEObject;
			T result = caseDataObject(dataObject);
			if (result == null)
				result = caseSecBPMN_DataObject(dataObject);
			if (result == null)
				result = caseDataItems(dataObject);
			if (result == null)
				result = caseSecBPMN_DataItems(dataObject);
			if (result == null)
				result = caseGMTNamedNode(dataObject);
			if (result == null)
				result = caseSecBpmnElement(dataObject);
			if (result == null)
				result = caseGMTNode(dataObject);
			if (result == null)
				result = caseGMTElement(dataObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.DATA_INPUT: {
			DataInput dataInput = (DataInput) theEObject;
			T result = caseDataInput(dataInput);
			if (result == null)
				result = caseDataItems(dataInput);
			if (result == null)
				result = caseSecBPMN_DataInput(dataInput);
			if (result == null)
				result = caseSecBPMN_DataItems(dataInput);
			if (result == null)
				result = caseGMTNamedNode(dataInput);
			if (result == null)
				result = caseSecBpmnElement(dataInput);
			if (result == null)
				result = caseGMTNode(dataInput);
			if (result == null)
				result = caseGMTElement(dataInput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.DATA_OUTPUT: {
			DataOutput dataOutput = (DataOutput) theEObject;
			T result = caseDataOutput(dataOutput);
			if (result == null)
				result = caseSecBPMN_DataOutput(dataOutput);
			if (result == null)
				result = caseDataItems(dataOutput);
			if (result == null)
				result = caseSecBPMN_DataItems(dataOutput);
			if (result == null)
				result = caseGMTNamedNode(dataOutput);
			if (result == null)
				result = caseSecBpmnElement(dataOutput);
			if (result == null)
				result = caseGMTNode(dataOutput);
			if (result == null)
				result = caseGMTElement(dataOutput);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.MESSAGE: {
			Message message = (Message) theEObject;
			T result = caseMessage(message);
			if (result == null)
				result = caseDataItems(message);
			if (result == null)
				result = caseSecBPMN_Message(message);
			if (result == null)
				result = caseSecBPMN_DataItems(message);
			if (result == null)
				result = caseGMTNamedNode(message);
			if (result == null)
				result = caseSecBpmnElement(message);
			if (result == null)
				result = caseGMTNode(message);
			if (result == null)
				result = caseGMTElement(message);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.MESSAGE_REF: {
			MessageRef messageRef = (MessageRef) theEObject;
			T result = caseMessageRef(messageRef);
			if (result == null)
				result = caseSecBPMN_MessageRef(messageRef);
			if (result == null)
				result = caseMessage(messageRef);
			if (result == null)
				result = caseSecBPMN_Message(messageRef);
			if (result == null)
				result = caseDataItems(messageRef);
			if (result == null)
				result = caseSecBPMN_DataItems(messageRef);
			if (result == null)
				result = caseGMTNamedNode(messageRef);
			if (result == null)
				result = caseSecBpmnElement(messageRef);
			if (result == null)
				result = caseGMTNode(messageRef);
			if (result == null)
				result = caseGMTElement(messageRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SecBPMN2BCPackage.SUB_PROCESS: {
			SubProcess subProcess = (SubProcess) theEObject;
			T result = caseSubProcess(subProcess);
			if (result == null)
				result = caseSecBPMN_SubProcess(subProcess);
			if (result == null)
				result = caseActivity(subProcess);
			if (result == null)
				result = caseFlowNode(subProcess);
			if (result == null)
				result = caseGMTNamedNode(subProcess);
			if (result == null)
				result = caseSecBpmnElement(subProcess);
			if (result == null)
				result = caseGMTNode(subProcess);
			if (result == null)
				result = caseGMTElement(subProcess);
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataStore(DataStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataObject(DataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataInput(DataInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataOutput(DataOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageRef(MessageRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubProcess(SubProcess object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBPMN_DataStore(it.unitn.disi.sweng.secbpmn.model.DataStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBPMN_DataObject(it.unitn.disi.sweng.secbpmn.model.DataObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBPMN_DataInput(it.unitn.disi.sweng.secbpmn.model.DataInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBPMN_DataOutput(it.unitn.disi.sweng.secbpmn.model.DataOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBPMN_Message(it.unitn.disi.sweng.secbpmn.model.Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBPMN_MessageRef(it.unitn.disi.sweng.secbpmn.model.MessageRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecBPMN_SubProcess(it.unitn.disi.sweng.secbpmn.model.SubProcess object) {
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
