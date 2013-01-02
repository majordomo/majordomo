/**
 */
package de.altimos.mdsd.majordomo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sensor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getSensorType()
 * @model
 * @generated
 */
public enum SensorType implements Enumerator {
	/**
	 * The '<em><b>SWITCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWITCH_VALUE
	 * @generated
	 * @ordered
	 */
	SWITCH(0, "SWITCH", "SWITCH"),

	/**
	 * The '<em><b>TEMPERATURE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE_VALUE
	 * @generated
	 * @ordered
	 */
	TEMPERATURE(1, "TEMPERATURE", "TEMPERATURE"),

	/**
	 * The '<em><b>NUMBER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBER_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBER(2, "NUMBER", "NUMBER"),

	/**
	 * The '<em><b>CLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CLOCK(3, "CLOCK", "CLOCK"),

	/**
	 * The '<em><b>TWILIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWILIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	TWILIGHT(4, "TWILIGHT", "TWILIGHT"),

	/**
	 * The '<em><b>RAIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RAIN_VALUE
	 * @generated
	 * @ordered
	 */
	RAIN(5, "RAIN", "RAIN");

	/**
	 * The '<em><b>SWITCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SWITCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWITCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SWITCH_VALUE = 0;

	/**
	 * The '<em><b>TEMPERATURE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEMPERATURE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEMPERATURE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEMPERATURE_VALUE = 1;

	/**
	 * The '<em><b>NUMBER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUMBER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMBER_VALUE = 2;

	/**
	 * The '<em><b>CLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOCK_VALUE = 3;

	/**
	 * The '<em><b>TWILIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TWILIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWILIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWILIGHT_VALUE = 4;

	/**
	 * The '<em><b>RAIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RAIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RAIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RAIN_VALUE = 5;

	/**
	 * An array of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SensorType[] VALUES_ARRAY =
		new SensorType[] {
			SWITCH,
			TEMPERATURE,
			NUMBER,
			CLOCK,
			TWILIGHT,
			RAIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Sensor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SensorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SensorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sensor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SensorType get(int value) {
		switch (value) {
			case SWITCH_VALUE: return SWITCH;
			case TEMPERATURE_VALUE: return TEMPERATURE;
			case NUMBER_VALUE: return NUMBER;
			case CLOCK_VALUE: return CLOCK;
			case TWILIGHT_VALUE: return TWILIGHT;
			case RAIN_VALUE: return RAIN;
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
	private SensorType(int value, String name, String literal) {
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
	
} //SensorType
