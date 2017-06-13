/**
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.phases;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.de.htwg.phases.PhasesPackage
 * @generated
 */
public interface PhasesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PhasesFactory eINSTANCE = org.xtext.de.htwg.phases.impl.PhasesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Game</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Game</em>'.
   * @generated
   */
  Game createGame();

  /**
   * Returns a new object of class '<em>Phase</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Phase</em>'.
   * @generated
   */
  Phase createPhase();

  /**
   * Returns a new object of class '<em>Phase Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Phase Type</em>'.
   * @generated
   */
  PhaseType createPhaseType();

  /**
   * Returns a new object of class '<em>NUMBERS TYPE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>NUMBERS TYPE</em>'.
   * @generated
   */
  NUMBERS_TYPE createNUMBERS_TYPE();

  /**
   * Returns a new object of class '<em>COLORS TYPE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>COLORS TYPE</em>'.
   * @generated
   */
  COLORS_TYPE createCOLORS_TYPE();

  /**
   * Returns a new object of class '<em>STREET TYPE</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>STREET TYPE</em>'.
   * @generated
   */
  STREET_TYPE createSTREET_TYPE();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PhasesPackage getPhasesPackage();

} //PhasesFactory
