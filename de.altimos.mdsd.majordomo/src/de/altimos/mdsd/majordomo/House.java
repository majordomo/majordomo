/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.House#getSensors <em>Sensors</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.House#getRooms <em>Rooms</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.House#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getHouse()
 * @model
 * @generated
 */
public interface House extends EObject {
	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getHouse_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>Rooms</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.Room}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rooms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getHouse_Rooms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Room> getRooms();

	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getHouse_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

} // House
