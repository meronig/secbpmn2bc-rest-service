/**
 */
package it.polimi.isgroup.secbpmn2bc.model.impl;

import it.polimi.isgroup.secbpmn2bc.model.BlockchainType;
import it.polimi.isgroup.secbpmn2bc.model.Definitions;

import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;
import it.unitn.disi.sweng.gmt.model.impl.GMTNamedNodeImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.impl.DefinitionsImpl#getBlockchainType <em>Blockchain Type</em>}</li>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.impl.DefinitionsImpl#isOnChainModel <em>On Chain Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionsImpl extends GMTNamedNodeImpl implements Definitions {
	/**
	 * The default value of the '{@link #getBlockchainType() <em>Blockchain Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockchainType()
	 * @generated
	 * @ordered
	 */
	protected static final BlockchainType BLOCKCHAIN_TYPE_EDEFAULT = BlockchainType.PUBLIC;

	/**
	 * The cached value of the '{@link #getBlockchainType() <em>Blockchain Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockchainType()
	 * @generated
	 * @ordered
	 */
	protected BlockchainType blockchainType = BLOCKCHAIN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOnChainModel() <em>On Chain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnChainModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_CHAIN_MODEL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isOnChainModel() <em>On Chain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnChainModel()
	 * @generated
	 * @ordered
	 */
	protected boolean onChainModel = ON_CHAIN_MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecBPMN2BCPackage.Literals.DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockchainType getBlockchainType() {
		return blockchainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlockchainType(BlockchainType newBlockchainType) {
		BlockchainType oldBlockchainType = blockchainType;
		blockchainType = newBlockchainType == null ? BLOCKCHAIN_TYPE_EDEFAULT : newBlockchainType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecBPMN2BCPackage.DEFINITIONS__BLOCKCHAIN_TYPE,
					oldBlockchainType, blockchainType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOnChainModel() {
		return onChainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnChainModel(boolean newOnChainModel) {
		boolean oldOnChainModel = onChainModel;
		onChainModel = newOnChainModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecBPMN2BCPackage.DEFINITIONS__ON_CHAIN_MODEL,
					oldOnChainModel, onChainModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SecBPMN2BCPackage.DEFINITIONS__BLOCKCHAIN_TYPE:
			return getBlockchainType();
		case SecBPMN2BCPackage.DEFINITIONS__ON_CHAIN_MODEL:
			return isOnChainModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SecBPMN2BCPackage.DEFINITIONS__BLOCKCHAIN_TYPE:
			setBlockchainType((BlockchainType) newValue);
			return;
		case SecBPMN2BCPackage.DEFINITIONS__ON_CHAIN_MODEL:
			setOnChainModel((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SecBPMN2BCPackage.DEFINITIONS__BLOCKCHAIN_TYPE:
			setBlockchainType(BLOCKCHAIN_TYPE_EDEFAULT);
			return;
		case SecBPMN2BCPackage.DEFINITIONS__ON_CHAIN_MODEL:
			setOnChainModel(ON_CHAIN_MODEL_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SecBPMN2BCPackage.DEFINITIONS__BLOCKCHAIN_TYPE:
			return blockchainType != BLOCKCHAIN_TYPE_EDEFAULT;
		case SecBPMN2BCPackage.DEFINITIONS__ON_CHAIN_MODEL:
			return onChainModel != ON_CHAIN_MODEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (BlockchainType: "); //$NON-NLS-1$
		result.append(blockchainType);
		result.append(", OnChainModel: "); //$NON-NLS-1$
		result.append(onChainModel);
		result.append(')');
		return result.toString();
	}

} //DefinitionsImpl
