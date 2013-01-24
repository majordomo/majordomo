/**
 */
package de.altimos.mdsd.majordomo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.altimos.mdsd.majordomo.Condition#getComperator <em>Comperator</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getCondition()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Comperator</b></em>' attribute.
	 * The literals are from the enumeration {@link de.altimos.mdsd.majordomo.Comperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comperator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comperator</em>' attribute.
	 * @see de.altimos.mdsd.majordomo.Comperator
	 * @see #setComperator(Comperator)
	 * @see de.altimos.mdsd.majordomo.MajordomoPackage#getCondition_Comperator()
	 * @model
	 * @generated
	 */
	Comperator getComperator();

	/**
	 * Sets the value of the '{@link de.altimos.mdsd.majordomo.Condition#getComperator <em>Comperator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comperator</em>' attribute.
	 * @see de.altimos.mdsd.majordomo.Comperator
	 * @see #getComperator()
	 * @generated
	 */
	void setComperator(Comperator value);

} // Condition
