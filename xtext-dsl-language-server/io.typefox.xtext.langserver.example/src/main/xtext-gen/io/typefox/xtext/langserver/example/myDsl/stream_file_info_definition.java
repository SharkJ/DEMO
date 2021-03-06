/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>stream file info definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.stream_file_info_definition#getStream_file_name_attribute <em>Stream file name attribute</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.stream_file_info_definition#getStream_mime_type_attribute <em>Stream mime type attribute</em>}</li>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.stream_file_info_definition#getStream_attachment_attribute <em>Stream attachment attribute</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getstream_file_info_definition()
 * @model
 * @generated
 */
public interface stream_file_info_definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Stream file name attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream file name attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream file name attribute</em>' containment reference.
   * @see #setStream_file_name_attribute(stream_file_name_attribute)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getstream_file_info_definition_Stream_file_name_attribute()
   * @model containment="true"
   * @generated
   */
  stream_file_name_attribute getStream_file_name_attribute();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.stream_file_info_definition#getStream_file_name_attribute <em>Stream file name attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream file name attribute</em>' containment reference.
   * @see #getStream_file_name_attribute()
   * @generated
   */
  void setStream_file_name_attribute(stream_file_name_attribute value);

  /**
   * Returns the value of the '<em><b>Stream mime type attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream mime type attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream mime type attribute</em>' containment reference.
   * @see #setStream_mime_type_attribute(stream_mime_type_attribute)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getstream_file_info_definition_Stream_mime_type_attribute()
   * @model containment="true"
   * @generated
   */
  stream_mime_type_attribute getStream_mime_type_attribute();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.stream_file_info_definition#getStream_mime_type_attribute <em>Stream mime type attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream mime type attribute</em>' containment reference.
   * @see #getStream_mime_type_attribute()
   * @generated
   */
  void setStream_mime_type_attribute(stream_mime_type_attribute value);

  /**
   * Returns the value of the '<em><b>Stream attachment attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stream attachment attribute</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stream attachment attribute</em>' containment reference.
   * @see #setStream_attachment_attribute(stream_attachment_attribute)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getstream_file_info_definition_Stream_attachment_attribute()
   * @model containment="true"
   * @generated
   */
  stream_attachment_attribute getStream_attachment_attribute();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.stream_file_info_definition#getStream_attachment_attribute <em>Stream attachment attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stream attachment attribute</em>' containment reference.
   * @see #getStream_attachment_attribute()
   * @generated
   */
  void setStream_attachment_attribute(stream_attachment_attribute value);

} // stream_file_info_definition
