/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.mapping_arguments;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>mapping arguments</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.mapping_argumentsImpl#getMapping_argument <em>Mapping argument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class mapping_argumentsImpl extends MinimalEObjectImpl.Container implements mapping_arguments
{
  /**
   * The default value of the '{@link #getMapping_argument() <em>Mapping argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping_argument()
   * @generated
   * @ordered
   */
  protected static final String MAPPING_ARGUMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMapping_argument() <em>Mapping argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping_argument()
   * @generated
   * @ordered
   */
  protected String mapping_argument = MAPPING_ARGUMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected mapping_argumentsImpl()
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
    return MyDslPackage.Literals.MAPPING_ARGUMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMapping_argument()
  {
    return mapping_argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapping_argument(String newMapping_argument)
  {
    String oldMapping_argument = mapping_argument;
    mapping_argument = newMapping_argument;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MAPPING_ARGUMENTS__MAPPING_ARGUMENT, oldMapping_argument, mapping_argument));
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
      case MyDslPackage.MAPPING_ARGUMENTS__MAPPING_ARGUMENT:
        return getMapping_argument();
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
      case MyDslPackage.MAPPING_ARGUMENTS__MAPPING_ARGUMENT:
        setMapping_argument((String)newValue);
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
      case MyDslPackage.MAPPING_ARGUMENTS__MAPPING_ARGUMENT:
        setMapping_argument(MAPPING_ARGUMENT_EDEFAULT);
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
      case MyDslPackage.MAPPING_ARGUMENTS__MAPPING_ARGUMENT:
        return MAPPING_ARGUMENT_EDEFAULT == null ? mapping_argument != null : !MAPPING_ARGUMENT_EDEFAULT.equals(mapping_argument);
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
    result.append(" (mapping_argument: ");
    result.append(mapping_argument);
    result.append(')');
    return result.toString();
  }

} //mapping_argumentsImpl