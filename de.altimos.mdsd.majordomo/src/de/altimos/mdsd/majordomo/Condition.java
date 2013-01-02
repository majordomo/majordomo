/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.Condition#getSource <em>Source</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Condition#getValue <em>Value</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Condition#getComperator <em>Comperator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Sensor)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getCondition_Source()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSource();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Condition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Sensor value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getCondition_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Condition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Comperator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.altimos.mdsd.majordomo.CompareOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comperator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comperator</em>' attribute.
	 * @see de.altimos.mdsd.majordomo.CompareOperator
	 * @see #setComperator(CompareOperator)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getCondition_Comperator()
	 * @model
	 * @generated
	 */
	CompareOperator getComperator();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Condition#getComperator <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comperator</em>' attribute.
	 * @see de.altimos.mdsd.majordomo.CompareOperator
	 * @see #getComperator()
	 * @generated
	 */
	void setComperator(CompareOperator value);

} // Condition
