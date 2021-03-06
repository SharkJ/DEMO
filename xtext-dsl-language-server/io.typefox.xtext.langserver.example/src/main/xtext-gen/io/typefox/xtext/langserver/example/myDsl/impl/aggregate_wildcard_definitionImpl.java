/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.aggregate_wildcard_definition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>aggregate wildcard definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.aggregate_wildcard_definitionImpl#getAggregate_wildcard_definition_wildcard_token <em>Aggregate wildcard definition wildcard token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class aggregate_wildcard_definitionImpl extends MinimalEObjectImpl.Container implements aggregate_wildcard_definition
{
  /**
   * The default value of the '{@link #getAggregate_wildcard_definition_wildcard_token() <em>Aggregate wildcard definition wildcard token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregate_wildcard_definition_wildcard_token()
   * @generated
   * @ordered
   */
  protected static final String AGGREGATE_WILDCARD_DEFINITION_WILDCARD_TOKEN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAggregate_wildcard_definition_wildcard_token() <em>Aggregate wildcard definition wildcard token</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregate_wildcard_definition_wildcard_token()
   * @generated
   * @ordered
   */
  protected String aggregate_wildcard_definition_wildcard_token = AGGREGATE_WILDCARD_DEFINITION_WILDCARD_TOKEN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected aggregate_wildcard_definitionImpl()
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
    return MyDslPackage.Literals.AGGREGATE_WILDCARD_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAggregate_wildcard_definition_wildcard_token()
  {
    return aggregate_wildcard_definition_wildcard_token;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregate_wildcard_definition_wildcard_token(String newAggregate_wildcard_definition_wildcard_token)
  {
    String oldAggregate_wildcard_definition_wildcard_token = aggregate_wildcard_definition_wildcard_token;
    aggregate_wildcard_definition_wildcard_token = newAggregate_wildcard_definition_wildcard_token;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.AGGREGATE_WILDCARD_DEFINITION__AGGREGATE_WILDCARD_DEFINITION_WILDCARD_TOKEN, oldAggregate_wildcard_definition_wildcard_token, aggregate_wildcard_definition_wildcard_token));
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
      case MyDslPackage.AGGREGATE_WILDCARD_DEFINITION__AGGREGATE_WILDCARD_DEFINITION_WILDCARD_TOKEN:
        return getAggregate_wildcard_definition_wildcard_token();
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
      case MyDslPackage.AGGREGATE_WILDCARD_DEFINITION__AGGREGATE_WILDCARD_DEFINITION_WILDCARD_TOKEN:
        setAggregate_wildcard_definition_wildcard_token((String)newValue);
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
      case MyDslPackage.AGGREGATE_WILDCARD_DEFINITION__AGGREGATE_WILDCARD_DEFINITION_WILDCARD_TOKEN:
        setAggregate_wildcard_definition_wildcard_token(AGGREGATE_WILDCARD_DEFINITION_WILDCARD_TOKEN_EDEFAULT);
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
      case MyDslPackage.AGGREGATE_WILDCARD_DEFINITION__AGGREGATE_WILDCARD_DEFINITION_WILDCARD_TOKEN:
        return AGGREGATE_WILDCARD_DEFINITION_WILDCARD_TOKEN_EDEFAULT == null ? aggregate_wildcard_definition_wildcard_token != null : !AGGREGATE_WILDCARD_DEFINITION_WILDCARD_TOKEN_EDEFAULT.equals(aggregate_wildcard_definition_wildcard_token);
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
    result.append(" (aggregate_wildcard_definition_wildcard_token: ");
    result.append(aggregate_wildcard_definition_wildcard_token);
    result.append(')');
    return result.toString();
  }

} //aggregate_wildcard_definitionImpl
