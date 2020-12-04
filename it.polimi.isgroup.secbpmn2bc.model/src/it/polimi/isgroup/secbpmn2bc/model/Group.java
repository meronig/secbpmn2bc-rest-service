/**
 */
package it.polimi.isgroup.secbpmn2bc.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.Group#isOnChainModel <em>On Chain Model</em>}</li>
 * </ul>
 *
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends it.unitn.disi.sweng.secbpmn.model.Group {
	/**
	 * Returns the value of the '<em><b>On Chain Model</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Chain Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Chain Model</em>' attribute.
	 * @see #setOnChainModel(boolean)
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getGroup_OnChainModel()
	 * @model default="true"
	 * @generated
	 */
	boolean isOnChainModel();

	/**
	 * Sets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Group#isOnChainModel <em>On Chain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Chain Model</em>' attribute.
	 * @see #isOnChainModel()
	 * @generated
	 */
	void setOnChainModel(boolean value);

} // Group
