/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Transformer#getIn <em>In</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getTransformer()
 * @model abstract="true"
 * @generated
 */
public interface Transformer extends Machine {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference.
	 * @see #setIn(Tray)
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getTransformer_In()
	 * @model
	 * @generated
	 */
	Tray getIn();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Transformer#getIn <em>In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Tray value);

} // Transformer
