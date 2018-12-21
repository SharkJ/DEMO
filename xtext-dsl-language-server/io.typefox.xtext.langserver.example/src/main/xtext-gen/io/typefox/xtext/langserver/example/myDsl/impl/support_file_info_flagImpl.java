/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.projection_flag_condition;
import io.typefox.xtext.langserver.example.myDsl.support_file_info_flag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>support file info flag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.support_file_info_flagImpl#getProjection_flag_condition <em>Projection flag condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class support_file_info_flagImpl extends MinimalEObjectImpl.Container implements support_file_info_flag
{
  /**
   * The cached value of the '{@link #getProjection_flag_condition() <em>Projection flag condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjection_flag_condition()
   * @generated
   * @ordered
   */
  protected projection_flag_condition projection_flag_condition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected support_file_info_flagImpl()
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
    return MyDslPackage.Literals.SUPPORT_FILE_INFO_FLAG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public projection_flag_condition getProjection_flag_condition()
  {
    return projection_flag_condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProjection_flag_condition(projection_flag_condition newProjection_flag_condition, NotificationChain msgs)
  {
    projection_flag_condition oldProjection_flag_condition = projection_flag_condition;
    projection_flag_condition = newProjection_flag_condition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SUPPORT_FILE_INFO_FLAG__PROJECTION_FLAG_CONDITION, oldProjection_flag_condition, newProjection_flag_condition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjection_flag_condition(projection_flag_condition newProjection_flag_condition)
  {
    if (newProjection_flag_condition != projection_flag_condition)
    {
      NotificationChain msgs = null;
      if (projection_flag_condition != null)
        msgs = ((InternalEObject)projection_flag_condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SUPPORT_FILE_INFO_FLAG__PROJECTION_FLAG_CONDITION, null, msgs);
      if (newProjection_flag_condition != null)
        msgs = ((InternalEObject)newProjection_flag_condition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SUPPORT_FILE_INFO_FLAG__PROJECTION_FLAG_CONDITION, null, msgs);
      msgs = basicSetProjection_flag_condition(newProjection_flag_condition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SUPPORT_FILE_INFO_FLAG__PROJECTION_FLAG_CONDITION, newProjection_flag_condition, newProjection_flag_condition));
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
      case MyDslPackage.SUPPORT_FILE_INFO_FLAG__PROJECTION_FLAG_CONDITION:
        return basicSetProjection_flag_condition(null, msgs);
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
      case MyDslPackage.SUPPORT_FILE_INFO_FLAG__PROJECTION_FLAG_CONDITION:
        return getProjection_flag_condition();
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
      case MyDslPackage.SUPPORT_FILE_INFO_FLAG__PROJECTION_FLAG_CONDITION:
        setProjection_flag_condition((projection_flag_condition)newValue);
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
      case MyDslPackage.SUPPORT_FILE_INFO_FLAG__PROJECTION_FLAG_CONDITION:
        setProjection_flag_condition((projection_flag_condition)null);
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
      case MyDslPackage.SUPPORT_FILE_INFO_FLAG__PROJECTION_FLAG_CONDITION:
        return projection_flag_condition != null;
    }
    return super.eIsSet(featureID);
  }

} //support_file_info_flagImpl
