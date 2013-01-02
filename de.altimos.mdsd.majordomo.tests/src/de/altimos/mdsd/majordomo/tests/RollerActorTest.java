/**
 */
package de.altimos.mdsd.majordomo.tests;

import de.altimos.mdsd.majordomo.MajordomoFactory;
import de.altimos.mdsd.majordomo.RollerActor;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Roller Actor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RollerActorTest extends TestCase {

	/**
	 * The fixture for this Roller Actor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RollerActor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RollerActorTest.class);
	}

	/**
	 * Constructs a new Roller Actor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RollerActorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Roller Actor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RollerActor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Roller Actor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RollerActor getFixture() {
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
		setFixture(MajordomoFactory.eINSTANCE.createRollerActor());
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

} //RollerActorTest
