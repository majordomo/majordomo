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
	 * The number of structural features of the '<em>Majordomo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAJORDOMO_FEATURE_COUNT = 2;

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
	int HOUSE__SENSORS = 0;

	/**
	 * The feature id for the '<em><b>Rooms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ROOMS = 1;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ACTORS = 2;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.SensorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Mountable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MOUNTABLE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 3;

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
	int ROOM__SENSORS = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ACTORS = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RuleImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 5;

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
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ConditionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Comperator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__COMPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.ActionImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 7;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTOR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.RoomActorImpl <em>Room Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.RoomActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoomActor()
	 * @generated
	 */
	int ROOM_ACTOR = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTOR__LABEL = ACTOR__LABEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTOR__TYPE = ACTOR__TYPE;

	/**
	 * The number of structural features of the '<em>Room Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.impl.HouseActorImpl <em>House Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.impl.HouseActorImpl
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouseActor()
	 * @generated
	 */
	int HOUSE_ACTOR = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_ACTOR__LABEL = ACTOR__LABEL;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_ACTOR__TYPE = ACTOR__TYPE;

	/**
	 * The number of structural features of the '<em>House Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_ACTOR_FEATURE_COUNT = ACTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.MountPoint <em>Mount Point</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.MountPoint
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getMountPoint()
	 * @generated
	 */
	int MOUNT_POINT = 10;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.CompareOperator <em>Compare Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.CompareOperator
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getCompareOperator()
	 * @generated
	 */
	int COMPARE_OPERATOR = 11;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.ActorType <em>Actor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.ActorType
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getActorType()
	 * @generated
	 */
	int ACTOR_TYPE = 12;

	/**
	 * The meta object id for the '{@link de.altimos.mdsd.majordomo.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.altimos.mdsd.majordomo.SensorType
	 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 13;


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
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.House#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see de.altimos.mdsd.majordomo.House#getSensors()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Sensors();

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
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.House#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see de.altimos.mdsd.majordomo.House#getActors()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Actors();

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
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Sensor#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.altimos.mdsd.majordomo.Sensor#getLabel()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Sensor#getMountable <em>Mountable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mountable</em>'.
	 * @see de.altimos.mdsd.majordomo.Sensor#getMountable()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Mountable();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Sensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.altimos.mdsd.majordomo.Sensor#getType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Type();

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
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Room#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see de.altimos.mdsd.majordomo.Room#getSensors()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Sensors();

	/**
	 * Returns the meta object for the containment reference list '{@link de.altimos.mdsd.majordomo.Room#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see de.altimos.mdsd.majordomo.Room#getActors()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Actors();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Room#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.altimos.mdsd.majordomo.Room#getLabel()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Label();

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
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Actor#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.altimos.mdsd.majordomo.Actor#getLabel()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Label();

	/**
	 * Returns the meta object for the attribute '{@link de.altimos.mdsd.majordomo.Actor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.altimos.mdsd.majordomo.Actor#getType()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Type();

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
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see de.altimos.mdsd.majordomo.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the reference '{@link de.altimos.mdsd.majordomo.Condition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.altimos.mdsd.majordomo.Condition#getSource()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Source();

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
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.RoomActor <em>Room Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.RoomActor
	 * @generated
	 */
	EClass getRoomActor();

	/**
	 * Returns the meta object for class '{@link de.altimos.mdsd.majordomo.HouseActor <em>House Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House Actor</em>'.
	 * @see de.altimos.mdsd.majordomo.HouseActor
	 * @generated
	 */
	EClass getHouseActor();

	/**
	 * Returns the meta object for enum '{@link de.altimos.mdsd.majordomo.MountPoint <em>Mount Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mount Point</em>'.
	 * @see de.altimos.mdsd.majordomo.MountPoint
	 * @generated
	 */
	EEnum getMountPoint();

	/**
	 * Returns the meta object for enum '{@link de.altimos.mdsd.majordomo.CompareOperator <em>Compare Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Compare Operator</em>'.
	 * @see de.altimos.mdsd.majordomo.CompareOperator
	 * @generated
	 */
	EEnum getCompareOperator();

	/**
	 * Returns the meta object for enum '{@link de.altimos.mdsd.majordomo.ActorType <em>Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actor Type</em>'.
	 * @see de.altimos.mdsd.majordomo.ActorType
	 * @generated
	 */
	EEnum getActorType();

	/**
	 * Returns the meta object for enum '{@link de.altimos.mdsd.majordomo.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see de.altimos.mdsd.majordomo.SensorType
	 * @generated
	 */
	EEnum getSensorType();

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
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__SENSORS = eINSTANCE.getHouse_Sensors();

		/**
		 * The meta object literal for the '<em><b>Rooms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__ROOMS = eINSTANCE.getHouse_Rooms();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__ACTORS = eINSTANCE.getHouse_Actors();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.SensorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__LABEL = eINSTANCE.getSensor_Label();

		/**
		 * The meta object literal for the '<em><b>Mountable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__MOUNTABLE = eINSTANCE.getSensor_Mountable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

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
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__SENSORS = eINSTANCE.getRoom_Sensors();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__ACTORS = eINSTANCE.getRoom_Actors();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__LABEL = eINSTANCE.getRoom_Label();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.ActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__LABEL = eINSTANCE.getActor_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__TYPE = eINSTANCE.getActor_Type();

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
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.ConditionImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__SOURCE = eINSTANCE.getCondition_Source();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__VALUE = eINSTANCE.getCondition_Value();

		/**
		 * The meta object literal for the '<em><b>Comperator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__COMPERATOR = eINSTANCE.getCondition_Comperator();

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
		 * The meta object literal for the '<em><b>Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTOR = eINSTANCE.getAction_Actor();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALUE = eINSTANCE.getAction_Value();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.RoomActorImpl <em>Room Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.RoomActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getRoomActor()
		 * @generated
		 */
		EClass ROOM_ACTOR = eINSTANCE.getRoomActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.impl.HouseActorImpl <em>House Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.impl.HouseActorImpl
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getHouseActor()
		 * @generated
		 */
		EClass HOUSE_ACTOR = eINSTANCE.getHouseActor();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.MountPoint <em>Mount Point</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.MountPoint
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getMountPoint()
		 * @generated
		 */
		EEnum MOUNT_POINT = eINSTANCE.getMountPoint();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.CompareOperator <em>Compare Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.CompareOperator
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getCompareOperator()
		 * @generated
		 */
		EEnum COMPARE_OPERATOR = eINSTANCE.getCompareOperator();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.ActorType <em>Actor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.ActorType
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getActorType()
		 * @generated
		 */
		EEnum ACTOR_TYPE = eINSTANCE.getActorType();

		/**
		 * The meta object literal for the '{@link de.altimos.mdsd.majordomo.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.altimos.mdsd.majordomo.SensorType
		 * @see de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

	}

} //MajordomoPackage
