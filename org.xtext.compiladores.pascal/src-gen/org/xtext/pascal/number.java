/**
 * generated by Xtext 2.11.0
 */
package org.xtext.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.number#getNumber <em>Number</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.PascalPackage#getnumber()
 * @model
 * @generated
 */
public interface number extends EObject
{
  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference.
   * @see #setNumber(any_number)
   * @see org.xtext.pascal.PascalPackage#getnumber_Number()
   * @model containment="true"
   * @generated
   */
  any_number getNumber();

  /**
   * Sets the value of the '{@link org.xtext.pascal.number#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(any_number value);

} // number
