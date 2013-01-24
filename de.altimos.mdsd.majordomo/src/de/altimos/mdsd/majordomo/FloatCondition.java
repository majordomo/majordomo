/**
 */
package de.altimos.mdsd.majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.FloatCondition#getValue <em>Value</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.FloatCondition#getSensor <em>Sensor</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getFloatCondition()
 * @model
 * @generated
 */
public interface FloatCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getFloatCondition_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.FloatCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(FloatSensor)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getFloatCondition_Sensor()
	 * @model
	 * @generated
	 */
	FloatSensor getSensor();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.FloatCondition#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(FloatSensor value);

} // FloatCondition
