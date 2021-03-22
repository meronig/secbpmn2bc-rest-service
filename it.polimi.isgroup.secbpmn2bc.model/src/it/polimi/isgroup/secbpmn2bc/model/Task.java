/**
 */
package it.polimi.isgroup.secbpmn2bc.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.Task#getOnChainExecution <em>On Chain Execution</em>}</li>
 * </ul>
 *
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends it.unitn.disi.sweng.secbpmn.model.Task {
	/**
	 * Returns the value of the '<em><b>On Chain Execution</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Chain Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Chain Execution</em>' attribute.
	 * @see #isSetOnChainExecution()
	 * @see #unsetOnChainExecution()
	 * @see #setOnChainExecution(Boolean)
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getTask_OnChainExecution()
	 * @model default="" unsettable="true" dataType="it.polimi.isgroup.secbpmn2bc.model.BooleanWithNull"
	 * @generated
	 */
	Boolean getOnChainExecution();

	/**
	 * Sets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Task#getOnChainExecution <em>On Chain Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Chain Execution</em>' attribute.
	 * @see #isSetOnChainExecution()
	 * @see #unsetOnChainExecution()
	 * @see #getOnChainExecution()
	 * @generated
	 */
	void setOnChainExecution(Boolean value);

	/**
	 * Unsets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Task#getOnChainExecution <em>On Chain Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnChainExecution()
	 * @see #getOnChainExecution()
	 * @see #setOnChainExecution(Boolean)
	 * @generated
	 */
	void unsetOnChainExecution();

	/**
	 * Returns whether the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Task#getOnChainExecution <em>On Chain Execution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Chain Execution</em>' attribute is set.
	 * @see #unsetOnChainExecution()
	 * @see #getOnChainExecution()
	 * @see #setOnChainExecution(Boolean)
	 * @generated
	 */
	boolean isSetOnChainExecution();

} // Task
