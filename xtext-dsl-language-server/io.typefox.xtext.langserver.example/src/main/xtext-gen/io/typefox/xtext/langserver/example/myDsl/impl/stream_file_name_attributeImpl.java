/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.dataitem_reference;
import io.typefox.xtext.langserver.example.myDsl.stream_file_name_attribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stream file name attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.stream_file_name_attributeImpl#getDataitem_reference <em>Dataitem reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class stream_file_name_attributeImpl extends MinimalEObjectImpl.Container implements stream_file_name_attribute
{
  /**
   * The cached value of the '{@link #getDataitem_reference() <em>Dataitem reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataitem_reference()
   * @generated
   * @ordered
   */
  protected dataitem_reference dataitem_reference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected stream_file_name_attributeImpl()
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
    return MyDslPackage.Literals.STREAM_FILE_NAME_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public dataitem_reference getDataitem_reference()
  {
    return dataitem_reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataitem_reference(dataitem_reference newDataitem_reference, NotificationChain msgs)
  {
    dataitem_reference oldDataitem_reference = dataitem_reference;
    dataitem_reference = newDataitem_reference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STREAM_FILE_NAME_ATTRIBUTE__DATAITEM_REFERENCE, oldDataitem_reference, newDataitem_reference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataitem_reference(dataitem_reference newDataitem_reference)
  {
    if (newDataitem_reference != dataitem_reference)
    {
      NotificationChain msgs = null;
      if (dataitem_reference != null)
        msgs = ((InternalEObject)dataitem_reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STREAM_FILE_NAME_ATTRIBUTE__DATAITEM_REFERENCE, null, msgs);
      if (newDataitem_reference != null)
        msgs = ((InternalEObject)newDataitem_reference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STREAM_FILE_NAME_ATTRIBUTE__DATAITEM_REFERENCE, null, msgs);
      msgs = basicSetDataitem_reference(newDataitem_reference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STREAM_FILE_NAME_ATTRIBUTE__DATAITEM_REFERENCE, newDataitem_reference, newDataitem_reference));
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
      case MyDslPackage.STREAM_FILE_NAME_ATTRIBUTE__DATAITEM_REFERENCE:
        return basicSetDataitem_reference(null, msgs);
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
      case MyDslPackage.STREAM_FILE_NAME_ATTRIBUTE__DATAITEM_REFERENCE:
        return getDataitem_reference();
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
      case MyDslPackage.STREAM_FILE_NAME_ATTRIBUTE__DATAITEM_REFERENCE:
        setDataitem_reference((dataitem_reference)newValue);
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
      case MyDslPackage.STREAM_FILE_NAME_ATTRIBUTE__DATAITEM_REFERENCE:
        setDataitem_reference((dataitem_reference)null);
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
      case MyDslPackage.STREAM_FILE_NAME_ATTRIBUTE__DATAITEM_REFERENCE:
        return dataitem_reference != null;
    }
    return super.eIsSet(featureID);
  }

} //stream_file_name_attributeImpl
