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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecBPMN2BCFactoryImpl extends EFactoryImpl implements SecBPMN2BCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecBPMN2BCFactory init() {
		try {
			SecBPMN2BCFactory theSecBPMN2BCFactory = (SecBPMN2BCFactory) EPackage.Registry.INSTANCE
					.getEFactory(SecBPMN2BCPackage.eNS_URI);
			if (theSecBPMN2BCFactory != null) {
				return theSecBPMN2BCFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecBPMN2BCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecBPMN2BCFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SecBPMN2BCPackage.PRIVITY_SPHERE:
			return createPrivitySphere();
		case SecBPMN2BCPackage.ENFORCEABILITY:
			return createEnforceability();
		case SecBPMN2BCPackage.PROCESS:
			return createProcess();
		case SecBPMN2BCPackage.DATA_ITEMS:
			return createDataItems();
		case SecBPMN2BCPackage.TASK:
			return createTask();
		case SecBPMN2BCPackage.GROUP:
			return createGroup();
		case SecBPMN2BCPackage.DEFINITIONS:
			return createDefinitions();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SecBPMN2BCPackage.ENFORCEABILITY_SCOPE:
			return createEnforceabilityScopeFromString(eDataType, initialValue);
		case SecBPMN2BCPackage.PRIVITY_SCOPE:
			return createPrivityScopeFromString(eDataType, initialValue);
		case SecBPMN2BCPackage.ON_CHAIN_DATA:
			return createOnChainDataFromString(eDataType, initialValue);
		case SecBPMN2BCPackage.BLOCKCHAIN_TYPE:
			return createBlockchainTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SecBPMN2BCPackage.ENFORCEABILITY_SCOPE:
			return convertEnforceabilityScopeToString(eDataType, instanceValue);
		case SecBPMN2BCPackage.PRIVITY_SCOPE:
			return convertPrivityScopeToString(eDataType, instanceValue);
		case SecBPMN2BCPackage.ON_CHAIN_DATA:
			return convertOnChainDataToString(eDataType, instanceValue);
		case SecBPMN2BCPackage.BLOCKCHAIN_TYPE:
			return convertBlockchainTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivitySphere createPrivitySphere() {
		PrivitySphereImpl privitySphere = new PrivitySphereImpl();
		return privitySphere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enforceability createEnforceability() {
		EnforceabilityImpl enforceability = new EnforceabilityImpl();
		return enforceability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public it.polimi.isgroup.secbpmn2bc.model.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataItems createDataItems() {
		DataItemsImpl dataItems = new DataItemsImpl();
		return dataItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definitions createDefinitions() {
		DefinitionsImpl definitions = new DefinitionsImpl();
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnforceabilityScope createEnforceabilityScope(String literal) {
		EnforceabilityScope result = EnforceabilityScope.get(literal);
		if (result == null)
			throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" //$NON-NLS-1$//$NON-NLS-2$
					+ SecBPMN2BCPackage.Literals.ENFORCEABILITY_SCOPE.getName() + "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnforceabilityScope createEnforceabilityScopeFromString(EDataType eDataType, String initialValue) {
		return createEnforceabilityScope(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertEnforceabilityScope(EnforceabilityScope instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnforceabilityScopeToString(EDataType eDataType, Object instanceValue) {
		return convertEnforceabilityScope((EnforceabilityScope) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivityScope createPrivityScope(String literal) {
		PrivityScope result = PrivityScope.get(literal);
		if (result == null)
			throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" //$NON-NLS-1$//$NON-NLS-2$
					+ SecBPMN2BCPackage.Literals.PRIVITY_SCOPE.getName() + "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrivityScope createPrivityScopeFromString(EDataType eDataType, String initialValue) {
		return createPrivityScope(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertPrivityScope(PrivityScope instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrivityScopeToString(EDataType eDataType, Object instanceValue) {
		return convertPrivityScope((PrivityScope) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnChainData createOnChainData(String literal) {
		OnChainData result = OnChainData.get(literal);
		if (result == null)
			throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" //$NON-NLS-1$//$NON-NLS-2$
					+ SecBPMN2BCPackage.Literals.ON_CHAIN_DATA.getName() + "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnChainData createOnChainDataFromString(EDataType eDataType, String initialValue) {
		return createOnChainData(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertOnChainData(OnChainData instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOnChainDataToString(EDataType eDataType, Object instanceValue) {
		return convertOnChainData((OnChainData) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockchainType createBlockchainType(String literal) {
		BlockchainType result = BlockchainType.get(literal);
		if (result == null)
			throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" //$NON-NLS-1$//$NON-NLS-2$
					+ SecBPMN2BCPackage.Literals.BLOCKCHAIN_TYPE.getName() + "'"); //$NON-NLS-1$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockchainType createBlockchainTypeFromString(EDataType eDataType, String initialValue) {
		return createBlockchainType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertBlockchainType(BlockchainType instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBlockchainTypeToString(EDataType eDataType, Object instanceValue) {
		return convertBlockchainType((BlockchainType) instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecBPMN2BCPackage getSecBPMN2BCPackage() {
		return (SecBPMN2BCPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecBPMN2BCPackage getPackage() {
		return SecBPMN2BCPackage.eINSTANCE;
	}

} //SecBPMN2BCFactoryImpl
