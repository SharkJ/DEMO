/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>singleton set definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.singleton_set_definition#getDynamic_component_dependency <em>Dynamic component dependency</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.singleton_set_definition#getSingleton_set_definition_singleton_name <em>Singleton set definition singleton name</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.singleton_set_definition#getSingleton_set_definition_reference_object_name <em>Singleton set definition reference object name</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.singleton_set_definition#getAlt <em>Alt</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getsingleton_set_definition()
 * @model
 * @generated
 */
public interface singleton_set_definition extends MainElement
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
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getsingleton_set_definition_Dynamic_component_dependency()
   * @model containment="true"
   * @generated
   */
  dynamic_component_dependency getDynamic_component_dependency();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.singleton_set_definition#getDynamic_component_dependency <em>Dynamic component dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic component dependency</em>' containment reference.
   * @see #getDynamic_component_dependency()
   * @generated
   */
  void setDynamic_component_dependency(dynamic_component_dependency value);

  /**
   * Returns the value of the '<em><b>Singleton set definition singleton name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Singleton set definition singleton name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Singleton set definition singleton name</em>' attribute.
   * @see #setSingleton_set_definition_singleton_name(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getsingleton_set_definition_Singleton_set_definition_singleton_name()
   * @model
   * @generated
   */
  String getSingleton_set_definition_singleton_name();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.singleton_set_definition#getSingleton_set_definition_singleton_name <em>Singleton set definition singleton name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Singleton set definition singleton name</em>' attribute.
   * @see #getSingleton_set_definition_singleton_name()
   * @generated
   */
  void setSingleton_set_definition_singleton_name(String value);

  /**
   * Returns the value of the '<em><b>Singleton set definition reference object name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Singleton set definition reference object name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Singleton set definition reference object name</em>' attribute.
   * @see #setSingleton_set_definition_reference_object_name(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getsingleton_set_definition_Singleton_set_definition_reference_object_name()
   * @model
   * @generated
   */
  String getSingleton_set_definition_reference_object_name();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.singleton_set_definition#getSingleton_set_definition_reference_object_name <em>Singleton set definition reference object name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Singleton set definition reference object name</em>' attribute.
   * @see #getSingleton_set_definition_reference_object_name()
   * @generated
   */
  void setSingleton_set_definition_reference_object_name(String value);

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
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getsingleton_set_definition_Alt()
   * @model containment="true"
   * @generated
   */
  EObject getAlt();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.singleton_set_definition#getAlt <em>Alt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alt</em>' containment reference.
   * @see #getAlt()
   * @generated
   */
  void setAlt(EObject value);

} // singleton_set_definition