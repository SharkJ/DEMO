/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>dependency definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.dependency_definition#getServer_package_reference <em>Server package reference</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getdependency_definition()
 * @model
 * @generated
 */
public interface dependency_definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Server package reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server package reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server package reference</em>' containment reference.
   * @see #setServer_package_reference(server_package_reference)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getdependency_definition_Server_package_reference()
   * @model containment="true"
   * @generated
   */
  server_package_reference getServer_package_reference();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.dependency_definition#getServer_package_reference <em>Server package reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server package reference</em>' containment reference.
   * @see #getServer_package_reference()
   * @generated
   */
  void setServer_package_reference(server_package_reference value);

} // dependency_definition
