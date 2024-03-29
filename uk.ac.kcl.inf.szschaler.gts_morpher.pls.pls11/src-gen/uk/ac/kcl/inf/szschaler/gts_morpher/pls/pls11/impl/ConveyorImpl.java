/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Conveyor;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Tray;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ConveyorImpl#getTray <em>Tray</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorImpl extends ContainerImpl implements Conveyor {
	/**
	 * The cached value of the '{@link #getTray() <em>Tray</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTray()
	 * @generated
	 * @ordered
	 */
	protected Tray tray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pls11Package.Literals.CONVEYOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tray getTray() {
		if (tray != null && tray.eIsProxy()) {
			InternalEObject oldTray = (InternalEObject) tray;
			tray = (Tray) eResolveProxy(oldTray);
			if (tray != oldTray) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, pls11Package.CONVEYOR__TRAY, oldTray,
							tray));
			}
		}
		return tray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tray basicGetTray() {
		return tray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTray(Tray newTray) {
		Tray oldTray = tray;
		tray = newTray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pls11Package.CONVEYOR__TRAY, oldTray, tray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case pls11Package.CONVEYOR__TRAY:
			if (resolve)
				return getTray();
			return basicGetTray();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case pls11Package.CONVEYOR__TRAY:
			setTray((Tray) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case pls11Package.CONVEYOR__TRAY:
			setTray((Tray) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case pls11Package.CONVEYOR__TRAY:
			return tray != null;
		}
		return super.eIsSet(featureID);
	}

} //ConveyorImpl
