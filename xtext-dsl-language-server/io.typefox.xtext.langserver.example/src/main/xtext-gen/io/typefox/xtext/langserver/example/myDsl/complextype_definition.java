/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>complextype definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.complextype_definition#getComplextype_definition_complextype_name <em>Complextype definition complextype name</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.complextype_definition#getAlt <em>Alt</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getcomplextype_definition()
 * @model
 * @generated
 */
public interface complextype_definition extends MainElement
{
  /**
   * Returns the value of the '<em><b>Complextype definition complextype name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Complextype definition complextype name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Complextype definition complextype name</em>' attribute.
   * @see #setComplextype_definition_complextype_name(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getcomplextype_definition_Complextype_definition_complextype_name()
   * @model
   * @generated
   */
  String getComplextype_definition_complextype_name();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.complextype_definition#getComplextype_definition_complextype_name <em>Complextype definition complextype name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Complextype definition complextype name</em>' attribute.
   * @see #getComplextype_definition_complextype_name()
   * @generated
   */
  void setComplextype_definition_complextype_name(String value);

  /**
   * Returns the value of the '<em><b>Alt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alt</em>' containment reference.
   * @see #setAlt(EObject)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getcomplextype_definition_Alt()
   * @model containment="true"
   * @generated
   */
  EObject getAlt();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.complextype_definition#getAlt <em>Alt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alt</em>' containment reference.
   * @see #getAlt()
   * @generated
   */
  void setAlt(EObject value);

} // complextype_definition