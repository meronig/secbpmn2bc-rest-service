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
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.impl.SubProcessImpl#isOnChainModel <em>On Chain Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubProcessImpl extends it.unitn.disi.sweng.secbpmn.model.impl.SubProcessImpl implements SubProcess {
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
			return isOnChainModel();
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
		result.append(" (OnChainModel: "); //$NON-NLS-1$
		result.append(onChainModel);
		result.append(')');
		return result.toString();
	}

} //SubProcessImpl
