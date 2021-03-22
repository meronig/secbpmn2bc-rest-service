/**
 */
package it.polimi.isgroup.secbpmn2bc.model.meta;

import it.unitn.disi.sweng.gmt.model.meta.GMTPackage;
import it.unitn.disi.sweng.secbpmn.model.meta.SecBPMNPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCFactory
 * @model kind="package"
 * @generated
 */
public interface SecBPMN2BCPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "secbpmn2bc"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.polimi.isgroup.secbpmn2bc.model/1.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "secbpmn2bc"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecBPMN2BCPackage eINSTANCE = it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.PrivitySphereImpl <em>Privity Sphere</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.PrivitySphereImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getPrivitySphere()
	 * @generated
	 */
	int PRIVITY_SPHERE = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__UUID = SecBPMNPackage.SECURITY_ANNOTATION__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__GRAPHICALS_CONSTRAINTS = SecBPMNPackage.SECURITY_ANNOTATION__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__INCOMING_CONNECTIONS = SecBPMNPackage.SECURITY_ANNOTATION__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__OUTGOING_CONNECTIONS = SecBPMNPackage.SECURITY_ANNOTATION__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__PARENT = SecBPMNPackage.SECURITY_ANNOTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__NODES = SecBPMNPackage.SECURITY_ANNOTATION__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__RELATIONS = SecBPMNPackage.SECURITY_ANNOTATION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__DOCUMENTATION = SecBPMNPackage.SECURITY_ANNOTATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__DESCRIPTION = SecBPMNPackage.SECURITY_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Security Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__SECURITY_ASSOCIATION = SecBPMNPackage.SECURITY_ANNOTATION__SECURITY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Enforced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__ENFORCED_BY = SecBPMNPackage.SECURITY_ANNOTATION__ENFORCED_BY;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE__SCOPE = SecBPMNPackage.SECURITY_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Privity Sphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE_FEATURE_COUNT = SecBPMNPackage.SECURITY_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE___GET_ROOT_PARENT = SecBPMNPackage.SECURITY_ANNOTATION___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Privity Sphere</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVITY_SPHERE_OPERATION_COUNT = SecBPMNPackage.SECURITY_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.EnforceabilityImpl <em>Enforceability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.EnforceabilityImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getEnforceability()
	 * @generated
	 */
	int ENFORCEABILITY = 1;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__UUID = SecBPMNPackage.SECURITY_ANNOTATION__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__GRAPHICALS_CONSTRAINTS = SecBPMNPackage.SECURITY_ANNOTATION__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__INCOMING_CONNECTIONS = SecBPMNPackage.SECURITY_ANNOTATION__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__OUTGOING_CONNECTIONS = SecBPMNPackage.SECURITY_ANNOTATION__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__PARENT = SecBPMNPackage.SECURITY_ANNOTATION__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__NODES = SecBPMNPackage.SECURITY_ANNOTATION__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__RELATIONS = SecBPMNPackage.SECURITY_ANNOTATION__RELATIONS;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__DOCUMENTATION = SecBPMNPackage.SECURITY_ANNOTATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__DESCRIPTION = SecBPMNPackage.SECURITY_ANNOTATION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Security Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__SECURITY_ASSOCIATION = SecBPMNPackage.SECURITY_ANNOTATION__SECURITY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Enforced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__ENFORCED_BY = SecBPMNPackage.SECURITY_ANNOTATION__ENFORCED_BY;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__SCOPE = SecBPMNPackage.SECURITY_ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User Defined Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY__USER_DEFINED_USERS = SecBPMNPackage.SECURITY_ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enforceability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY_FEATURE_COUNT = SecBPMNPackage.SECURITY_ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY___GET_ROOT_PARENT = SecBPMNPackage.SECURITY_ANNOTATION___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Enforceability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENFORCEABILITY_OPERATION_COUNT = SecBPMNPackage.SECURITY_ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.ProcessImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__UUID = SecBPMNPackage.PROCESS__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__GRAPHICALS_CONSTRAINTS = SecBPMNPackage.PROCESS__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INCOMING_CONNECTIONS = SecBPMNPackage.PROCESS__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OUTGOING_CONNECTIONS = SecBPMNPackage.PROCESS__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARENT = SecBPMNPackage.PROCESS__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NODES = SecBPMNPackage.PROCESS__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RELATIONS = SecBPMNPackage.PROCESS__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = SecBPMNPackage.PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOCUMENTATION = SecBPMNPackage.PROCESS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DESCRIPTION = SecBPMNPackage.PROCESS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__GLOBAL = SecBPMNPackage.PROCESS__GLOBAL;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IMPORTS = SecBPMNPackage.PROCESS__IMPORTS;

	/**
	 * The feature id for the '<em><b>On Chain Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ON_CHAIN_MODEL = SecBPMNPackage.PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = SecBPMNPackage.PROCESS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_ROOT_PARENT = SecBPMNPackage.PROCESS___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = SecBPMNPackage.PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DataItemsImpl <em>Data Items</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DataItemsImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDataItems()
	 * @generated
	 */
	int DATA_ITEMS = 3;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS__UUID = SecBPMNPackage.DATA_ITEMS__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS__GRAPHICALS_CONSTRAINTS = SecBPMNPackage.DATA_ITEMS__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS__INCOMING_CONNECTIONS = SecBPMNPackage.DATA_ITEMS__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS__OUTGOING_CONNECTIONS = SecBPMNPackage.DATA_ITEMS__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS__PARENT = SecBPMNPackage.DATA_ITEMS__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS__NODES = SecBPMNPackage.DATA_ITEMS__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS__RELATIONS = SecBPMNPackage.DATA_ITEMS__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS__NAME = SecBPMNPackage.DATA_ITEMS__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS__DOCUMENTATION = SecBPMNPackage.DATA_ITEMS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS__DESCRIPTION = SecBPMNPackage.DATA_ITEMS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>On Chain Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS__ON_CHAIN_DATA = SecBPMNPackage.DATA_ITEMS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS_FEATURE_COUNT = SecBPMNPackage.DATA_ITEMS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS___GET_ROOT_PARENT = SecBPMNPackage.DATA_ITEMS___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Data Items</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEMS_OPERATION_COUNT = SecBPMNPackage.DATA_ITEMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.TaskImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 4;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__UUID = SecBPMNPackage.TASK__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__GRAPHICALS_CONSTRAINTS = SecBPMNPackage.TASK__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__INCOMING_CONNECTIONS = SecBPMNPackage.TASK__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OUTGOING_CONNECTIONS = SecBPMNPackage.TASK__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARENT = SecBPMNPackage.TASK__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NODES = SecBPMNPackage.TASK__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RELATIONS = SecBPMNPackage.TASK__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = SecBPMNPackage.TASK__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DOCUMENTATION = SecBPMNPackage.TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = SecBPMNPackage.TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_FOR_COMPENSATION = SecBPMNPackage.TASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__LOOP_CHARACTERISTIC = SecBPMNPackage.TASK__LOOP_CHARACTERISTIC;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_QUANTITY = SecBPMNPackage.TASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completition Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMPLETITION_QUANTITY = SecBPMNPackage.TASK__COMPLETITION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__BOUNDARY_EVENT_REFS = SecBPMNPackage.TASK__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TYPE = SecBPMNPackage.TASK__TYPE;

	/**
	 * The feature id for the '<em><b>On Chain Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ON_CHAIN_EXECUTION = SecBPMNPackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = SecBPMNPackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_ROOT_PARENT = SecBPMNPackage.TASK___GET_ROOT_PARENT;

	/**
	 * The operation id for the '<em>Get Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK___GET_DESCRIPTION = SecBPMNPackage.TASK___GET_DESCRIPTION;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = SecBPMNPackage.TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DefinitionsImpl <em>Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DefinitionsImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDefinitions()
	 * @generated
	 */
	int DEFINITIONS = 5;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__UUID = GMTPackage.GMT_NAMED_NODE__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__GRAPHICALS_CONSTRAINTS = GMTPackage.GMT_NAMED_NODE__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__INCOMING_CONNECTIONS = GMTPackage.GMT_NAMED_NODE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__OUTGOING_CONNECTIONS = GMTPackage.GMT_NAMED_NODE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__PARENT = GMTPackage.GMT_NAMED_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__NODES = GMTPackage.GMT_NAMED_NODE__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__RELATIONS = GMTPackage.GMT_NAMED_NODE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__NAME = GMTPackage.GMT_NAMED_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Blockchain Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__BLOCKCHAIN_TYPE = GMTPackage.GMT_NAMED_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Chain Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS__ON_CHAIN_MODEL = GMTPackage.GMT_NAMED_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_FEATURE_COUNT = GMTPackage.GMT_NAMED_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS___GET_ROOT_PARENT = GMTPackage.GMT_NAMED_NODE___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITIONS_OPERATION_COUNT = GMTPackage.GMT_NAMED_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DataStoreImpl <em>Data Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DataStoreImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDataStore()
	 * @generated
	 */
	int DATA_STORE = 6;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__UUID = SecBPMNPackage.DATA_STORE__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__GRAPHICALS_CONSTRAINTS = SecBPMNPackage.DATA_STORE__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__INCOMING_CONNECTIONS = SecBPMNPackage.DATA_STORE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__OUTGOING_CONNECTIONS = SecBPMNPackage.DATA_STORE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__PARENT = SecBPMNPackage.DATA_STORE__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__NODES = SecBPMNPackage.DATA_STORE__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__RELATIONS = SecBPMNPackage.DATA_STORE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__NAME = SecBPMNPackage.DATA_STORE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__DOCUMENTATION = SecBPMNPackage.DATA_STORE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__DESCRIPTION = SecBPMNPackage.DATA_STORE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__CAPACITY = SecBPMNPackage.DATA_STORE__CAPACITY;

	/**
	 * The feature id for the '<em><b>Is Unlimited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__IS_UNLIMITED = SecBPMNPackage.DATA_STORE__IS_UNLIMITED;

	/**
	 * The feature id for the '<em><b>On Chain Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE__ON_CHAIN_DATA = SecBPMNPackage.DATA_STORE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_FEATURE_COUNT = SecBPMNPackage.DATA_STORE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE___GET_ROOT_PARENT = SecBPMNPackage.DATA_STORE___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Data Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_STORE_OPERATION_COUNT = SecBPMNPackage.DATA_STORE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DataObjectImpl <em>Data Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DataObjectImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDataObject()
	 * @generated
	 */
	int DATA_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__UUID = SecBPMNPackage.DATA_OBJECT__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__GRAPHICALS_CONSTRAINTS = SecBPMNPackage.DATA_OBJECT__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__INCOMING_CONNECTIONS = SecBPMNPackage.DATA_OBJECT__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__OUTGOING_CONNECTIONS = SecBPMNPackage.DATA_OBJECT__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__PARENT = SecBPMNPackage.DATA_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__NODES = SecBPMNPackage.DATA_OBJECT__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__RELATIONS = SecBPMNPackage.DATA_OBJECT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__NAME = SecBPMNPackage.DATA_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DOCUMENTATION = SecBPMNPackage.DATA_OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DESCRIPTION = SecBPMNPackage.DATA_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__IS_COLLECTION = SecBPMNPackage.DATA_OBJECT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__DATA_STATE = SecBPMNPackage.DATA_OBJECT__DATA_STATE;

	/**
	 * The feature id for the '<em><b>On Chain Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT__ON_CHAIN_DATA = SecBPMNPackage.DATA_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_FEATURE_COUNT = SecBPMNPackage.DATA_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT___GET_ROOT_PARENT = SecBPMNPackage.DATA_OBJECT___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Data Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OBJECT_OPERATION_COUNT = SecBPMNPackage.DATA_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DataInputImpl <em>Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DataInputImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDataInput()
	 * @generated
	 */
	int DATA_INPUT = 8;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__UUID = DATA_ITEMS__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__GRAPHICALS_CONSTRAINTS = DATA_ITEMS__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__INCOMING_CONNECTIONS = DATA_ITEMS__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__OUTGOING_CONNECTIONS = DATA_ITEMS__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__PARENT = DATA_ITEMS__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__NODES = DATA_ITEMS__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__RELATIONS = DATA_ITEMS__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__NAME = DATA_ITEMS__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__DOCUMENTATION = DATA_ITEMS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__DESCRIPTION = DATA_ITEMS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>On Chain Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__ON_CHAIN_DATA = DATA_ITEMS__ON_CHAIN_DATA;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__IS_COLLECTION = DATA_ITEMS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_FEATURE_COUNT = DATA_ITEMS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT___GET_ROOT_PARENT = DATA_ITEMS___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_OPERATION_COUNT = DATA_ITEMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DataOutputImpl <em>Data Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DataOutputImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDataOutput()
	 * @generated
	 */
	int DATA_OUTPUT = 9;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__UUID = SecBPMNPackage.DATA_OUTPUT__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__GRAPHICALS_CONSTRAINTS = SecBPMNPackage.DATA_OUTPUT__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__INCOMING_CONNECTIONS = SecBPMNPackage.DATA_OUTPUT__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__OUTGOING_CONNECTIONS = SecBPMNPackage.DATA_OUTPUT__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__PARENT = SecBPMNPackage.DATA_OUTPUT__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__NODES = SecBPMNPackage.DATA_OUTPUT__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__RELATIONS = SecBPMNPackage.DATA_OUTPUT__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__NAME = SecBPMNPackage.DATA_OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__DOCUMENTATION = SecBPMNPackage.DATA_OUTPUT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__DESCRIPTION = SecBPMNPackage.DATA_OUTPUT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__IS_COLLECTION = SecBPMNPackage.DATA_OUTPUT__IS_COLLECTION;

	/**
	 * The feature id for the '<em><b>On Chain Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__ON_CHAIN_DATA = SecBPMNPackage.DATA_OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_FEATURE_COUNT = SecBPMNPackage.DATA_OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT___GET_ROOT_PARENT = SecBPMNPackage.DATA_OUTPUT___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Data Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_OPERATION_COUNT = SecBPMNPackage.DATA_OUTPUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.MessageImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__UUID = DATA_ITEMS__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__GRAPHICALS_CONSTRAINTS = DATA_ITEMS__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__INCOMING_CONNECTIONS = DATA_ITEMS__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OUTGOING_CONNECTIONS = DATA_ITEMS__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PARENT = DATA_ITEMS__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NODES = DATA_ITEMS__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__RELATIONS = DATA_ITEMS__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = DATA_ITEMS__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DOCUMENTATION = DATA_ITEMS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DESCRIPTION = DATA_ITEMS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>On Chain Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ON_CHAIN_DATA = DATA_ITEMS__ON_CHAIN_DATA;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__REFERENCES = DATA_ITEMS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = DATA_ITEMS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_ROOT_PARENT = DATA_ITEMS___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = DATA_ITEMS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.MessageRefImpl <em>Message Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.MessageRefImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getMessageRef()
	 * @generated
	 */
	int MESSAGE_REF = 11;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__UUID = MESSAGE__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__GRAPHICALS_CONSTRAINTS = MESSAGE__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__INCOMING_CONNECTIONS = MESSAGE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__OUTGOING_CONNECTIONS = MESSAGE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__PARENT = MESSAGE__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__NODES = MESSAGE__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__RELATIONS = MESSAGE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__NAME = MESSAGE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__DOCUMENTATION = MESSAGE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__DESCRIPTION = MESSAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>On Chain Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__ON_CHAIN_DATA = MESSAGE__ON_CHAIN_DATA;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF__REFERENCES = MESSAGE__REFERENCES;

	/**
	 * The number of structural features of the '<em>Message Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF___GET_ROOT_PARENT = MESSAGE___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Message Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_REF_OPERATION_COUNT = MESSAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.SubProcessImpl <em>Sub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SubProcessImpl
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getSubProcess()
	 * @generated
	 */
	int SUB_PROCESS = 12;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__UUID = SecBPMNPackage.SUB_PROCESS__UUID;

	/**
	 * The feature id for the '<em><b>Graphicals Constraints</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__GRAPHICALS_CONSTRAINTS = SecBPMNPackage.SUB_PROCESS__GRAPHICALS_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__INCOMING_CONNECTIONS = SecBPMNPackage.SUB_PROCESS__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__OUTGOING_CONNECTIONS = SecBPMNPackage.SUB_PROCESS__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__PARENT = SecBPMNPackage.SUB_PROCESS__PARENT;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__NODES = SecBPMNPackage.SUB_PROCESS__NODES;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__RELATIONS = SecBPMNPackage.SUB_PROCESS__RELATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__NAME = SecBPMNPackage.SUB_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DOCUMENTATION = SecBPMNPackage.SUB_PROCESS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__DESCRIPTION = SecBPMNPackage.SUB_PROCESS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__IS_FOR_COMPENSATION = SecBPMNPackage.SUB_PROCESS__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Loop Characteristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__LOOP_CHARACTERISTIC = SecBPMNPackage.SUB_PROCESS__LOOP_CHARACTERISTIC;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__START_QUANTITY = SecBPMNPackage.SUB_PROCESS__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Completition Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__COMPLETITION_QUANTITY = SecBPMNPackage.SUB_PROCESS__COMPLETITION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Boundary Event Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__BOUNDARY_EVENT_REFS = SecBPMNPackage.SUB_PROCESS__BOUNDARY_EVENT_REFS;

	/**
	 * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__TRIGGERED_BY_EVENT = SecBPMNPackage.SUB_PROCESS__TRIGGERED_BY_EVENT;

	/**
	 * The feature id for the '<em><b>Is Ad Hoc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__IS_AD_HOC = SecBPMNPackage.SUB_PROCESS__IS_AD_HOC;

	/**
	 * The feature id for the '<em><b>On Chain Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS__ON_CHAIN_MODEL = SecBPMNPackage.SUB_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_FEATURE_COUNT = SecBPMNPackage.SUB_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Root Parent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS___GET_ROOT_PARENT = SecBPMNPackage.SUB_PROCESS___GET_ROOT_PARENT;

	/**
	 * The number of operations of the '<em>Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_PROCESS_OPERATION_COUNT = SecBPMNPackage.SUB_PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope <em>Enforceability Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getEnforceabilityScope()
	 * @generated
	 */
	int ENFORCEABILITY_SCOPE = 13;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.PrivityScope <em>Privity Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.PrivityScope
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getPrivityScope()
	 * @generated
	 */
	int PRIVITY_SCOPE = 14;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.OnChainData <em>On Chain Data</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.OnChainData
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getOnChainData()
	 * @generated
	 */
	int ON_CHAIN_DATA = 15;

	/**
	 * The meta object id for the '{@link it.polimi.isgroup.secbpmn2bc.model.BlockchainType <em>Blockchain Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.polimi.isgroup.secbpmn2bc.model.BlockchainType
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getBlockchainType()
	 * @generated
	 */
	int BLOCKCHAIN_TYPE = 16;

	/**
	 * The meta object id for the '<em>Boolean With Null</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getBooleanWithNull()
	 * @generated
	 */
	int BOOLEAN_WITH_NULL = 17;

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.PrivitySphere <em>Privity Sphere</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privity Sphere</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.PrivitySphere
	 * @generated
	 */
	EClass getPrivitySphere();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.isgroup.secbpmn2bc.model.PrivitySphere#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.PrivitySphere#getScope()
	 * @see #getPrivitySphere()
	 * @generated
	 */
	EAttribute getPrivitySphere_Scope();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.Enforceability <em>Enforceability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enforceability</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Enforceability
	 * @generated
	 */
	EClass getEnforceability();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.isgroup.secbpmn2bc.model.Enforceability#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Enforceability#getScope()
	 * @see #getEnforceability()
	 * @generated
	 */
	EAttribute getEnforceability_Scope();

	/**
	 * Returns the meta object for the reference list '{@link it.polimi.isgroup.secbpmn2bc.model.Enforceability#getUserDefinedUsers <em>User Defined Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>User Defined Users</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Enforceability#getUserDefinedUsers()
	 * @see #getEnforceability()
	 * @generated
	 */
	EReference getEnforceability_UserDefinedUsers();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.isgroup.secbpmn2bc.model.Process#getOnChainModel <em>On Chain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Chain Model</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Process#getOnChainModel()
	 * @see #getProcess()
	 * @generated
	 */
	EAttribute getProcess_OnChainModel();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.DataItems <em>Data Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Items</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.DataItems
	 * @generated
	 */
	EClass getDataItems();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.isgroup.secbpmn2bc.model.DataItems#getOnChainData <em>On Chain Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Chain Data</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.DataItems#getOnChainData()
	 * @see #getDataItems()
	 * @generated
	 */
	EAttribute getDataItems_OnChainData();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.isgroup.secbpmn2bc.model.Task#getOnChainExecution <em>On Chain Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Chain Execution</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Task#getOnChainExecution()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_OnChainExecution();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definitions</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Definitions
	 * @generated
	 */
	EClass getDefinitions();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#getBlockchainType <em>Blockchain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blockchain Type</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Definitions#getBlockchainType()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_BlockchainType();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#getOnChainModel <em>On Chain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Chain Model</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Definitions#getOnChainModel()
	 * @see #getDefinitions()
	 * @generated
	 */
	EAttribute getDefinitions_OnChainModel();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Store</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.DataStore
	 * @generated
	 */
	EClass getDataStore();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.DataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Object</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.DataObject
	 * @generated
	 */
	EClass getDataObject();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Input</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.DataInput
	 * @generated
	 */
	EClass getDataInput();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.DataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Output</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.DataOutput
	 * @generated
	 */
	EClass getDataOutput();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.MessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Ref</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.MessageRef
	 * @generated
	 */
	EClass getMessageRef();

	/**
	 * Returns the meta object for class '{@link it.polimi.isgroup.secbpmn2bc.model.SubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Process</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.SubProcess
	 * @generated
	 */
	EClass getSubProcess();

	/**
	 * Returns the meta object for the attribute '{@link it.polimi.isgroup.secbpmn2bc.model.SubProcess#getOnChainModel <em>On Chain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On Chain Model</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.SubProcess#getOnChainModel()
	 * @see #getSubProcess()
	 * @generated
	 */
	EAttribute getSubProcess_OnChainModel();

	/**
	 * Returns the meta object for enum '{@link it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope <em>Enforceability Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enforceability Scope</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope
	 * @generated
	 */
	EEnum getEnforceabilityScope();

	/**
	 * Returns the meta object for enum '{@link it.polimi.isgroup.secbpmn2bc.model.PrivityScope <em>Privity Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Privity Scope</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.PrivityScope
	 * @generated
	 */
	EEnum getPrivityScope();

	/**
	 * Returns the meta object for enum '{@link it.polimi.isgroup.secbpmn2bc.model.OnChainData <em>On Chain Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>On Chain Data</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.OnChainData
	 * @generated
	 */
	EEnum getOnChainData();

	/**
	 * Returns the meta object for enum '{@link it.polimi.isgroup.secbpmn2bc.model.BlockchainType <em>Blockchain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Blockchain Type</em>'.
	 * @see it.polimi.isgroup.secbpmn2bc.model.BlockchainType
	 * @generated
	 */
	EEnum getBlockchainType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean With Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean With Null</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="baseType='EBooleanObject\r\n'"
	 * @generated
	 */
	EDataType getBooleanWithNull();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecBPMN2BCFactory getSecBPMN2BCFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.PrivitySphereImpl <em>Privity Sphere</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.PrivitySphereImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getPrivitySphere()
		 * @generated
		 */
		EClass PRIVITY_SPHERE = eINSTANCE.getPrivitySphere();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVITY_SPHERE__SCOPE = eINSTANCE.getPrivitySphere_Scope();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.EnforceabilityImpl <em>Enforceability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.EnforceabilityImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getEnforceability()
		 * @generated
		 */
		EClass ENFORCEABILITY = eINSTANCE.getEnforceability();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENFORCEABILITY__SCOPE = eINSTANCE.getEnforceability_Scope();

		/**
		 * The meta object literal for the '<em><b>User Defined Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENFORCEABILITY__USER_DEFINED_USERS = eINSTANCE.getEnforceability_UserDefinedUsers();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.ProcessImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>On Chain Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS__ON_CHAIN_MODEL = eINSTANCE.getProcess_OnChainModel();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DataItemsImpl <em>Data Items</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DataItemsImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDataItems()
		 * @generated
		 */
		EClass DATA_ITEMS = eINSTANCE.getDataItems();

		/**
		 * The meta object literal for the '<em><b>On Chain Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_ITEMS__ON_CHAIN_DATA = eINSTANCE.getDataItems_OnChainData();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.TaskImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>On Chain Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ON_CHAIN_EXECUTION = eINSTANCE.getTask_OnChainExecution();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DefinitionsImpl <em>Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DefinitionsImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDefinitions()
		 * @generated
		 */
		EClass DEFINITIONS = eINSTANCE.getDefinitions();

		/**
		 * The meta object literal for the '<em><b>Blockchain Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITIONS__BLOCKCHAIN_TYPE = eINSTANCE.getDefinitions_BlockchainType();

		/**
		 * The meta object literal for the '<em><b>On Chain Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINITIONS__ON_CHAIN_MODEL = eINSTANCE.getDefinitions_OnChainModel();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DataStoreImpl <em>Data Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DataStoreImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDataStore()
		 * @generated
		 */
		EClass DATA_STORE = eINSTANCE.getDataStore();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DataObjectImpl <em>Data Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DataObjectImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDataObject()
		 * @generated
		 */
		EClass DATA_OBJECT = eINSTANCE.getDataObject();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DataInputImpl <em>Data Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DataInputImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDataInput()
		 * @generated
		 */
		EClass DATA_INPUT = eINSTANCE.getDataInput();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.DataOutputImpl <em>Data Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.DataOutputImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getDataOutput()
		 * @generated
		 */
		EClass DATA_OUTPUT = eINSTANCE.getDataOutput();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.MessageImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.MessageRefImpl <em>Message Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.MessageRefImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getMessageRef()
		 * @generated
		 */
		EClass MESSAGE_REF = eINSTANCE.getMessageRef();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.impl.SubProcessImpl <em>Sub Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SubProcessImpl
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getSubProcess()
		 * @generated
		 */
		EClass SUB_PROCESS = eINSTANCE.getSubProcess();

		/**
		 * The meta object literal for the '<em><b>On Chain Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_PROCESS__ON_CHAIN_MODEL = eINSTANCE.getSubProcess_OnChainModel();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope <em>Enforceability Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getEnforceabilityScope()
		 * @generated
		 */
		EEnum ENFORCEABILITY_SCOPE = eINSTANCE.getEnforceabilityScope();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.PrivityScope <em>Privity Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.PrivityScope
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getPrivityScope()
		 * @generated
		 */
		EEnum PRIVITY_SCOPE = eINSTANCE.getPrivityScope();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.OnChainData <em>On Chain Data</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.OnChainData
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getOnChainData()
		 * @generated
		 */
		EEnum ON_CHAIN_DATA = eINSTANCE.getOnChainData();

		/**
		 * The meta object literal for the '{@link it.polimi.isgroup.secbpmn2bc.model.BlockchainType <em>Blockchain Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.polimi.isgroup.secbpmn2bc.model.BlockchainType
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getBlockchainType()
		 * @generated
		 */
		EEnum BLOCKCHAIN_TYPE = eINSTANCE.getBlockchainType();

		/**
		 * The meta object literal for the '<em>Boolean With Null</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see it.polimi.isgroup.secbpmn2bc.model.impl.SecBPMN2BCPackageImpl#getBooleanWithNull()
		 * @generated
		 */
		EDataType BOOLEAN_WITH_NULL = eINSTANCE.getBooleanWithNull();

	}

} //SecBPMN2BCPackage
