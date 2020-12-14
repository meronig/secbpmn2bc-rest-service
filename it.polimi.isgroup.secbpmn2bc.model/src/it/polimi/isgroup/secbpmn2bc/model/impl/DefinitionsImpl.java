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
	protected static final BlockchainType BLOCKCHAIN_TYPE_EDEFAULT = BlockchainType.UNDEFINED;

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
	 * This is true if the Blockchain Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean blockchainTypeESet;

	/**
	 * The default value of the '{@link #isOnChainModel() <em>On Chain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnChainModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ON_CHAIN_MODEL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isOnChainModel() <em>On Chain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnChainModel()
	 * @generated
	 * @ordered
	 */

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
	 * This is true if the On Chain Model attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onChainModelESet;

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
		boolean oldBlockchainTypeESet = blockchainTypeESet;
		blockchainTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecBPMN2BCPackage.DEFINITIONS__BLOCKCHAIN_TYPE,
					oldBlockchainType, blockchainType, !oldBlockchainTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBlockchainType() {
		BlockchainType oldBlockchainType = blockchainType;
		boolean oldBlockchainTypeESet = blockchainTypeESet;
		blockchainType = BLOCKCHAIN_TYPE_EDEFAULT;
		blockchainTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SecBPMN2BCPackage.DEFINITIONS__BLOCKCHAIN_TYPE,
					oldBlockchainType, BLOCKCHAIN_TYPE_EDEFAULT, oldBlockchainTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBlockchainType() {
		return blockchainTypeESet;
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
		boolean oldOnChainModelESet = onChainModelESet;
		onChainModelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecBPMN2BCPackage.DEFINITIONS__ON_CHAIN_MODEL,
					oldOnChainModel, onChainModel, !oldOnChainModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOnChainModel() {
		boolean oldOnChainModel = onChainModel;
		boolean oldOnChainModelESet = onChainModelESet;
		onChainModel = ON_CHAIN_MODEL_EDEFAULT;
		onChainModelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SecBPMN2BCPackage.DEFINITIONS__ON_CHAIN_MODEL,
					oldOnChainModel, ON_CHAIN_MODEL_EDEFAULT, oldOnChainModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOnChainModel() {
		return onChainModelESet;
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
			unsetBlockchainType();
			return;
		case SecBPMN2BCPackage.DEFINITIONS__ON_CHAIN_MODEL:
			unsetOnChainModel();
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
			return isSetBlockchainType();
		case SecBPMN2BCPackage.DEFINITIONS__ON_CHAIN_MODEL:
			return isSetOnChainModel();
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
		if (blockchainTypeESet)
			result.append(blockchainType);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(", OnChainModel: "); //$NON-NLS-1$
		if (onChainModelESet)
			result.append(onChainModel);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //DefinitionsImpl
