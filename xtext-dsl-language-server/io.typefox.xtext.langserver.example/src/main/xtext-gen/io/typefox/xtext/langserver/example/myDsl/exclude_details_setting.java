/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>exclude details setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.exclude_details_setting#getExclude_details_entity <em>Exclude details entity</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.exclude_details_setting#getExclude_details_entity2 <em>Exclude details entity2</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getexclude_details_setting()
 * @model
 * @generated
 */
public interface exclude_details_setting extends EObject
{
  /**
   * Returns the value of the '<em><b>Exclude details entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude details entity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude details entity</em>' attribute.
   * @see #setExclude_details_entity(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getexclude_details_setting_Exclude_details_entity()
   * @model
   * @generated
   */
  String getExclude_details_entity();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.exclude_details_setting#getExclude_details_entity <em>Exclude details entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude details entity</em>' attribute.
   * @see #getExclude_details_entity()
   * @generated
   */
  void setExclude_details_entity(String value);

  /**
   * Returns the value of the '<em><b>Exclude details entity2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exclude details entity2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude details entity2</em>' attribute.
   * @see #setExclude_details_entity2(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getexclude_details_setting_Exclude_details_entity2()
   * @model
   * @generated
   */
  String getExclude_details_entity2();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.exclude_details_setting#getExclude_details_entity2 <em>Exclude details entity2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude details entity2</em>' attribute.
   * @see #getExclude_details_entity2()
   * @generated
   */
  void setExclude_details_entity2(String value);

} // exclude_details_setting
