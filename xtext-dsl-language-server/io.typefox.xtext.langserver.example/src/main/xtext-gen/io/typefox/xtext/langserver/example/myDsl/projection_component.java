/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>projection component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.projection_component#getComponentName <em>Component Name</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getprojection_component()
 * @model
 * @generated
 */
public interface projection_component extends EObject
{
  /**
   * Returns the value of the '<em><b>Component Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component Name</em>' attribute.
   * @see #setComponentName(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getprojection_component_ComponentName()
   * @model
   * @generated
   */
  String getComponentName();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.projection_component#getComponentName <em>Component Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component Name</em>' attribute.
   * @see #getComponentName()
   * @generated
   */
  void setComponentName(String value);

} // projection_component
