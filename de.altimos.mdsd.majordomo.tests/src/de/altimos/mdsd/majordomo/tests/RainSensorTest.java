/**
 */
package de.altimos.mdsd.majordomo.tests;

import de.altimos.mdsd.majordomo.MajordomoFactory;
import de.altimos.mdsd.majordomo.RainSensor;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rain Sensor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RainSensorTest extends TestCase {

	/**
	 * The fixture for this Rain Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RainSensor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RainSensorTest.class);
	}

	/**
	 * Constructs a new Rain Sensor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RainSensorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Rain Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RainSensor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Rain Sensor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RainSensor getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MajordomoFactory.eINSTANCE.createRainSensor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //RainSensorTest
