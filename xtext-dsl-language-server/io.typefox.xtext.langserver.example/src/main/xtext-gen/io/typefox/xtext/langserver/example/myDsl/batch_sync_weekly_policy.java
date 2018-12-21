/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>batch sync weekly policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.batch_sync_weekly_policy#getBatch_sync_weekday <em>Batch sync weekday</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.batch_sync_weekly_policy#getBatch_sync_weekly_policy_time <em>Batch sync weekly policy time</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getbatch_sync_weekly_policy()
 * @model
 * @generated
 */
public interface batch_sync_weekly_policy extends sync_schedule_definition
{
  /**
   * Returns the value of the '<em><b>Batch sync weekday</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Batch sync weekday</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Batch sync weekday</em>' containment reference.
   * @see #setBatch_sync_weekday(batch_sync_weekday)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getbatch_sync_weekly_policy_Batch_sync_weekday()
   * @model containment="true"
   * @generated
   */
  batch_sync_weekday getBatch_sync_weekday();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.batch_sync_weekly_policy#getBatch_sync_weekday <em>Batch sync weekday</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Batch sync weekday</em>' containment reference.
   * @see #getBatch_sync_weekday()
   * @generated
   */
  void setBatch_sync_weekday(batch_sync_weekday value);

  /**
   * Returns the value of the '<em><b>Batch sync weekly policy time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Batch sync weekly policy time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Batch sync weekly policy time</em>' attribute.
   * @see #setBatch_sync_weekly_policy_time(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getbatch_sync_weekly_policy_Batch_sync_weekly_policy_time()
   * @model
   * @generated
   */
  String getBatch_sync_weekly_policy_time();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.batch_sync_weekly_policy#getBatch_sync_weekly_policy_time <em>Batch sync weekly policy time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Batch sync weekly policy time</em>' attribute.
   * @see #getBatch_sync_weekly_policy_time()
   * @generated
   */
  void setBatch_sync_weekly_policy_time(String value);

} // batch_sync_weekly_policy
