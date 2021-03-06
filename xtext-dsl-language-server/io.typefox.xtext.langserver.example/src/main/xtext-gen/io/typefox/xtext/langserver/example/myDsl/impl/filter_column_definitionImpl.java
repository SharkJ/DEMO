/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.filter_column_definition;
import io.typefox.xtext.langserver.example.myDsl.filter_column_operator;
import io.typefox.xtext.langserver.example.myDsl.null_image;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>filter column definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.filter_column_definitionImpl#getFilter_column_definition_filter_column_name <em>Filter column definition filter column name</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.filter_column_definitionImpl#getFilter_column_operator <em>Filter column operator</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.filter_column_definitionImpl#getNull_image <em>Null image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class filter_column_definitionImpl extends MinimalEObjectImpl.Container implements filter_column_definition
{
  /**
   * The default value of the '{@link #getFilter_column_definition_filter_column_name() <em>Filter column definition filter column name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter_column_definition_filter_column_name()
   * @generated
   * @ordered
   */
  protected static final String FILTER_COLUMN_DEFINITION_FILTER_COLUMN_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFilter_column_definition_filter_column_name() <em>Filter column definition filter column name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter_column_definition_filter_column_name()
   * @generated
   * @ordered
   */
  protected String filter_column_definition_filter_column_name = FILTER_COLUMN_DEFINITION_FILTER_COLUMN_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFilter_column_operator() <em>Filter column operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter_column_operator()
   * @generated
   * @ordered
   */
  protected filter_column_operator filter_column_operator;

  /**
   * The cached value of the '{@link #getNull_image() <em>Null image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull_image()
   * @generated
   * @ordered
   */
  protected null_image null_image;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected filter_column_definitionImpl()
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
    return MyDslPackage.Literals.FILTER_COLUMN_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFilter_column_definition_filter_column_name()
  {
    return filter_column_definition_filter_column_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter_column_definition_filter_column_name(String newFilter_column_definition_filter_column_name)
  {
    String oldFilter_column_definition_filter_column_name = filter_column_definition_filter_column_name;
    filter_column_definition_filter_column_name = newFilter_column_definition_filter_column_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_DEFINITION_FILTER_COLUMN_NAME, oldFilter_column_definition_filter_column_name, filter_column_definition_filter_column_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public filter_column_operator getFilter_column_operator()
  {
    return filter_column_operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter_column_operator(filter_column_operator newFilter_column_operator, NotificationChain msgs)
  {
    filter_column_operator oldFilter_column_operator = filter_column_operator;
    filter_column_operator = newFilter_column_operator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_OPERATOR, oldFilter_column_operator, newFilter_column_operator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter_column_operator(filter_column_operator newFilter_column_operator)
  {
    if (newFilter_column_operator != filter_column_operator)
    {
      NotificationChain msgs = null;
      if (filter_column_operator != null)
        msgs = ((InternalEObject)filter_column_operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_OPERATOR, null, msgs);
      if (newFilter_column_operator != null)
        msgs = ((InternalEObject)newFilter_column_operator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_OPERATOR, null, msgs);
      msgs = basicSetFilter_column_operator(newFilter_column_operator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_OPERATOR, newFilter_column_operator, newFilter_column_operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public null_image getNull_image()
  {
    return null_image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNull_image(null_image newNull_image, NotificationChain msgs)
  {
    null_image oldNull_image = null_image;
    null_image = newNull_image;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FILTER_COLUMN_DEFINITION__NULL_IMAGE, oldNull_image, newNull_image);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNull_image(null_image newNull_image)
  {
    if (newNull_image != null_image)
    {
      NotificationChain msgs = null;
      if (null_image != null)
        msgs = ((InternalEObject)null_image).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FILTER_COLUMN_DEFINITION__NULL_IMAGE, null, msgs);
      if (newNull_image != null)
        msgs = ((InternalEObject)newNull_image).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FILTER_COLUMN_DEFINITION__NULL_IMAGE, null, msgs);
      msgs = basicSetNull_image(newNull_image, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FILTER_COLUMN_DEFINITION__NULL_IMAGE, newNull_image, newNull_image));
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
      case MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_OPERATOR:
        return basicSetFilter_column_operator(null, msgs);
      case MyDslPackage.FILTER_COLUMN_DEFINITION__NULL_IMAGE:
        return basicSetNull_image(null, msgs);
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
      case MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_DEFINITION_FILTER_COLUMN_NAME:
        return getFilter_column_definition_filter_column_name();
      case MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_OPERATOR:
        return getFilter_column_operator();
      case MyDslPackage.FILTER_COLUMN_DEFINITION__NULL_IMAGE:
        return getNull_image();
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
      case MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_DEFINITION_FILTER_COLUMN_NAME:
        setFilter_column_definition_filter_column_name((String)newValue);
        return;
      case MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_OPERATOR:
        setFilter_column_operator((filter_column_operator)newValue);
        return;
      case MyDslPackage.FILTER_COLUMN_DEFINITION__NULL_IMAGE:
        setNull_image((null_image)newValue);
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
      case MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_DEFINITION_FILTER_COLUMN_NAME:
        setFilter_column_definition_filter_column_name(FILTER_COLUMN_DEFINITION_FILTER_COLUMN_NAME_EDEFAULT);
        return;
      case MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_OPERATOR:
        setFilter_column_operator((filter_column_operator)null);
        return;
      case MyDslPackage.FILTER_COLUMN_DEFINITION__NULL_IMAGE:
        setNull_image((null_image)null);
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
      case MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_DEFINITION_FILTER_COLUMN_NAME:
        return FILTER_COLUMN_DEFINITION_FILTER_COLUMN_NAME_EDEFAULT == null ? filter_column_definition_filter_column_name != null : !FILTER_COLUMN_DEFINITION_FILTER_COLUMN_NAME_EDEFAULT.equals(filter_column_definition_filter_column_name);
      case MyDslPackage.FILTER_COLUMN_DEFINITION__FILTER_COLUMN_OPERATOR:
        return filter_column_operator != null;
      case MyDslPackage.FILTER_COLUMN_DEFINITION__NULL_IMAGE:
        return null_image != null;
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
    result.append(" (filter_column_definition_filter_column_name: ");
    result.append(filter_column_definition_filter_column_name);
    result.append(')');
    return result.toString();
  }

} //filter_column_definitionImpl
