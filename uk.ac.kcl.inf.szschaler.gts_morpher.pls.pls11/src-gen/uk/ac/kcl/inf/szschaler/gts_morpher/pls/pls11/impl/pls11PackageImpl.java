/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Assembler;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Conveyor;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.GenHandle;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.GenHead;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Handle;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Head;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Machine;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.NamedElement;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Part;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Polisher;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Transformer;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Tray;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Factory;
import uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class pls11PackageImpl extends EPackageImpl implements pls11Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionLineModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hammerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assemblerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genHeadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genHandleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionExecEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private pls11PackageImpl() {
		super(eNS_URI, pls11Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link pls11Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static pls11Package init() {
		if (isInited)
			return (pls11Package) EPackage.Registry.INSTANCE.getEPackage(pls11Package.eNS_URI);

		// Obtain or create and register package
		Object registeredpls11Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		pls11PackageImpl thepls11Package = registeredpls11Package instanceof pls11PackageImpl
				? (pls11PackageImpl) registeredpls11Package
				: new pls11PackageImpl();

		isInited = true;

		// Create package meta-data objects
		thepls11Package.createPackageContents();

		// Initialize created meta-data
		thepls11Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thepls11Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(pls11Package.eNS_URI, thepls11Package);
		return thepls11Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductionLineModel() {
		return productionLineModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLineModel_Elts() {
		return (EReference) productionLineModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLineModel_Parts() {
		return (EReference) productionLineModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLineModel_Actionexecs() {
		return (EReference) productionLineModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductionLineModel_Clock() {
		return (EAttribute) productionLineModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Out() {
		return (EReference) machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Parts() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPart() {
		return partEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyor() {
		return conveyorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyor_Tray() {
		return (EReference) conveyorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTray() {
		return trayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHammer() {
		return hammerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHammer_Head() {
		return (EReference) hammerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHammer_Handle() {
		return (EReference) hammerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHead() {
		return headEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandle() {
		return handleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPolisher() {
		return polisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssembler() {
		return assemblerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenHead() {
		return genHeadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenHandle() {
		return genHandleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Tray() {
		return (EReference) operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperator_Counter() {
		return (EAttribute) operatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformer() {
		return transformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformer_In() {
		return (EReference) transformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionExec() {
		return actionExecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionExec_Namedelement() {
		return (EReference) actionExecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionExec_Parts() {
		return (EReference) actionExecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionExec_Timer() {
		return (EAttribute) actionExecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pls11Factory getpls11Factory() {
		return (pls11Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		productionLineModelEClass = createEClass(PRODUCTION_LINE_MODEL);
		createEReference(productionLineModelEClass, PRODUCTION_LINE_MODEL__ELTS);
		createEReference(productionLineModelEClass, PRODUCTION_LINE_MODEL__PARTS);
		createEReference(productionLineModelEClass, PRODUCTION_LINE_MODEL__ACTIONEXECS);
		createEAttribute(productionLineModelEClass, PRODUCTION_LINE_MODEL__CLOCK);

		machineEClass = createEClass(MACHINE);
		createEReference(machineEClass, MACHINE__OUT);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__PARTS);

		partEClass = createEClass(PART);

		conveyorEClass = createEClass(CONVEYOR);
		createEReference(conveyorEClass, CONVEYOR__TRAY);

		trayEClass = createEClass(TRAY);

		hammerEClass = createEClass(HAMMER);
		createEReference(hammerEClass, HAMMER__HEAD);
		createEReference(hammerEClass, HAMMER__HANDLE);

		headEClass = createEClass(HEAD);

		handleEClass = createEClass(HANDLE);

		polisherEClass = createEClass(POLISHER);

		assemblerEClass = createEClass(ASSEMBLER);

		genHeadEClass = createEClass(GEN_HEAD);

		genHandleEClass = createEClass(GEN_HANDLE);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__TRAY);
		createEAttribute(operatorEClass, OPERATOR__COUNTER);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		transformerEClass = createEClass(TRANSFORMER);
		createEReference(transformerEClass, TRANSFORMER__IN);

		actionExecEClass = createEClass(ACTION_EXEC);
		createEReference(actionExecEClass, ACTION_EXEC__NAMEDELEMENT);
		createEReference(actionExecEClass, ACTION_EXEC__PARTS);
		createEAttribute(actionExecEClass, ACTION_EXEC__TIMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		machineEClass.getESuperTypes().add(this.getNamedElement());
		containerEClass.getESuperTypes().add(this.getNamedElement());
		conveyorEClass.getESuperTypes().add(this.getContainer());
		trayEClass.getESuperTypes().add(this.getContainer());
		hammerEClass.getESuperTypes().add(this.getPart());
		headEClass.getESuperTypes().add(this.getPart());
		handleEClass.getESuperTypes().add(this.getPart());
		polisherEClass.getESuperTypes().add(this.getTransformer());
		assemblerEClass.getESuperTypes().add(this.getTransformer());
		genHeadEClass.getESuperTypes().add(this.getMachine());
		genHandleEClass.getESuperTypes().add(this.getMachine());
		operatorEClass.getESuperTypes().add(this.getNamedElement());
		transformerEClass.getESuperTypes().add(this.getMachine());

		// Initialize classes, features, and operations; add parameters
		initEClass(productionLineModelEClass, ProductionLineModel.class, "ProductionLineModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductionLineModel_Elts(), this.getNamedElement(), null, "elts", null, 0, -1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductionLineModel_Parts(), this.getPart(), null, "parts", null, 0, -1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductionLineModel_Actionexecs(), this.getActionExec(), null, "actionexecs", null, 0, -1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProductionLineModel_Clock(), ecorePackage.getEDouble(), "clock", null, 0, 1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMachine_Out(), this.getConveyor(), null, "out", null, 0, 1, Machine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(containerEClass, uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Container.class, "Container",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Parts(), this.getPart(), null, "parts", null, 0, -1,
				uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Container.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partEClass, Part.class, "Part", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conveyorEClass, Conveyor.class, "Conveyor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConveyor_Tray(), this.getTray(), null, "tray", null, 0, 1, Conveyor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(trayEClass, Tray.class, "Tray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hammerEClass, Hammer.class, "Hammer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHammer_Head(), this.getHead(), null, "head", null, 0, -1, Hammer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHammer_Handle(), this.getHandle(), null, "handle", null, 0, -1, Hammer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(headEClass, Head.class, "Head", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(handleEClass, Handle.class, "Handle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(polisherEClass, Polisher.class, "Polisher", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(assemblerEClass, Assembler.class, "Assembler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(genHeadEClass, GenHead.class, "GenHead", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genHandleEClass, GenHandle.class, "GenHandle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_Tray(), this.getTray(), null, "tray", null, 0, 1, Operator.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getOperator_Counter(), ecorePackage.getEInt(), "counter", null, 0, 1, Operator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformerEClass, Transformer.class, "Transformer", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformer_In(), this.getTray(), null, "in", null, 0, 1, Transformer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(actionExecEClass, ActionExec.class, "ActionExec", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionExec_Namedelement(), this.getNamedElement(), null, "namedelement", null, 0, -1,
				ActionExec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionExec_Parts(), this.getPart(), null, "parts", null, 0, -1, ActionExec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionExec_Timer(), ecorePackage.getEDouble(), "timer", null, 0, 1, ActionExec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";
		addAnnotation(productionLineModelEClass, source, new String[] {});
		addAnnotation(getProductionLineModel_Parts(), source, new String[] {});
		addAnnotation(getProductionLineModel_Actionexecs(), source, new String[] {});
		addAnnotation(getProductionLineModel_Clock(), source, new String[] {});
		addAnnotation(getContainer_Parts(), source, new String[] {});
		addAnnotation(partEClass, source, new String[] {});
		addAnnotation(hammerEClass, source, new String[] {});
		addAnnotation(getHammer_Head(), source, new String[] {});
		addAnnotation(getHammer_Handle(), source, new String[] {});
		addAnnotation(headEClass, source, new String[] {});
		addAnnotation(handleEClass, source, new String[] {});
		addAnnotation(actionExecEClass, source, new String[] {});
		addAnnotation(getActionExec_Namedelement(), source, new String[] {});
		addAnnotation(getActionExec_Parts(), source, new String[] {});
		addAnnotation(getActionExec_Timer(), source, new String[] {});
	}

} //pls11PackageImpl
