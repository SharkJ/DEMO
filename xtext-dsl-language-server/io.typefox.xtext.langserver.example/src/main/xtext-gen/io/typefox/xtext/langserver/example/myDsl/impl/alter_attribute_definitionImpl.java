/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.alter_attribute_definition;
import io.typefox.xtext.langserver.example.myDsl.fetch_definition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>alter attribute definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.alter_attribute_definitionImpl#getAlter_attribute_definition_dataitem_name <em>Alter attribute definition dataitem name</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.alter_attribute_definitionImpl#getFetch_definition <em>Fetch definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class alter_attribute_definitionImpl extends MinimalEObjectImpl.Container implements alter_attribute_definition
{
  /**
   * The default value of the '{@link #getAlter_attribute_definition_dataitem_name() <em>Alter attribute definition dataitem name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlter_attribute_definition_dataitem_name()
   * @generated
   * @ordered
   */
  protected static final String ALTER_ATTRIBUTE_DEFINITION_DATAITEM_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlter_attribute_definition_dataitem_name() <em>Alter attribute definition dataitem name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlter_attribute_definition_dataitem_name()
   * @generated
   * @ordered
   */
  protected String alter_attribute_definition_dataitem_name = ALTER_ATTRIBUTE_DEFINITION_DATAITEM_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFetch_definition() <em>Fetch definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFetch_definition()
   * @generated
   * @ordered
   */
  protected fetch_definition fetch_definition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected alter_attribute_definitionImpl()
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
    return MyDslPackage.Literals.ALTER_ATTRIBUTE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlter_attribute_definition_dataitem_name()
  {
    return alter_attribute_definition_dataitem_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlter_attribute_definition_dataitem_name(String newAlter_attribute_definition_dataitem_name)
  {
    String oldAlter_attribute_definition_dataitem_name = alter_attribute_definition_dataitem_name;
    alter_attribute_definition_dataitem_name = newAlter_attribute_definition_dataitem_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__ALTER_ATTRIBUTE_DEFINITION_DATAITEM_NAME, oldAlter_attribute_definition_dataitem_name, alter_attribute_definition_dataitem_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fetch_definition getFetch_definition()
  {
    return fetch_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFetch_definition(fetch_definition newFetch_definition, NotificationChain msgs)
  {
    fetch_definition oldFetch_definition = fetch_definition;
    fetch_definition = newFetch_definition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__FETCH_DEFINITION, oldFetch_definition, newFetch_definition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFetch_definition(fetch_definition newFetch_definition)
  {
    if (newFetch_definition != fetch_definition)
    {
      NotificationChain msgs = null;
      if (fetch_definition != null)
        msgs = ((InternalEObject)fetch_definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__FETCH_DEFINITION, null, msgs);
      if (newFetch_definition != null)
        msgs = ((InternalEObject)newFetch_definition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__FETCH_DEFINITION, null, msgs);
      msgs = basicSetFetch_definition(newFetch_definition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__FETCH_DEFINITION, newFetch_definition, newFetch_definition));
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
      case MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__FETCH_DEFINITION:
        return basicSetFetch_definition(null, msgs);
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
      case MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__ALTER_ATTRIBUTE_DEFINITION_DATAITEM_NAME:
        return getAlter_attribute_definition_dataitem_name();
      case MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__FETCH_DEFINITION:
        return getFetch_definition();
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
      case MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__ALTER_ATTRIBUTE_DEFINITION_DATAITEM_NAME:
        setAlter_attribute_definition_dataitem_name((String)newValue);
        return;
      case MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__FETCH_DEFINITION:
        setFetch_definition((fetch_definition)newValue);
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
      case MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__ALTER_ATTRIBUTE_DEFINITION_DATAITEM_NAME:
        setAlter_attribute_definition_dataitem_name(ALTER_ATTRIBUTE_DEFINITION_DATAITEM_NAME_EDEFAULT);
        return;
      case MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__FETCH_DEFINITION:
        setFetch_definition((fetch_definition)null);
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
      case MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__ALTER_ATTRIBUTE_DEFINITION_DATAITEM_NAME:
        return ALTER_ATTRIBUTE_DEFINITION_DATAITEM_NAME_EDEFAULT == null ? alter_attribute_definition_dataitem_name != null : !ALTER_ATTRIBUTE_DEFINITION_DATAITEM_NAME_EDEFAULT.equals(alter_attribute_definition_dataitem_name);
      case MyDslPackage.ALTER_ATTRIBUTE_DEFINITION__FETCH_DEFINITION:
        return fetch_definition != null;
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
    result.append(" (alter_attribute_definition_dataitem_name: ");
    result.append(alter_attribute_definition_dataitem_name);
    result.append(')');
    return result.toString();
  }

} //alter_attribute_definitionImpl
