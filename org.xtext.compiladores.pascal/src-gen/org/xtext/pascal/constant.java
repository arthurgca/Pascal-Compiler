/**
 * generated by Xtext 2.11.0
 */
package org.xtext.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.constant#getOpterator <em>Opterator</em>}</li>
 *   <li>{@link org.xtext.pascal.constant#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.pascal.constant#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.pascal.constant#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.pascal.constant#getBoolLiteral <em>Bool Literal</em>}</li>
 *   <li>{@link org.xtext.pascal.constant#getNil <em>Nil</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.PascalPackage#getconstant()
 * @model
 * @generated
 */
public interface constant extends EObject
{
  /**
   * Returns the value of the '<em><b>Opterator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opterator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opterator</em>' attribute.
   * @see #setOpterator(String)
   * @see org.xtext.pascal.PascalPackage#getconstant_Opterator()
   * @model
   * @generated
   */
  String getOpterator();

  /**
   * Sets the value of the '{@link org.xtext.pascal.constant#getOpterator <em>Opterator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opterator</em>' attribute.
   * @see #getOpterator()
   * @generated
   */
  void setOpterator(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.pascal.PascalPackage#getconstant_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.pascal.constant#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference.
   * @see #setNumber(number)
   * @see org.xtext.pascal.PascalPackage#getconstant_Number()
   * @model containment="true"
   * @generated
   */
  number getNumber();

  /**
   * Sets the value of the '{@link org.xtext.pascal.constant#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(number value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.xtext.pascal.PascalPackage#getconstant_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.xtext.pascal.constant#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Bool Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool Literal</em>' attribute.
   * @see #setBoolLiteral(String)
   * @see org.xtext.pascal.PascalPackage#getconstant_BoolLiteral()
   * @model
   * @generated
   */
  String getBoolLiteral();

  /**
   * Sets the value of the '{@link org.xtext.pascal.constant#getBoolLiteral <em>Bool Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool Literal</em>' attribute.
   * @see #getBoolLiteral()
   * @generated
   */
  void setBoolLiteral(String value);

  /**
   * Returns the value of the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nil</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nil</em>' attribute.
   * @see #setNil(String)
   * @see org.xtext.pascal.PascalPackage#getconstant_Nil()
   * @model
   * @generated
   */
  String getNil();

  /**
   * Sets the value of the '{@link org.xtext.pascal.constant#getNil <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nil</em>' attribute.
   * @see #getNil()
   * @generated
   */
  void setNil(String value);

} // constant
