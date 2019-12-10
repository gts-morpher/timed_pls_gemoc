/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class pls11FactoryImpl extends EFactoryImpl implements pls11Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static pls11Factory init() {
		try {
			pls11Factory thepls11Factory = (pls11Factory) EPackage.Registry.INSTANCE.getEFactory(pls11Package.eNS_URI);
			if (thepls11Factory != null) {
				return thepls11Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new pls11FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pls11FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case pls11Package.PRODUCTION_LINE_MODEL:
			return createProductionLineModel();
		case pls11Package.CONVEYOR:
			return createConveyor();
		case pls11Package.TRAY:
			return createTray();
		case pls11Package.HAMMER:
			return createHammer();
		case pls11Package.HEAD:
			return createHead();
		case pls11Package.HANDLE:
			return createHandle();
		case pls11Package.POLISHER:
			return createPolisher();
		case pls11Package.ASSEMBLER:
			return createAssembler();
		case pls11Package.GEN_HEAD:
			return createGenHead();
		case pls11Package.GEN_HANDLE:
			return createGenHandle();
		case pls11Package.OPERATOR:
			return createOperator();
		case pls11Package.ACTION_EXEC:
			return createActionExec();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionLineModel createProductionLineModel() {
		ProductionLineModelImpl productionLineModel = new ProductionLineModelImpl();
		return productionLineModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tray createTray() {
		TrayImpl tray = new TrayImpl();
		return tray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hammer createHammer() {
		HammerImpl hammer = new HammerImpl();
		return hammer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Head createHead() {
		HeadImpl head = new HeadImpl();
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handle createHandle() {
		HandleImpl handle = new HandleImpl();
		return handle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polisher createPolisher() {
		PolisherImpl polisher = new PolisherImpl();
		return polisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembler createAssembler() {
		AssemblerImpl assembler = new AssemblerImpl();
		return assembler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenHead createGenHead() {
		GenHeadImpl genHead = new GenHeadImpl();
		return genHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenHandle createGenHandle() {
		GenHandleImpl genHandle = new GenHandleImpl();
		return genHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionExec createActionExec() {
		ActionExecImpl actionExec = new ActionExecImpl();
		return actionExec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pls11Package getpls11Package() {
		return (pls11Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static pls11Package getPackage() {
		return pls11Package.eINSTANCE;
	}

} //pls11FactoryImpl
