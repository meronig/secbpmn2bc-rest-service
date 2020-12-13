/**
 */
package it.polimi.isgroup.secbpmn2bc.model.impl;

import it.polimi.isgroup.secbpmn2bc.model.DataItems;
import it.polimi.isgroup.secbpmn2bc.model.DataStore;
import it.polimi.isgroup.secbpmn2bc.model.OnChainData;

import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.impl.DataStoreImpl#getOnChainData <em>On Chain Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataStoreImpl extends it.unitn.disi.sweng.secbpmn.model.impl.DataStoreImpl implements DataStore {
	/**
	 * The default value of the '{@link #getOnChainData() <em>On Chain Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChainData()
	 * @generated
	 * @ordered
	 */
	protected static final OnChainData ON_CHAIN_DATA_EDEFAULT = OnChainData.UNDEFINED;

	/**
	 * The cached value of the '{@link #getOnChainData() <em>On Chain Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChainData()
	 * @generated
	 * @ordered
	 */
	protected OnChainData onChainData = ON_CHAIN_DATA_EDEFAULT;

	/**
	 * This is true if the On Chain Data attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean onChainDataESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecBPMN2BCPackage.Literals.DATA_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnChainData getOnChainData() {
		return onChainData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnChainData(OnChainData newOnChainData) {
		OnChainData oldOnChainData = onChainData;
		onChainData = newOnChainData == null ? ON_CHAIN_DATA_EDEFAULT : newOnChainData;
		boolean oldOnChainDataESet = onChainDataESet;
		onChainDataESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecBPMN2BCPackage.DATA_STORE__ON_CHAIN_DATA,
					oldOnChainData, onChainData, !oldOnChainDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOnChainData() {
		OnChainData oldOnChainData = onChainData;
		boolean oldOnChainDataESet = onChainDataESet;
		onChainData = ON_CHAIN_DATA_EDEFAULT;
		onChainDataESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SecBPMN2BCPackage.DATA_STORE__ON_CHAIN_DATA,
					oldOnChainData, ON_CHAIN_DATA_EDEFAULT, oldOnChainDataESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOnChainData() {
		return onChainDataESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SecBPMN2BCPackage.DATA_STORE__ON_CHAIN_DATA:
			return getOnChainData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SecBPMN2BCPackage.DATA_STORE__ON_CHAIN_DATA:
			setOnChainData((OnChainData) newValue);
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
		case SecBPMN2BCPackage.DATA_STORE__ON_CHAIN_DATA:
			unsetOnChainData();
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
		case SecBPMN2BCPackage.DATA_STORE__ON_CHAIN_DATA:
			return isSetOnChainData();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DataItems.class) {
			switch (derivedFeatureID) {
			case SecBPMN2BCPackage.DATA_STORE__ON_CHAIN_DATA:
				return SecBPMN2BCPackage.DATA_ITEMS__ON_CHAIN_DATA;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DataItems.class) {
			switch (baseFeatureID) {
			case SecBPMN2BCPackage.DATA_ITEMS__ON_CHAIN_DATA:
				return SecBPMN2BCPackage.DATA_STORE__ON_CHAIN_DATA;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (OnChainData: "); //$NON-NLS-1$
		if (onChainDataESet)
			result.append(onChainData);
		else
			result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //DataStoreImpl
