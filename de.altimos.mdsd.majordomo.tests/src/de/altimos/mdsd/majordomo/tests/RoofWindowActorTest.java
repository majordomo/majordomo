/**
 */
package de.altimos.mdsd.majordomo.tests;

import de.altimos.mdsd.majordomo.MajordomoFactory;
import de.altimos.mdsd.majordomo.RoofWindowActor;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Roof Window Actor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoofWindowActorTest extends TestCase {

	/**
	 * The fixture for this Roof Window Actor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoofWindowActor fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoofWindowActorTest.class);
	}

	/**
	 * Constructs a new Roof Window Actor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoofWindowActorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Roof Window Actor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RoofWindowActor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Roof Window Actor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoofWindowActor getFixture() {
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
		setFixture(MajordomoFactory.eINSTANCE.createRoofWindowActor());
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

} //RoofWindowActorTest
