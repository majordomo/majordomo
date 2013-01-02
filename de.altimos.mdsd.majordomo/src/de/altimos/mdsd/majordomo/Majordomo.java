/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Majordomo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.Majordomo#getHouse <em>House</em>}</li>
 *   <li>{@link de.altimos.mdsd.majordomo.Majordomo#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getMajordomo()
 * @model
 * @generated
 */
public interface Majordomo extends EObject {
	/**
	 * Returns the value of the '<em><b>House</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' containment reference.
	 * @see #setHouse(House)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getMajordomo_House()
	 * @model containment="true"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Majordomo#getHouse <em>House</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' containment reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link de.altimos.mdsd.majordomo.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getMajordomo_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Majordomo
