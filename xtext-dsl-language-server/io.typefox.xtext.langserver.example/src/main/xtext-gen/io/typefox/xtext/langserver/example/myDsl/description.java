/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.description#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getdescription()
 * @model
 * @generated
 */
public interface description extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getdescription_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.description#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // description
