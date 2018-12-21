/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>aggregate list flag setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.aggregate_list_flag_setting#getProjection_flag_condition <em>Projection flag condition</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_list_flag_setting()
 * @model
 * @generated
 */
public interface aggregate_list_flag_setting extends EObject
{
  /**
   * Returns the value of the '<em><b>Projection flag condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Projection flag condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Projection flag condition</em>' containment reference.
   * @see #setProjection_flag_condition(projection_flag_condition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getaggregate_list_flag_setting_Projection_flag_condition()
   * @model containment="true"
   * @generated
   */
  projection_flag_condition getProjection_flag_condition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.aggregate_list_flag_setting#getProjection_flag_condition <em>Projection flag condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Projection flag condition</em>' containment reference.
   * @see #getProjection_flag_condition()
   * @generated
   */
  void setProjection_flag_condition(projection_flag_condition value);

} // aggregate_list_flag_setting
