/**
 */
package de.altimos.mdsd.majordomo.tests;

import de.altimos.mdsd.majordomo.BoilerAction;
import de.altimos.mdsd.majordomo.MajordomoFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Boiler Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BoilerActionTest extends TestCase {

	/**
	 * The fixture for this Boiler Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoilerAction fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BoilerActionTest.class);
	}

	/**
	 * Constructs a new Boiler Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoilerActionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Boiler Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BoilerAction fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Boiler Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoilerAction getFixture() {
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
		setFixture(MajordomoFactory.eINSTANCE.createBoilerAction());
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

} //BoilerActionTest
