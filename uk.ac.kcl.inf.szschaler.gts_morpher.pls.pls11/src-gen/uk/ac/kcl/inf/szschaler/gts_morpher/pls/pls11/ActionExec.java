/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Exec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec#getNamedelement <em>Namedelement</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec#getParts <em>Parts</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec#getTimer <em>Timer</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getActionExec()
 * @model
 * @generated
 */
public interface ActionExec extends EObject {
	/**
	 * Returns the value of the '<em><b>Namedelement</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namedelement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namedelement</em>' reference list.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getActionExec_Namedelement()
	 * @model
	 * @generated
	 */
	EList<NamedElement> getNamedelement();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' reference list.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getActionExec_Parts()
	 * @model
	 * @generated
	 */
	EList<Part> getParts();

	/**
	 * Returns the value of the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timer</em>' attribute.
	 * @see #setTimer(double)
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getActionExec_Timer()
	 * @model
	 * @generated
	 */
	double getTimer();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec#getTimer <em>Timer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timer</em>' attribute.
	 * @see #getTimer()
	 * @generated
	 */
	void setTimer(double value);

} // ActionExec
