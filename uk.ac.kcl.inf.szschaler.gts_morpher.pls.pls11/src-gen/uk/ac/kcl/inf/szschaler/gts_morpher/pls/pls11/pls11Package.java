/**
 */
package uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.pls11Factory
 * @model kind="package"
 * @generated
 */
public interface pls11Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pls11";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kcl.ac.uk/metamodels/pls11";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pls11";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	pls11Package eINSTANCE = uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ProductionLineModelImpl <em>Production Line Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ProductionLineModelImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getProductionLineModel()
	 * @generated
	 */
	int PRODUCTION_LINE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Elts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__ELTS = 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__PARTS = 1;

	/**
	 * The feature id for the '<em><b>Actionexecs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__ACTIONEXECS = 2;

	/**
	 * The feature id for the '<em><b>Clock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__CLOCK = 3;

	/**
	 * The number of structural features of the '<em>Production Line Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Production Line Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.NamedElementImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.MachineImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OUT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ContainerImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PARTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.PartImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getPart()
	 * @generated
	 */
	int PART = 3;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ConveyorImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__PARTS = CONTAINER__PARTS;

	/**
	 * The feature id for the '<em><b>Tray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__TRAY = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.TrayImpl <em>Tray</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.TrayImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getTray()
	 * @generated
	 */
	int TRAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__NAME = CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY__PARTS = CONTAINER__PARTS;

	/**
	 * The number of structural features of the '<em>Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tray</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAY_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HammerImpl <em>Hammer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HammerImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getHammer()
	 * @generated
	 */
	int HAMMER = 6;

	/**
	 * The feature id for the '<em><b>Head</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMMER__HEAD = PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMMER__HANDLE = PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hammer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMMER_FEATURE_COUNT = PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hammer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAMMER_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HeadImpl <em>Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HeadImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getHead()
	 * @generated
	 */
	int HEAD = 7;

	/**
	 * The number of structural features of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAD_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HandleImpl <em>Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HandleImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getHandle()
	 * @generated
	 */
	int HANDLE = 8;

	/**
	 * The number of structural features of the '<em>Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_FEATURE_COUNT = PART_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLE_OPERATION_COUNT = PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.TransformerImpl <em>Transformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.TransformerImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getTransformer()
	 * @generated
	 */
	int TRANSFORMER = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__OUT = MACHINE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER__IN = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMER_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.PolisherImpl <em>Polisher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.PolisherImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getPolisher()
	 * @generated
	 */
	int POLISHER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER__NAME = TRANSFORMER__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER__OUT = TRANSFORMER__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER__IN = TRANSFORMER__IN;

	/**
	 * The number of structural features of the '<em>Polisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER_FEATURE_COUNT = TRANSFORMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Polisher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLISHER_OPERATION_COUNT = TRANSFORMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.AssemblerImpl <em>Assembler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.AssemblerImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getAssembler()
	 * @generated
	 */
	int ASSEMBLER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__NAME = TRANSFORMER__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__OUT = TRANSFORMER__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER__IN = TRANSFORMER__IN;

	/**
	 * The number of structural features of the '<em>Assembler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_FEATURE_COUNT = TRANSFORMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Assembler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLER_OPERATION_COUNT = TRANSFORMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.GenHeadImpl <em>Gen Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.GenHeadImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getGenHead()
	 * @generated
	 */
	int GEN_HEAD = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD__OUT = MACHINE__OUT;

	/**
	 * The number of structural features of the '<em>Gen Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gen Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HEAD_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.GenHandleImpl <em>Gen Handle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.GenHandleImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getGenHandle()
	 * @generated
	 */
	int GEN_HANDLE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE__NAME = MACHINE__NAME;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE__OUT = MACHINE__OUT;

	/**
	 * The number of structural features of the '<em>Gen Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE_FEATURE_COUNT = MACHINE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Gen Handle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_HANDLE_OPERATION_COUNT = MACHINE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.OperatorImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Tray</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__TRAY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__COUNTER = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ActionExecImpl <em>Action Exec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ActionExecImpl
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getActionExec()
	 * @generated
	 */
	int ACTION_EXEC = 16;

	/**
	 * The feature id for the '<em><b>Namedelement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXEC__NAMEDELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXEC__PARTS = 1;

	/**
	 * The feature id for the '<em><b>Timer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXEC__TIMER = 2;

	/**
	 * The number of structural features of the '<em>Action Exec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXEC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action Exec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EXEC_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel <em>Production Line Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Line Model</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel
	 * @generated
	 */
	EClass getProductionLineModel();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getElts <em>Elts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elts</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getElts()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Elts();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getParts()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Parts();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getActionexecs <em>Actionexecs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actionexecs</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getActionexecs()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Actionexecs();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clock</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ProductionLineModel#getClock()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EAttribute getProductionLineModel_Clock();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Machine#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Machine#getOut()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Out();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Container#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parts</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Container#getParts()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Parts();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Conveyor#getTray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tray</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Conveyor#getTray()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Tray();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Tray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tray</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Tray
	 * @generated
	 */
	EClass getTray();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer <em>Hammer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hammer</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer
	 * @generated
	 */
	EClass getHammer();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer#getHead <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Head</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer#getHead()
	 * @see #getHammer()
	 * @generated
	 */
	EReference getHammer_Head();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Handle</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Hammer#getHandle()
	 * @see #getHammer()
	 * @generated
	 */
	EReference getHammer_Handle();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Head <em>Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Head</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Head
	 * @generated
	 */
	EClass getHead();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Handle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handle</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Handle
	 * @generated
	 */
	EClass getHandle();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Polisher <em>Polisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polisher</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Polisher
	 * @generated
	 */
	EClass getPolisher();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Assembler <em>Assembler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembler</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Assembler
	 * @generated
	 */
	EClass getAssembler();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.GenHead <em>Gen Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Head</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.GenHead
	 * @generated
	 */
	EClass getGenHead();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.GenHandle <em>Gen Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Handle</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.GenHandle
	 * @generated
	 */
	EClass getGenHandle();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator#getTray <em>Tray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tray</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator#getTray()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Tray();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Operator#getCounter()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Counter();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Transformer <em>Transformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformer</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Transformer
	 * @generated
	 */
	EClass getTransformer();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Transformer#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.Transformer#getIn()
	 * @see #getTransformer()
	 * @generated
	 */
	EReference getTransformer_In();

	/**
	 * Returns the meta object for class '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec <em>Action Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Exec</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec
	 * @generated
	 */
	EClass getActionExec();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec#getNamedelement <em>Namedelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Namedelement</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec#getNamedelement()
	 * @see #getActionExec()
	 * @generated
	 */
	EReference getActionExec_Namedelement();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parts</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec#getParts()
	 * @see #getActionExec()
	 * @generated
	 */
	EReference getActionExec_Parts();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec#getTimer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timer</em>'.
	 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.ActionExec#getTimer()
	 * @see #getActionExec()
	 * @generated
	 */
	EAttribute getActionExec_Timer();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	pls11Factory getpls11Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ProductionLineModelImpl <em>Production Line Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ProductionLineModelImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getProductionLineModel()
		 * @generated
		 */
		EClass PRODUCTION_LINE_MODEL = eINSTANCE.getProductionLineModel();

		/**
		 * The meta object literal for the '<em><b>Elts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__ELTS = eINSTANCE.getProductionLineModel_Elts();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__PARTS = eINSTANCE.getProductionLineModel_Parts();

		/**
		 * The meta object literal for the '<em><b>Actionexecs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__ACTIONEXECS = eINSTANCE.getProductionLineModel_Actionexecs();

		/**
		 * The meta object literal for the '<em><b>Clock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCTION_LINE_MODEL__CLOCK = eINSTANCE.getProductionLineModel_Clock();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.MachineImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__OUT = eINSTANCE.getMachine_Out();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ContainerImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__PARTS = eINSTANCE.getContainer_Parts();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.PartImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ConveyorImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '<em><b>Tray</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__TRAY = eINSTANCE.getConveyor_Tray();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.TrayImpl <em>Tray</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.TrayImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getTray()
		 * @generated
		 */
		EClass TRAY = eINSTANCE.getTray();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HammerImpl <em>Hammer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HammerImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getHammer()
		 * @generated
		 */
		EClass HAMMER = eINSTANCE.getHammer();

		/**
		 * The meta object literal for the '<em><b>Head</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAMMER__HEAD = eINSTANCE.getHammer_Head();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAMMER__HANDLE = eINSTANCE.getHammer_Handle();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HeadImpl <em>Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HeadImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getHead()
		 * @generated
		 */
		EClass HEAD = eINSTANCE.getHead();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HandleImpl <em>Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.HandleImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getHandle()
		 * @generated
		 */
		EClass HANDLE = eINSTANCE.getHandle();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.PolisherImpl <em>Polisher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.PolisherImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getPolisher()
		 * @generated
		 */
		EClass POLISHER = eINSTANCE.getPolisher();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.AssemblerImpl <em>Assembler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.AssemblerImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getAssembler()
		 * @generated
		 */
		EClass ASSEMBLER = eINSTANCE.getAssembler();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.GenHeadImpl <em>Gen Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.GenHeadImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getGenHead()
		 * @generated
		 */
		EClass GEN_HEAD = eINSTANCE.getGenHead();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.GenHandleImpl <em>Gen Handle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.GenHandleImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getGenHandle()
		 * @generated
		 */
		EClass GEN_HANDLE = eINSTANCE.getGenHandle();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.OperatorImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Tray</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__TRAY = eINSTANCE.getOperator_Tray();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__COUNTER = eINSTANCE.getOperator_Counter();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.NamedElementImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.TransformerImpl <em>Transformer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.TransformerImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getTransformer()
		 * @generated
		 */
		EClass TRANSFORMER = eINSTANCE.getTransformer();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMER__IN = eINSTANCE.getTransformer_In();

		/**
		 * The meta object literal for the '{@link uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ActionExecImpl <em>Action Exec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.ActionExecImpl
		 * @see uk.ac.kcl.inf.szschaler.gts_morpher.pls.pls11.impl.pls11PackageImpl#getActionExec()
		 * @generated
		 */
		EClass ACTION_EXEC = eINSTANCE.getActionExec();

		/**
		 * The meta object literal for the '<em><b>Namedelement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_EXEC__NAMEDELEMENT = eINSTANCE.getActionExec_Namedelement();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_EXEC__PARTS = eINSTANCE.getActionExec_Parts();

		/**
		 * The meta object literal for the '<em><b>Timer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_EXEC__TIMER = eINSTANCE.getActionExec_Timer();

	}

} //pls11Package
