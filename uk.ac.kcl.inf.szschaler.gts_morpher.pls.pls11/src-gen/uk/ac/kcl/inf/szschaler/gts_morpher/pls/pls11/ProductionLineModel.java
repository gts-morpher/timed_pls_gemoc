/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production Line Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getElts <em>Elts</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getParts <em>Parts</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getActionexecs <em>Actionexecs</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getProductionLineModel()
 * @model
 * @generated
 */
public interface ProductionLineModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elts</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elts</em>' containment reference list.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getProductionLineModel_Elts()
	 * @model containment="true"
	 * @generated
	 */
	EList<NamedElement> getElts();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Part}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getProductionLineModel_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Part> getParts();

	/**
	 * Returns the value of the '<em><b>Actionexecs</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actionexecs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actionexecs</em>' containment reference list.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getProductionLineModel_Actionexecs()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionExec> getActionexecs();

	/**
	 * Returns the value of the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock</em>' attribute.
	 * @see #setClock(double)
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#getProductionLineModel_Clock()
	 * @model
	 * @generated
	 */
	double getClock();

	/**
	 * Sets the value of the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getClock <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock</em>' attribute.
	 * @see #getClock()
	 * @generated
	 */
	void setClock(double value);

} // ProductionLineModel
