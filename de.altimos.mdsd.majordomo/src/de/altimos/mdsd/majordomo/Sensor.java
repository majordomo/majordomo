/**
 */
package de.altimos.mdsd.majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.Sensor#getCtx <em>Ctx</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getSensor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Sensor extends Extension {
	/**
	 * Returns the value of the '<em><b>Ctx</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.altimos.mdsd.majordomo.Extendable#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctx</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctx</em>' container reference.
	 * @see #setCtx(Extendable)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getSensor_Ctx()
	 * @see de.altimos.mdsd.majordomo.Extendable#getSensors
	 * @model opposite="sensors" required="true" transient="false"
	 * @generated
	 */
	Extendable getCtx();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Sensor#getCtx <em>Ctx</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctx</em>' container reference.
	 * @see #getCtx()
	 * @generated
	 */
	void setCtx(Extendable value);

} // Sensor
