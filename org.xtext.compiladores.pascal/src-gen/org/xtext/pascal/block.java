/**
 * generated by Xtext 2.11.0
 */
package org.xtext.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.pascal.block#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.pascal.block#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.xtext.pascal.block#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.pascal.block#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.pascal.block#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link org.xtext.pascal.block#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.pascal.PascalPackage#getblock()
 * @model
 * @generated
 */
public interface block extends EObject
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' containment reference.
   * @see #setLabel(label_declaration_part)
   * @see org.xtext.pascal.PascalPackage#getblock_Label()
   * @model containment="true"
   * @generated
   */
  label_declaration_part getLabel();

  /**
   * Sets the value of the '{@link org.xtext.pascal.block#getLabel <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' containment reference.
   * @see #getLabel()
   * @generated
   */
  void setLabel(label_declaration_part value);

  /**
   * Returns the value of the '<em><b>Constant</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant</em>' containment reference.
   * @see #setConstant(constant_definition_part)
   * @see org.xtext.pascal.PascalPackage#getblock_Constant()
   * @model containment="true"
   * @generated
   */
  constant_definition_part getConstant();

  /**
   * Sets the value of the '{@link org.xtext.pascal.block#getConstant <em>Constant</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant</em>' containment reference.
   * @see #getConstant()
   * @generated
   */
  void setConstant(constant_definition_part value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(type_definition_part)
   * @see org.xtext.pascal.PascalPackage#getblock_Type()
   * @model containment="true"
   * @generated
   */
  type_definition_part getType();

  /**
   * Sets the value of the '{@link org.xtext.pascal.block#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type_definition_part value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(variable_declaration_part)
   * @see org.xtext.pascal.PascalPackage#getblock_Variable()
   * @model containment="true"
   * @generated
   */
  variable_declaration_part getVariable();

  /**
   * Sets the value of the '{@link org.xtext.pascal.block#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(variable_declaration_part value);

  /**
   * Returns the value of the '<em><b>Abstraction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstraction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstraction</em>' containment reference.
   * @see #setAbstraction(procedure_and_function_declaration_part)
   * @see org.xtext.pascal.PascalPackage#getblock_Abstraction()
   * @model containment="true"
   * @generated
   */
  procedure_and_function_declaration_part getAbstraction();

  /**
   * Sets the value of the '{@link org.xtext.pascal.block#getAbstraction <em>Abstraction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstraction</em>' containment reference.
   * @see #getAbstraction()
   * @generated
   */
  void setAbstraction(procedure_and_function_declaration_part value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(statement_part)
   * @see org.xtext.pascal.PascalPackage#getblock_Statement()
   * @model containment="true"
   * @generated
   */
  statement_part getStatement();

  /**
   * Sets the value of the '{@link org.xtext.pascal.block#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(statement_part value);

} // block
