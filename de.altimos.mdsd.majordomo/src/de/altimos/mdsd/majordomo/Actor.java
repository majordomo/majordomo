/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.Actor#getLabel <em>Label</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Actor#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getActor_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Actor#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.altimos.mdsd.majordomo.ActorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.altimos.mdsd.majordomo.ActorType
	 * @see #setType(ActorType)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getActor_Type()
	 * @model
	 * @generated
	 */
	ActorType getType();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Actor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.altimos.mdsd.majordomo.ActorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActorType value);

} // Actor
