/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.key_reference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>key reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.key_referenceImpl#getKey_reference_key_name <em>Key reference key name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class key_referenceImpl extends MinimalEObjectImpl.Container implements key_reference
{
  /**
   * The default value of the '{@link #getKey_reference_key_name() <em>Key reference key name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey_reference_key_name()
   * @generated
   * @ordered
   */
  protected static final String KEY_REFERENCE_KEY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKey_reference_key_name() <em>Key reference key name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKey_reference_key_name()
   * @generated
   * @ordered
   */
  protected String key_reference_key_name = KEY_REFERENCE_KEY_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected key_referenceImpl()
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
    return MyDslPackage.Literals.KEY_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKey_reference_key_name()
  {
    return key_reference_key_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKey_reference_key_name(String newKey_reference_key_name)
  {
    String oldKey_reference_key_name = key_reference_key_name;
    key_reference_key_name = newKey_reference_key_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.KEY_REFERENCE__KEY_REFERENCE_KEY_NAME, oldKey_reference_key_name, key_reference_key_name));
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
      case MyDslPackage.KEY_REFERENCE__KEY_REFERENCE_KEY_NAME:
        return getKey_reference_key_name();
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
      case MyDslPackage.KEY_REFERENCE__KEY_REFERENCE_KEY_NAME:
        setKey_reference_key_name((String)newValue);
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
      case MyDslPackage.KEY_REFERENCE__KEY_REFERENCE_KEY_NAME:
        setKey_reference_key_name(KEY_REFERENCE_KEY_NAME_EDEFAULT);
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
      case MyDslPackage.KEY_REFERENCE__KEY_REFERENCE_KEY_NAME:
        return KEY_REFERENCE_KEY_NAME_EDEFAULT == null ? key_reference_key_name != null : !KEY_REFERENCE_KEY_NAME_EDEFAULT.equals(key_reference_key_name);
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
    result.append(" (key_reference_key_name: ");
    result.append(key_reference_key_name);
    result.append(')');
    return result.toString();
  }

} //key_referenceImpl
