/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.batch_sync_hourly_policy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>batch sync hourly policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.batch_sync_hourly_policyImpl#getBatch_sync_hourly_policy_time <em>Batch sync hourly policy time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class batch_sync_hourly_policyImpl extends sync_schedule_definitionImpl implements batch_sync_hourly_policy
{
  /**
   * The default value of the '{@link #getBatch_sync_hourly_policy_time() <em>Batch sync hourly policy time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBatch_sync_hourly_policy_time()
   * @generated
   * @ordered
   */
  protected static final String BATCH_SYNC_HOURLY_POLICY_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBatch_sync_hourly_policy_time() <em>Batch sync hourly policy time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBatch_sync_hourly_policy_time()
   * @generated
   * @ordered
   */
  protected String batch_sync_hourly_policy_time = BATCH_SYNC_HOURLY_POLICY_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected batch_sync_hourly_policyImpl()
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
    return MyDslPackage.Literals.BATCH_SYNC_HOURLY_POLICY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBatch_sync_hourly_policy_time()
  {
    return batch_sync_hourly_policy_time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBatch_sync_hourly_policy_time(String newBatch_sync_hourly_policy_time)
  {
    String oldBatch_sync_hourly_policy_time = batch_sync_hourly_policy_time;
    batch_sync_hourly_policy_time = newBatch_sync_hourly_policy_time;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.BATCH_SYNC_HOURLY_POLICY__BATCH_SYNC_HOURLY_POLICY_TIME, oldBatch_sync_hourly_policy_time, batch_sync_hourly_policy_time));
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
      case MyDslPackage.BATCH_SYNC_HOURLY_POLICY__BATCH_SYNC_HOURLY_POLICY_TIME:
        return getBatch_sync_hourly_policy_time();
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
      case MyDslPackage.BATCH_SYNC_HOURLY_POLICY__BATCH_SYNC_HOURLY_POLICY_TIME:
        setBatch_sync_hourly_policy_time((String)newValue);
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
      case MyDslPackage.BATCH_SYNC_HOURLY_POLICY__BATCH_SYNC_HOURLY_POLICY_TIME:
        setBatch_sync_hourly_policy_time(BATCH_SYNC_HOURLY_POLICY_TIME_EDEFAULT);
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
      case MyDslPackage.BATCH_SYNC_HOURLY_POLICY__BATCH_SYNC_HOURLY_POLICY_TIME:
        return BATCH_SYNC_HOURLY_POLICY_TIME_EDEFAULT == null ? batch_sync_hourly_policy_time != null : !BATCH_SYNC_HOURLY_POLICY_TIME_EDEFAULT.equals(batch_sync_hourly_policy_time);
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
    result.append(" (batch_sync_hourly_policy_time: ");
    result.append(batch_sync_hourly_policy_time);
    result.append(')');
    return result.toString();
  }

} //batch_sync_hourly_policyImpl
