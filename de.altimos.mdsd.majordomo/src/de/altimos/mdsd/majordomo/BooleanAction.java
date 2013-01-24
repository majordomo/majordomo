/**
 */
package de.altimos.mdsd.majordomo;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.BooleanAction#isValue <em>Value</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.BooleanAction#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getBooleanAction()
 * @model
 * @generated
 */
public interface BooleanAction extends Action {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(boolean)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getBooleanAction_Value()
	 * @model
	 * @generated
	 */
	boolean isValue();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.BooleanAction#isValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isValue()
	 * @generated
	 */
	void setValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(BooleanActor)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getBooleanAction_Actor()
	 * @model
	 * @generated
	 */
	BooleanActor getActor();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.BooleanAction#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(BooleanActor value);

} // BooleanAction
