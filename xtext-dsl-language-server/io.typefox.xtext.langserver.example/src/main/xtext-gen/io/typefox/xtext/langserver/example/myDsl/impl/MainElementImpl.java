/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MainElement;
import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.query_definition;
import io.typefox.xtext.langserver.example.myDsl.virtual_definition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Main Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.MainElementImpl#getVirtual_definition <em>Virtual definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.MainElementImpl#getQuery_definition <em>Query definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MainElementImpl extends MinimalEObjectImpl.Container implements MainElement
{
  /**
   * The cached value of the '{@link #getVirtual_definition() <em>Virtual definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVirtual_definition()
   * @generated
   * @ordered
   */
  protected virtual_definition virtual_definition;

  /**
   * The cached value of the '{@link #getQuery_definition() <em>Query definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuery_definition()
   * @generated
   * @ordered
   */
  protected query_definition query_definition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MainElementImpl()
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
    return MyDslPackage.Literals.MAIN_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public virtual_definition getVirtual_definition()
  {
    return virtual_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVirtual_definition(virtual_definition newVirtual_definition, NotificationChain msgs)
  {
    virtual_definition oldVirtual_definition = virtual_definition;
    virtual_definition = newVirtual_definition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MAIN_ELEMENT__VIRTUAL_DEFINITION, oldVirtual_definition, newVirtual_definition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVirtual_definition(virtual_definition newVirtual_definition)
  {
    if (newVirtual_definition != virtual_definition)
    {
      NotificationChain msgs = null;
      if (virtual_definition != null)
        msgs = ((InternalEObject)virtual_definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MAIN_ELEMENT__VIRTUAL_DEFINITION, null, msgs);
      if (newVirtual_definition != null)
        msgs = ((InternalEObject)newVirtual_definition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MAIN_ELEMENT__VIRTUAL_DEFINITION, null, msgs);
      msgs = basicSetVirtual_definition(newVirtual_definition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MAIN_ELEMENT__VIRTUAL_DEFINITION, newVirtual_definition, newVirtual_definition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public query_definition getQuery_definition()
  {
    return query_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQuery_definition(query_definition newQuery_definition, NotificationChain msgs)
  {
    query_definition oldQuery_definition = query_definition;
    query_definition = newQuery_definition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MAIN_ELEMENT__QUERY_DEFINITION, oldQuery_definition, newQuery_definition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuery_definition(query_definition newQuery_definition)
  {
    if (newQuery_definition != query_definition)
    {
      NotificationChain msgs = null;
      if (query_definition != null)
        msgs = ((InternalEObject)query_definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MAIN_ELEMENT__QUERY_DEFINITION, null, msgs);
      if (newQuery_definition != null)
        msgs = ((InternalEObject)newQuery_definition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MAIN_ELEMENT__QUERY_DEFINITION, null, msgs);
      msgs = basicSetQuery_definition(newQuery_definition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MAIN_ELEMENT__QUERY_DEFINITION, newQuery_definition, newQuery_definition));
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
      case MyDslPackage.MAIN_ELEMENT__VIRTUAL_DEFINITION:
        return basicSetVirtual_definition(null, msgs);
      case MyDslPackage.MAIN_ELEMENT__QUERY_DEFINITION:
        return basicSetQuery_definition(null, msgs);
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
      case MyDslPackage.MAIN_ELEMENT__VIRTUAL_DEFINITION:
        return getVirtual_definition();
      case MyDslPackage.MAIN_ELEMENT__QUERY_DEFINITION:
        return getQuery_definition();
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
      case MyDslPackage.MAIN_ELEMENT__VIRTUAL_DEFINITION:
        setVirtual_definition((virtual_definition)newValue);
        return;
      case MyDslPackage.MAIN_ELEMENT__QUERY_DEFINITION:
        setQuery_definition((query_definition)newValue);
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
      case MyDslPackage.MAIN_ELEMENT__VIRTUAL_DEFINITION:
        setVirtual_definition((virtual_definition)null);
        return;
      case MyDslPackage.MAIN_ELEMENT__QUERY_DEFINITION:
        setQuery_definition((query_definition)null);
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
      case MyDslPackage.MAIN_ELEMENT__VIRTUAL_DEFINITION:
        return virtual_definition != null;
      case MyDslPackage.MAIN_ELEMENT__QUERY_DEFINITION:
        return query_definition != null;
    }
    return super.eIsSet(featureID);
  }

} //MainElementImpl
