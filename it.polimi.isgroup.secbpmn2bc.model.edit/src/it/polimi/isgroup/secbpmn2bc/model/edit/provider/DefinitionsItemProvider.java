/**
 */
package it.polimi.isgroup.secbpmn2bc.model.edit.provider;

import it.polimi.isgroup.secbpmn2bc.model.Definitions;

import it.polimi.isgroup.secbpmn2bc.model.edit.internal.Activator;

import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCFactory;
import it.polimi.isgroup.secbpmn2bc.model.meta.SecBPMN2BCPackage;
import it.unitn.disi.sweng.gmt.model.edit.provider.GMTNamedNodeItemProvider;
import it.unitn.disi.sweng.gmt.model.meta.GMTPackage;
import it.unitn.disi.sweng.secbpmn.model.meta.SecBPMNFactory;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link it.polimi.isgroup.secbpmn2bc.model.Definitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DefinitionsItemProvider extends GMTNamedNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBlockchainTypePropertyDescriptor(object);
			addOnChainModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Blockchain Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBlockchainTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Definitions_BlockchainType_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_Definitions_BlockchainType_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_Definitions_type"), //$NON-NLS-1$
						SecBPMN2BCPackage.Literals.DEFINITIONS__BLOCKCHAIN_TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the On Chain Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnChainModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Definitions_OnChainModel_feature"), //$NON-NLS-1$
						getString("_UI_PropertyDescriptor_description", "_UI_Definitions_OnChainModel_feature", //$NON-NLS-1$//$NON-NLS-2$
								"_UI_Definitions_type"), //$NON-NLS-1$
						SecBPMN2BCPackage.Literals.DEFINITIONS__ON_CHAIN_MODEL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Definitions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Definitions")); //$NON-NLS-1$
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Definitions) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Definitions_type") : //$NON-NLS-1$
				getString("_UI_Definitions_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Definitions.class)) {
		case SecBPMN2BCPackage.DEFINITIONS__BLOCKCHAIN_TYPE:
		case SecBPMN2BCPackage.DEFINITIONS__ON_CHAIN_MODEL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMN2BCFactory.eINSTANCE.createPrivitySphere()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMN2BCFactory.eINSTANCE.createEnforceability()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMN2BCFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMN2BCFactory.eINSTANCE.createDataItems()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMN2BCFactory.eINSTANCE.createTask()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMN2BCFactory.eINSTANCE.createDefinitions()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMN2BCFactory.eINSTANCE.createDataStore()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMN2BCFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMN2BCFactory.eINSTANCE.createDataInput()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMN2BCFactory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMN2BCFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMN2BCFactory.eINSTANCE.createMessageRef()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMN2BCFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createTemplateProcess()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createParticipant()));

		newChildDescriptors
				.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createLane()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createFlowNode()));

		newChildDescriptors
				.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createTask()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createCallActivity()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createSubProcess()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createCatchEvent()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createThrowEvent()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createStartEvent()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createEndEvent()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createBoundaryEvent()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createExclusiveGateway()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createInclusiveGateway()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createParallelGateway()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createComplexGateway()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createEventBasedGateway()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createDataItems()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createDataObject()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createDataStore()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createDataInput()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createDataOutput()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createMessageRef()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createAccountability()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createAuditability()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createAuthenticity()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createAvailability()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createConfidentiality()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createIntegrity()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createNonRepudiation()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createPrivacy()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createBindOfDuty()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createSeparationOfDuty()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES,
				SecBPMNFactory.eINSTANCE.createNonDelegation()));

		newChildDescriptors.add(
				createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createBpmnNote()));

		newChildDescriptors
				.add(createChildParameter(GMTPackage.Literals.GMT_NODE__NODES, SecBPMNFactory.eINSTANCE.createGroup()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__RELATIONS,
				SecBPMNFactory.eINSTANCE.createSequenceFlow()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__RELATIONS,
				SecBPMNFactory.eINSTANCE.createMessageFlow()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__RELATIONS,
				SecBPMNFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__RELATIONS,
				SecBPMNFactory.eINSTANCE.createDataAssociation()));

		newChildDescriptors.add(createChildParameter(GMTPackage.Literals.GMT_NODE__RELATIONS,
				SecBPMNFactory.eINSTANCE.createSecurityAssociation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Activator.INSTANCE;
	}

}
