/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.Sensor#getLabel <em>Label</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Sensor#getMountable <em>Mountable</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Sensor#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getSensor_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Sensor#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Mountable</b></em>' attribute.
	 * The literals are from the enumeration {@link de.altimos.mdsd.majordomo.MountPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mountable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mountable</em>' attribute.
	 * @see de.altimos.mdsd.majordomo.MountPoint
	 * @see #setMountable(MountPoint)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getSensor_Mountable()
	 * @model
	 * @generated
	 */
	MountPoint getMountable();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Sensor#getMountable <em>Mountable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mountable</em>' attribute.
	 * @see de.altimos.mdsd.majordomo.MountPoint
	 * @see #getMountable()
	 * @generated
	 */
	void setMountable(MountPoint value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.altimos.mdsd.majordomo.SensorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.altimos.mdsd.majordomo.SensorType
	 * @see #setType(SensorType)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getSensor_Type()
	 * @model
	 * @generated
	 */
	SensorType getType();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Sensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.altimos.mdsd.majordomo.SensorType
	 * @see #getType()
	 * @generated
	 */
	void setType(SensorType value);

} // Sensor
