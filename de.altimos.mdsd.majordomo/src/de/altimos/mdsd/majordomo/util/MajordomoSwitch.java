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
				if (result == null) result = caseHouseMountable(lightSensor);
				if (result == null) result = caseRoomMountable(lightSensor);
				if (result == null) result = caseFloatSensor(lightSensor);
				if (result == null) result = caseSensor(lightSensor);
				if (result == null) result = caseExtension(lightSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.TEMPERATURE_SENSOR: {
				TemperatureSensor temperatureSensor = (TemperatureSensor)theEObject;
				T result = caseTemperatureSensor(temperatureSensor);
				if (result == null) result = caseHouseMountable(temperatureSensor);
				if (result == null) result = caseRoomMountable(temperatureSensor);
				if (result == null) result = caseFloatSensor(temperatureSensor);
				if (result == null) result = caseSensor(temperatureSensor);
				if (result == null) result = caseExtension(temperatureSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.RAIN_SENSOR: {
				RainSensor rainSensor = (RainSensor)theEObject;
				T result = caseRainSensor(rainSensor);
				if (result == null) result = caseHouseMountable(rainSensor);
				if (result == null) result = caseBooleanSensor(rainSensor);
				if (result == null) result = caseSensor(rainSensor);
				if (result == null) result = caseExtension(rainSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.SWITCH_SENSOR: {
				SwitchSensor switchSensor = (SwitchSensor)theEObject;
				T result = caseSwitchSensor(switchSensor);
				if (result == null) result = caseRoomMountable(switchSensor);
				if (result == null) result = caseBooleanSensor(switchSensor);
				if (result == null) result = caseSensor(switchSensor);
				if (result == null) result = caseExtension(switchSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.NUMBER_SENSOR: {
				NumberSensor numberSensor = (NumberSensor)theEObject;
				T result = caseNumberSensor(numberSensor);
				if (result == null) result = caseRoomMountable(numberSensor);
				if (result == null) result = caseIntegerSensor(numberSensor);
				if (result == null) result = caseSensor(numberSensor);
				if (result == null) result = caseExtension(numberSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.CLOCK_SENSOR: {
				ClockSensor clockSensor = (ClockSensor)theEObject;
				T result = caseClockSensor(clockSensor);
				if (result == null) result = caseHouseMountable(clockSensor);
				if (result == null) result = caseIntegerSensor(clockSensor);
				if (result == null) result = caseSensor(clockSensor);
				if (result == null) result = caseExtension(clockSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.LAMP_ACTOR: {
				LampActor lampActor = (LampActor)theEObject;
				T result = caseLampActor(lampActor);
				if (result == null) result = caseHouseMountable(lampActor);
				if (result == null) result = caseRoomMountable(lampActor);
				if (result == null) result = caseFloatActor(lampActor);
				if (result == null) result = caseActor(lampActor);
				if (result == null) result = caseExtension(lampActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.ROLLER_ACTOR: {
				RollerActor rollerActor = (RollerActor)theEObject;
				T result = caseRollerActor(rollerActor);
				if (result == null) result = caseRoomMountable(rollerActor);
				if (result == null) result = caseBooleanActor(rollerActor);
				if (result == null) result = caseActor(rollerActor);
				if (result == null) result = caseExtension(rollerActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.ROOF_WINDOW_ACTOR: {
				RoofWindowActor roofWindowActor = (RoofWindowActor)theEObject;
				T result = caseRoofWindowActor(roofWindowActor);
				if (result == null) result = caseRoomMountable(roofWindowActor);
				if (result == null) result = caseBooleanActor(roofWindowActor);
				if (result == null) result = caseActor(roofWindowActor);
				if (result == null) result = caseExtension(roofWindowActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.BOILER_ACTION: {
				BoilerAction boilerAction = (BoilerAction)theEObject;
				T result = caseBoilerAction(boilerAction);
				if (result == null) result = caseHouseMountable(boilerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.RADIATOR_ACTOR: {
				RadiatorActor radiatorActor = (RadiatorActor)theEObject;
				T result = caseRadiatorActor(radiatorActor);
				if (result == null) result = caseRoomMountable(radiatorActor);
				if (result == null) result = caseBooleanActor(radiatorActor);
				if (result == null) result = caseActor(radiatorActor);
				if (result == null) result = caseExtension(radiatorActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.ROOM_MOUNTABLE: {
				RoomMountable roomMountable = (RoomMountable)theEObject;
				T result = caseRoomMountable(roomMountable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.HOUSE_MOUNTABLE: {
				HouseMountable houseMountable = (HouseMountable)theEObject;
				T result = caseHouseMountable(houseMountable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.BOOLEAN_SENSOR: {
				BooleanSensor booleanSensor = (BooleanSensor)theEObject;
				T result = caseBooleanSensor(booleanSensor);
				if (result == null) result = caseSensor(booleanSensor);
				if (result == null) result = caseExtension(booleanSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.INTEGER_SENSOR: {
				IntegerSensor integerSensor = (IntegerSensor)theEObject;
				T result = caseIntegerSensor(integerSensor);
				if (result == null) result = caseSensor(integerSensor);
				if (result == null) result = caseExtension(integerSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.FLOAT_SENSOR: {
				FloatSensor floatSensor = (FloatSensor)theEObject;
				T result = caseFloatSensor(floatSensor);
				if (result == null) result = caseSensor(floatSensor);
				if (result == null) result = caseExtension(floatSensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.BOOLEAN_ACTOR: {
				BooleanActor booleanActor = (BooleanActor)theEObject;
				T result = caseBooleanActor(booleanActor);
				if (result == null) result = caseActor(booleanActor);
				if (result == null) result = caseExtension(booleanActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.INTEGER_ACTOR: {
				IntegerActor integerActor = (IntegerActor)theEObject;
				T result = caseIntegerActor(integerActor);
				if (result == null) result = caseActor(integerActor);
				if (result == null) result = caseExtension(integerActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.FLOAT_ACTOR: {
				FloatActor floatActor = (FloatActor)theEObject;
				T result = caseFloatActor(floatActor);
				if (result == null) result = caseActor(floatActor);
				if (result == null) result = caseExtension(floatActor);
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
			case MajordomoPackage.INTEGER_CONDITION: {
				IntegerCondition integerCondition = (IntegerCondition)theEObject;
				T result = caseIntegerCondition(integerCondition);
				if (result == null) result = caseCondition(integerCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.FLOAT_CONDITION: {
				FloatCondition floatCondition = (FloatCondition)theEObject;
				T result = caseFloatCondition(floatCondition);
				if (result == null) result = caseCondition(floatCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.BOOLEAN_CONDITION: {
				BooleanCondition booleanCondition = (BooleanCondition)theEObject;
				T result = caseBooleanCondition(booleanCondition);
				if (result == null) result = caseCondition(booleanCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.INTEGER_ACTION: {
				IntegerAction integerAction = (IntegerAction)theEObject;
				T result = caseIntegerAction(integerAction);
				if (result == null) result = caseAction(integerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.FLOAT_ACTION: {
				FloatAction floatAction = (FloatAction)theEObject;
				T result = caseFloatAction(floatAction);
				if (result == null) result = caseAction(floatAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MajordomoPackage.BOOLEAN_ACTION: {
				BooleanAction booleanAction = (BooleanAction)theEObject;
				T result = caseBooleanAction(booleanAction);
				if (result == null) result = caseAction(booleanAction);
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
	 * Returns the result of interpreting the object as an instance of '<em>Room Mountable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Mountable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomMountable(RoomMountable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>House Mountable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>House Mountable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHouseMountable(HouseMountable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanSensor(BooleanSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerSensor(IntegerSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatSensor(FloatSensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanActor(BooleanActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerActor(IntegerActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatActor(FloatActor object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Integer Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerCondition(IntegerCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatCondition(FloatCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanCondition(BooleanCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerAction(IntegerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatAction(FloatAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanAction(BooleanAction object) {
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
