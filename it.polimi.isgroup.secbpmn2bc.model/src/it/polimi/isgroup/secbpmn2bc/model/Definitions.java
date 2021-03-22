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
 *   <li>{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#getOnChainModel <em>On Chain Model</em>}</li>
 * </ul>
 *
 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getDefinitions()
 * @model
 * @generated
 */
public interface Definitions extends GMTNamedNode {
	/**
	 * Returns the value of the '<em><b>Blockchain Type</b></em>' attribute.
	 * The default value is <code>"Undefined"</code>.
	 * The literals are from the enumeration {@link it.polimi.isgroup.secbpmn2bc.model.BlockchainType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockchain Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockchain Type</em>' attribute.
	 * @see it.polimi.isgroup.secbpmn2bc.model.BlockchainType
	 * @see #isSetBlockchainType()
	 * @see #unsetBlockchainType()
	 * @see #setBlockchainType(BlockchainType)
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getDefinitions_BlockchainType()
	 * @model default="Undefined" unsettable="true" derived="true"
	 * @generated
	 */
	BlockchainType getBlockchainType();

	/**
	 * Sets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#getBlockchainType <em>Blockchain Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blockchain Type</em>' attribute.
	 * @see it.polimi.isgroup.secbpmn2bc.model.BlockchainType
	 * @see #isSetBlockchainType()
	 * @see #unsetBlockchainType()
	 * @see #getBlockchainType()
	 * @generated
	 */
	void setBlockchainType(BlockchainType value);

	/**
	 * Unsets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#getBlockchainType <em>Blockchain Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBlockchainType()
	 * @see #getBlockchainType()
	 * @see #setBlockchainType(BlockchainType)
	 * @generated
	 */
	void unsetBlockchainType();

	/**
	 * Returns whether the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#getBlockchainType <em>Blockchain Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Blockchain Type</em>' attribute is set.
	 * @see #unsetBlockchainType()
	 * @see #getBlockchainType()
	 * @see #setBlockchainType(BlockchainType)
	 * @generated
	 */
	boolean isSetBlockchainType();

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
	 * @see #isSetOnChainModel()
	 * @see #unsetOnChainModel()
	 * @see #setOnChainModel(Boolean)
	 * @see it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage#getDefinitions_OnChainModel()
	 * @model default="" unsettable="true" dataType="it.polimi.isgroup.secbpmn2bc.model.BooleanWithNull"
	 * @generated
	 */
	Boolean getOnChainModel();

	/**
	 * Sets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#getOnChainModel <em>On Chain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Chain Model</em>' attribute.
	 * @see #isSetOnChainModel()
	 * @see #unsetOnChainModel()
	 * @see #getOnChainModel()
	 * @generated
	 */
	void setOnChainModel(Boolean value);

	/**
	 * Unsets the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#getOnChainModel <em>On Chain Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOnChainModel()
	 * @see #getOnChainModel()
	 * @see #setOnChainModel(Boolean)
	 * @generated
	 */
	void unsetOnChainModel();

	/**
	 * Returns whether the value of the '{@link it.polimi.isgroup.secbpmn2bc.model.Definitions#getOnChainModel <em>On Chain Model</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>On Chain Model</em>' attribute is set.
	 * @see #unsetOnChainModel()
	 * @see #getOnChainModel()
	 * @see #setOnChainModel(Boolean)
	 * @generated
	 */
	boolean isSetOnChainModel();

} // Definitions
