/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>lu definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.lu_definition#getLu_definition_lu_name <em>Lu definition lu name</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getlu_definition()
 * @model
 * @generated
 */
public interface lu_definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Lu definition lu name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lu definition lu name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lu definition lu name</em>' attribute.
   * @see #setLu_definition_lu_name(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getlu_definition_Lu_definition_lu_name()
   * @model
   * @generated
   */
  String getLu_definition_lu_name();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.lu_definition#getLu_definition_lu_name <em>Lu definition lu name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lu definition lu name</em>' attribute.
   * @see #getLu_definition_lu_name()
   * @generated
   */
  void setLu_definition_lu_name(String value);

} // lu_definition
