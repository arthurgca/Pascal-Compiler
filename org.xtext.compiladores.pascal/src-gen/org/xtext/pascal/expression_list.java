/**
 * generated by Xtext 2.11.0
 */
package org.xtext.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>expression list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.expression_list#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.PascalPackage#getexpression_list()
 * @model
 * @generated
 */
public interface expression_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.pascal.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.xtext.pascal.PascalPackage#getexpression_list_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpressions();

} // expression_list
