/**
 * generated by Xtext 2.13.0
 */
package io.typefox.xtext.langserver.example.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>filter columns definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.typefox.xtext.langserver.example.myDsl.filter_columns_definition#getFilter_column_definition <em>Filter column definition</em>}</li>
 * </ul>
 *
 * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getfilter_columns_definition()
 * @model
 * @generated
 */
public interface filter_columns_definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Filter column definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter column definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter column definition</em>' containment reference.
   * @see #setFilter_column_definition(filter_column_definition)
   * @see io.typefox.xtext.langserver.example.myDsl.MyDslPackage#getfilter_columns_definition_Filter_column_definition()
   * @model containment="true"
   * @generated
   */
  filter_column_definition getFilter_column_definition();

  /**
   * Sets the value of the '{@link io.typefox.xtext.langserver.example.myDsl.filter_columns_definition#getFilter_column_definition <em>Filter column definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter column definition</em>' containment reference.
   * @see #getFilter_column_definition()
   * @generated
   */
  void setFilter_column_definition(filter_column_definition value);

} // filter_columns_definition
