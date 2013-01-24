/**
 */
package de.altimos.mdsd.majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.FloatAction#getValue <em>Value</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.FloatAction#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getFloatAction()
 * @model
 * @generated
 */
public interface FloatAction extends Action {
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
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getFloatAction_Value()
	 * @model
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.FloatAction#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(FloatActor)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getFloatAction_Actor()
	 * @model
	 * @generated
	 */
	FloatActor getActor();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.FloatAction#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(FloatActor value);

} // FloatAction
