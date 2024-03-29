/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Container#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends NamedElement {
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
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getContainer_Parts()
	 * @model
	 * @generated
	 */
	EList<Part> getParts();

} // Container
