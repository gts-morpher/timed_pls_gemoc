/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Handle;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Head;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hammer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HammerImpl#getHead <em>Head</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HammerImpl#getHandle <em>Handle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HammerImpl extends PartImpl implements Hammer {
	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected EList<Head> head;

	/**
	 * The cached value of the '{@link #getHandle() <em>Handle</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandle()
	 * @generated
	 * @ordered
	 */
	protected EList<Handle> handle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HammerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return pls11Package.Literals.HAMMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Head> getHead() {
		if (head == null) {
			head = new EObjectResolvingEList<Head>(Head.class, this, pls11Package.HAMMER__HEAD);
		}
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Handle> getHandle() {
		if (handle == null) {
			handle = new EObjectResolvingEList<Handle>(Handle.class, this, pls11Package.HAMMER__HANDLE);
		}
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case pls11Package.HAMMER__HEAD:
			return getHead();
		case pls11Package.HAMMER__HANDLE:
			return getHandle();
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
		case pls11Package.HAMMER__HEAD:
			getHead().clear();
			getHead().addAll((Collection<? extends Head>) newValue);
			return;
		case pls11Package.HAMMER__HANDLE:
			getHandle().clear();
			getHandle().addAll((Collection<? extends Handle>) newValue);
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
		case pls11Package.HAMMER__HEAD:
			getHead().clear();
			return;
		case pls11Package.HAMMER__HANDLE:
			getHandle().clear();
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
		case pls11Package.HAMMER__HEAD:
			return head != null && !head.isEmpty();
		case pls11Package.HAMMER__HANDLE:
			return handle != null && !handle.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HammerImpl
