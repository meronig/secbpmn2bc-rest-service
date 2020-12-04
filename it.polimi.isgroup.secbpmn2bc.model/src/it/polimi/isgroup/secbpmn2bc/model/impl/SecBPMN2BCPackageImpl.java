/**
 */
package it.polimi.isgroup.secbpmn2bc.model.impl;

import it.polimi.isgroup.secbpmn2bc.model.BlockchainType;
import it.polimi.isgroup.secbpmn2bc.model.DataItems;
import it.polimi.isgroup.secbpmn2bc.model.Definitions;
import it.polimi.isgroup.secbpmn2bc.model.Enforceability;
import it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope;
import it.polimi.isgroup.secbpmn2bc.model.Group;
import it.polimi.isgroup.secbpmn2bc.model.OnChainData;
import it.polimi.isgroup.secbpmn2bc.model.PrivityScope;
import it.polimi.isgroup.secbpmn2bc.model.PrivitySphere;

import it.polimi.isgroup.secbpmn2bc.model.Task;
import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCFactory;
import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;
import it.unitn.disi.sweng.gmt.model.meta.GMTPackage;
import it.unitn.disi.sweng.secbpmn.model.meta.SecBPMNPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecBPMN2BCPackageImpl extends EPackageImpl implements SecBPMN2BCPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privitySphereEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enforceabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enforceabilityScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum privityScopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum onChainDataEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blockchainTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecBPMN2BCPackageImpl() {
		super(eNS_URI, SecBPMN2BCFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SecBPMN2BCPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecBPMN2BCPackage init() {
		if (isInited)
			return (SecBPMN2BCPackage) EPackage.Registry.INSTANCE.getEPackage(SecBPMN2BCPackage.eNS_URI);

		// Obtain or create and register package
		SecBPMN2BCPackageImpl theSecBPMN2BCPackage = (SecBPMN2BCPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof SecBPMN2BCPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new SecBPMN2BCPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SecBPMNPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSecBPMN2BCPackage.createPackageContents();

		// Initialize created meta-data
		theSecBPMN2BCPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecBPMN2BCPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecBPMN2BCPackage.eNS_URI, theSecBPMN2BCPackage);
		return theSecBPMN2BCPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivitySphere() {
		return privitySphereEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivitySphere_Scope() {
		return (EAttribute) privitySphereEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnforceability() {
		return enforceabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnforceability_Scope() {
		return (EAttribute) enforceabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnforceability_UserDefinedUsers() {
		return (EReference) enforceabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_OnChainModel() {
		return (EAttribute) processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataItems() {
		return dataItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataItems_OnChainData() {
		return (EAttribute) dataItemsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTask_OnChainExecution() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_OnChainModel() {
		return (EAttribute) groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitions() {
		return definitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinitions_BlockchainType() {
		return (EAttribute) definitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinitions_OnChainModel() {
		return (EAttribute) definitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnforceabilityScope() {
		return enforceabilityScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrivityScope() {
		return privityScopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOnChainData() {
		return onChainDataEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBlockchainType() {
		return blockchainTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecBPMN2BCFactory getSecBPMN2BCFactory() {
		return (SecBPMN2BCFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		privitySphereEClass = createEClass(PRIVITY_SPHERE);
		createEAttribute(privitySphereEClass, PRIVITY_SPHERE__SCOPE);

		enforceabilityEClass = createEClass(ENFORCEABILITY);
		createEAttribute(enforceabilityEClass, ENFORCEABILITY__SCOPE);
		createEReference(enforceabilityEClass, ENFORCEABILITY__USER_DEFINED_USERS);

		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__ON_CHAIN_MODEL);

		dataItemsEClass = createEClass(DATA_ITEMS);
		createEAttribute(dataItemsEClass, DATA_ITEMS__ON_CHAIN_DATA);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__ON_CHAIN_EXECUTION);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__ON_CHAIN_MODEL);

		definitionsEClass = createEClass(DEFINITIONS);
		createEAttribute(definitionsEClass, DEFINITIONS__BLOCKCHAIN_TYPE);
		createEAttribute(definitionsEClass, DEFINITIONS__ON_CHAIN_MODEL);

		// Create enums
		enforceabilityScopeEEnum = createEEnum(ENFORCEABILITY_SCOPE);
		privityScopeEEnum = createEEnum(PRIVITY_SCOPE);
		onChainDataEEnum = createEEnum(ON_CHAIN_DATA);
		blockchainTypeEEnum = createEEnum(BLOCKCHAIN_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SecBPMNPackage theSecBPMNPackage = (SecBPMNPackage) EPackage.Registry.INSTANCE
				.getEPackage(SecBPMNPackage.eNS_URI);
		GMTPackage theGMTPackage = (GMTPackage) EPackage.Registry.INSTANCE.getEPackage(GMTPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		privitySphereEClass.getESuperTypes().add(theSecBPMNPackage.getSecurityAnnotation());
		enforceabilityEClass.getESuperTypes().add(theSecBPMNPackage.getSecurityAnnotation());
		processEClass.getESuperTypes().add(theSecBPMNPackage.getProcess());
		dataItemsEClass.getESuperTypes().add(theSecBPMNPackage.getDataItems());
		taskEClass.getESuperTypes().add(theSecBPMNPackage.getTask());
		groupEClass.getESuperTypes().add(theSecBPMNPackage.getGroup());
		definitionsEClass.getESuperTypes().add(theGMTPackage.getGMTNamedNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(privitySphereEClass, PrivitySphere.class, "PrivitySphere", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivitySphere_Scope(), this.getPrivityScope(), "Scope", "Public", 1, 1, PrivitySphere.class, //$NON-NLS-1$//$NON-NLS-2$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enforceabilityEClass, Enforceability.class, "Enforceability", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnforceability_Scope(), this.getEnforceabilityScope(), "Scope", "Public", 1, 1, //$NON-NLS-1$//$NON-NLS-2$
				Enforceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEnforceability_UserDefinedUsers(), theSecBPMNPackage.getUser(), null, "UserDefinedUsers", //$NON-NLS-1$
				null, 0, -1, Enforceability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processEClass, it.polimi.isgroup.secbpmn2bc.model.Process.class, "Process", !IS_ABSTRACT, //$NON-NLS-1$
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_OnChainModel(), ecorePackage.getEBoolean(), "OnChainModel", "true", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				it.polimi.isgroup.secbpmn2bc.model.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataItemsEClass, DataItems.class, "DataItems", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataItems_OnChainData(), this.getOnChainData(), "OnChainData", "Digest", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				DataItems.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTask_OnChainExecution(), ecorePackage.getEBoolean(), "OnChainExecution", "true", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getGroup_OnChainModel(), ecorePackage.getEBoolean(), "OnChainModel", "true", 0, 1, Group.class, //$NON-NLS-1$//$NON-NLS-2$
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionsEClass, Definitions.class, "Definitions", !IS_ABSTRACT, !IS_INTERFACE, //$NON-NLS-1$
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefinitions_BlockchainType(), this.getBlockchainType(), "BlockchainType", "Public", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefinitions_OnChainModel(), ecorePackage.getEBoolean(), "OnChainModel", "true", 0, 1, //$NON-NLS-1$//$NON-NLS-2$
				Definitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enforceabilityScopeEEnum, EnforceabilityScope.class, "EnforceabilityScope"); //$NON-NLS-1$
		addEEnumLiteral(enforceabilityScopeEEnum, EnforceabilityScope.PUBLIC);
		addEEnumLiteral(enforceabilityScopeEEnum, EnforceabilityScope.PRIVATE);
		addEEnumLiteral(enforceabilityScopeEEnum, EnforceabilityScope.USER_DEFINED);

		initEEnum(privityScopeEEnum, PrivityScope.class, "PrivityScope"); //$NON-NLS-1$
		addEEnumLiteral(privityScopeEEnum, PrivityScope.PUBLIC);
		addEEnumLiteral(privityScopeEEnum, PrivityScope.PRIVATE);
		addEEnumLiteral(privityScopeEEnum, PrivityScope.STATIC);
		addEEnumLiteral(privityScopeEEnum, PrivityScope.WEAK_DYNAMIC);
		addEEnumLiteral(privityScopeEEnum, PrivityScope.STRONG_DYNAMIC);

		initEEnum(onChainDataEEnum, OnChainData.class, "OnChainData"); //$NON-NLS-1$
		addEEnumLiteral(onChainDataEEnum, OnChainData.NONE);
		addEEnumLiteral(onChainDataEEnum, OnChainData.DIGEST);
		addEEnumLiteral(onChainDataEEnum, OnChainData.ENCRYPTED);
		addEEnumLiteral(onChainDataEEnum, OnChainData.UNENCRYPTED);

		initEEnum(blockchainTypeEEnum, BlockchainType.class, "BlockchainType"); //$NON-NLS-1$
		addEEnumLiteral(blockchainTypeEEnum, BlockchainType.PUBLIC);
		addEEnumLiteral(blockchainTypeEEnum, BlockchainType.PRIVATE);

		// Create resource
		createResource(eNS_URI);
	}

} //SecBPMN2BCPackageImpl
