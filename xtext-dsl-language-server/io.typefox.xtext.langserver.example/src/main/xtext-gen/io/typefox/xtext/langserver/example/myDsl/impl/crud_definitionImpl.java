/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.crud_definition;
import io.typefox.xtext.langserver.example.myDsl.crud_reference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>crud definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.crud_definitionImpl#getCrud_reference <em>Crud reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class crud_definitionImpl extends MinimalEObjectImpl.Container implements crud_definition
{
  /**
   * The cached value of the '{@link #getCrud_reference() <em>Crud reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCrud_reference()
   * @generated
   * @ordered
   */
  protected crud_reference crud_reference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected crud_definitionImpl()
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
    return MyDslPackage.Literals.CRUD_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public crud_reference getCrud_reference()
  {
    return crud_reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCrud_reference(crud_reference newCrud_reference, NotificationChain msgs)
  {
    crud_reference oldCrud_reference = crud_reference;
    crud_reference = newCrud_reference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.CRUD_DEFINITION__CRUD_REFERENCE, oldCrud_reference, newCrud_reference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCrud_reference(crud_reference newCrud_reference)
  {
    if (newCrud_reference != crud_reference)
    {
      NotificationChain msgs = null;
      if (crud_reference != null)
        msgs = ((InternalEObject)crud_reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CRUD_DEFINITION__CRUD_REFERENCE, null, msgs);
      if (newCrud_reference != null)
        msgs = ((InternalEObject)newCrud_reference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.CRUD_DEFINITION__CRUD_REFERENCE, null, msgs);
      msgs = basicSetCrud_reference(newCrud_reference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CRUD_DEFINITION__CRUD_REFERENCE, newCrud_reference, newCrud_reference));
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
      case MyDslPackage.CRUD_DEFINITION__CRUD_REFERENCE:
        return basicSetCrud_reference(null, msgs);
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
      case MyDslPackage.CRUD_DEFINITION__CRUD_REFERENCE:
        return getCrud_reference();
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
      case MyDslPackage.CRUD_DEFINITION__CRUD_REFERENCE:
        setCrud_reference((crud_reference)newValue);
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
      case MyDslPackage.CRUD_DEFINITION__CRUD_REFERENCE:
        setCrud_reference((crud_reference)null);
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
      case MyDslPackage.CRUD_DEFINITION__CRUD_REFERENCE:
        return crud_reference != null;
    }
    return super.eIsSet(featureID);
  }

} //crud_definitionImpl
