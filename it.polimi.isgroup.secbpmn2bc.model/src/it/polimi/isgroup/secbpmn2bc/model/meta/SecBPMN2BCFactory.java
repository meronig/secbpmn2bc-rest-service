/**
 */
package it.polimi.isgroup.secbpmn2bc.model.meta;

import it.polimi.isgroup.secbpmn2bc.model.BlockchainType;
import it.polimi.isgroup.secbpmn2bc.model.DataInput;
import it.polimi.isgroup.secbpmn2bc.model.DataItems;
import it.polimi.isgroup.secbpmn2bc.model.DataObject;
import it.polimi.isgroup.secbpmn2bc.model.DataOutput;
import it.polimi.isgroup.secbpmn2bc.model.DataStore;
import it.polimi.isgroup.secbpmn2bc.model.Definitions;
import it.polimi.isgroup.secbpmn2bc.model.Enforceability;
import it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope;
import it.polimi.isgroup.secbpmn2bc.model.Message;
import it.polimi.isgroup.secbpmn2bc.model.MessageRef;
import it.polimi.isgroup.secbpmn2bc.model.OnChainData;
import it.polimi.isgroup.secbpmn2bc.model.PrivityScope;
import it.polimi.isgroup.secbpmn2bc.model.PrivitySphere;

import it.polimi.isgroup.secbpmn2bc.model.SubProcess;
import it.polimi.isgroup.secbpmn2bc.model.Task;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage
 * @generated
 */
public interface SecBPMN2BCFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecBPMN2BCFactory eINSTANCE = it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Privity Sphere</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Privity Sphere</em>'.
	 * @generated
	 */
	PrivitySphere createPrivitySphere();

	/**
	 * Returns a new object of class '<em>Enforceability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enforceability</em>'.
	 * @generated
	 */
	Enforceability createEnforceability();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	it.polimi.isgroup.secbpmn2bc.model.Process createProcess();

	/**
	 * Returns a new object of class '<em>Data Items</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Items</em>'.
	 * @generated
	 */
	DataItems createDataItems();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definitions</em>'.
	 * @generated
	 */
	Definitions createDefinitions();

	/**
	 * Returns a new object of class '<em>Data Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Store</em>'.
	 * @generated
	 */
	DataStore createDataStore();

	/**
	 * Returns a new object of class '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Object</em>'.
	 * @generated
	 */
	DataObject createDataObject();

	/**
	 * Returns a new object of class '<em>Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Input</em>'.
	 * @generated
	 */
	DataInput createDataInput();

	/**
	 * Returns a new object of class '<em>Data Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Output</em>'.
	 * @generated
	 */
	DataOutput createDataOutput();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Message Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Ref</em>'.
	 * @generated
	 */
	MessageRef createMessageRef();

	/**
	 * Returns a new object of class '<em>Sub Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sub Process</em>'.
	 * @generated
	 */
	SubProcess createSubProcess();

	/**
	 * Returns an instance of data type '<em>Enforceability Scope</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	EnforceabilityScope createEnforceabilityScope(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Enforceability Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertEnforceabilityScope(EnforceabilityScope instanceValue);

	/**
	 * Returns an instance of data type '<em>Privity Scope</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	PrivityScope createPrivityScope(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Privity Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertPrivityScope(PrivityScope instanceValue);

	/**
	 * Returns an instance of data type '<em>On Chain Data</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	OnChainData createOnChainData(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>On Chain Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertOnChainData(OnChainData instanceValue);

	/**
	 * Returns an instance of data type '<em>Blockchain Type</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	BlockchainType createBlockchainType(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Blockchain Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertBlockchainType(BlockchainType instanceValue);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecBPMN2BCPackage getSecBPMN2BCPackage();

} //SecBPMN2BCFactory
