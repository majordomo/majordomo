/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.altimos.mdsd.majordomo.MajordomoPackage
 * @generated
 */
public interface MajordomoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MajordomoFactory eINSTANCE = de.altimos.mdsd.majordomo.impl.MajordomoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Majordomo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Majordomo</em>'.
	 * @generated
	 */
	Majordomo createMajordomo();

	/**
	 * Returns a new object of class '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>House</em>'.
	 * @generated
	 */
	House createHouse();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Light Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Light Sensor</em>'.
	 * @generated
	 */
	LightSensor createLightSensor();

	/**
	 * Returns a new object of class '<em>Temperature Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temperature Sensor</em>'.
	 * @generated
	 */
	TemperatureSensor createTemperatureSensor();

	/**
	 * Returns a new object of class '<em>Rain Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rain Sensor</em>'.
	 * @generated
	 */
	RainSensor createRainSensor();

	/**
	 * Returns a new object of class '<em>Switch Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Sensor</em>'.
	 * @generated
	 */
	SwitchSensor createSwitchSensor();

	/**
	 * Returns a new object of class '<em>Number Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Sensor</em>'.
	 * @generated
	 */
	NumberSensor createNumberSensor();

	/**
	 * Returns a new object of class '<em>Clock Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clock Sensor</em>'.
	 * @generated
	 */
	ClockSensor createClockSensor();

	/**
	 * Returns a new object of class '<em>Lamp Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lamp Actor</em>'.
	 * @generated
	 */
	LampActor createLampActor();

	/**
	 * Returns a new object of class '<em>Roller Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roller Actor</em>'.
	 * @generated
	 */
	RollerActor createRollerActor();

	/**
	 * Returns a new object of class '<em>Roof Window Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Roof Window Actor</em>'.
	 * @generated
	 */
	RoofWindowActor createRoofWindowActor();

	/**
	 * Returns a new object of class '<em>Boiler Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boiler Actor</em>'.
	 * @generated
	 */
	BoilerActor createBoilerActor();

	/**
	 * Returns a new object of class '<em>Radiator Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Radiator Actor</em>'.
	 * @generated
	 */
	RadiatorActor createRadiatorActor();

	/**
	 * Returns a new object of class '<em>Integer Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Condition</em>'.
	 * @generated
	 */
	IntegerCondition createIntegerCondition();

	/**
	 * Returns a new object of class '<em>Float Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Condition</em>'.
	 * @generated
	 */
	FloatCondition createFloatCondition();

	/**
	 * Returns a new object of class '<em>Boolean Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Condition</em>'.
	 * @generated
	 */
	BooleanCondition createBooleanCondition();

	/**
	 * Returns a new object of class '<em>Integer Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Action</em>'.
	 * @generated
	 */
	IntegerAction createIntegerAction();

	/**
	 * Returns a new object of class '<em>Float Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Float Action</em>'.
	 * @generated
	 */
	FloatAction createFloatAction();

	/**
	 * Returns a new object of class '<em>Boolean Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Action</em>'.
	 * @generated
	 */
	BooleanAction createBooleanAction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MajordomoPackage getMajordomoPackage();

} //MajordomoFactory
