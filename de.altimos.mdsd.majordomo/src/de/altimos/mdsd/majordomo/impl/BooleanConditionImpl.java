/**
 */
package de.altimos.mdsd.majordomo.impl;

import de.altimos.mdsd.majordomo.BooleanCondition;
import de.altimos.mdsd.majordomo.BooleanSensor;
import de.altimos.mdsd.majordomo.Comperator;
import de.altimos.mdsd.majordomo.MajordomoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.BooleanConditionImpl#getComperator <em>Comperator</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.BooleanConditionImpl#isValue <em>Value</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.BooleanConditionImpl#getSensor <em>Sensor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanConditionImpl extends EObjectImpl implements BooleanCondition {
	/**
	 * The default value of the '{@link #getComperator() <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComperator()
	 * @generated
	 * @ordered
	 */
	protected static final Comperator COMPERATOR_EDEFAULT = Comperator.EQUALS;

	/**
	 * The cached value of the '{@link #getComperator() <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComperator()
	 * @generated
	 * @ordered
	 */
	protected Comperator comperator = COMPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValue()
	 * @generated
	 * @ordered
	 */
	protected boolean value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected BooleanSensor sensor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MajordomoPackage.Literals.BOOLEAN_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comperator getComperator() {
		return comperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComperator(Comperator newComperator) {
		Comperator oldComperator = comperator;
		comperator = newComperator == null ? COMPERATOR_EDEFAULT : newComperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.BOOLEAN_CONDITION__COMPERATOR, oldComperator, comperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean newValue) {
		boolean oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.BOOLEAN_CONDITION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanSensor getSensor() {
		if (sensor != null && sensor.eIsProxy()) {
			InternalEObject oldSensor = (InternalEObject)sensor;
			sensor = (BooleanSensor)eResolveProxy(oldSensor);
			if (sensor != oldSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MajordomoPackage.BOOLEAN_CONDITION__SENSOR, oldSensor, sensor));
			}
		}
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanSensor basicGetSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(BooleanSensor newSensor) {
		BooleanSensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.BOOLEAN_CONDITION__SENSOR, oldSensor, sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MajordomoPackage.BOOLEAN_CONDITION__COMPERATOR:
				return getComperator();
			case MajordomoPackage.BOOLEAN_CONDITION__VALUE:
				return isValue();
			case MajordomoPackage.BOOLEAN_CONDITION__SENSOR:
				if (resolve) return getSensor();
				return basicGetSensor();
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
			case MajordomoPackage.BOOLEAN_CONDITION__COMPERATOR:
				setComperator((Comperator)newValue);
				return;
			case MajordomoPackage.BOOLEAN_CONDITION__VALUE:
				setValue((Boolean)newValue);
				return;
			case MajordomoPackage.BOOLEAN_CONDITION__SENSOR:
				setSensor((BooleanSensor)newValue);
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
			case MajordomoPackage.BOOLEAN_CONDITION__COMPERATOR:
				setComperator(COMPERATOR_EDEFAULT);
				return;
			case MajordomoPackage.BOOLEAN_CONDITION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MajordomoPackage.BOOLEAN_CONDITION__SENSOR:
				setSensor((BooleanSensor)null);
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
			case MajordomoPackage.BOOLEAN_CONDITION__COMPERATOR:
				return comperator != COMPERATOR_EDEFAULT;
			case MajordomoPackage.BOOLEAN_CONDITION__VALUE:
				return value != VALUE_EDEFAULT;
			case MajordomoPackage.BOOLEAN_CONDITION__SENSOR:
				return sensor != null;
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
		result.append(" (comperator: ");
		result.append(comperator);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //BooleanConditionImpl
