/**
 */
package de.altimos.mdsd.majordomo.impl;

import de.altimos.mdsd.majordomo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case MajordomoPackage.INTEGER_CONDITION: return createIntegerCondition();
			case MajordomoPackage.FLOAT_CONDITION: return createFloatCondition();
			case MajordomoPackage.BOOLEAN_CONDITION: return createBooleanCondition();
			case MajordomoPackage.INTEGER_ACTION: return createIntegerAction();
			case MajordomoPackage.FLOAT_ACTION: return createFloatAction();
			case MajordomoPackage.BOOLEAN_ACTION: return createBooleanAction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MajordomoPackage.COMPERATOR:
				return createComperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MajordomoPackage.COMPERATOR:
				return convertComperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public IntegerCondition createIntegerCondition() {
		IntegerConditionImpl integerCondition = new IntegerConditionImpl();
		return integerCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatCondition createFloatCondition() {
		FloatConditionImpl floatCondition = new FloatConditionImpl();
		return floatCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanCondition createBooleanCondition() {
		BooleanConditionImpl booleanCondition = new BooleanConditionImpl();
		return booleanCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerAction createIntegerAction() {
		IntegerActionImpl integerAction = new IntegerActionImpl();
		return integerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatAction createFloatAction() {
		FloatActionImpl floatAction = new FloatActionImpl();
		return floatAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAction createBooleanAction() {
		BooleanActionImpl booleanAction = new BooleanActionImpl();
		return booleanAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comperator createComperatorFromString(EDataType eDataType, String initialValue) {
		Comperator result = Comperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
