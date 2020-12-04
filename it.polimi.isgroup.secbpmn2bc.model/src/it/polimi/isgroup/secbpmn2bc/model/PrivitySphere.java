/**
 */
package it.polimi.isgroup.secbpmn2bc.model;

import it.unitn.disi.sweng.secbpmn.model.SecurityAnnotation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privity Sphere</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.PrivitySphere#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getPrivitySphere()
 * @model
 * @generated
 */
public interface PrivitySphere extends SecurityAnnotation {

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The default value is <code>"Public"</code>.
	 * The literals are from the enumeration {@link it.polimi.isgroup.secbpmn2bc.model.PrivityScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see it.polimi.isgroup.secbpmn2bc.model.PrivityScope
	 * @see #setScope(PrivityScope)
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getPrivitySphere_Scope()
	 * @model default="Public" required="true"
	 * @generated
	 */
	PrivityScope getScope();

	/**
	 * Sets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.PrivitySphere#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see it.polimi.isgroup.secbpmn2bc.model.PrivityScope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(PrivityScope value);
} // PrivitySphere
