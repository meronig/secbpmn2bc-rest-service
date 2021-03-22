/**
 */
package it.polimi.isgroup.secbpmn2bc.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.SubProcess#getOnChainModel <em>On Chain Model</em>}</li>
 * </ul>
 *
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getSubProcess()
 * @model
 * @generated
 */
public interface SubProcess extends it.unitn.disi.sweng.secbpmn.model.SubProcess {
	/**
	 * Returns the value of the '<em><b>On Chain Model</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Chain Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Chain Model</em>' attribute.
	 * @see #setOnChainModel(Boolean)
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getSubProcess_OnChainModel()
	 * @model default="" dataType="it.polimi.isgroup.secbpmn2bc.model.BooleanWithNull"
	 * @generated
	 */
	Boolean getOnChainModel();

	/**
	 * Sets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.SubProcess#getOnChainModel <em>On Chain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Chain Model</em>' attribute.
	 * @see #getOnChainModel()
	 * @generated
	 */
	void setOnChainModel(Boolean value);

} // SubProcess
