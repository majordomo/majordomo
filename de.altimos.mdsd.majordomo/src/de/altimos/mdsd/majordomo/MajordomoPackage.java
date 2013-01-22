/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	 * The number of structural features of the '<em>Majordomo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORDOMO_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ROOMS = EXTENDABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = EXTENDABLE_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ACTION = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

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
	int LIGHT_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR__CTX = SENSOR__CTX;

	/**
	 * The number of structural features of the '<em>Light Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

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
	int TEMPERATURE_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR__CTX = SENSOR__CTX;

	/**
	 * The number of structural features of the '<em>Temperature Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURE_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

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
	int RAIN_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN_SENSOR__CTX = SENSOR__CTX;

	/**
	 * The number of structural features of the '<em>Rain Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAIN_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

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
	int SWITCH_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SENSOR__CTX = SENSOR__CTX;

	/**
	 * The number of structural features of the '<em>Switch Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

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
	int NUMBER_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SENSOR__CTX = SENSOR__CTX;

	/**
	 * The number of structural features of the '<em>Number Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

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
	int CLOCK_SENSOR__NAME = SENSOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SENSOR__CTX = SENSOR__CTX;

	/**
	 * The number of structural features of the '<em>Clock Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOCK_SENSOR_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 0;

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
	int LAMP_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_ACTOR__CTX = ACTOR__CTX;

	/**
	 * The number of structural features of the '<em>Lamp Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMP_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

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
	int ROLLER_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLER_ACTOR__CTX = ACTOR__CTX;

	/**
	 * The number of structural features of the '<em>Roller Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLER_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

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
	int ROOF_WINDOW_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_WINDOW_ACTOR__CTX = ACTOR__CTX;

	/**
	 * The number of structural features of the '<em>Roof Window Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOF_WINDOW_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOILER_ACTION__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOILER_ACTION__CTX = ACTOR__CTX;

	/**
	 * The number of structural features of the '<em>Boiler Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOILER_ACTION_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

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
	int RADIATOR_ACTOR__NAME = ACTOR__NAME;

	/**
	 * The feature id for the '<em><b>Ctx</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTOR__CTX = ACTOR__CTX;

	/**
	 * The number of structural features of the '<em>Radiator Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RADIATOR_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.RoomExtension <em>Room Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.RoomExtension
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoomExtension()
	 * @generated
	 */
	int ROOM_EXTENSION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTENSION__NAME = EXTENSION__NAME;

	/**
	 * The number of structural features of the '<em>Room Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_EXTENSION_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.HouseExtension <em>House Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.HouseExtension
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouseExtension()
	 * @generated
	 */
	int HOUSE_EXTENSION = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EXTENSION__NAME = EXTENSION__NAME;

	/**
	 * The number of structural features of the '<em>House Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_EXTENSION_FEATURE_COUNT = EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.Condition <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.Condition
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 21;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ActionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTOR = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.LesserConditionImpl <em>Lesser Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.LesserConditionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getLesserCondition()
	 * @generated
	 */
	int LESSER_CONDITION = 23;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSER_CONDITION__SENSOR = CONDITION__SENSOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSER_CONDITION__VALUE = CONDITION__VALUE;

	/**
	 * The number of structural features of the '<em>Lesser Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESSER_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.GreaterConditionImpl <em>Greater Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.GreaterConditionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getGreaterCondition()
	 * @generated
	 */
	int GREATER_CONDITION = 24;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_CONDITION__SENSOR = CONDITION__SENSOR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_CONDITION__VALUE = CONDITION__VALUE;

	/**
	 * The number of structural features of the '<em>Greater Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;


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
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see de.altimos.mdsd.majordomo.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.House#getRooms <em>Rooms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rooms</em>'.
	 * @see de.altimos.mdsd.majordomo.House#getRooms()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Rooms();

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
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Rule#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see de.altimos.mdsd.majordomo.Rule#getAction()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Action();

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
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RoomExtension <em>Room Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Extension</em>'.
	 * @see de.altimos.mdsd.majordomo.RoomExtension
	 * @generated
	 */
	EClass getRoomExtension();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.HouseExtension <em>House Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House Extension</em>'.
	 * @see de.altimos.mdsd.majordomo.HouseExtension
	 * @generated
	 */
	EClass getHouseExtension();

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
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.Condition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see de.altimos.mdsd.majordomo.Condition#getSensor()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Condition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.Condition#getValue()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Value();

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
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Action#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.altimos.mdsd.majordomo.Action#getValue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Value();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.Action#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.Action#getActor()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.LesserCondition <em>Lesser Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lesser Condition</em>'.
	 * @see de.altimos.mdsd.majordomo.LesserCondition
	 * @generated
	 */
	EClass getLesserCondition();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.GreaterCondition <em>Greater Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Condition</em>'.
	 * @see de.altimos.mdsd.majordomo.GreaterCondition
	 * @generated
	 */
	EClass getGreaterCondition();

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
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.HouseImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__ROOMS = eINSTANCE.getHouse_Rooms();

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
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__ACTION = eINSTANCE.getRule_Action();

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
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.RoomExtension <em>Room Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.RoomExtension
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoomExtension()
		 * @generated
		 */
		EClass ROOM_EXTENSION = eINSTANCE.getRoomExtension();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.HouseExtension <em>House Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.HouseExtension
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouseExtension()
		 * @generated
		 */
		EClass HOUSE_EXTENSION = eINSTANCE.getHouseExtension();

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
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__SENSOR = eINSTANCE.getCondition_Sensor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.ActionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALUE = eINSTANCE.getAction_Value();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTOR = eINSTANCE.getAction_Actor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.LesserConditionImpl <em>Lesser Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.LesserConditionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getLesserCondition()
		 * @generated
		 */
		EClass LESSER_CONDITION = eINSTANCE.getLesserCondition();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.GreaterConditionImpl <em>Greater Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.GreaterConditionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getGreaterCondition()
		 * @generated
		 */
		EClass GREATER_CONDITION = eINSTANCE.getGreaterCondition();

	}

} //MajordomoPackage
