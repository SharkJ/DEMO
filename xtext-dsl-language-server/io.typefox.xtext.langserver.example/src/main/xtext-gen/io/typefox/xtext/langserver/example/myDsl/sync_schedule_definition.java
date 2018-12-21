/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>sync schedule definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.sync_schedule_definition#getFilter_on_entity_setting <em>Filter on entity setting</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.sync_schedule_definition#getString <em>String</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.sync_schedule_definition#getGuard_condition_definition <em>Guard condition definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.sync_schedule_definition#getOwnership_query_definition <em>Ownership query definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.sync_schedule_definition#getExclude_details_setting <em>Exclude details setting</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getsync_schedule_definition()
 * @model
 * @generated
 */
public interface sync_schedule_definition extends batch_sync_policy_definition, push_sync_policy_definition, grouped_push_sync_policy_definition
{
  /**
   * Returns the value of the '<em><b>Filter on entity setting</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter on entity setting</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter on entity setting</em>' containment reference.
   * @see #setFilter_on_entity_setting(filter_on_entity_setting)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getsync_schedule_definition_Filter_on_entity_setting()
   * @model containment="true"
   * @generated
   */
  filter_on_entity_setting getFilter_on_entity_setting();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.sync_schedule_definition#getFilter_on_entity_setting <em>Filter on entity setting</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter on entity setting</em>' containment reference.
   * @see #getFilter_on_entity_setting()
   * @generated
   */
  void setFilter_on_entity_setting(filter_on_entity_setting value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getsync_schedule_definition_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.sync_schedule_definition#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Guard condition definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard condition definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard condition definition</em>' containment reference.
   * @see #setGuard_condition_definition(guard_condition_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getsync_schedule_definition_Guard_condition_definition()
   * @model containment="true"
   * @generated
   */
  guard_condition_definition getGuard_condition_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.sync_schedule_definition#getGuard_condition_definition <em>Guard condition definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard condition definition</em>' containment reference.
   * @see #getGuard_condition_definition()
   * @generated
   */
  void setGuard_condition_definition(guard_condition_definition value);

  /**
   * Returns the value of the '<em><b>Ownership query definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ownership query definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ownership query definition</em>' containment reference.
   * @see #setOwnership_query_definition(ownership_query_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getsync_schedule_definition_Ownership_query_definition()
   * @model containment="true"
   * @generated
   */
  ownership_query_definition getOwnership_query_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.sync_schedule_definition#getOwnership_query_definition <em>Ownership query definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ownership query definition</em>' containment reference.
   * @see #getOwnership_query_definition()
   * @generated
   */
  void setOwnership_query_definition(ownership_query_definition value);

  /**
   * Returns the value of the '<em><b>Exclude details setting</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude details setting</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude details setting</em>' containment reference.
   * @see #setExclude_details_setting(exclude_details_setting)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getsync_schedule_definition_Exclude_details_setting()
   * @model containment="true"
   * @generated
   */
  exclude_details_setting getExclude_details_setting();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.sync_schedule_definition#getExclude_details_setting <em>Exclude details setting</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude details setting</em>' containment reference.
   * @see #getExclude_details_setting()
   * @generated
   */
  void setExclude_details_setting(exclude_details_setting value);

} // sync_schedule_definition