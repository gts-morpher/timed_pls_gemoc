/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Factory;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package;

/**
 * This is the item provider adapter for a {@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductionLineModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionLineModelItemProvider(AdapterFactory adapterFactory) {
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

			addClockPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Clock feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClockPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ProductionLineModel_clock_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ProductionLineModel_clock_feature",
								"_UI_ProductionLineModel_type"),
						pls11Package.Literals.PRODUCTION_LINE_MODEL__CLOCK, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(pls11Package.Literals.PRODUCTION_LINE_MODEL__ELTS);
			childrenFeatures.add(pls11Package.Literals.PRODUCTION_LINE_MODEL__PARTS);
			childrenFeatures.add(pls11Package.Literals.PRODUCTION_LINE_MODEL__ACTIONEXECS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ProductionLineModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProductionLineModel"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ProductionLineModel productionLineModel = (ProductionLineModel) object;
		return getString("_UI_ProductionLineModel_type") + " " + productionLineModel.getClock();
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

		switch (notification.getFeatureID(ProductionLineModel.class)) {
		case pls11Package.PRODUCTION_LINE_MODEL__CLOCK:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case pls11Package.PRODUCTION_LINE_MODEL__ELTS:
		case pls11Package.PRODUCTION_LINE_MODEL__PARTS:
		case pls11Package.PRODUCTION_LINE_MODEL__ACTIONEXECS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(pls11Package.Literals.PRODUCTION_LINE_MODEL__ELTS,
				pls11Factory.eINSTANCE.createConveyor()));

		newChildDescriptors.add(createChildParameter(pls11Package.Literals.PRODUCTION_LINE_MODEL__ELTS,
				pls11Factory.eINSTANCE.createTray()));

		newChildDescriptors.add(createChildParameter(pls11Package.Literals.PRODUCTION_LINE_MODEL__ELTS,
				pls11Factory.eINSTANCE.createPolisher()));

		newChildDescriptors.add(createChildParameter(pls11Package.Literals.PRODUCTION_LINE_MODEL__ELTS,
				pls11Factory.eINSTANCE.createAssembler()));

		newChildDescriptors.add(createChildParameter(pls11Package.Literals.PRODUCTION_LINE_MODEL__ELTS,
				pls11Factory.eINSTANCE.createGenHead()));

		newChildDescriptors.add(createChildParameter(pls11Package.Literals.PRODUCTION_LINE_MODEL__ELTS,
				pls11Factory.eINSTANCE.createGenHandle()));

		newChildDescriptors.add(createChildParameter(pls11Package.Literals.PRODUCTION_LINE_MODEL__ELTS,
				pls11Factory.eINSTANCE.createOperator()));

		newChildDescriptors.add(createChildParameter(pls11Package.Literals.PRODUCTION_LINE_MODEL__PARTS,
				pls11Factory.eINSTANCE.createHammer()));

		newChildDescriptors.add(createChildParameter(pls11Package.Literals.PRODUCTION_LINE_MODEL__PARTS,
				pls11Factory.eINSTANCE.createHead()));

		newChildDescriptors.add(createChildParameter(pls11Package.Literals.PRODUCTION_LINE_MODEL__PARTS,
				pls11Factory.eINSTANCE.createHandle()));

		newChildDescriptors.add(createChildParameter(pls11Package.Literals.PRODUCTION_LINE_MODEL__ACTIONEXECS,
				pls11Factory.eINSTANCE.createActionExec()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return pls11EditPlugin.INSTANCE;
	}

}
