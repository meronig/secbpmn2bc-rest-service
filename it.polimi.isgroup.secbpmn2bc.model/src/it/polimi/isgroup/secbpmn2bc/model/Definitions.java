/**
 */
package it.polimi.isgroup.secbpmn2bc.model;

import it.unitn.disi.sweng.gmt.model.GMTNamedNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#getBlockchainType <em>Blockchain Type</em>}</li>
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#isOnChainModel <em>On Chain Model</em>}</li>
 * </ul>
 *
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getDefinitions()
 * @model
 * @generated
 */
public interface Definitions extends GMTNamedNode {
	/**
	 * Returns the value of the '<em><b>Blockchain Type</b></em>' attribute.
	 * The default value is <code>"Public"</code>.
	 * The literals are from the enumeration {@link it.polimi.isgroup.secbpmn2bc.model.BlockchainType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockchain Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockchain Type</em>' attribute.
	 * @see it.polimi.isgroup.secbpmn2bc.model.BlockchainType
	 * @see #setBlockchainType(BlockchainType)
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getDefinitions_BlockchainType()
	 * @model default="Public"
	 * @generated
	 */
	BlockchainType getBlockchainType();

	/**
	 * Sets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#getBlockchainType <em>Blockchain Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blockchain Type</em>' attribute.
	 * @see it.polimi.isgroup.secbpmn2bc.model.BlockchainType
	 * @see #getBlockchainType()
	 * @generated
	 */
	void setBlockchainType(BlockchainType value);

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
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getDefinitions_OnChainModel()
	 * @model default="true"
	 * @generated
	 */
	boolean isOnChainModel();

	/**
	 * Sets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#isOnChainModel <em>On Chain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Chain Model</em>' attribute.
	 * @see #isOnChainModel()
	 * @generated
	 */
	void setOnChainModel(boolean value);

} // Definitions
