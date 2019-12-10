/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator#getTray <em>Tray</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator#getCounter <em>Counter</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getOperator()
 * @model
 * @generated
 */
public interface Operator extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Tray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tray</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tray</em>' reference.
	 * @see #setTray(Tray)
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getOperator_Tray()
	 * @model
	 * @generated
	 */
	Tray getTray();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator#getTray <em>Tray</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tray</em>' reference.
	 * @see #getTray()
	 * @generated
	 */
	void setTray(Tray value);

	/**
	 * Returns the value of the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter</em>' attribute.
	 * @see #setCounter(int)
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getOperator_Counter()
	 * @model
	 * @generated
	 */
	int getCounter();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator#getCounter <em>Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter</em>' attribute.
	 * @see #getCounter()
	 * @generated
	 */
	void setCounter(int value);

} // Operator
