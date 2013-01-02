/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extendable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.Extendable#getSensors <em>Sensors</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Extendable#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getExtendable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Extendable extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.Sensor}.
	 * It is bidirectional and its opposite is '{@link de.altimos.mdsd.majordomo.Sensor#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getExtendable_Sensors()
	 * @see de.altimos.mdsd.majordomo.Sensor#getCtx
	 * @model opposite="ctx" containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.Actor}.
	 * It is bidirectional and its opposite is '{@link de.altimos.mdsd.majordomo.Actor#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getExtendable_Actors()
	 * @see de.altimos.mdsd.majordomo.Actor#getCtx
	 * @model opposite="ctx" containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

} // Extendable
