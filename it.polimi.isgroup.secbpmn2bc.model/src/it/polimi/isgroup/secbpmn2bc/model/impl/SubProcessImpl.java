/**
 */
package it.polimi.isgroup.secbpmn2bc.model.impl;

import it.polimi.isgroup.secbpmn2bc.model.SubProcess;

import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.impl.SubProcessImpl#getOnChainModel <em>On Chain Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubProcessImpl extends it.unitn.disi.sweng.secbpmn.model.impl.SubProcessImpl implements SubProcess {
	/**
	 * The default value of the '{@link #getOnChainModel() <em>On Chain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChainModel()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ON_CHAIN_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnChainModel() <em>On Chain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnChainModel()
	 * @generated
	 * @ordered
	 */
	protected Boolean onChainModel = ON_CHAIN_MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecBPMN2BCPackage.Literals.SUB_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnChainModel() {
		return onChainModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnChainModel(Boolean newOnChainModel) {
		Boolean oldOnChainModel = onChainModel;
		onChainModel = newOnChainModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecBPMN2BCPackage.SUB_PROCESS__ON_CHAIN_MODEL,
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
		case SecBPMN2BCPackage.SUB_PROCESS__ON_CHAIN_MODEL:
			return getOnChainModel();
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
		case SecBPMN2BCPackage.SUB_PROCESS__ON_CHAIN_MODEL:
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
		case SecBPMN2BCPackage.SUB_PROCESS__ON_CHAIN_MODEL:
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
		case SecBPMN2BCPackage.SUB_PROCESS__ON_CHAIN_MODEL:
			return ON_CHAIN_MODEL_EDEFAULT == null ? onChainModel != null
					: !ON_CHAIN_MODEL_EDEFAULT.equals(onChainModel);
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
		result.append(" (OnChainModel: "); //$NON-NLS-1$
		result.append(onChainModel);
		result.append(')');
		return result.toString();
	}

} //SubProcessImpl
