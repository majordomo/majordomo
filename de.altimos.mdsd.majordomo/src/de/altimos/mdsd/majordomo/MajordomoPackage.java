/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.altimos.mdsd.majordomo.MajordomoFactory
 * @model kind="package"
 * @generated
 */
public interface MajordomoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "majordomo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdsd.altimos.de/majordomo/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "majordomo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MajordomoPackage eINSTANCE = de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.MajordomoImpl <em>Majordomo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getMajordomo()
	 * @generated
	 */
	int MAJORDOMO = 0;

	/**
	 * The feature id for the '<em><b>House</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORDOMO__HOUSE = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORDOMO__RULES = 1;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORDOMO__ROOMS = 2;

	/**
	 * The number of structural features of the '<em>Majordomo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORDOMO_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Extendable <em>Extendable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Extendable
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getExtendable()
	 * @generated
	 */
	int EXTENDABLE = 2;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE__SENSORS = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE__ACTORS = 1;

	/**
	 * The number of structural features of the '<em>Extendable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.HouseImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 1;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__SENSORS = EXTENDABLE__SENSORS;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ACTORS = EXTENDABLE__ACTORS;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = EXTENDABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RoomImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 3;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SENSORS = EXTENDABLE__SENSORS;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ACTORS = EXTENDABLE__ACTORS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = EXTENDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = EXTENDABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Extension <em>Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Extension
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getExtension()
	 * @generated
	 */
	int EXTENSION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Sensor <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Sensor
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = EXTENSION__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CTX = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Actor <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Actor
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = EXTENSION__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CTX = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RuleImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 6;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITIONS = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTIONS = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.HouseMountable <em>House Mountable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.HouseMountable
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouseMountable()
	 * @generated
	 */
	int HOUSE_MOUNTABLE = 20;

	/**
	 * The number of structural features of the '<em>House Mountable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_MOUNTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.LightSensorImpl <em>Light Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.LightSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getLightSensor()
	 * @generated
	 */
	int LIGHT_SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR__NAME = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR__CTX = HOUSE_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.TemperatureSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getTemperatureSensor()
	 * @generated
	 */
	int TEMPERATURE_SENSOR = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR__NAME = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR__CTX = HOUSE_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RainSensorImpl <em>Rain Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RainSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRainSensor()
	 * @generated
	 */
	int RAIN_SENSOR = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN_SENSOR__NAME = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN_SENSOR__CTX = HOUSE_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rain Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN_SENSOR_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.RoomMountable <em>Room Mountable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.RoomMountable
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoomMountable()
	 * @generated
	 */
	int ROOM_MOUNTABLE = 19;

	/**
	 * The number of structural features of the '<em>Room Mountable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_MOUNTABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.SwitchSensorImpl <em>Switch Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.SwitchSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSwitchSensor()
	 * @generated
	 */
	int SWITCH_SENSOR = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SENSOR__NAME = ROOM_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SENSOR__CTX = ROOM_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SENSOR_FEATURE_COUNT = ROOM_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.NumberSensorImpl <em>Number Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.NumberSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getNumberSensor()
	 * @generated
	 */
	int NUMBER_SENSOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SENSOR__NAME = ROOM_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SENSOR__CTX = ROOM_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Number Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SENSOR_FEATURE_COUNT = ROOM_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ClockSensorImpl <em>Clock Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ClockSensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getClockSensor()
	 * @generated
	 */
	int CLOCK_SENSOR = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SENSOR__NAME = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SENSOR__CTX = HOUSE_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Clock Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SENSOR_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.LampActorImpl <em>Lamp Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.LampActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getLampActor()
	 * @generated
	 */
	int LAMP_ACTOR = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_ACTOR__NAME = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_ACTOR__CTX = HOUSE_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Lamp Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_ACTOR_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RollerActorImpl <em>Roller Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RollerActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRollerActor()
	 * @generated
	 */
	int ROLLER_ACTOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLER_ACTOR__NAME = ROOM_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLER_ACTOR__CTX = ROOM_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLER_ACTOR__EREFERENCE0 = ROOM_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Roller Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLER_ACTOR_FEATURE_COUNT = ROOM_MOUNTABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RoofWindowActorImpl <em>Roof Window Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RoofWindowActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoofWindowActor()
	 * @generated
	 */
	int ROOF_WINDOW_ACTOR = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_WINDOW_ACTOR__NAME = ROOM_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_WINDOW_ACTOR__CTX = ROOM_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_WINDOW_ACTOR__EREFERENCE0 = ROOM_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Roof Window Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_WINDOW_ACTOR_FEATURE_COUNT = ROOM_MOUNTABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.BoilerActionImpl <em>Boiler Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.BoilerActionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBoilerAction()
	 * @generated
	 */
	int BOILER_ACTION = 17;

	/**
	 * The number of structural features of the '<em>Boiler Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOILER_ACTION_FEATURE_COUNT = HOUSE_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RadiatorActorImpl <em>Radiator Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RadiatorActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRadiatorActor()
	 * @generated
	 */
	int RADIATOR_ACTOR = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTOR__NAME = ROOM_MOUNTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTOR__CTX = ROOM_MOUNTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTOR__EREFERENCE0 = ROOM_MOUNTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Radiator Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTOR_FEATURE_COUNT = ROOM_MOUNTABLE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.BooleanSensor <em>Boolean Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.BooleanSensor
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanSensor()
	 * @generated
	 */
	int BOOLEAN_SENSOR = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR__CTX = SENSOR__CTX;

	/**
	 * The number of structural features of the '<em>Boolean Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.IntegerSensor <em>Integer Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.IntegerSensor
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getIntegerSensor()
	 * @generated
	 */
	int INTEGER_SENSOR = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SENSOR__CTX = SENSOR__CTX;

	/**
	 * The number of structural features of the '<em>Integer Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.FloatSensor <em>Float Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.FloatSensor
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatSensor()
	 * @generated
	 */
	int FLOAT_SENSOR = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_SENSOR__CTX = SENSOR__CTX;

	/**
	 * The number of structural features of the '<em>Float Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.BooleanActor <em>Boolean Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.BooleanActor
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanActor()
	 * @generated
	 */
	int BOOLEAN_ACTOR = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTOR__CTX = ACTOR__CTX;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTOR__EREFERENCE0 = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.IntegerActor <em>Integer Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.IntegerActor
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getIntegerActor()
	 * @generated
	 */
	int INTEGER_ACTOR = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ACTOR__CTX = ACTOR__CTX;

	/**
	 * The number of structural features of the '<em>Integer Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.FloatActor <em>Float Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.FloatActor
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatActor()
	 * @generated
	 */
	int FLOAT_ACTOR = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTOR__CTX = ACTOR__CTX;

	/**
	 * The number of structural features of the '<em>Float Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Condition <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Condition
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 27;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__COMPERATOR = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Action <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Action
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 28;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.IntegerConditionImpl <em>Integer Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.IntegerConditionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getIntegerCondition()
	 * @generated
	 */
	int INTEGER_CONDITION = 29;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONDITION__COMPERATOR = CONDITION__COMPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONDITION__SENSOR = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.FloatConditionImpl <em>Float Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.FloatConditionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatCondition()
	 * @generated
	 */
	int FLOAT_CONDITION = 30;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONDITION__COMPERATOR = CONDITION__COMPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONDITION__SENSOR = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Float Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.BooleanConditionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanCondition()
	 * @generated
	 */
	int BOOLEAN_CONDITION = 31;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__COMPERATOR = CONDITION__COMPERATOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION__SENSOR = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.IntegerActionImpl <em>Integer Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.IntegerActionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getIntegerAction()
	 * @generated
	 */
	int INTEGER_ACTION = 32;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ACTION__VALUE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ACTION__ACTOR = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.FloatActionImpl <em>Float Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.FloatActionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatAction()
	 * @generated
	 */
	int FLOAT_ACTION = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTION__VALUE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTION__ACTOR = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Float Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.BooleanActionImpl <em>Boolean Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.BooleanActionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanAction()
	 * @generated
	 */
	int BOOLEAN_ACTION = 34;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTION__VALUE = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTION__ACTOR = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Comperator <em>Comperator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Comperator
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getComperator()
	 * @generated
	 */
	int COMPERATOR = 35;


	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Majordomo <em>Majordomo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Majordomo</em>'.
	 * @see de.altimos.mdsd.majordomo.Majordomo
	 * @generated
	 */
	EClass getMajordomo();

	/**
	 * Returns the meta object for the containment reference '{@link de.altimos.mdsd.majordomo.Majordomo#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>House</em>'.
	 * @see de.altimos.mdsd.majordomo.Majordomo#getHouse()
	 * @see #getMajordomo()
	 * @generated
	 */
	EReference getMajordomo_House();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Majordomo#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see de.altimos.mdsd.majordomo.Majordomo#getRules()
	 * @see #getMajordomo()
	 * @generated
	 */
	EReference getMajordomo_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Majordomo#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see de.altimos.mdsd.majordomo.Majordomo#getRooms()
	 * @see #getMajordomo()
	 * @generated
	 */
	EReference getMajordomo_Rooms();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see de.altimos.mdsd.majordomo.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Extendable <em>Extendable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extendable</em>'.
	 * @see de.altimos.mdsd.majordomo.Extendable
	 * @generated
	 */
	EClass getExtendable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Extendable#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see de.altimos.mdsd.majordomo.Extendable#getSensors()
	 * @see #getExtendable()
	 * @generated
	 */
	EReference getExtendable_Sensors();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Extendable#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see de.altimos.mdsd.majordomo.Extendable#getActors()
	 * @see #getExtendable()
	 * @generated
	 */
	EReference getExtendable_Actors();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see de.altimos.mdsd.majordomo.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Room#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.altimos.mdsd.majordomo.Room#getName()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Name();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the container reference '{@link de.altimos.mdsd.majordomo.Sensor#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ctx</em>'.
	 * @see de.altimos.mdsd.majordomo.Sensor#getCtx()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Ctx();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the container reference '{@link de.altimos.mdsd.majordomo.Actor#getCtx <em>Ctx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ctx</em>'.
	 * @see de.altimos.mdsd.majordomo.Actor#getCtx()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Ctx();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see de.altimos.mdsd.majordomo.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Rule#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see de.altimos.mdsd.majordomo.Rule#getConditions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Rule#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see de.altimos.mdsd.majordomo.Rule#getActions()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Actions();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension</em>'.
	 * @see de.altimos.mdsd.majordomo.Extension
	 * @generated
	 */
	EClass getExtension();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Extension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.altimos.mdsd.majordomo.Extension#getName()
	 * @see #getExtension()
	 * @generated
	 */
	EAttribute getExtension_Name();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.LightSensor
	 * @generated
	 */
	EClass getLightSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperature Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.TemperatureSensor
	 * @generated
	 */
	EClass getTemperatureSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RainSensor <em>Rain Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rain Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.RainSensor
	 * @generated
	 */
	EClass getRainSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.SwitchSensor <em>Switch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.SwitchSensor
	 * @generated
	 */
	EClass getSwitchSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.NumberSensor <em>Number Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.NumberSensor
	 * @generated
	 */
	EClass getNumberSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.ClockSensor <em>Clock Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clock Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.ClockSensor
	 * @generated
	 */
	EClass getClockSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.LampActor <em>Lamp Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lamp Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.LampActor
	 * @generated
	 */
	EClass getLampActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RollerActor <em>Roller Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roller Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.RollerActor
	 * @generated
	 */
	EClass getRollerActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RoofWindowActor <em>Roof Window Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roof Window Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.RoofWindowActor
	 * @generated
	 */
	EClass getRoofWindowActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BoilerAction <em>Boiler Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boiler Action</em>'.
	 * @see de.altimos.mdsd.majordomo.BoilerAction
	 * @generated
	 */
	EClass getBoilerAction();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RadiatorActor <em>Radiator Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Radiator Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.RadiatorActor
	 * @generated
	 */
	EClass getRadiatorActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RoomMountable <em>Room Mountable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Mountable</em>'.
	 * @see de.altimos.mdsd.majordomo.RoomMountable
	 * @generated
	 */
	EClass getRoomMountable();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.HouseMountable <em>House Mountable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House Mountable</em>'.
	 * @see de.altimos.mdsd.majordomo.HouseMountable
	 * @generated
	 */
	EClass getHouseMountable();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BooleanSensor <em>Boolean Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanSensor
	 * @generated
	 */
	EClass getBooleanSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.IntegerSensor <em>Integer Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.IntegerSensor
	 * @generated
	 */
	EClass getIntegerSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.FloatSensor <em>Float Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatSensor
	 * @generated
	 */
	EClass getFloatSensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BooleanActor <em>Boolean Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanActor
	 * @generated
	 */
	EClass getBooleanActor();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.BooleanActor#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanActor#getEReference0()
	 * @see #getBooleanActor()
	 * @generated
	 */
	EReference getBooleanActor_EReference0();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.IntegerActor <em>Integer Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.IntegerActor
	 * @generated
	 */
	EClass getIntegerActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.FloatActor <em>Float Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatActor
	 * @generated
	 */
	EClass getFloatActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see de.altimos.mdsd.majordomo.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Condition#getComperator <em>Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comperator</em>'.
	 * @see de.altimos.mdsd.majordomo.Condition#getComperator()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Comperator();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see de.altimos.mdsd.majordomo.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.IntegerCondition <em>Integer Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Condition</em>'.
	 * @see de.altimos.mdsd.majordomo.IntegerCondition
	 * @generated
	 */
	EClass getIntegerCondition();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.IntegerCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.IntegerCondition#getValue()
	 * @see #getIntegerCondition()
	 * @generated
	 */
	EAttribute getIntegerCondition_Value();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.IntegerCondition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.IntegerCondition#getSensor()
	 * @see #getIntegerCondition()
	 * @generated
	 */
	EReference getIntegerCondition_Sensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.FloatCondition <em>Float Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Condition</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatCondition
	 * @generated
	 */
	EClass getFloatCondition();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.FloatCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatCondition#getValue()
	 * @see #getFloatCondition()
	 * @generated
	 */
	EAttribute getFloatCondition_Value();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.FloatCondition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatCondition#getSensor()
	 * @see #getFloatCondition()
	 * @generated
	 */
	EReference getFloatCondition_Sensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BooleanCondition <em>Boolean Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Condition</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanCondition
	 * @generated
	 */
	EClass getBooleanCondition();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.BooleanCondition#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanCondition#isValue()
	 * @see #getBooleanCondition()
	 * @generated
	 */
	EAttribute getBooleanCondition_Value();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.BooleanCondition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanCondition#getSensor()
	 * @see #getBooleanCondition()
	 * @generated
	 */
	EReference getBooleanCondition_Sensor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.IntegerAction <em>Integer Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Action</em>'.
	 * @see de.altimos.mdsd.majordomo.IntegerAction
	 * @generated
	 */
	EClass getIntegerAction();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.IntegerAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.IntegerAction#getValue()
	 * @see #getIntegerAction()
	 * @generated
	 */
	EAttribute getIntegerAction_Value();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.IntegerAction#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.IntegerAction#getActor()
	 * @see #getIntegerAction()
	 * @generated
	 */
	EReference getIntegerAction_Actor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.FloatAction <em>Float Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float Action</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatAction
	 * @generated
	 */
	EClass getFloatAction();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.FloatAction#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatAction#getValue()
	 * @see #getFloatAction()
	 * @generated
	 */
	EAttribute getFloatAction_Value();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.FloatAction#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.FloatAction#getActor()
	 * @see #getFloatAction()
	 * @generated
	 */
	EReference getFloatAction_Actor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.BooleanAction <em>Boolean Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Action</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanAction
	 * @generated
	 */
	EClass getBooleanAction();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.BooleanAction#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanAction#isValue()
	 * @see #getBooleanAction()
	 * @generated
	 */
	EAttribute getBooleanAction_Value();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.BooleanAction#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.BooleanAction#getActor()
	 * @see #getBooleanAction()
	 * @generated
	 */
	EReference getBooleanAction_Actor();

	/**
	 * Returns the meta object for enum '{@link de.altimos.mdsd.majordomo.Comperator <em>Comperator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comperator</em>'.
	 * @see de.altimos.mdsd.majordomo.Comperator
	 * @generated
	 */
	EEnum getComperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MajordomoFactory getMajordomoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.MajordomoImpl <em>Majordomo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getMajordomo()
		 * @generated
		 */
		EClass MAJORDOMO = eINSTANCE.getMajordomo();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAJORDOMO__HOUSE = eINSTANCE.getMajordomo_House();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAJORDOMO__RULES = eINSTANCE.getMajordomo_Rules();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAJORDOMO__ROOMS = eINSTANCE.getMajordomo_Rooms();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.HouseImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.Extendable <em>Extendable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.Extendable
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getExtendable()
		 * @generated
		 */
		EClass EXTENDABLE = eINSTANCE.getExtendable();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDABLE__SENSORS = eINSTANCE.getExtendable_Sensors();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDABLE__ACTORS = eINSTANCE.getExtendable_Actors();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RoomImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__NAME = eINSTANCE.getRoom_Name();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.Sensor <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.Sensor
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Ctx</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__CTX = eINSTANCE.getSensor_Ctx();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.Actor <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.Actor
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Ctx</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__CTX = eINSTANCE.getActor_Ctx();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RuleImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONDITIONS = eINSTANCE.getRule_Conditions();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ACTIONS = eINSTANCE.getRule_Actions();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.Extension <em>Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.Extension
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getExtension()
		 * @generated
		 */
		EClass EXTENSION = eINSTANCE.getExtension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION__NAME = eINSTANCE.getExtension_Name();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.LightSensorImpl <em>Light Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.LightSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getLightSensor()
		 * @generated
		 */
		EClass LIGHT_SENSOR = eINSTANCE.getLightSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.TemperatureSensorImpl <em>Temperature Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.TemperatureSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getTemperatureSensor()
		 * @generated
		 */
		EClass TEMPERATURE_SENSOR = eINSTANCE.getTemperatureSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RainSensorImpl <em>Rain Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RainSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRainSensor()
		 * @generated
		 */
		EClass RAIN_SENSOR = eINSTANCE.getRainSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.SwitchSensorImpl <em>Switch Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.SwitchSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSwitchSensor()
		 * @generated
		 */
		EClass SWITCH_SENSOR = eINSTANCE.getSwitchSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.NumberSensorImpl <em>Number Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.NumberSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getNumberSensor()
		 * @generated
		 */
		EClass NUMBER_SENSOR = eINSTANCE.getNumberSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.ClockSensorImpl <em>Clock Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.ClockSensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getClockSensor()
		 * @generated
		 */
		EClass CLOCK_SENSOR = eINSTANCE.getClockSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.LampActorImpl <em>Lamp Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.LampActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getLampActor()
		 * @generated
		 */
		EClass LAMP_ACTOR = eINSTANCE.getLampActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RollerActorImpl <em>Roller Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RollerActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRollerActor()
		 * @generated
		 */
		EClass ROLLER_ACTOR = eINSTANCE.getRollerActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RoofWindowActorImpl <em>Roof Window Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RoofWindowActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoofWindowActor()
		 * @generated
		 */
		EClass ROOF_WINDOW_ACTOR = eINSTANCE.getRoofWindowActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.BoilerActionImpl <em>Boiler Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.BoilerActionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBoilerAction()
		 * @generated
		 */
		EClass BOILER_ACTION = eINSTANCE.getBoilerAction();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RadiatorActorImpl <em>Radiator Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RadiatorActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRadiatorActor()
		 * @generated
		 */
		EClass RADIATOR_ACTOR = eINSTANCE.getRadiatorActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.RoomMountable <em>Room Mountable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.RoomMountable
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoomMountable()
		 * @generated
		 */
		EClass ROOM_MOUNTABLE = eINSTANCE.getRoomMountable();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.HouseMountable <em>House Mountable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.HouseMountable
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouseMountable()
		 * @generated
		 */
		EClass HOUSE_MOUNTABLE = eINSTANCE.getHouseMountable();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.BooleanSensor <em>Boolean Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.BooleanSensor
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanSensor()
		 * @generated
		 */
		EClass BOOLEAN_SENSOR = eINSTANCE.getBooleanSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.IntegerSensor <em>Integer Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.IntegerSensor
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getIntegerSensor()
		 * @generated
		 */
		EClass INTEGER_SENSOR = eINSTANCE.getIntegerSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.FloatSensor <em>Float Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.FloatSensor
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatSensor()
		 * @generated
		 */
		EClass FLOAT_SENSOR = eINSTANCE.getFloatSensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.BooleanActor <em>Boolean Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.BooleanActor
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanActor()
		 * @generated
		 */
		EClass BOOLEAN_ACTOR = eINSTANCE.getBooleanActor();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_ACTOR__EREFERENCE0 = eINSTANCE.getBooleanActor_EReference0();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.IntegerActor <em>Integer Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.IntegerActor
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getIntegerActor()
		 * @generated
		 */
		EClass INTEGER_ACTOR = eINSTANCE.getIntegerActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.FloatActor <em>Float Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.FloatActor
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatActor()
		 * @generated
		 */
		EClass FLOAT_ACTOR = eINSTANCE.getFloatActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.Condition <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.Condition
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Comperator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__COMPERATOR = eINSTANCE.getCondition_Comperator();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.Action <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.Action
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.IntegerConditionImpl <em>Integer Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.IntegerConditionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getIntegerCondition()
		 * @generated
		 */
		EClass INTEGER_CONDITION = eINSTANCE.getIntegerCondition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONDITION__VALUE = eINSTANCE.getIntegerCondition_Value();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_CONDITION__SENSOR = eINSTANCE.getIntegerCondition_Sensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.FloatConditionImpl <em>Float Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.FloatConditionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatCondition()
		 * @generated
		 */
		EClass FLOAT_CONDITION = eINSTANCE.getFloatCondition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_CONDITION__VALUE = eINSTANCE.getFloatCondition_Value();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOAT_CONDITION__SENSOR = eINSTANCE.getFloatCondition_Sensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.BooleanConditionImpl <em>Boolean Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.BooleanConditionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanCondition()
		 * @generated
		 */
		EClass BOOLEAN_CONDITION = eINSTANCE.getBooleanCondition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONDITION__VALUE = eINSTANCE.getBooleanCondition_Value();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_CONDITION__SENSOR = eINSTANCE.getBooleanCondition_Sensor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.IntegerActionImpl <em>Integer Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.IntegerActionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getIntegerAction()
		 * @generated
		 */
		EClass INTEGER_ACTION = eINSTANCE.getIntegerAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_ACTION__VALUE = eINSTANCE.getIntegerAction_Value();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_ACTION__ACTOR = eINSTANCE.getIntegerAction_Actor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.FloatActionImpl <em>Float Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.FloatActionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getFloatAction()
		 * @generated
		 */
		EClass FLOAT_ACTION = eINSTANCE.getFloatAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT_ACTION__VALUE = eINSTANCE.getFloatAction_Value();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOAT_ACTION__ACTOR = eINSTANCE.getFloatAction_Actor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.BooleanActionImpl <em>Boolean Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.BooleanActionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getBooleanAction()
		 * @generated
		 */
		EClass BOOLEAN_ACTION = eINSTANCE.getBooleanAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ACTION__VALUE = eINSTANCE.getBooleanAction_Value();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_ACTION__ACTOR = eINSTANCE.getBooleanAction_Actor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.Comperator <em>Comperator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.Comperator
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getComperator()
		 * @generated
		 */
		EEnum COMPERATOR = eINSTANCE.getComperator();

	}

} //MajordomoPackage
