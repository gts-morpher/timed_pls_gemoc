/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package
 * @generated
 */
public class pls11AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static pls11Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pls11AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = pls11Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected pls11Switch<Adapter> modelSwitch = new pls11Switch<Adapter>() {
		@Override
		public Adapter caseProductionLineModel(ProductionLineModel object) {
			return createProductionLineModelAdapter();
		}

		@Override
		public Adapter caseMachine(Machine object) {
			return createMachineAdapter();
		}

		@Override
		public Adapter caseContainer(Container object) {
			return createContainerAdapter();
		}

		@Override
		public Adapter casePart(Part object) {
			return createPartAdapter();
		}

		@Override
		public Adapter caseConveyor(Conveyor object) {
			return createConveyorAdapter();
		}

		@Override
		public Adapter caseTray(Tray object) {
			return createTrayAdapter();
		}

		@Override
		public Adapter caseHammer(Hammer object) {
			return createHammerAdapter();
		}

		@Override
		public Adapter caseHead(Head object) {
			return createHeadAdapter();
		}

		@Override
		public Adapter caseHandle(Handle object) {
			return createHandleAdapter();
		}

		@Override
		public Adapter casePolisher(Polisher object) {
			return createPolisherAdapter();
		}

		@Override
		public Adapter caseAssembler(Assembler object) {
			return createAssemblerAdapter();
		}

		@Override
		public Adapter caseGenHead(GenHead object) {
			return createGenHeadAdapter();
		}

		@Override
		public Adapter caseGenHandle(GenHandle object) {
			return createGenHandleAdapter();
		}

		@Override
		public Adapter caseOperator(Operator object) {
			return createOperatorAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseTransformer(Transformer object) {
			return createTransformerAdapter();
		}

		@Override
		public Adapter caseActionExec(ActionExec object) {
			return createActionExecAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel <em>Production Line Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel
	 * @generated
	 */
	public Adapter createProductionLineModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Conveyor
	 * @generated
	 */
	public Adapter createConveyorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Tray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Tray
	 * @generated
	 */
	public Adapter createTrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer <em>Hammer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer
	 * @generated
	 */
	public Adapter createHammerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Head
	 * @generated
	 */
	public Adapter createHeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Handle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Handle
	 * @generated
	 */
	public Adapter createHandleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Polisher <em>Polisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Polisher
	 * @generated
	 */
	public Adapter createPolisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Assembler <em>Assembler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Assembler
	 * @generated
	 */
	public Adapter createAssemblerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.GenHead <em>Gen Head</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.GenHead
	 * @generated
	 */
	public Adapter createGenHeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.GenHandle <em>Gen Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.GenHandle
	 * @generated
	 */
	public Adapter createGenHandleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Transformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Transformer
	 * @generated
	 */
	public Adapter createTransformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec <em>Action Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec
	 * @generated
	 */
	public Adapter createActionExecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //pls11AdapterFactory
