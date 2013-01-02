/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.Action#getValue <em>Value</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Action#getActor <em>Actor</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
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
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getAction_Value()
	 * @model
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Action#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getAction_Actor()
	 * @model
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Action#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

} // Action
