/**
 */
package it.polimi.isgroup.secbpmn2bc.model;

import it.unitn.disi.sweng.secbpmn.model.SecurityAnnotation;
import it.unitn.disi.sweng.secbpmn.model.User;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enforceability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.Enforceability#getScope <em>Scope</em>}</li>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.Enforceability#getUserDefinedUsers <em>User Defined Users</em>}</li>
 * </ul>
 *
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getEnforceability()
 * @model
 * @generated
 */
public interface Enforceability extends SecurityAnnotation {

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>"Public"</code>.
	 * The literals are from the enumeration {@link it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope
	 * @see #setScope(EnforceabilityScope)
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getEnforceability_Scope()
	 * @model default="Public" required="true"
	 * @generated
	 */
	EnforceabilityScope getScope();

	/**
	 * Sets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Enforceability#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see it.polimi.isgroup.secbpmn2bc.model.EnforceabilityScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(EnforceabilityScope value);

	/**
	 * Returns the value of the '<em><b>User Defined Users</b></em>' reference list.
	 * The list contents are of type {@link it.unitn.disi.sweng.secbpmn.model.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Defined Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Defined Users</em>' reference list.
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getEnforceability_UserDefinedUsers()
	 * @model
	 * @generated
	 */
	EList<User> getUserDefinedUsers();
} // Enforceability
