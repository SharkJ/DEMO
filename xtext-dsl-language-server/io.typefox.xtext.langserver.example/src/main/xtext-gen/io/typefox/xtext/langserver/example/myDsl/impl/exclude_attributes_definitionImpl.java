/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.exclude_attributes_definition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>exclude attributes definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.exclude_attributes_definitionImpl#getAttribute_reference <em>Attribute reference</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.exclude_attributes_definitionImpl#getAttribute_reference2 <em>Attribute reference2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class exclude_attributes_definitionImpl extends MinimalEObjectImpl.Container implements exclude_attributes_definition
{
  /**
   * The default value of the '{@link #getAttribute_reference() <em>Attribute reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute_reference()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttribute_reference() <em>Attribute reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute_reference()
   * @generated
   * @ordered
   */
  protected String attribute_reference = ATTRIBUTE_REFERENCE_EDEFAULT;

  /**
   * The default value of the '{@link #getAttribute_reference2() <em>Attribute reference2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute_reference2()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_REFERENCE2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttribute_reference2() <em>Attribute reference2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttribute_reference2()
   * @generated
   * @ordered
   */
  protected String attribute_reference2 = ATTRIBUTE_REFERENCE2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected exclude_attributes_definitionImpl()
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
    return MyDslPackage.Literals.EXCLUDE_ATTRIBUTES_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttribute_reference()
  {
    return attribute_reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute_reference(String newAttribute_reference)
  {
    String oldAttribute_reference = attribute_reference;
    attribute_reference = newAttribute_reference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCLUDE_ATTRIBUTES_DEFINITION__ATTRIBUTE_REFERENCE, oldAttribute_reference, attribute_reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttribute_reference2()
  {
    return attribute_reference2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttribute_reference2(String newAttribute_reference2)
  {
    String oldAttribute_reference2 = attribute_reference2;
    attribute_reference2 = newAttribute_reference2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.EXCLUDE_ATTRIBUTES_DEFINITION__ATTRIBUTE_REFERENCE2, oldAttribute_reference2, attribute_reference2));
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
      case MyDslPackage.EXCLUDE_ATTRIBUTES_DEFINITION__ATTRIBUTE_REFERENCE:
        return getAttribute_reference();
      case MyDslPackage.EXCLUDE_ATTRIBUTES_DEFINITION__ATTRIBUTE_REFERENCE2:
        return getAttribute_reference2();
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
      case MyDslPackage.EXCLUDE_ATTRIBUTES_DEFINITION__ATTRIBUTE_REFERENCE:
        setAttribute_reference((String)newValue);
        return;
      case MyDslPackage.EXCLUDE_ATTRIBUTES_DEFINITION__ATTRIBUTE_REFERENCE2:
        setAttribute_reference2((String)newValue);
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
      case MyDslPackage.EXCLUDE_ATTRIBUTES_DEFINITION__ATTRIBUTE_REFERENCE:
        setAttribute_reference(ATTRIBUTE_REFERENCE_EDEFAULT);
        return;
      case MyDslPackage.EXCLUDE_ATTRIBUTES_DEFINITION__ATTRIBUTE_REFERENCE2:
        setAttribute_reference2(ATTRIBUTE_REFERENCE2_EDEFAULT);
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
      case MyDslPackage.EXCLUDE_ATTRIBUTES_DEFINITION__ATTRIBUTE_REFERENCE:
        return ATTRIBUTE_REFERENCE_EDEFAULT == null ? attribute_reference != null : !ATTRIBUTE_REFERENCE_EDEFAULT.equals(attribute_reference);
      case MyDslPackage.EXCLUDE_ATTRIBUTES_DEFINITION__ATTRIBUTE_REFERENCE2:
        return ATTRIBUTE_REFERENCE2_EDEFAULT == null ? attribute_reference2 != null : !ATTRIBUTE_REFERENCE2_EDEFAULT.equals(attribute_reference2);
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
    result.append(" (attribute_reference: ");
    result.append(attribute_reference);
    result.append(", attribute_reference2: ");
    result.append(attribute_reference2);
    result.append(')');
    return result.toString();
  }

} //exclude_attributes_definitionImpl
