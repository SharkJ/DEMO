/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>batch sync daily policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.batch_sync_daily_policy#getBatch_sync_daily_policy_time <em>Batch sync daily policy time</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getbatch_sync_daily_policy()
 * @model
 * @generated
 */
public interface batch_sync_daily_policy extends sync_schedule_definition
{
  /**
   * Returns the value of the '<em><b>Batch sync daily policy time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Batch sync daily policy time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Batch sync daily policy time</em>' attribute.
   * @see #setBatch_sync_daily_policy_time(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getbatch_sync_daily_policy_Batch_sync_daily_policy_time()
   * @model
   * @generated
   */
  String getBatch_sync_daily_policy_time();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.batch_sync_daily_policy#getBatch_sync_daily_policy_time <em>Batch sync daily policy time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Batch sync daily policy time</em>' attribute.
   * @see #getBatch_sync_daily_policy_time()
   * @generated
   */
  void setBatch_sync_daily_policy_time(String value);

} // batch_sync_daily_policy