/**
 */
package de.altimos.mdsd.majordomo.impl;

import de.altimos.mdsd.majordomo.Actor;
import de.altimos.mdsd.majordomo.House;
import de.altimos.mdsd.majordomo.MajordomoPackage;
import de.altimos.mdsd.majordomo.Room;
import de.altimos.mdsd.majordomo.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.HouseImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.HouseImpl#getRooms <em>Rooms</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.HouseImpl#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HouseImpl extends EObjectImpl implements House {
	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * The cached value of the '{@link #getRooms() <em>Rooms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRooms()
	 * @generated
	 * @ordered
	 */
	protected EList<Room> rooms;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> actors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HouseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MajordomoPackage.Literals.HOUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, MajordomoPackage.HOUSE__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Room> getRooms() {
		if (rooms == null) {
			rooms = new EObjectContainmentEList<Room>(Room.class, this, MajordomoPackage.HOUSE__ROOMS);
		}
		return rooms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actor> getActors() {
		if (actors == null) {
			actors = new EObjectContainmentEList<Actor>(Actor.class, this, MajordomoPackage.HOUSE__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MajordomoPackage.HOUSE__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
			case MajordomoPackage.HOUSE__ROOMS:
				return ((InternalEList<?>)getRooms()).basicRemove(otherEnd, msgs);
			case MajordomoPackage.HOUSE__ACTORS:
				return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MajordomoPackage.HOUSE__SENSORS:
				return getSensors();
			case MajordomoPackage.HOUSE__ROOMS:
				return getRooms();
			case MajordomoPackage.HOUSE__ACTORS:
				return getActors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MajordomoPackage.HOUSE__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Sensor>)newValue);
				return;
			case MajordomoPackage.HOUSE__ROOMS:
				getRooms().clear();
				getRooms().addAll((Collection<? extends Room>)newValue);
				return;
			case MajordomoPackage.HOUSE__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends Actor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MajordomoPackage.HOUSE__SENSORS:
				getSensors().clear();
				return;
			case MajordomoPackage.HOUSE__ROOMS:
				getRooms().clear();
				return;
			case MajordomoPackage.HOUSE__ACTORS:
				getActors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MajordomoPackage.HOUSE__SENSORS:
				return sensors != null && !sensors.isEmpty();
			case MajordomoPackage.HOUSE__ROOMS:
				return rooms != null && !rooms.isEmpty();
			case MajordomoPackage.HOUSE__ACTORS:
				return actors != null && !actors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HouseImpl
