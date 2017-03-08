/**
 * generated by Xtext 2.11.0
 */
package org.xtext.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>formal parameter list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.formal_parameter_list#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.PascalPackage#getformal_parameter_list()
 * @model
 * @generated
 */
public interface formal_parameter_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.pascal.formal_parameter_section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.xtext.pascal.PascalPackage#getformal_parameter_list_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<formal_parameter_section> getParameters();

} // formal_parameter_list
