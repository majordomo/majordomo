/**
 */
package de.altimos.mdsd.majordomo.impl;

import de.altimos.mdsd.majordomo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MajordomoFactoryImpl extends EFactoryImpl implements MajordomoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MajordomoFactory init() {
		try {
			MajordomoFactory theMajordomoFactory = (MajordomoFactory)EPackage.Registry.INSTANCE.getEFactory("http://mdsd.altimos.de/majordomo/1.0"); 
			if (theMajordomoFactory != null) {
				return theMajordomoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MajordomoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajordomoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MajordomoPackage.MAJORDOMO: return createMajordomo();
			case MajordomoPackage.HOUSE: return createHouse();
			case MajordomoPackage.ROOM: return createRoom();
			case MajordomoPackage.RULE: return createRule();
			case MajordomoPackage.LIGHT_SENSOR: return createLightSensor();
			case MajordomoPackage.TEMPERATURE_SENSOR: return createTemperatureSensor();
			case MajordomoPackage.RAIN_SENSOR: return createRainSensor();
			case MajordomoPackage.SWITCH_SENSOR: return createSwitchSensor();
			case MajordomoPackage.NUMBER_SENSOR: return createNumberSensor();
			case MajordomoPackage.CLOCK_SENSOR: return createClockSensor();
			case MajordomoPackage.LAMP_ACTOR: return createLampActor();
			case MajordomoPackage.ROLLER_ACTOR: return createRollerActor();
			case MajordomoPackage.ROOF_WINDOW_ACTOR: return createRoofWindowActor();
			case MajordomoPackage.BOILER_ACTION: return createBoilerAction();
			case MajordomoPackage.RADIATOR_ACTOR: return createRadiatorActor();
			case MajordomoPackage.ACTION: return createAction();
			case MajordomoPackage.LESSER_CONDITION: return createLesserCondition();
			case MajordomoPackage.GREATER_CONDITION: return createGreaterCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Majordomo createMajordomo() {
		MajordomoImpl majordomo = new MajordomoImpl();
		return majordomo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LightSensor createLightSensor() {
		LightSensorImpl lightSensor = new LightSensorImpl();
		return lightSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemperatureSensor createTemperatureSensor() {
		TemperatureSensorImpl temperatureSensor = new TemperatureSensorImpl();
		return temperatureSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RainSensor createRainSensor() {
		RainSensorImpl rainSensor = new RainSensorImpl();
		return rainSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchSensor createSwitchSensor() {
		SwitchSensorImpl switchSensor = new SwitchSensorImpl();
		return switchSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberSensor createNumberSensor() {
		NumberSensorImpl numberSensor = new NumberSensorImpl();
		return numberSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockSensor createClockSensor() {
		ClockSensorImpl clockSensor = new ClockSensorImpl();
		return clockSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LampActor createLampActor() {
		LampActorImpl lampActor = new LampActorImpl();
		return lampActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollerActor createRollerActor() {
		RollerActorImpl rollerActor = new RollerActorImpl();
		return rollerActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoofWindowActor createRoofWindowActor() {
		RoofWindowActorImpl roofWindowActor = new RoofWindowActorImpl();
		return roofWindowActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoilerAction createBoilerAction() {
		BoilerActionImpl boilerAction = new BoilerActionImpl();
		return boilerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadiatorActor createRadiatorActor() {
		RadiatorActorImpl radiatorActor = new RadiatorActorImpl();
		return radiatorActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LesserCondition createLesserCondition() {
		LesserConditionImpl lesserCondition = new LesserConditionImpl();
		return lesserCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterCondition createGreaterCondition() {
		GreaterConditionImpl greaterCondition = new GreaterConditionImpl();
		return greaterCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajordomoPackage getMajordomoPackage() {
		return (MajordomoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MajordomoPackage getPackage() {
		return MajordomoPackage.eINSTANCE;
	}

} //MajordomoFactoryImpl
