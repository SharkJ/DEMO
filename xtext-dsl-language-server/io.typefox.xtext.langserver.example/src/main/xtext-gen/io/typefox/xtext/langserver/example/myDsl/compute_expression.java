/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>compute expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.compute_expression#getCompute_expression_atom <em>Compute expression atom</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.compute_expression#getCompute_expression <em>Compute expression</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getcompute_expression()
 * @model
 * @generated
 */
public interface compute_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Compute expression atom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compute expression atom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compute expression atom</em>' containment reference.
   * @see #setCompute_expression_atom(compute_expression_atom)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getcompute_expression_Compute_expression_atom()
   * @model containment="true"
   * @generated
   */
  compute_expression_atom getCompute_expression_atom();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.compute_expression#getCompute_expression_atom <em>Compute expression atom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compute expression atom</em>' containment reference.
   * @see #getCompute_expression_atom()
   * @generated
   */
  void setCompute_expression_atom(compute_expression_atom value);

  /**
   * Returns the value of the '<em><b>Compute expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compute expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compute expression</em>' containment reference.
   * @see #setCompute_expression(compute_expression)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getcompute_expression_Compute_expression()
   * @model containment="true"
   * @generated
   */
  compute_expression getCompute_expression();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.compute_expression#getCompute_expression <em>Compute expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compute expression</em>' containment reference.
   * @see #getCompute_expression()
   * @generated
   */
  void setCompute_expression(compute_expression value);

} // compute_expression