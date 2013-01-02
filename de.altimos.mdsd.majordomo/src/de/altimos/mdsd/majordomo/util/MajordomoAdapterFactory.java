/**
 */
package de.altimos.mdsd.majordomo.util;

import de.altimos.mdsd.majordomo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.altimos.mdsd.majordomo.MajordomoPackage
 * @generated
 */
public class MajordomoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MajordomoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajordomoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MajordomoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MajordomoSwitch<Adapter> modelSwitch =
		new MajordomoSwitch<Adapter>() {
			@Override
			public Adapter caseMajordomo(Majordomo object) {
				return createMajordomoAdapter();
			}
			@Override
			public Adapter caseHouse(House object) {
				return createHouseAdapter();
			}
			@Override
			public Adapter caseExtendable(Extendable object) {
				return createExtendableAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseLightSensor(LightSensor object) {
				return createLightSensorAdapter();
			}
			@Override
			public Adapter caseTemperatureSensor(TemperatureSensor object) {
				return createTemperatureSensorAdapter();
			}
			@Override
			public Adapter caseRainSensor(RainSensor object) {
				return createRainSensorAdapter();
			}
			@Override
			public Adapter caseSwitchSensor(SwitchSensor object) {
				return createSwitchSensorAdapter();
			}
			@Override
			public Adapter caseNumberSensor(NumberSensor object) {
				return createNumberSensorAdapter();
			}
			@Override
			public Adapter caseClockSensor(ClockSensor object) {
				return createClockSensorAdapter();
			}
			@Override
			public Adapter caseLampActor(LampActor object) {
				return createLampActorAdapter();
			}
			@Override
			public Adapter caseRollerActor(RollerActor object) {
				return createRollerActorAdapter();
			}
			@Override
			public Adapter caseRoofWindowActor(RoofWindowActor object) {
				return createRoofWindowActorAdapter();
			}
			@Override
			public Adapter caseBoilerAction(BoilerAction object) {
				return createBoilerActionAdapter();
			}
			@Override
			public Adapter caseRadiatorActor(RadiatorActor object) {
				return createRadiatorActorAdapter();
			}
			@Override
			public Adapter caseRoomExtension(RoomExtension object) {
				return createRoomExtensionAdapter();
			}
			@Override
			public Adapter caseHouseExtension(HouseExtension object) {
				return createHouseExtensionAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseLesserCondition(LesserCondition object) {
				return createLesserConditionAdapter();
			}
			@Override
			public Adapter caseGreaterCondition(GreaterCondition object) {
				return createGreaterConditionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.Majordomo <em>Majordomo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.Majordomo
	 * @generated
	 */
	public Adapter createMajordomoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.House
	 * @generated
	 */
	public Adapter createHouseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.Extendable <em>Extendable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.Extendable
	 * @generated
	 */
	public Adapter createExtendableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.LightSensor <em>Light Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.LightSensor
	 * @generated
	 */
	public Adapter createLightSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.TemperatureSensor <em>Temperature Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.TemperatureSensor
	 * @generated
	 */
	public Adapter createTemperatureSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.RainSensor <em>Rain Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.RainSensor
	 * @generated
	 */
	public Adapter createRainSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.SwitchSensor <em>Switch Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.SwitchSensor
	 * @generated
	 */
	public Adapter createSwitchSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.NumberSensor <em>Number Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.NumberSensor
	 * @generated
	 */
	public Adapter createNumberSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.ClockSensor <em>Clock Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.ClockSensor
	 * @generated
	 */
	public Adapter createClockSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.LampActor <em>Lamp Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.LampActor
	 * @generated
	 */
	public Adapter createLampActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.RollerActor <em>Roller Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.RollerActor
	 * @generated
	 */
	public Adapter createRollerActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.RoofWindowActor <em>Roof Window Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.RoofWindowActor
	 * @generated
	 */
	public Adapter createRoofWindowActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.BoilerAction <em>Boiler Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.BoilerAction
	 * @generated
	 */
	public Adapter createBoilerActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.RadiatorActor <em>Radiator Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.RadiatorActor
	 * @generated
	 */
	public Adapter createRadiatorActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.RoomExtension <em>Room Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.RoomExtension
	 * @generated
	 */
	public Adapter createRoomExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.HouseExtension <em>House Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.HouseExtension
	 * @generated
	 */
	public Adapter createHouseExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.LesserCondition <em>Lesser Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.LesserCondition
	 * @generated
	 */
	public Adapter createLesserConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.altimos.mdsd.majordomo.GreaterCondition <em>Greater Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.altimos.mdsd.majordomo.GreaterCondition
	 * @generated
	 */
	public Adapter createGreaterConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MajordomoAdapterFactory
