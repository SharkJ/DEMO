/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>override</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.override#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getoverride()
 * @model
 * @generated
 */
public interface override extends MainElement
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' attribute.
   * @see #setAnnotation(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getoverride_Annotation()
   * @model
   * @generated
   */
  String getAnnotation();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.override#getAnnotation <em>Annotation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotation</em>' attribute.
   * @see #getAnnotation()
   * @generated
   */
  void setAnnotation(String value);

} // override
