/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.projection_flag_condition_atom;
import io.typefox.xtext.langserver.example.myDsl.projection_flag_condition_atom_value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>projection flag condition atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.projection_flag_condition_atomImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.projection_flag_condition_atomImpl#getProjection_flag_condition_atom_dataitem_ref <em>Projection flag condition atom dataitem ref</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.projection_flag_condition_atomImpl#getProjection_flag_condition_atom_value <em>Projection flag condition atom value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class projection_flag_condition_atomImpl extends MinimalEObjectImpl.Container implements projection_flag_condition_atom
{
  /**
   * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlt()
   * @generated
   * @ordered
   */
  protected static final String ALT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlt()
   * @generated
   * @ordered
   */
  protected String alt = ALT_EDEFAULT;

  /**
   * The default value of the '{@link #getProjection_flag_condition_atom_dataitem_ref() <em>Projection flag condition atom dataitem ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjection_flag_condition_atom_dataitem_ref()
   * @generated
   * @ordered
   */
  protected static final String PROJECTION_FLAG_CONDITION_ATOM_DATAITEM_REF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProjection_flag_condition_atom_dataitem_ref() <em>Projection flag condition atom dataitem ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjection_flag_condition_atom_dataitem_ref()
   * @generated
   * @ordered
   */
  protected String projection_flag_condition_atom_dataitem_ref = PROJECTION_FLAG_CONDITION_ATOM_DATAITEM_REF_EDEFAULT;

  /**
   * The cached value of the '{@link #getProjection_flag_condition_atom_value() <em>Projection flag condition atom value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProjection_flag_condition_atom_value()
   * @generated
   * @ordered
   */
  protected projection_flag_condition_atom_value projection_flag_condition_atom_value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected projection_flag_condition_atomImpl()
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
    return MyDslPackage.Literals.PROJECTION_FLAG_CONDITION_ATOM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlt()
  {
    return alt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlt(String newAlt)
  {
    String oldAlt = alt;
    alt = newAlt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__ALT, oldAlt, alt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProjection_flag_condition_atom_dataitem_ref()
  {
    return projection_flag_condition_atom_dataitem_ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjection_flag_condition_atom_dataitem_ref(String newProjection_flag_condition_atom_dataitem_ref)
  {
    String oldProjection_flag_condition_atom_dataitem_ref = projection_flag_condition_atom_dataitem_ref;
    projection_flag_condition_atom_dataitem_ref = newProjection_flag_condition_atom_dataitem_ref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_DATAITEM_REF, oldProjection_flag_condition_atom_dataitem_ref, projection_flag_condition_atom_dataitem_ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public projection_flag_condition_atom_value getProjection_flag_condition_atom_value()
  {
    return projection_flag_condition_atom_value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProjection_flag_condition_atom_value(projection_flag_condition_atom_value newProjection_flag_condition_atom_value, NotificationChain msgs)
  {
    projection_flag_condition_atom_value oldProjection_flag_condition_atom_value = projection_flag_condition_atom_value;
    projection_flag_condition_atom_value = newProjection_flag_condition_atom_value;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_VALUE, oldProjection_flag_condition_atom_value, newProjection_flag_condition_atom_value);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProjection_flag_condition_atom_value(projection_flag_condition_atom_value newProjection_flag_condition_atom_value)
  {
    if (newProjection_flag_condition_atom_value != projection_flag_condition_atom_value)
    {
      NotificationChain msgs = null;
      if (projection_flag_condition_atom_value != null)
        msgs = ((InternalEObject)projection_flag_condition_atom_value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_VALUE, null, msgs);
      if (newProjection_flag_condition_atom_value != null)
        msgs = ((InternalEObject)newProjection_flag_condition_atom_value).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_VALUE, null, msgs);
      msgs = basicSetProjection_flag_condition_atom_value(newProjection_flag_condition_atom_value, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_VALUE, newProjection_flag_condition_atom_value, newProjection_flag_condition_atom_value));
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
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_VALUE:
        return basicSetProjection_flag_condition_atom_value(null, msgs);
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
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__ALT:
        return getAlt();
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_DATAITEM_REF:
        return getProjection_flag_condition_atom_dataitem_ref();
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_VALUE:
        return getProjection_flag_condition_atom_value();
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
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__ALT:
        setAlt((String)newValue);
        return;
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_DATAITEM_REF:
        setProjection_flag_condition_atom_dataitem_ref((String)newValue);
        return;
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_VALUE:
        setProjection_flag_condition_atom_value((projection_flag_condition_atom_value)newValue);
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
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__ALT:
        setAlt(ALT_EDEFAULT);
        return;
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_DATAITEM_REF:
        setProjection_flag_condition_atom_dataitem_ref(PROJECTION_FLAG_CONDITION_ATOM_DATAITEM_REF_EDEFAULT);
        return;
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_VALUE:
        setProjection_flag_condition_atom_value((projection_flag_condition_atom_value)null);
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
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__ALT:
        return ALT_EDEFAULT == null ? alt != null : !ALT_EDEFAULT.equals(alt);
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_DATAITEM_REF:
        return PROJECTION_FLAG_CONDITION_ATOM_DATAITEM_REF_EDEFAULT == null ? projection_flag_condition_atom_dataitem_ref != null : !PROJECTION_FLAG_CONDITION_ATOM_DATAITEM_REF_EDEFAULT.equals(projection_flag_condition_atom_dataitem_ref);
      case MyDslPackage.PROJECTION_FLAG_CONDITION_ATOM__PROJECTION_FLAG_CONDITION_ATOM_VALUE:
        return projection_flag_condition_atom_value != null;
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
    result.append(" (alt: ");
    result.append(alt);
    result.append(", projection_flag_condition_atom_dataitem_ref: ");
    result.append(projection_flag_condition_atom_dataitem_ref);
    result.append(')');
    return result.toString();
  }

} //projection_flag_condition_atomImpl
