/**
 * generated by Xtext 2.11.0
 */
package org.xtext.de.htwg.phases.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.de.htwg.phases.COLORS_TYPE;
import org.xtext.de.htwg.phases.NUMBERS_TYPE;
import org.xtext.de.htwg.phases.PhaseType;
import org.xtext.de.htwg.phases.PhasesPackage;
import org.xtext.de.htwg.phases.STREET_TYPE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.de.htwg.phases.impl.PhaseTypeImpl#getStreetType <em>Street Type</em>}</li>
 *   <li>{@link org.xtext.de.htwg.phases.impl.PhaseTypeImpl#getNumbersType <em>Numbers Type</em>}</li>
 *   <li>{@link org.xtext.de.htwg.phases.impl.PhaseTypeImpl#getColorType <em>Color Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseTypeImpl extends PhaseImpl implements PhaseType
{
  /**
   * The cached value of the '{@link #getStreetType() <em>Street Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStreetType()
   * @generated
   * @ordered
   */
  protected STREET_TYPE streetType;

  /**
   * The cached value of the '{@link #getNumbersType() <em>Numbers Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumbersType()
   * @generated
   * @ordered
   */
  protected NUMBERS_TYPE numbersType;

  /**
   * The cached value of the '{@link #getColorType() <em>Color Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorType()
   * @generated
   * @ordered
   */
  protected COLORS_TYPE colorType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PhaseTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PhasesPackage.Literals.PHASE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STREET_TYPE getStreetType()
  {
    return streetType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStreetType(STREET_TYPE newStreetType, NotificationChain msgs)
  {
    STREET_TYPE oldStreetType = streetType;
    streetType = newStreetType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhasesPackage.PHASE_TYPE__STREET_TYPE, oldStreetType, newStreetType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStreetType(STREET_TYPE newStreetType)
  {
    if (newStreetType != streetType)
    {
      NotificationChain msgs = null;
      if (streetType != null)
        msgs = ((InternalEObject)streetType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhasesPackage.PHASE_TYPE__STREET_TYPE, null, msgs);
      if (newStreetType != null)
        msgs = ((InternalEObject)newStreetType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhasesPackage.PHASE_TYPE__STREET_TYPE, null, msgs);
      msgs = basicSetStreetType(newStreetType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PhasesPackage.PHASE_TYPE__STREET_TYPE, newStreetType, newStreetType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NUMBERS_TYPE getNumbersType()
  {
    return numbersType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumbersType(NUMBERS_TYPE newNumbersType, NotificationChain msgs)
  {
    NUMBERS_TYPE oldNumbersType = numbersType;
    numbersType = newNumbersType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhasesPackage.PHASE_TYPE__NUMBERS_TYPE, oldNumbersType, newNumbersType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumbersType(NUMBERS_TYPE newNumbersType)
  {
    if (newNumbersType != numbersType)
    {
      NotificationChain msgs = null;
      if (numbersType != null)
        msgs = ((InternalEObject)numbersType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhasesPackage.PHASE_TYPE__NUMBERS_TYPE, null, msgs);
      if (newNumbersType != null)
        msgs = ((InternalEObject)newNumbersType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhasesPackage.PHASE_TYPE__NUMBERS_TYPE, null, msgs);
      msgs = basicSetNumbersType(newNumbersType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PhasesPackage.PHASE_TYPE__NUMBERS_TYPE, newNumbersType, newNumbersType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public COLORS_TYPE getColorType()
  {
    return colorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColorType(COLORS_TYPE newColorType, NotificationChain msgs)
  {
    COLORS_TYPE oldColorType = colorType;
    colorType = newColorType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PhasesPackage.PHASE_TYPE__COLOR_TYPE, oldColorType, newColorType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColorType(COLORS_TYPE newColorType)
  {
    if (newColorType != colorType)
    {
      NotificationChain msgs = null;
      if (colorType != null)
        msgs = ((InternalEObject)colorType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PhasesPackage.PHASE_TYPE__COLOR_TYPE, null, msgs);
      if (newColorType != null)
        msgs = ((InternalEObject)newColorType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PhasesPackage.PHASE_TYPE__COLOR_TYPE, null, msgs);
      msgs = basicSetColorType(newColorType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PhasesPackage.PHASE_TYPE__COLOR_TYPE, newColorType, newColorType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PhasesPackage.PHASE_TYPE__STREET_TYPE:
        return basicSetStreetType(null, msgs);
      case PhasesPackage.PHASE_TYPE__NUMBERS_TYPE:
        return basicSetNumbersType(null, msgs);
      case PhasesPackage.PHASE_TYPE__COLOR_TYPE:
        return basicSetColorType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PhasesPackage.PHASE_TYPE__STREET_TYPE:
        return getStreetType();
      case PhasesPackage.PHASE_TYPE__NUMBERS_TYPE:
        return getNumbersType();
      case PhasesPackage.PHASE_TYPE__COLOR_TYPE:
        return getColorType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PhasesPackage.PHASE_TYPE__STREET_TYPE:
        setStreetType((STREET_TYPE)newValue);
        return;
      case PhasesPackage.PHASE_TYPE__NUMBERS_TYPE:
        setNumbersType((NUMBERS_TYPE)newValue);
        return;
      case PhasesPackage.PHASE_TYPE__COLOR_TYPE:
        setColorType((COLORS_TYPE)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PhasesPackage.PHASE_TYPE__STREET_TYPE:
        setStreetType((STREET_TYPE)null);
        return;
      case PhasesPackage.PHASE_TYPE__NUMBERS_TYPE:
        setNumbersType((NUMBERS_TYPE)null);
        return;
      case PhasesPackage.PHASE_TYPE__COLOR_TYPE:
        setColorType((COLORS_TYPE)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PhasesPackage.PHASE_TYPE__STREET_TYPE:
        return streetType != null;
      case PhasesPackage.PHASE_TYPE__NUMBERS_TYPE:
        return numbersType != null;
      case PhasesPackage.PHASE_TYPE__COLOR_TYPE:
        return colorType != null;
    }
    return super.eIsSet(featureID);
  }

} //PhaseTypeImpl
