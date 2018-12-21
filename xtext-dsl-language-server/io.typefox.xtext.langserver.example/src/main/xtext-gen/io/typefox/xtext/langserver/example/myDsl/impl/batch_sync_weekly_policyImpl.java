/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl.impl;

import io.typefox.xtext.langserver.example.myDsl.MyDslPackage;
import io.typefox.xtext.langserver.example.myDsl.batch_sync_weekday;
import io.typefox.xtext.langserver.example.myDsl.batch_sync_weekly_policy;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>batch sync weekly policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.batch_sync_weekly_policyImpl#getBatch_sync_weekday <em>Batch sync weekday</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.impl.batch_sync_weekly_policyImpl#getBatch_sync_weekly_policy_time <em>Batch sync weekly policy time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class batch_sync_weekly_policyImpl extends sync_schedule_definitionImpl implements batch_sync_weekly_policy
{
  /**
   * The cached value of the '{@link #getBatch_sync_weekday() <em>Batch sync weekday</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBatch_sync_weekday()
   * @generated
   * @ordered
   */
  protected batch_sync_weekday batch_sync_weekday;

  /**
   * The default value of the '{@link #getBatch_sync_weekly_policy_time() <em>Batch sync weekly policy time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBatch_sync_weekly_policy_time()
   * @generated
   * @ordered
   */
  protected static final String BATCH_SYNC_WEEKLY_POLICY_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBatch_sync_weekly_policy_time() <em>Batch sync weekly policy time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBatch_sync_weekly_policy_time()
   * @generated
   * @ordered
   */
  protected String batch_sync_weekly_policy_time = BATCH_SYNC_WEEKLY_POLICY_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected batch_sync_weekly_policyImpl()
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
    return MyDslPackage.Literals.BATCH_SYNC_WEEKLY_POLICY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public batch_sync_weekday getBatch_sync_weekday()
  {
    return batch_sync_weekday;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBatch_sync_weekday(batch_sync_weekday newBatch_sync_weekday, NotificationChain msgs)
  {
    batch_sync_weekday oldBatch_sync_weekday = batch_sync_weekday;
    batch_sync_weekday = newBatch_sync_weekday;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKDAY, oldBatch_sync_weekday, newBatch_sync_weekday);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBatch_sync_weekday(batch_sync_weekday newBatch_sync_weekday)
  {
    if (newBatch_sync_weekday != batch_sync_weekday)
    {
      NotificationChain msgs = null;
      if (batch_sync_weekday != null)
        msgs = ((InternalEObject)batch_sync_weekday).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKDAY, null, msgs);
      if (newBatch_sync_weekday != null)
        msgs = ((InternalEObject)newBatch_sync_weekday).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKDAY, null, msgs);
      msgs = basicSetBatch_sync_weekday(newBatch_sync_weekday, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKDAY, newBatch_sync_weekday, newBatch_sync_weekday));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBatch_sync_weekly_policy_time()
  {
    return batch_sync_weekly_policy_time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBatch_sync_weekly_policy_time(String newBatch_sync_weekly_policy_time)
  {
    String oldBatch_sync_weekly_policy_time = batch_sync_weekly_policy_time;
    batch_sync_weekly_policy_time = newBatch_sync_weekly_policy_time;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKLY_POLICY_TIME, oldBatch_sync_weekly_policy_time, batch_sync_weekly_policy_time));
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
      case MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKDAY:
        return basicSetBatch_sync_weekday(null, msgs);
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
      case MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKDAY:
        return getBatch_sync_weekday();
      case MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKLY_POLICY_TIME:
        return getBatch_sync_weekly_policy_time();
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
      case MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKDAY:
        setBatch_sync_weekday((batch_sync_weekday)newValue);
        return;
      case MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKLY_POLICY_TIME:
        setBatch_sync_weekly_policy_time((String)newValue);
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
      case MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKDAY:
        setBatch_sync_weekday((batch_sync_weekday)null);
        return;
      case MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKLY_POLICY_TIME:
        setBatch_sync_weekly_policy_time(BATCH_SYNC_WEEKLY_POLICY_TIME_EDEFAULT);
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
      case MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKDAY:
        return batch_sync_weekday != null;
      case MyDslPackage.BATCH_SYNC_WEEKLY_POLICY__BATCH_SYNC_WEEKLY_POLICY_TIME:
        return BATCH_SYNC_WEEKLY_POLICY_TIME_EDEFAULT == null ? batch_sync_weekly_policy_time != null : !BATCH_SYNC_WEEKLY_POLICY_TIME_EDEFAULT.equals(batch_sync_weekly_policy_time);
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
    result.append(" (batch_sync_weekly_policy_time: ");
    result.append(batch_sync_weekly_policy_time);
    result.append(')');
    return result.toString();
  }

} //batch_sync_weekly_policyImpl