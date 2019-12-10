/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.NamedElement;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Part;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Line Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ProductionLineModelImpl#getElts <em>Elts</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ProductionLineModelImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ProductionLineModelImpl#getActionexecs <em>Actionexecs</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ProductionLineModelImpl#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionLineModelImpl extends MinimalEObjectImpl.Container implements ProductionLineModel {
	/**
	 * The cached value of the '{@link #getElts() <em>Elts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElts()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> elts;

	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<Part> parts;

	/**
	 * The cached value of the '{@link #getActionexecs() <em>Actionexecs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionexecs()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionExec> actionexecs;

	/**
	 * The default value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected static final double CLOCK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected double clock = CLOCK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionLineModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pls11Package.Literals.PRODUCTION_LINE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getElts() {
		if (elts == null) {
			elts = new EObjectContainmentEList<NamedElement>(NamedElement.class, this,
					pls11Package.PRODUCTION_LINE_MODEL__ELTS);
		}
		return elts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Part> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<Part>(Part.class, this, pls11Package.PRODUCTION_LINE_MODEL__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionExec> getActionexecs() {
		if (actionexecs == null) {
			actionexecs = new EObjectContainmentEList<ActionExec>(ActionExec.class, this,
					pls11Package.PRODUCTION_LINE_MODEL__ACTIONEXECS);
		}
		return actionexecs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(double newClock) {
		double oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, pls11Package.PRODUCTION_LINE_MODEL__CLOCK, oldClock,
					clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case pls11Package.PRODUCTION_LINE_MODEL__ELTS:
			return ((InternalEList<?>) getElts()).basicRemove(otherEnd, msgs);
		case pls11Package.PRODUCTION_LINE_MODEL__PARTS:
			return ((InternalEList<?>) getParts()).basicRemove(otherEnd, msgs);
		case pls11Package.PRODUCTION_LINE_MODEL__ACTIONEXECS:
			return ((InternalEList<?>) getActionexecs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case pls11Package.PRODUCTION_LINE_MODEL__ELTS:
			return getElts();
		case pls11Package.PRODUCTION_LINE_MODEL__PARTS:
			return getParts();
		case pls11Package.PRODUCTION_LINE_MODEL__ACTIONEXECS:
			return getActionexecs();
		case pls11Package.PRODUCTION_LINE_MODEL__CLOCK:
			return getClock();
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
		case pls11Package.PRODUCTION_LINE_MODEL__ELTS:
			getElts().clear();
			getElts().addAll((Collection<? extends NamedElement>) newValue);
			return;
		case pls11Package.PRODUCTION_LINE_MODEL__PARTS:
			getParts().clear();
			getParts().addAll((Collection<? extends Part>) newValue);
			return;
		case pls11Package.PRODUCTION_LINE_MODEL__ACTIONEXECS:
			getActionexecs().clear();
			getActionexecs().addAll((Collection<? extends ActionExec>) newValue);
			return;
		case pls11Package.PRODUCTION_LINE_MODEL__CLOCK:
			setClock((Double) newValue);
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
		case pls11Package.PRODUCTION_LINE_MODEL__ELTS:
			getElts().clear();
			return;
		case pls11Package.PRODUCTION_LINE_MODEL__PARTS:
			getParts().clear();
			return;
		case pls11Package.PRODUCTION_LINE_MODEL__ACTIONEXECS:
			getActionexecs().clear();
			return;
		case pls11Package.PRODUCTION_LINE_MODEL__CLOCK:
			setClock(CLOCK_EDEFAULT);
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
		case pls11Package.PRODUCTION_LINE_MODEL__ELTS:
			return elts != null && !elts.isEmpty();
		case pls11Package.PRODUCTION_LINE_MODEL__PARTS:
			return parts != null && !parts.isEmpty();
		case pls11Package.PRODUCTION_LINE_MODEL__ACTIONEXECS:
			return actionexecs != null && !actionexecs.isEmpty();
		case pls11Package.PRODUCTION_LINE_MODEL__CLOCK:
			return clock != CLOCK_EDEFAULT;
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
		result.append(" (clock: ");
		result.append(clock);
		result.append(')');
		return result.toString();
	}

} //ProductionLineModelImpl
