/**
 */
package it.polimi.isgroup.secbpmn2bc.model.impl;

import it.polimi.isgroup.secbpmn2bc.model.Enforceability;

import it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope;
import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;

import it.unitn.disi.sweng.secbpmn.model.User;
import it.unitn.disi.sweng.secbpmn.model.impl.SecurityAnnotationImpl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enforceability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.impl.EnforceabilityImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.impl.EnforceabilityImpl#getUserDefinedUsers <em>User Defined Users</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnforceabilityImpl extends SecurityAnnotationImpl implements Enforceability {
	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final EnforceabilityScope SCOPE_EDEFAULT = EnforceabilityScope.PUBLIC;
	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EnforceabilityScope scope = SCOPE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getUserDefinedUsers() <em>User Defined Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> userDefinedUsers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnforceabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecBPMN2BCPackage.Literals.ENFORCEABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnforceabilityScope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScope(EnforceabilityScope newScope) {
		EnforceabilityScope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecBPMN2BCPackage.ENFORCEABILITY__SCOPE, oldScope,
					scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<User> getUserDefinedUsers() {
		if (userDefinedUsers == null) {
			userDefinedUsers = new EObjectResolvingEList<User>(User.class, this,
					SecBPMN2BCPackage.ENFORCEABILITY__USER_DEFINED_USERS);
		}
		return userDefinedUsers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SecBPMN2BCPackage.ENFORCEABILITY__SCOPE:
			return getScope();
		case SecBPMN2BCPackage.ENFORCEABILITY__USER_DEFINED_USERS:
			return getUserDefinedUsers();
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
		case SecBPMN2BCPackage.ENFORCEABILITY__SCOPE:
			setScope((EnforceabilityScope) newValue);
			return;
		case SecBPMN2BCPackage.ENFORCEABILITY__USER_DEFINED_USERS:
			getUserDefinedUsers().clear();
			getUserDefinedUsers().addAll((Collection<? extends User>) newValue);
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
		case SecBPMN2BCPackage.ENFORCEABILITY__SCOPE:
			setScope(SCOPE_EDEFAULT);
			return;
		case SecBPMN2BCPackage.ENFORCEABILITY__USER_DEFINED_USERS:
			getUserDefinedUsers().clear();
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
		case SecBPMN2BCPackage.ENFORCEABILITY__SCOPE:
			return scope != SCOPE_EDEFAULT;
		case SecBPMN2BCPackage.ENFORCEABILITY__USER_DEFINED_USERS:
			return userDefinedUsers != null && !userDefinedUsers.isEmpty();
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
		result.append(" (Scope: "); //$NON-NLS-1$
		result.append(scope);
		result.append(')');
		return result.toString();
	}

} //EnforceabilityImpl
