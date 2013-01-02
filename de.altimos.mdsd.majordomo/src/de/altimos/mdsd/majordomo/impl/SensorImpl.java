/**
 */
package de.altimos.mdsd.majordomo.impl;

import de.altimos.mdsd.majordomo.MajordomoPackage;
import de.altimos.mdsd.majordomo.MountPoint;
import de.altimos.mdsd.majordomo.Sensor;
import de.altimos.mdsd.majordomo.SensorType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.SensorImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.SensorImpl#getMountable <em>Mountable</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.SensorImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends EObjectImpl implements Sensor {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMountable() <em>Mountable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountable()
	 * @generated
	 * @ordered
	 */
	protected static final MountPoint MOUNTABLE_EDEFAULT = MountPoint.HOUSE;

	/**
	 * The cached value of the '{@link #getMountable() <em>Mountable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMountable()
	 * @generated
	 * @ordered
	 */
	protected MountPoint mountable = MOUNTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SensorType TYPE_EDEFAULT = SensorType.SWITCH;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SensorType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MajordomoPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.SENSOR__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MountPoint getMountable() {
		return mountable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMountable(MountPoint newMountable) {
		MountPoint oldMountable = mountable;
		mountable = newMountable == null ? MOUNTABLE_EDEFAULT : newMountable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.SENSOR__MOUNTABLE, oldMountable, mountable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SensorType newType) {
		SensorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.SENSOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MajordomoPackage.SENSOR__LABEL:
				return getLabel();
			case MajordomoPackage.SENSOR__MOUNTABLE:
				return getMountable();
			case MajordomoPackage.SENSOR__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MajordomoPackage.SENSOR__LABEL:
				setLabel((String)newValue);
				return;
			case MajordomoPackage.SENSOR__MOUNTABLE:
				setMountable((MountPoint)newValue);
				return;
			case MajordomoPackage.SENSOR__TYPE:
				setType((SensorType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MajordomoPackage.SENSOR__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case MajordomoPackage.SENSOR__MOUNTABLE:
				setMountable(MOUNTABLE_EDEFAULT);
				return;
			case MajordomoPackage.SENSOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MajordomoPackage.SENSOR__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case MajordomoPackage.SENSOR__MOUNTABLE:
				return mountable != MOUNTABLE_EDEFAULT;
			case MajordomoPackage.SENSOR__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", mountable: ");
		result.append(mountable);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
