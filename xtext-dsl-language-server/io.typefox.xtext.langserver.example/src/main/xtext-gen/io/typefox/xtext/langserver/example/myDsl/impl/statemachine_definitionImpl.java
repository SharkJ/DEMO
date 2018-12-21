/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.state_event_definition;
import io.typefox.xtext.langserver.example.myDsl.statemachine_definition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>statemachine definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.statemachine_definitionImpl#getState_event_definition <em>State event definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class statemachine_definitionImpl extends MinimalEObjectImpl.Container implements statemachine_definition
{
  /**
   * The cached value of the '{@link #getState_event_definition() <em>State event definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState_event_definition()
   * @generated
   * @ordered
   */
  protected state_event_definition state_event_definition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected statemachine_definitionImpl()
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
    return MyDslPackage.Literals.STATEMACHINE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public state_event_definition getState_event_definition()
  {
    return state_event_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetState_event_definition(state_event_definition newState_event_definition, NotificationChain msgs)
  {
    state_event_definition oldState_event_definition = state_event_definition;
    state_event_definition = newState_event_definition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMACHINE_DEFINITION__STATE_EVENT_DEFINITION, oldState_event_definition, newState_event_definition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState_event_definition(state_event_definition newState_event_definition)
  {
    if (newState_event_definition != state_event_definition)
    {
      NotificationChain msgs = null;
      if (state_event_definition != null)
        msgs = ((InternalEObject)state_event_definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMACHINE_DEFINITION__STATE_EVENT_DEFINITION, null, msgs);
      if (newState_event_definition != null)
        msgs = ((InternalEObject)newState_event_definition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.STATEMACHINE_DEFINITION__STATE_EVENT_DEFINITION, null, msgs);
      msgs = basicSetState_event_definition(newState_event_definition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMACHINE_DEFINITION__STATE_EVENT_DEFINITION, newState_event_definition, newState_event_definition));
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
      case MyDslPackage.STATEMACHINE_DEFINITION__STATE_EVENT_DEFINITION:
        return basicSetState_event_definition(null, msgs);
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
      case MyDslPackage.STATEMACHINE_DEFINITION__STATE_EVENT_DEFINITION:
        return getState_event_definition();
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
      case MyDslPackage.STATEMACHINE_DEFINITION__STATE_EVENT_DEFINITION:
        setState_event_definition((state_event_definition)newValue);
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
      case MyDslPackage.STATEMACHINE_DEFINITION__STATE_EVENT_DEFINITION:
        setState_event_definition((state_event_definition)null);
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
      case MyDslPackage.STATEMACHINE_DEFINITION__STATE_EVENT_DEFINITION:
        return state_event_definition != null;
    }
    return super.eIsSet(featureID);
  }

} //statemachine_definitionImpl