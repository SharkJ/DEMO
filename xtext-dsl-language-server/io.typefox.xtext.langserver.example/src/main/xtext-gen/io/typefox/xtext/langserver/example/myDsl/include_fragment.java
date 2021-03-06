/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>include fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.include_fragment#getDynamic_component_dependency <em>Dynamic component dependency</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.include_fragment#getFragmentToIncludeName <em>Fragment To Include Name</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getinclude_fragment()
 * @model
 * @generated
 */
public interface include_fragment extends MainElement
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
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getinclude_fragment_Dynamic_component_dependency()
   * @model containment="true"
   * @generated
   */
  dynamic_component_dependency getDynamic_component_dependency();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.include_fragment#getDynamic_component_dependency <em>Dynamic component dependency</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic component dependency</em>' containment reference.
   * @see #getDynamic_component_dependency()
   * @generated
   */
  void setDynamic_component_dependency(dynamic_component_dependency value);

  /**
   * Returns the value of the '<em><b>Fragment To Include Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fragment To Include Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fragment To Include Name</em>' attribute.
   * @see #setFragmentToIncludeName(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getinclude_fragment_FragmentToIncludeName()
   * @model
   * @generated
   */
  String getFragmentToIncludeName();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.include_fragment#getFragmentToIncludeName <em>Fragment To Include Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fragment To Include Name</em>' attribute.
   * @see #getFragmentToIncludeName()
   * @generated
   */
  void setFragmentToIncludeName(String value);

} // include_fragment
