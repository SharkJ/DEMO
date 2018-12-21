/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.dynamic_component_dependency;
import io.typefox.xtext.langserver.example.myDsl.summary_definition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>summary definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.summary_definitionImpl#getDynamic_component_dependency <em>Dynamic component dependency</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.summary_definitionImpl#getSummary_definition_summary_name <em>Summary definition summary name</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.summary_definitionImpl#getAlt <em>Alt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class summary_definitionImpl extends MainElementImpl implements summary_definition
{
  /**
   * The cached value of the '{@link #getDynamic_component_dependency() <em>Dynamic component dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDynamic_component_dependency()
   * @generated
   * @ordered
   */
  protected dynamic_component_dependency dynamic_component_dependency;

  /**
   * The default value of the '{@link #getSummary_definition_summary_name() <em>Summary definition summary name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary_definition_summary_name()
   * @generated
   * @ordered
   */
  protected static final String SUMMARY_DEFINITION_SUMMARY_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSummary_definition_summary_name() <em>Summary definition summary name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSummary_definition_summary_name()
   * @generated
   * @ordered
   */
  protected String summary_definition_summary_name = SUMMARY_DEFINITION_SUMMARY_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAlt() <em>Alt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlt()
   * @generated
   * @ordered
   */
  protected EObject alt;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected summary_definitionImpl()
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
    return MyDslPackage.Literals.SUMMARY_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public dynamic_component_dependency getDynamic_component_dependency()
  {
    return dynamic_component_dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDynamic_component_dependency(dynamic_component_dependency newDynamic_component_dependency, NotificationChain msgs)
  {
    dynamic_component_dependency oldDynamic_component_dependency = dynamic_component_dependency;
    dynamic_component_dependency = newDynamic_component_dependency;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SUMMARY_DEFINITION__DYNAMIC_COMPONENT_DEPENDENCY, oldDynamic_component_dependency, newDynamic_component_dependency);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDynamic_component_dependency(dynamic_component_dependency newDynamic_component_dependency)
  {
    if (newDynamic_component_dependency != dynamic_component_dependency)
    {
      NotificationChain msgs = null;
      if (dynamic_component_dependency != null)
        msgs = ((InternalEObject)dynamic_component_dependency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SUMMARY_DEFINITION__DYNAMIC_COMPONENT_DEPENDENCY, null, msgs);
      if (newDynamic_component_dependency != null)
        msgs = ((InternalEObject)newDynamic_component_dependency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SUMMARY_DEFINITION__DYNAMIC_COMPONENT_DEPENDENCY, null, msgs);
      msgs = basicSetDynamic_component_dependency(newDynamic_component_dependency, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SUMMARY_DEFINITION__DYNAMIC_COMPONENT_DEPENDENCY, newDynamic_component_dependency, newDynamic_component_dependency));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSummary_definition_summary_name()
  {
    return summary_definition_summary_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSummary_definition_summary_name(String newSummary_definition_summary_name)
  {
    String oldSummary_definition_summary_name = summary_definition_summary_name;
    summary_definition_summary_name = newSummary_definition_summary_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SUMMARY_DEFINITION__SUMMARY_DEFINITION_SUMMARY_NAME, oldSummary_definition_summary_name, summary_definition_summary_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getAlt()
  {
    return alt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlt(EObject newAlt, NotificationChain msgs)
  {
    EObject oldAlt = alt;
    alt = newAlt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SUMMARY_DEFINITION__ALT, oldAlt, newAlt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlt(EObject newAlt)
  {
    if (newAlt != alt)
    {
      NotificationChain msgs = null;
      if (alt != null)
        msgs = ((InternalEObject)alt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SUMMARY_DEFINITION__ALT, null, msgs);
      if (newAlt != null)
        msgs = ((InternalEObject)newAlt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SUMMARY_DEFINITION__ALT, null, msgs);
      msgs = basicSetAlt(newAlt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SUMMARY_DEFINITION__ALT, newAlt, newAlt));
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
      case MyDslPackage.SUMMARY_DEFINITION__DYNAMIC_COMPONENT_DEPENDENCY:
        return basicSetDynamic_component_dependency(null, msgs);
      case MyDslPackage.SUMMARY_DEFINITION__ALT:
        return basicSetAlt(null, msgs);
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
      case MyDslPackage.SUMMARY_DEFINITION__DYNAMIC_COMPONENT_DEPENDENCY:
        return getDynamic_component_dependency();
      case MyDslPackage.SUMMARY_DEFINITION__SUMMARY_DEFINITION_SUMMARY_NAME:
        return getSummary_definition_summary_name();
      case MyDslPackage.SUMMARY_DEFINITION__ALT:
        return getAlt();
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
      case MyDslPackage.SUMMARY_DEFINITION__DYNAMIC_COMPONENT_DEPENDENCY:
        setDynamic_component_dependency((dynamic_component_dependency)newValue);
        return;
      case MyDslPackage.SUMMARY_DEFINITION__SUMMARY_DEFINITION_SUMMARY_NAME:
        setSummary_definition_summary_name((String)newValue);
        return;
      case MyDslPackage.SUMMARY_DEFINITION__ALT:
        setAlt((EObject)newValue);
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
      case MyDslPackage.SUMMARY_DEFINITION__DYNAMIC_COMPONENT_DEPENDENCY:
        setDynamic_component_dependency((dynamic_component_dependency)null);
        return;
      case MyDslPackage.SUMMARY_DEFINITION__SUMMARY_DEFINITION_SUMMARY_NAME:
        setSummary_definition_summary_name(SUMMARY_DEFINITION_SUMMARY_NAME_EDEFAULT);
        return;
      case MyDslPackage.SUMMARY_DEFINITION__ALT:
        setAlt((EObject)null);
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
      case MyDslPackage.SUMMARY_DEFINITION__DYNAMIC_COMPONENT_DEPENDENCY:
        return dynamic_component_dependency != null;
      case MyDslPackage.SUMMARY_DEFINITION__SUMMARY_DEFINITION_SUMMARY_NAME:
        return SUMMARY_DEFINITION_SUMMARY_NAME_EDEFAULT == null ? summary_definition_summary_name != null : !SUMMARY_DEFINITION_SUMMARY_NAME_EDEFAULT.equals(summary_definition_summary_name);
      case MyDslPackage.SUMMARY_DEFINITION__ALT:
        return alt != null;
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
    result.append(" (summary_definition_summary_name: ");
    result.append(summary_definition_summary_name);
    result.append(')');
    return result.toString();
  }

} //summary_definitionImpl
