/**
 */
package de.altimos.mdsd.majordomo.impl;

import de.altimos.mdsd.majordomo.Actor;
import de.altimos.mdsd.majordomo.BooleanActor;
import de.altimos.mdsd.majordomo.Extendable;
import de.altimos.mdsd.majordomo.Extension;
import de.altimos.mdsd.majordomo.MajordomoPackage;
import de.altimos.mdsd.majordomo.RoofWindowActor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Roof Window Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.RoofWindowActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.RoofWindowActorImpl#getCtx <em>Ctx</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.impl.RoofWindowActorImpl#getEReference0 <em>EReference0</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoofWindowActorImpl extends EObjectImpl implements RoofWindowActor {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEReference0() <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference0()
	 * @generated
	 * @ordered
	 */
	protected Actor eReference0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoofWindowActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MajordomoPackage.Literals.ROOF_WINDOW_ACTOR;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.ROOF_WINDOW_ACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extendable getCtx() {
		if (eContainerFeatureID() != MajordomoPackage.ROOF_WINDOW_ACTOR__CTX) return null;
		return (Extendable)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCtx(Extendable newCtx, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCtx, MajordomoPackage.ROOF_WINDOW_ACTOR__CTX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCtx(Extendable newCtx) {
		if (newCtx != eInternalContainer() || (eContainerFeatureID() != MajordomoPackage.ROOF_WINDOW_ACTOR__CTX && newCtx != null)) {
			if (EcoreUtil.isAncestor(this, newCtx))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCtx != null)
				msgs = ((InternalEObject)newCtx).eInverseAdd(this, MajordomoPackage.EXTENDABLE__ACTORS, Extendable.class, msgs);
			msgs = basicSetCtx(newCtx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.ROOF_WINDOW_ACTOR__CTX, newCtx, newCtx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getEReference0() {
		if (eReference0 != null && eReference0.eIsProxy()) {
			InternalEObject oldEReference0 = (InternalEObject)eReference0;
			eReference0 = (Actor)eResolveProxy(oldEReference0);
			if (eReference0 != oldEReference0) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MajordomoPackage.ROOF_WINDOW_ACTOR__EREFERENCE0, oldEReference0, eReference0));
			}
		}
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetEReference0() {
		return eReference0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference0(Actor newEReference0) {
		Actor oldEReference0 = eReference0;
		eReference0 = newEReference0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MajordomoPackage.ROOF_WINDOW_ACTOR__EREFERENCE0, oldEReference0, eReference0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(boolean value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MajordomoPackage.ROOF_WINDOW_ACTOR__CTX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCtx((Extendable)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MajordomoPackage.ROOF_WINDOW_ACTOR__CTX:
				return basicSetCtx(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MajordomoPackage.ROOF_WINDOW_ACTOR__CTX:
				return eInternalContainer().eInverseRemove(this, MajordomoPackage.EXTENDABLE__ACTORS, Extendable.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MajordomoPackage.ROOF_WINDOW_ACTOR__NAME:
				return getName();
			case MajordomoPackage.ROOF_WINDOW_ACTOR__CTX:
				return getCtx();
			case MajordomoPackage.ROOF_WINDOW_ACTOR__EREFERENCE0:
				if (resolve) return getEReference0();
				return basicGetEReference0();
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
			case MajordomoPackage.ROOF_WINDOW_ACTOR__NAME:
				setName((String)newValue);
				return;
			case MajordomoPackage.ROOF_WINDOW_ACTOR__CTX:
				setCtx((Extendable)newValue);
				return;
			case MajordomoPackage.ROOF_WINDOW_ACTOR__EREFERENCE0:
				setEReference0((Actor)newValue);
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
			case MajordomoPackage.ROOF_WINDOW_ACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MajordomoPackage.ROOF_WINDOW_ACTOR__CTX:
				setCtx((Extendable)null);
				return;
			case MajordomoPackage.ROOF_WINDOW_ACTOR__EREFERENCE0:
				setEReference0((Actor)null);
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
			case MajordomoPackage.ROOF_WINDOW_ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MajordomoPackage.ROOF_WINDOW_ACTOR__CTX:
				return getCtx() != null;
			case MajordomoPackage.ROOF_WINDOW_ACTOR__EREFERENCE0:
				return eReference0 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Extension.class) {
			switch (derivedFeatureID) {
				case MajordomoPackage.ROOF_WINDOW_ACTOR__NAME: return MajordomoPackage.EXTENSION__NAME;
				default: return -1;
			}
		}
		if (baseClass == Actor.class) {
			switch (derivedFeatureID) {
				case MajordomoPackage.ROOF_WINDOW_ACTOR__CTX: return MajordomoPackage.ACTOR__CTX;
				default: return -1;
			}
		}
		if (baseClass == BooleanActor.class) {
			switch (derivedFeatureID) {
				case MajordomoPackage.ROOF_WINDOW_ACTOR__EREFERENCE0: return MajordomoPackage.BOOLEAN_ACTOR__EREFERENCE0;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Extension.class) {
			switch (baseFeatureID) {
				case MajordomoPackage.EXTENSION__NAME: return MajordomoPackage.ROOF_WINDOW_ACTOR__NAME;
				default: return -1;
			}
		}
		if (baseClass == Actor.class) {
			switch (baseFeatureID) {
				case MajordomoPackage.ACTOR__CTX: return MajordomoPackage.ROOF_WINDOW_ACTOR__CTX;
				default: return -1;
			}
		}
		if (baseClass == BooleanActor.class) {
			switch (baseFeatureID) {
				case MajordomoPackage.BOOLEAN_ACTOR__EREFERENCE0: return MajordomoPackage.ROOF_WINDOW_ACTOR__EREFERENCE0;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoofWindowActorImpl
