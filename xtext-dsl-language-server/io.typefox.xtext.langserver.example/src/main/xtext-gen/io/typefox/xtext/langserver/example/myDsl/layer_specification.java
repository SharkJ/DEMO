/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>layer specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.layer_specification#getLayerName <em>Layer Name</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getlayer_specification()
 * @model
 * @generated
 */
public interface layer_specification extends EObject
{
  /**
   * Returns the value of the '<em><b>Layer Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Layer Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layer Name</em>' attribute.
   * @see #setLayerName(String)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getlayer_specification_LayerName()
   * @model
   * @generated
   */
  String getLayerName();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.layer_specification#getLayerName <em>Layer Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Layer Name</em>' attribute.
   * @see #getLayerName()
   * @generated
   */
  void setLayerName(String value);

} // layer_specification