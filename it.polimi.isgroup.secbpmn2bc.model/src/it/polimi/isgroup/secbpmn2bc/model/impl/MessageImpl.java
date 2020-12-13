/**
 */
package it.polimi.isgroup.secbpmn2bc.model.impl;

import it.polimi.isgroup.secbpmn2bc.model.Message;

import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;

import it.unitn.disi.sweng.secbpmn.model.MessageRef;

import it.unitn.disi.sweng.secbpmn.model.meta.SecBPMNPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.impl.MessageImpl#getReferences <em>References</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends DataItemsImpl implements Message {
	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageRef> references;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecBPMN2BCPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MessageRef> getReferences() {
		if (references == null) {
			references = new EObjectWithInverseResolvingEList<MessageRef>(MessageRef.class, this,
					SecBPMN2BCPackage.MESSAGE__REFERENCES, SecBPMNPackage.MESSAGE_REF__REFERENCE);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SecBPMN2BCPackage.MESSAGE__REFERENCES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReferences()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SecBPMN2BCPackage.MESSAGE__REFERENCES:
			return ((InternalEList<?>) getReferences()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SecBPMN2BCPackage.MESSAGE__REFERENCES:
			return getReferences();
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
		case SecBPMN2BCPackage.MESSAGE__REFERENCES:
			getReferences().clear();
			getReferences().addAll((Collection<? extends MessageRef>) newValue);
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
		case SecBPMN2BCPackage.MESSAGE__REFERENCES:
			getReferences().clear();
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
		case SecBPMN2BCPackage.MESSAGE__REFERENCES:
			return references != null && !references.isEmpty();
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
		if (baseClass == it.unitn.disi.sweng.secbpmn.model.Message.class) {
			switch (derivedFeatureID) {
			case SecBPMN2BCPackage.MESSAGE__REFERENCES:
				return SecBPMNPackage.MESSAGE__REFERENCES;
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
		if (baseClass == it.unitn.disi.sweng.secbpmn.model.Message.class) {
			switch (baseFeatureID) {
			case SecBPMNPackage.MESSAGE__REFERENCES:
				return SecBPMN2BCPackage.MESSAGE__REFERENCES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //MessageImpl
