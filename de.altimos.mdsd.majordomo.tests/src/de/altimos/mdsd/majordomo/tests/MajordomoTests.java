/**
 */
package de.altimos.mdsd.majordomo.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>majordomo</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MajordomoTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MajordomoTests("majordomo Tests");
		suite.addTestSuite(LightSensorTest.class);
		suite.addTestSuite(TemperatureSensorTest.class);
		suite.addTestSuite(RainSensorTest.class);
		suite.addTestSuite(SwitchSensorTest.class);
		suite.addTestSuite(NumberSensorTest.class);
		suite.addTestSuite(ClockSensorTest.class);
		suite.addTestSuite(LampActorTest.class);
		suite.addTestSuite(RollerActorTest.class);
		suite.addTestSuite(RoofWindowActorTest.class);
		suite.addTestSuite(BoilerActorTest.class);
		suite.addTestSuite(RadiatorActorTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MajordomoTests(String name) {
		super(name);
	}

} //MajordomoTests
