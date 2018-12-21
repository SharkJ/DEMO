/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.mandatory_flag_setting;
import io.typefox.xtext.langserver.example.myDsl.parameter_definition;
import io.typefox.xtext.langserver.example.myDsl.type_definition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.parameter_definitionImpl#getParameter_definition_parameter_name <em>Parameter definition parameter name</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.parameter_definitionImpl#getType_definition <em>Type definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.parameter_definitionImpl#getMandatory_flag_setting <em>Mandatory flag setting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class parameter_definitionImpl extends MinimalEObjectImpl.Container implements parameter_definition
{
  /**
   * The default value of the '{@link #getParameter_definition_parameter_name() <em>Parameter definition parameter name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_definition_parameter_name()
   * @generated
   * @ordered
   */
  protected static final String PARAMETER_DEFINITION_PARAMETER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParameter_definition_parameter_name() <em>Parameter definition parameter name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter_definition_parameter_name()
   * @generated
   * @ordered
   */
  protected String parameter_definition_parameter_name = PARAMETER_DEFINITION_PARAMETER_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType_definition() <em>Type definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_definition()
   * @generated
   * @ordered
   */
  protected type_definition type_definition;

  /**
   * The cached value of the '{@link #getMandatory_flag_setting() <em>Mandatory flag setting</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMandatory_flag_setting()
   * @generated
   * @ordered
   */
  protected mandatory_flag_setting mandatory_flag_setting;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected parameter_definitionImpl()
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
    return MyDslPackage.Literals.PARAMETER_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParameter_definition_parameter_name()
  {
    return parameter_definition_parameter_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter_definition_parameter_name(String newParameter_definition_parameter_name)
  {
    String oldParameter_definition_parameter_name = parameter_definition_parameter_name;
    parameter_definition_parameter_name = newParameter_definition_parameter_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_DEFINITION__PARAMETER_DEFINITION_PARAMETER_NAME, oldParameter_definition_parameter_name, parameter_definition_parameter_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_definition getType_definition()
  {
    return type_definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_definition(type_definition newType_definition, NotificationChain msgs)
  {
    type_definition oldType_definition = type_definition;
    type_definition = newType_definition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_DEFINITION__TYPE_DEFINITION, oldType_definition, newType_definition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_definition(type_definition newType_definition)
  {
    if (newType_definition != type_definition)
    {
      NotificationChain msgs = null;
      if (type_definition != null)
        msgs = ((InternalEObject)type_definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_DEFINITION__TYPE_DEFINITION, null, msgs);
      if (newType_definition != null)
        msgs = ((InternalEObject)newType_definition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_DEFINITION__TYPE_DEFINITION, null, msgs);
      msgs = basicSetType_definition(newType_definition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_DEFINITION__TYPE_DEFINITION, newType_definition, newType_definition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mandatory_flag_setting getMandatory_flag_setting()
  {
    return mandatory_flag_setting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMandatory_flag_setting(mandatory_flag_setting newMandatory_flag_setting, NotificationChain msgs)
  {
    mandatory_flag_setting oldMandatory_flag_setting = mandatory_flag_setting;
    mandatory_flag_setting = newMandatory_flag_setting;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_DEFINITION__MANDATORY_FLAG_SETTING, oldMandatory_flag_setting, newMandatory_flag_setting);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMandatory_flag_setting(mandatory_flag_setting newMandatory_flag_setting)
  {
    if (newMandatory_flag_setting != mandatory_flag_setting)
    {
      NotificationChain msgs = null;
      if (mandatory_flag_setting != null)
        msgs = ((InternalEObject)mandatory_flag_setting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_DEFINITION__MANDATORY_FLAG_SETTING, null, msgs);
      if (newMandatory_flag_setting != null)
        msgs = ((InternalEObject)newMandatory_flag_setting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PARAMETER_DEFINITION__MANDATORY_FLAG_SETTING, null, msgs);
      msgs = basicSetMandatory_flag_setting(newMandatory_flag_setting, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PARAMETER_DEFINITION__MANDATORY_FLAG_SETTING, newMandatory_flag_setting, newMandatory_flag_setting));
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
      case MyDslPackage.PARAMETER_DEFINITION__TYPE_DEFINITION:
        return basicSetType_definition(null, msgs);
      case MyDslPackage.PARAMETER_DEFINITION__MANDATORY_FLAG_SETTING:
        return basicSetMandatory_flag_setting(null, msgs);
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
      case MyDslPackage.PARAMETER_DEFINITION__PARAMETER_DEFINITION_PARAMETER_NAME:
        return getParameter_definition_parameter_name();
      case MyDslPackage.PARAMETER_DEFINITION__TYPE_DEFINITION:
        return getType_definition();
      case MyDslPackage.PARAMETER_DEFINITION__MANDATORY_FLAG_SETTING:
        return getMandatory_flag_setting();
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
      case MyDslPackage.PARAMETER_DEFINITION__PARAMETER_DEFINITION_PARAMETER_NAME:
        setParameter_definition_parameter_name((String)newValue);
        return;
      case MyDslPackage.PARAMETER_DEFINITION__TYPE_DEFINITION:
        setType_definition((type_definition)newValue);
        return;
      case MyDslPackage.PARAMETER_DEFINITION__MANDATORY_FLAG_SETTING:
        setMandatory_flag_setting((mandatory_flag_setting)newValue);
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
      case MyDslPackage.PARAMETER_DEFINITION__PARAMETER_DEFINITION_PARAMETER_NAME:
        setParameter_definition_parameter_name(PARAMETER_DEFINITION_PARAMETER_NAME_EDEFAULT);
        return;
      case MyDslPackage.PARAMETER_DEFINITION__TYPE_DEFINITION:
        setType_definition((type_definition)null);
        return;
      case MyDslPackage.PARAMETER_DEFINITION__MANDATORY_FLAG_SETTING:
        setMandatory_flag_setting((mandatory_flag_setting)null);
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
      case MyDslPackage.PARAMETER_DEFINITION__PARAMETER_DEFINITION_PARAMETER_NAME:
        return PARAMETER_DEFINITION_PARAMETER_NAME_EDEFAULT == null ? parameter_definition_parameter_name != null : !PARAMETER_DEFINITION_PARAMETER_NAME_EDEFAULT.equals(parameter_definition_parameter_name);
      case MyDslPackage.PARAMETER_DEFINITION__TYPE_DEFINITION:
        return type_definition != null;
      case MyDslPackage.PARAMETER_DEFINITION__MANDATORY_FLAG_SETTING:
        return mandatory_flag_setting != null;
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
    result.append(" (parameter_definition_parameter_name: ");
    result.append(parameter_definition_parameter_name);
    result.append(')');
    return result.toString();
  }

} //parameter_definitionImpl
