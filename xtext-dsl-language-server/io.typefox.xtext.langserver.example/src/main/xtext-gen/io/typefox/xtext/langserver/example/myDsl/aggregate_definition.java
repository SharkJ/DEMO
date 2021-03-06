/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>aggregate definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getDynamic_component_dependency <em>Dynamic component dependency</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getAggregate_definition_aggregate_name <em>Aggregate definition aggregate name</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getKey_reference <em>Key reference</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getKey_reference2 <em>Key reference2</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getDataitem_reference <em>Dataitem reference</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getDataitem_reference2 <em>Dataitem reference2</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getDataitem_reference3 <em>Dataitem reference3</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getTo_reference_definition <em>To reference definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getTo_function_definition <em>To function definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getLabel_definition <em>Label definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getPrefetch_definition <em>Prefetch definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getCopy_definition <em>Copy definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getWhere_definition <em>Where definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getWhere_filter_definition <em>Where filter definition</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getAggregate_list_flag_setting <em>Aggregate list flag setting</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getAlt <em>Alt</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getAggregate_wildcard_definition <em>Aggregate wildcard definition</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition()
 * @model
 * @generated
 */
public interface aggregate_definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Dynamic component dependency</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dynamic component dependency</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic component dependency</em>' containment reference.
   * @see #setDynamic_component_dependency(dynamic_component_dependency)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Dynamic_component_dependency()
   * @model containment="true"
   * @generated
   */
  dynamic_component_dependency getDynamic_component_dependency();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getDynamic_component_dependency <em>Dynamic component dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic component dependency</em>' containment reference.
   * @see #getDynamic_component_dependency()
   * @generated
   */
  void setDynamic_component_dependency(dynamic_component_dependency value);

  /**
   * Returns the value of the '<em><b>Aggregate definition aggregate name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregate definition aggregate name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregate definition aggregate name</em>' attribute.
   * @see #setAggregate_definition_aggregate_name(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Aggregate_definition_aggregate_name()
   * @model
   * @generated
   */
  String getAggregate_definition_aggregate_name();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getAggregate_definition_aggregate_name <em>Aggregate definition aggregate name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregate definition aggregate name</em>' attribute.
   * @see #getAggregate_definition_aggregate_name()
   * @generated
   */
  void setAggregate_definition_aggregate_name(String value);

  /**
   * Returns the value of the '<em><b>Key reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key reference</em>' containment reference.
   * @see #setKey_reference(key_reference)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Key_reference()
   * @model containment="true"
   * @generated
   */
  key_reference getKey_reference();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getKey_reference <em>Key reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key reference</em>' containment reference.
   * @see #getKey_reference()
   * @generated
   */
  void setKey_reference(key_reference value);

  /**
   * Returns the value of the '<em><b>Key reference2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key reference2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key reference2</em>' containment reference.
   * @see #setKey_reference2(key_reference)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Key_reference2()
   * @model containment="true"
   * @generated
   */
  key_reference getKey_reference2();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getKey_reference2 <em>Key reference2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key reference2</em>' containment reference.
   * @see #getKey_reference2()
   * @generated
   */
  void setKey_reference2(key_reference value);

  /**
   * Returns the value of the '<em><b>Dataitem reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataitem reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataitem reference</em>' containment reference.
   * @see #setDataitem_reference(dataitem_reference)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Dataitem_reference()
   * @model containment="true"
   * @generated
   */
  dataitem_reference getDataitem_reference();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getDataitem_reference <em>Dataitem reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dataitem reference</em>' containment reference.
   * @see #getDataitem_reference()
   * @generated
   */
  void setDataitem_reference(dataitem_reference value);

  /**
   * Returns the value of the '<em><b>Dataitem reference2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataitem reference2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataitem reference2</em>' containment reference.
   * @see #setDataitem_reference2(dataitem_reference)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Dataitem_reference2()
   * @model containment="true"
   * @generated
   */
  dataitem_reference getDataitem_reference2();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getDataitem_reference2 <em>Dataitem reference2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dataitem reference2</em>' containment reference.
   * @see #getDataitem_reference2()
   * @generated
   */
  void setDataitem_reference2(dataitem_reference value);

  /**
   * Returns the value of the '<em><b>Dataitem reference3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataitem reference3</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataitem reference3</em>' containment reference.
   * @see #setDataitem_reference3(dataitem_reference)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Dataitem_reference3()
   * @model containment="true"
   * @generated
   */
  dataitem_reference getDataitem_reference3();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getDataitem_reference3 <em>Dataitem reference3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dataitem reference3</em>' containment reference.
   * @see #getDataitem_reference3()
   * @generated
   */
  void setDataitem_reference3(dataitem_reference value);

  /**
   * Returns the value of the '<em><b>To reference definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To reference definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To reference definition</em>' containment reference.
   * @see #setTo_reference_definition(to_reference_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_To_reference_definition()
   * @model containment="true"
   * @generated
   */
  to_reference_definition getTo_reference_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getTo_reference_definition <em>To reference definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To reference definition</em>' containment reference.
   * @see #getTo_reference_definition()
   * @generated
   */
  void setTo_reference_definition(to_reference_definition value);

  /**
   * Returns the value of the '<em><b>To function definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To function definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To function definition</em>' containment reference.
   * @see #setTo_function_definition(to_function_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_To_function_definition()
   * @model containment="true"
   * @generated
   */
  to_function_definition getTo_function_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getTo_function_definition <em>To function definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To function definition</em>' containment reference.
   * @see #getTo_function_definition()
   * @generated
   */
  void setTo_function_definition(to_function_definition value);

  /**
   * Returns the value of the '<em><b>Label definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label definition</em>' containment reference.
   * @see #setLabel_definition(label_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Label_definition()
   * @model containment="true"
   * @generated
   */
  label_definition getLabel_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getLabel_definition <em>Label definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label definition</em>' containment reference.
   * @see #getLabel_definition()
   * @generated
   */
  void setLabel_definition(label_definition value);

  /**
   * Returns the value of the '<em><b>Prefetch definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefetch definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefetch definition</em>' containment reference.
   * @see #setPrefetch_definition(prefetch_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Prefetch_definition()
   * @model containment="true"
   * @generated
   */
  prefetch_definition getPrefetch_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getPrefetch_definition <em>Prefetch definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefetch definition</em>' containment reference.
   * @see #getPrefetch_definition()
   * @generated
   */
  void setPrefetch_definition(prefetch_definition value);

  /**
   * Returns the value of the '<em><b>Copy definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Copy definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Copy definition</em>' containment reference.
   * @see #setCopy_definition(copy_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Copy_definition()
   * @model containment="true"
   * @generated
   */
  copy_definition getCopy_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getCopy_definition <em>Copy definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Copy definition</em>' containment reference.
   * @see #getCopy_definition()
   * @generated
   */
  void setCopy_definition(copy_definition value);

  /**
   * Returns the value of the '<em><b>Where definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where definition</em>' containment reference.
   * @see #setWhere_definition(where_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Where_definition()
   * @model containment="true"
   * @generated
   */
  where_definition getWhere_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getWhere_definition <em>Where definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where definition</em>' containment reference.
   * @see #getWhere_definition()
   * @generated
   */
  void setWhere_definition(where_definition value);

  /**
   * Returns the value of the '<em><b>Where filter definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where filter definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where filter definition</em>' containment reference.
   * @see #setWhere_filter_definition(where_filter_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Where_filter_definition()
   * @model containment="true"
   * @generated
   */
  where_filter_definition getWhere_filter_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getWhere_filter_definition <em>Where filter definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Where filter definition</em>' containment reference.
   * @see #getWhere_filter_definition()
   * @generated
   */
  void setWhere_filter_definition(where_filter_definition value);

  /**
   * Returns the value of the '<em><b>Aggregate list flag setting</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregate list flag setting</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregate list flag setting</em>' containment reference.
   * @see #setAggregate_list_flag_setting(aggregate_list_flag_setting)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Aggregate_list_flag_setting()
   * @model containment="true"
   * @generated
   */
  aggregate_list_flag_setting getAggregate_list_flag_setting();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getAggregate_list_flag_setting <em>Aggregate list flag setting</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregate list flag setting</em>' containment reference.
   * @see #getAggregate_list_flag_setting()
   * @generated
   */
  void setAggregate_list_flag_setting(aggregate_list_flag_setting value);

  /**
   * Returns the value of the '<em><b>Alt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alt</em>' containment reference.
   * @see #setAlt(aggregate_check_flag_setting)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Alt()
   * @model containment="true"
   * @generated
   */
  aggregate_check_flag_setting getAlt();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getAlt <em>Alt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alt</em>' containment reference.
   * @see #getAlt()
   * @generated
   */
  void setAlt(aggregate_check_flag_setting value);

  /**
   * Returns the value of the '<em><b>Aggregate wildcard definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregate wildcard definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregate wildcard definition</em>' containment reference.
   * @see #setAggregate_wildcard_definition(aggregate_wildcard_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_definition_Aggregate_wildcard_definition()
   * @model containment="true"
   * @generated
   */
  aggregate_wildcard_definition getAggregate_wildcard_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_definition#getAggregate_wildcard_definition <em>Aggregate wildcard definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregate wildcard definition</em>' containment reference.
   * @see #getAggregate_wildcard_definition()
   * @generated
   */
  void setAggregate_wildcard_definition(aggregate_wildcard_definition value);

} // aggregate_definition
