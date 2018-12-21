/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.validate_action_reference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>validate action reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.validate_action_referenceImpl#getValidate_action_reference_action_ref <em>Validate action reference action ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class validate_action_referenceImpl extends MinimalEObjectImpl.Container implements validate_action_reference
{
  /**
   * The default value of the '{@link #getValidate_action_reference_action_ref() <em>Validate action reference action ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidate_action_reference_action_ref()
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_ACTION_REFERENCE_ACTION_REF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValidate_action_reference_action_ref() <em>Validate action reference action ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValidate_action_reference_action_ref()
   * @generated
   * @ordered
   */
  protected String validate_action_reference_action_ref = VALIDATE_ACTION_REFERENCE_ACTION_REF_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected validate_action_referenceImpl()
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
    return MyDslPackage.Literals.VALIDATE_ACTION_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValidate_action_reference_action_ref()
  {
    return validate_action_reference_action_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValidate_action_reference_action_ref(String newValidate_action_reference_action_ref)
  {
    String oldValidate_action_reference_action_ref = validate_action_reference_action_ref;
    validate_action_reference_action_ref = newValidate_action_reference_action_ref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.VALIDATE_ACTION_REFERENCE__VALIDATE_ACTION_REFERENCE_ACTION_REF, oldValidate_action_reference_action_ref, validate_action_reference_action_ref));
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
      case MyDslPackage.VALIDATE_ACTION_REFERENCE__VALIDATE_ACTION_REFERENCE_ACTION_REF:
        return getValidate_action_reference_action_ref();
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
      case MyDslPackage.VALIDATE_ACTION_REFERENCE__VALIDATE_ACTION_REFERENCE_ACTION_REF:
        setValidate_action_reference_action_ref((String)newValue);
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
      case MyDslPackage.VALIDATE_ACTION_REFERENCE__VALIDATE_ACTION_REFERENCE_ACTION_REF:
        setValidate_action_reference_action_ref(VALIDATE_ACTION_REFERENCE_ACTION_REF_EDEFAULT);
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
      case MyDslPackage.VALIDATE_ACTION_REFERENCE__VALIDATE_ACTION_REFERENCE_ACTION_REF:
        return VALIDATE_ACTION_REFERENCE_ACTION_REF_EDEFAULT == null ? validate_action_reference_action_ref != null : !VALIDATE_ACTION_REFERENCE_ACTION_REF_EDEFAULT.equals(validate_action_reference_action_ref);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (validate_action_reference_action_ref: ");
    result.append(validate_action_reference_action_ref);
    result.append(')');
    return result.toString();
  }

} //validate_action_referenceImpl