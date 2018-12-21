/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.user_column_definition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>user column definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.user_column_definitionImpl#getUser_column_definition_user_column_name <em>User column definition user column name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class user_column_definitionImpl extends MinimalEObjectImpl.Container implements user_column_definition
{
  /**
   * The default value of the '{@link #getUser_column_definition_user_column_name() <em>User column definition user column name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUser_column_definition_user_column_name()
   * @generated
   * @ordered
   */
  protected static final String USER_COLUMN_DEFINITION_USER_COLUMN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUser_column_definition_user_column_name() <em>User column definition user column name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUser_column_definition_user_column_name()
   * @generated
   * @ordered
   */
  protected String user_column_definition_user_column_name = USER_COLUMN_DEFINITION_USER_COLUMN_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected user_column_definitionImpl()
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
    return MyDslPackage.Literals.USER_COLUMN_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUser_column_definition_user_column_name()
  {
    return user_column_definition_user_column_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUser_column_definition_user_column_name(String newUser_column_definition_user_column_name)
  {
    String oldUser_column_definition_user_column_name = user_column_definition_user_column_name;
    user_column_definition_user_column_name = newUser_column_definition_user_column_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.USER_COLUMN_DEFINITION__USER_COLUMN_DEFINITION_USER_COLUMN_NAME, oldUser_column_definition_user_column_name, user_column_definition_user_column_name));
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
      case MyDslPackage.USER_COLUMN_DEFINITION__USER_COLUMN_DEFINITION_USER_COLUMN_NAME:
        return getUser_column_definition_user_column_name();
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
      case MyDslPackage.USER_COLUMN_DEFINITION__USER_COLUMN_DEFINITION_USER_COLUMN_NAME:
        setUser_column_definition_user_column_name((String)newValue);
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
      case MyDslPackage.USER_COLUMN_DEFINITION__USER_COLUMN_DEFINITION_USER_COLUMN_NAME:
        setUser_column_definition_user_column_name(USER_COLUMN_DEFINITION_USER_COLUMN_NAME_EDEFAULT);
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
      case MyDslPackage.USER_COLUMN_DEFINITION__USER_COLUMN_DEFINITION_USER_COLUMN_NAME:
        return USER_COLUMN_DEFINITION_USER_COLUMN_NAME_EDEFAULT == null ? user_column_definition_user_column_name != null : !USER_COLUMN_DEFINITION_USER_COLUMN_NAME_EDEFAULT.equals(user_column_definition_user_column_name);
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
    result.append(" (user_column_definition_user_column_name: ");
    result.append(user_column_definition_user_column_name);
    result.append(')');
    return result.toString();
  }

} //user_column_definitionImpl
