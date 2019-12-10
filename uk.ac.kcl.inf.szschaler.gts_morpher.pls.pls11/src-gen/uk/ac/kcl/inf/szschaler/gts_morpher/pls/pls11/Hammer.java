/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hammer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer#getHead <em>Head</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer#getHandle <em>Handle</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getHammer()
 * @model
 * @generated
 */
public interface Hammer extends Part {
	/**
	 * Returns the value of the '<em><b>Head</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Head}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' reference list.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getHammer_Head()
	 * @model
	 * @generated
	 */
	EList<Head> getHead();

	/**
	 * Returns the value of the '<em><b>Handle</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Handle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handle</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle</em>' reference list.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getHammer_Handle()
	 * @model
	 * @generated
	 */
	EList<Handle> getHandle();

} // Hammer
