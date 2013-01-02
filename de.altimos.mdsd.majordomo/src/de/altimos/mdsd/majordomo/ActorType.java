/**
 */
package de.altimos.mdsd.majordomo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getActorType()
 * @model
 * @generated
 */
public enum ActorType implements Enumerator {
	/**
	 * The '<em><b>LAMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAMP_VALUE
	 * @generated
	 * @ordered
	 */
	LAMP(0, "LAMP", "LAMP"),

	/**
	 * The '<em><b>BOILER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOILER_VALUE
	 * @generated
	 * @ordered
	 */
	BOILER(1, "BOILER", "BOILER"),

	/**
	 * The '<em><b>RADIATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIATOR_VALUE
	 * @generated
	 * @ordered
	 */
	RADIATOR(2, "RADIATOR", "RADIATOR"),

	/**
	 * The '<em><b>ROOF WINDOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOF_WINDOW_VALUE
	 * @generated
	 * @ordered
	 */
	ROOF_WINDOW(3, "ROOF_WINDOW", "ROOF_WINDOW"),

	/**
	 * The '<em><b>ROLLER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLLER_VALUE
	 * @generated
	 * @ordered
	 */
	ROLLER(4, "ROLLER", "ROLLER");

	/**
	 * The '<em><b>LAMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LAMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAMP_VALUE = 0;

	/**
	 * The '<em><b>BOILER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOILER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOILER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOILER_VALUE = 1;

	/**
	 * The '<em><b>RADIATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RADIATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADIATOR_VALUE = 2;

	/**
	 * The '<em><b>ROOF WINDOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROOF WINDOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOF_WINDOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROOF_WINDOW_VALUE = 3;

	/**
	 * The '<em><b>ROLLER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROLLER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROLLER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROLLER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Actor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActorType[] VALUES_ARRAY =
		new ActorType[] {
			LAMP,
			BOILER,
			RADIATOR,
			ROOF_WINDOW,
			ROLLER,
		};

	/**
	 * A public read-only list of all the '<em><b>Actor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Actor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Actor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActorType get(int value) {
		switch (value) {
			case LAMP_VALUE: return LAMP;
			case BOILER_VALUE: return BOILER;
			case RADIATOR_VALUE: return RADIATOR;
			case ROOF_WINDOW_VALUE: return ROOF_WINDOW;
			case ROLLER_VALUE: return ROLLER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ActorType
