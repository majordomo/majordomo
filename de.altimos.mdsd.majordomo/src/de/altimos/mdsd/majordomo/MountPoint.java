/**
 */
package de.altimos.mdsd.majordomo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mount Point</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getMountPoint()
 * @model
 * @generated
 */
public enum MountPoint implements Enumerator {
	/**
	 * The '<em><b>HOUSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUSE_VALUE
	 * @generated
	 * @ordered
	 */
	HOUSE(0, "HOUSE", "HOUSE"),

	/**
	 * The '<em><b>ROOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	ROOM(1, "ROOM", "ROOM"),

	/**
	 * The '<em><b>BOTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH(2, "BOTH", "BOTH");

	/**
	 * The '<em><b>HOUSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOUSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOUSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOUSE_VALUE = 0;

	/**
	 * The '<em><b>ROOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROOM_VALUE = 1;

	/**
	 * The '<em><b>BOTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_VALUE = 2;

	/**
	 * An array of all the '<em><b>Mount Point</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MountPoint[] VALUES_ARRAY =
		new MountPoint[] {
			HOUSE,
			ROOM,
			BOTH,
		};

	/**
	 * A public read-only list of all the '<em><b>Mount Point</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MountPoint> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mount Point</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MountPoint get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MountPoint result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mount Point</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MountPoint getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MountPoint result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mount Point</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MountPoint get(int value) {
		switch (value) {
			case HOUSE_VALUE: return HOUSE;
			case ROOM_VALUE: return ROOM;
			case BOTH_VALUE: return BOTH;
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
	private MountPoint(int value, String name, String literal) {
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
	
} //MountPoint
