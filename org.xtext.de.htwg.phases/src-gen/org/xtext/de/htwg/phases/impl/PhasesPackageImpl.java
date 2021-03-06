/**
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.phases.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.de.htwg.phases.Game;
import org.xtext.de.htwg.phases.Phase;
import org.xtext.de.htwg.phases.PhaseType;
import org.xtext.de.htwg.phases.PhasesFactory;
import org.xtext.de.htwg.phases.PhasesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PhasesPackageImpl extends EPackageImpl implements PhasesPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass phaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass phaseTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberS_TYPEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorS_TYPEEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass streeT_TYPEEClass = null;

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
   * @see org.xtext.de.htwg.phases.PhasesPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PhasesPackageImpl()
  {
    super(eNS_URI, PhasesFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link PhasesPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PhasesPackage init()
  {
    if (isInited) return (PhasesPackage)EPackage.Registry.INSTANCE.getEPackage(PhasesPackage.eNS_URI);

    // Obtain or create and register package
    PhasesPackageImpl thePhasesPackage = (PhasesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PhasesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PhasesPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePhasesPackage.createPackageContents();

    // Initialize created meta-data
    thePhasesPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePhasesPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PhasesPackage.eNS_URI, thePhasesPackage);
    return thePhasesPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGame()
  {
    return gameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGame_Phases()
  {
    return (EReference)gameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPhase()
  {
    return phaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPhaseType()
  {
    return phaseTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPhaseType_StreetType()
  {
    return (EReference)phaseTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPhaseType_NumbersType()
  {
    return (EReference)phaseTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPhaseType_ColorType()
  {
    return (EReference)phaseTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNUMBERS_TYPE()
  {
    return numberS_TYPEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNUMBERS_TYPE_Name()
  {
    return (EAttribute)numberS_TYPEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNUMBERS_TYPE_NumbersType()
  {
    return (EAttribute)numberS_TYPEEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCOLORS_TYPE()
  {
    return colorS_TYPEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCOLORS_TYPE_Name()
  {
    return (EAttribute)colorS_TYPEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCOLORS_TYPE_NumberColors()
  {
    return (EAttribute)colorS_TYPEEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSTREET_TYPE()
  {
    return streeT_TYPEEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSTREET_TYPE_Name()
  {
    return (EAttribute)streeT_TYPEEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSTREET_TYPE_StreetLenght()
  {
    return (EAttribute)streeT_TYPEEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhasesFactory getPhasesFactory()
  {
    return (PhasesFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    gameEClass = createEClass(GAME);
    createEReference(gameEClass, GAME__PHASES);

    phaseEClass = createEClass(PHASE);

    phaseTypeEClass = createEClass(PHASE_TYPE);
    createEReference(phaseTypeEClass, PHASE_TYPE__STREET_TYPE);
    createEReference(phaseTypeEClass, PHASE_TYPE__NUMBERS_TYPE);
    createEReference(phaseTypeEClass, PHASE_TYPE__COLOR_TYPE);

    numberS_TYPEEClass = createEClass(NUMBERS_TYPE);
    createEAttribute(numberS_TYPEEClass, NUMBERS_TYPE__NAME);
    createEAttribute(numberS_TYPEEClass, NUMBERS_TYPE__NUMBERS_TYPE);

    colorS_TYPEEClass = createEClass(COLORS_TYPE);
    createEAttribute(colorS_TYPEEClass, COLORS_TYPE__NAME);
    createEAttribute(colorS_TYPEEClass, COLORS_TYPE__NUMBER_COLORS);

    streeT_TYPEEClass = createEClass(STREET_TYPE);
    createEAttribute(streeT_TYPEEClass, STREET_TYPE__NAME);
    createEAttribute(streeT_TYPEEClass, STREET_TYPE__STREET_LENGHT);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    phaseTypeEClass.getESuperTypes().add(this.getPhase());

    // Initialize classes and features; add operations and parameters
    initEClass(gameEClass, Game.class, "Game", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGame_Phases(), this.getPhase(), null, "phases", null, 0, -1, Game.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(phaseEClass, Phase.class, "Phase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(phaseTypeEClass, PhaseType.class, "PhaseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPhaseType_StreetType(), this.getSTREET_TYPE(), null, "streetType", null, 0, 1, PhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPhaseType_NumbersType(), this.getNUMBERS_TYPE(), null, "numbersType", null, 0, 1, PhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPhaseType_ColorType(), this.getCOLORS_TYPE(), null, "colorType", null, 0, 1, PhaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberS_TYPEEClass, org.xtext.de.htwg.phases.NUMBERS_TYPE.class, "NUMBERS_TYPE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNUMBERS_TYPE_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.de.htwg.phases.NUMBERS_TYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNUMBERS_TYPE_NumbersType(), ecorePackage.getEString(), "numbersType", null, 0, -1, org.xtext.de.htwg.phases.NUMBERS_TYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorS_TYPEEClass, org.xtext.de.htwg.phases.COLORS_TYPE.class, "COLORS_TYPE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCOLORS_TYPE_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.de.htwg.phases.COLORS_TYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCOLORS_TYPE_NumberColors(), ecorePackage.getEInt(), "numberColors", null, 0, 1, org.xtext.de.htwg.phases.COLORS_TYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(streeT_TYPEEClass, org.xtext.de.htwg.phases.STREET_TYPE.class, "STREET_TYPE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSTREET_TYPE_Name(), ecorePackage.getEString(), "name", null, 0, 1, org.xtext.de.htwg.phases.STREET_TYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSTREET_TYPE_StreetLenght(), ecorePackage.getEInt(), "streetLenght", null, 0, 1, org.xtext.de.htwg.phases.STREET_TYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PhasesPackageImpl
