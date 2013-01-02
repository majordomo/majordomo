/**
 */
package de.altimos.mdsd.majordomo.impl;

import de.altimos.mdsd.majordomo.CompareOperator;
import de.altimos.mdsd.majordomo.Condition;
import de.altimos.mdsd.majordomo.MajordomoPackage;
import de.altimos.mdsd.majordomo.Sensor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.ConditionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.ConditionImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.ConditionImpl#getComperator <em>Comperator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends EObjectImpl implements Condition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Sensor source;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComperator() <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComperator()
	 * @generated
	 * @ordered
	 */
	protected static final CompareOperator COMPERATOR_EDEFAULT = CompareOperator.LESS;

	/**
	 * The cached value of the '{@link #getComperator() <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComperator()
	 * @generated
	 * @ordered
	 */
	protected CompareOperator comperator = COMPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MajordomoPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Sensor)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MajordomoPackage.CONDITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Sensor newSource) {
		Sensor oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.CONDITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.CONDITION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompareOperator getComperator() {
		return comperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComperator(CompareOperator newComperator) {
		CompareOperator oldComperator = comperator;
		comperator = newComperator == null ? COMPERATOR_EDEFAULT : newComperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.CONDITION__COMPERATOR, oldComperator, comperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MajordomoPackage.CONDITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case MajordomoPackage.CONDITION__VALUE:
				return getValue();
			case MajordomoPackage.CONDITION__COMPERATOR:
				return getComperator();
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
			case MajordomoPackage.CONDITION__SOURCE:
				setSource((Sensor)newValue);
				return;
			case MajordomoPackage.CONDITION__VALUE:
				setValue(newValue);
				return;
			case MajordomoPackage.CONDITION__COMPERATOR:
				setComperator((CompareOperator)newValue);
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
			case MajordomoPackage.CONDITION__SOURCE:
				setSource((Sensor)null);
				return;
			case MajordomoPackage.CONDITION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case MajordomoPackage.CONDITION__COMPERATOR:
				setComperator(COMPERATOR_EDEFAULT);
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
			case MajordomoPackage.CONDITION__SOURCE:
				return source != null;
			case MajordomoPackage.CONDITION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case MajordomoPackage.CONDITION__COMPERATOR:
				return comperator != COMPERATOR_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", comperator: ");
		result.append(comperator);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
