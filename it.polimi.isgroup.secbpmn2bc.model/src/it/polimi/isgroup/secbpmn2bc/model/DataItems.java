/**
 */
package it.polimi.isgroup.secbpmn2bc.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.DataItems#getOnChainData <em>On Chain Data</em>}</li>
 * </ul>
 *
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getDataItems()
 * @model
 * @generated
 */
public interface DataItems extends it.unitn.disi.sweng.secbpmn.model.DataItems {
	/**
	 * Returns the value of the '<em><b>On Chain Data</b></em>' attribute.
	 * The default value is <code>"Undefined"</code>.
	 * The literals are from the enumeration {@link it.polimi.isgroup.secbpmn2bc.model.OnChainData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Chain Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Chain Data</em>' attribute.
	 * @see it.polimi.isgroup.secbpmn2bc.model.OnChainData
	 * @see #isSetOnChainData()
	 * @see #unsetOnChainData()
	 * @see #setOnChainData(OnChainData)
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getDataItems_OnChainData()
	 * @model default="Undefined" unsettable="true"
	 * @generated
	 */
	OnChainData getOnChainData();

	/**
	 * Sets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.DataItems#getOnChainData <em>On Chain Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Chain Data</em>' attribute.
	 * @see it.polimi.isgroup.secbpmn2bc.model.OnChainData
	 * @see #isSetOnChainData()
	 * @see #unsetOnChainData()
	 * @see #getOnChainData()
	 * @generated
	 */
	void setOnChainData(OnChainData value);

	/**
	 * Unsets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.DataItems#getOnChainData <em>On Chain Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnChainData()
	 * @see #getOnChainData()
	 * @see #setOnChainData(OnChainData)
	 * @generated
	 */
	void unsetOnChainData();

	/**
	 * Returns whether the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.DataItems#getOnChainData <em>On Chain Data</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Chain Data</em>' attribute is set.
	 * @see #unsetOnChainData()
	 * @see #getOnChainData()
	 * @see #setOnChainData(OnChainData)
	 * @generated
	 */
	boolean isSetOnChainData();

} // DataItems
