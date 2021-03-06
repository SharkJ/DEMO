/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.objkey_column;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>objkey column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.objkey_columnImpl#getObjkey_column_objkey_column_name <em>Objkey column objkey column name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class objkey_columnImpl extends MinimalEObjectImpl.Container implements objkey_column
{
  /**
   * The default value of the '{@link #getObjkey_column_objkey_column_name() <em>Objkey column objkey column name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjkey_column_objkey_column_name()
   * @generated
   * @ordered
   */
  protected static final String OBJKEY_COLUMN_OBJKEY_COLUMN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getObjkey_column_objkey_column_name() <em>Objkey column objkey column name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjkey_column_objkey_column_name()
   * @generated
   * @ordered
   */
  protected String objkey_column_objkey_column_name = OBJKEY_COLUMN_OBJKEY_COLUMN_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected objkey_columnImpl()
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
    return MyDslPackage.Literals.OBJKEY_COLUMN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getObjkey_column_objkey_column_name()
  {
    return objkey_column_objkey_column_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setObjkey_column_objkey_column_name(String newObjkey_column_objkey_column_name)
  {
    String oldObjkey_column_objkey_column_name = objkey_column_objkey_column_name;
    objkey_column_objkey_column_name = newObjkey_column_objkey_column_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OBJKEY_COLUMN__OBJKEY_COLUMN_OBJKEY_COLUMN_NAME, oldObjkey_column_objkey_column_name, objkey_column_objkey_column_name));
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
      case MyDslPackage.OBJKEY_COLUMN__OBJKEY_COLUMN_OBJKEY_COLUMN_NAME:
        return getObjkey_column_objkey_column_name();
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
      case MyDslPackage.OBJKEY_COLUMN__OBJKEY_COLUMN_OBJKEY_COLUMN_NAME:
        setObjkey_column_objkey_column_name((String)newValue);
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
      case MyDslPackage.OBJKEY_COLUMN__OBJKEY_COLUMN_OBJKEY_COLUMN_NAME:
        setObjkey_column_objkey_column_name(OBJKEY_COLUMN_OBJKEY_COLUMN_NAME_EDEFAULT);
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
      case MyDslPackage.OBJKEY_COLUMN__OBJKEY_COLUMN_OBJKEY_COLUMN_NAME:
        return OBJKEY_COLUMN_OBJKEY_COLUMN_NAME_EDEFAULT == null ? objkey_column_objkey_column_name != null : !OBJKEY_COLUMN_OBJKEY_COLUMN_NAME_EDEFAULT.equals(objkey_column_objkey_column_name);
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
    result.append(" (objkey_column_objkey_column_name: ");
    result.append(objkey_column_objkey_column_name);
    result.append(')');
    return result.toString();
  }

} //objkey_columnImpl
