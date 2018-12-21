/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>grouped push sync policy definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.grouped_push_sync_policy_definition#getUser_filter_reference <em>User filter reference</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.grouped_push_sync_policy_definition#getLanguage_dependent_definition <em>Language dependent definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.grouped_push_sync_policy_definition#getSync_group_definition <em>Sync group definition</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getgrouped_push_sync_policy_definition()
 * @model
 * @generated
 */
public interface grouped_push_sync_policy_definition extends sync_policy_definition
{
  /**
   * Returns the value of the '<em><b>User filter reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User filter reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User filter reference</em>' containment reference.
   * @see #setUser_filter_reference(user_filter_reference)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getgrouped_push_sync_policy_definition_User_filter_reference()
   * @model containment="true"
   * @generated
   */
  user_filter_reference getUser_filter_reference();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.grouped_push_sync_policy_definition#getUser_filter_reference <em>User filter reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User filter reference</em>' containment reference.
   * @see #getUser_filter_reference()
   * @generated
   */
  void setUser_filter_reference(user_filter_reference value);

  /**
   * Returns the value of the '<em><b>Language dependent definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Language dependent definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Language dependent definition</em>' containment reference.
   * @see #setLanguage_dependent_definition(language_dependent_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getgrouped_push_sync_policy_definition_Language_dependent_definition()
   * @model containment="true"
   * @generated
   */
  language_dependent_definition getLanguage_dependent_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.grouped_push_sync_policy_definition#getLanguage_dependent_definition <em>Language dependent definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Language dependent definition</em>' containment reference.
   * @see #getLanguage_dependent_definition()
   * @generated
   */
  void setLanguage_dependent_definition(language_dependent_definition value);

  /**
   * Returns the value of the '<em><b>Sync group definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sync group definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sync group definition</em>' containment reference.
   * @see #setSync_group_definition(sync_group_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getgrouped_push_sync_policy_definition_Sync_group_definition()
   * @model containment="true"
   * @generated
   */
  sync_group_definition getSync_group_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.grouped_push_sync_policy_definition#getSync_group_definition <em>Sync group definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sync group definition</em>' containment reference.
   * @see #getSync_group_definition()
   * @generated
   */
  void setSync_group_definition(sync_group_definition value);

} // grouped_push_sync_policy_definition
