/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.NamedElement;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Part;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Exec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ActionExecImpl#getNamedelement <em>Namedelement</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ActionExecImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ActionExecImpl#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionExecImpl extends MinimalEObjectImpl.Container implements ActionExec {
	/**
	 * The cached value of the '{@link #getNamedelement() <em>Namedelement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedelement()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> namedelement;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> parts;

	/**
	 * The default value of the '{@link #getTimer() <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected static final double TIMER_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTimer() <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimer()
	 * @generated
	 * @ordered
	 */
	protected double timer = TIMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionExecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pls11Package.Literals.ACTION_EXEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getNamedelement() {
		if (namedelement == null) {
			namedelement = new EObjectResolvingEList<NamedElement>(NamedElement.class, this,
					pls11Package.ACTION_EXEC__NAMEDELEMENT);
		}
		return namedelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getParts() {
		if (parts == null) {
			parts = new EObjectResolvingEList<Part>(Part.class, this, pls11Package.ACTION_EXEC__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTimer() {
		return timer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimer(double newTimer) {
		double oldTimer = timer;
		timer = newTimer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pls11Package.ACTION_EXEC__TIMER, oldTimer, timer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case pls11Package.ACTION_EXEC__NAMEDELEMENT:
			return getNamedelement();
		case pls11Package.ACTION_EXEC__PARTS:
			return getParts();
		case pls11Package.ACTION_EXEC__TIMER:
			return getTimer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case pls11Package.ACTION_EXEC__NAMEDELEMENT:
			getNamedelement().clear();
			getNamedelement().addAll((Collection<? extends NamedElement>) newValue);
			return;
		case pls11Package.ACTION_EXEC__PARTS:
			getParts().clear();
			getParts().addAll((Collection<? extends Part>) newValue);
			return;
		case pls11Package.ACTION_EXEC__TIMER:
			setTimer((Double) newValue);
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
		case pls11Package.ACTION_EXEC__NAMEDELEMENT:
			getNamedelement().clear();
			return;
		case pls11Package.ACTION_EXEC__PARTS:
			getParts().clear();
			return;
		case pls11Package.ACTION_EXEC__TIMER:
			setTimer(TIMER_EDEFAULT);
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
		case pls11Package.ACTION_EXEC__NAMEDELEMENT:
			return namedelement != null && !namedelement.isEmpty();
		case pls11Package.ACTION_EXEC__PARTS:
			return parts != null && !parts.isEmpty();
		case pls11Package.ACTION_EXEC__TIMER:
			return timer != TIMER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (timer: ");
		result.append(timer);
		result.append(')');
		return result.toString();
	}

} //ActionExecImpl
