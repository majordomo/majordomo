/**
 */
package de.altimos.mdsd.majordomo.util;

import de.altimos.mdsd.majordomo.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.altimos.mdsd.majordomo.MajordomoPackage
 * @generated
 */
public class MajordomoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MajordomoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajordomoSwitch() {
		if (modelPackage == null) {
			modelPackage = MajordomoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MajordomoPackage.MAJORDOMO: {
				Majordomo majordomo = (Majordomo)theEObject;
				T result = caseMajordomo(majordomo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.HOUSE: {
				House house = (House)theEObject;
				T result = caseHouse(house);
				if (result == null) result = caseExtendable(house);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.EXTENDABLE: {
				Extendable extendable = (Extendable)theEObject;
				T result = caseExtendable(extendable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = caseExtendable(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseExtension(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseExtension(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.EXTENSION: {
				Extension extension = (Extension)theEObject;
				T result = caseExtension(extension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.LIGHT_SENSOR: {
				LightSensor lightSensor = (LightSensor)theEObject;
				T result = caseLightSensor(lightSensor);
				if (result == null) result = caseSensor(lightSensor);
				if (result == null) result = caseHouseExtension(lightSensor);
				if (result == null) result = caseRoomExtension(lightSensor);
				if (result == null) result = caseExtension(lightSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.TEMPERATURE_SENSOR: {
				TemperatureSensor temperatureSensor = (TemperatureSensor)theEObject;
				T result = caseTemperatureSensor(temperatureSensor);
				if (result == null) result = caseSensor(temperatureSensor);
				if (result == null) result = caseHouseExtension(temperatureSensor);
				if (result == null) result = caseRoomExtension(temperatureSensor);
				if (result == null) result = caseExtension(temperatureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.RAIN_SENSOR: {
				RainSensor rainSensor = (RainSensor)theEObject;
				T result = caseRainSensor(rainSensor);
				if (result == null) result = caseSensor(rainSensor);
				if (result == null) result = caseHouseExtension(rainSensor);
				if (result == null) result = caseExtension(rainSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.SWITCH_SENSOR: {
				SwitchSensor switchSensor = (SwitchSensor)theEObject;
				T result = caseSwitchSensor(switchSensor);
				if (result == null) result = caseSensor(switchSensor);
				if (result == null) result = caseRoomExtension(switchSensor);
				if (result == null) result = caseExtension(switchSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.NUMBER_SENSOR: {
				NumberSensor numberSensor = (NumberSensor)theEObject;
				T result = caseNumberSensor(numberSensor);
				if (result == null) result = caseSensor(numberSensor);
				if (result == null) result = caseRoomExtension(numberSensor);
				if (result == null) result = caseExtension(numberSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.CLOCK_SENSOR: {
				ClockSensor clockSensor = (ClockSensor)theEObject;
				T result = caseClockSensor(clockSensor);
				if (result == null) result = caseSensor(clockSensor);
				if (result == null) result = caseHouseExtension(clockSensor);
				if (result == null) result = caseExtension(clockSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.LAMP_ACTOR: {
				LampActor lampActor = (LampActor)theEObject;
				T result = caseLampActor(lampActor);
				if (result == null) result = caseActor(lampActor);
				if (result == null) result = caseHouseExtension(lampActor);
				if (result == null) result = caseRoomExtension(lampActor);
				if (result == null) result = caseExtension(lampActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.ROLLER_ACTOR: {
				RollerActor rollerActor = (RollerActor)theEObject;
				T result = caseRollerActor(rollerActor);
				if (result == null) result = caseActor(rollerActor);
				if (result == null) result = caseRoomExtension(rollerActor);
				if (result == null) result = caseExtension(rollerActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.ROOF_WINDOW_ACTOR: {
				RoofWindowActor roofWindowActor = (RoofWindowActor)theEObject;
				T result = caseRoofWindowActor(roofWindowActor);
				if (result == null) result = caseActor(roofWindowActor);
				if (result == null) result = caseRoomExtension(roofWindowActor);
				if (result == null) result = caseExtension(roofWindowActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.BOILER_ACTION: {
				BoilerAction boilerAction = (BoilerAction)theEObject;
				T result = caseBoilerAction(boilerAction);
				if (result == null) result = caseActor(boilerAction);
				if (result == null) result = caseHouseExtension(boilerAction);
				if (result == null) result = caseExtension(boilerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.RADIATOR_ACTOR: {
				RadiatorActor radiatorActor = (RadiatorActor)theEObject;
				T result = caseRadiatorActor(radiatorActor);
				if (result == null) result = caseActor(radiatorActor);
				if (result == null) result = caseRoomExtension(radiatorActor);
				if (result == null) result = caseExtension(radiatorActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.ROOM_EXTENSION: {
				RoomExtension roomExtension = (RoomExtension)theEObject;
				T result = caseRoomExtension(roomExtension);
				if (result == null) result = caseExtension(roomExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.HOUSE_EXTENSION: {
				HouseExtension houseExtension = (HouseExtension)theEObject;
				T result = caseHouseExtension(houseExtension);
				if (result == null) result = caseExtension(houseExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.LESSER_CONDITION: {
				LesserCondition lesserCondition = (LesserCondition)theEObject;
				T result = caseLesserCondition(lesserCondition);
				if (result == null) result = caseCondition(lesserCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.GREATER_CONDITION: {
				GreaterCondition greaterCondition = (GreaterCondition)theEObject;
				T result = caseGreaterCondition(greaterCondition);
				if (result == null) result = caseCondition(greaterCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Majordomo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Majordomo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMajordomo(Majordomo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>House</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHouse(House object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extendable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extendable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendable(Extendable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLightSensor(LightSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temperature Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemperatureSensor(TemperatureSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rain Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rain Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRainSensor(RainSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchSensor(SwitchSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberSensor(NumberSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClockSensor(ClockSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lamp Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lamp Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLampActor(LampActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roller Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roller Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRollerActor(RollerActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Roof Window Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Roof Window Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoofWindowActor(RoofWindowActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boiler Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boiler Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoilerAction(BoilerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radiator Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radiator Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRadiatorActor(RadiatorActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomExtension(RoomExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>House Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>House Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHouseExtension(HouseExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lesser Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lesser Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLesserCondition(LesserCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreaterCondition(GreaterCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MajordomoSwitch
