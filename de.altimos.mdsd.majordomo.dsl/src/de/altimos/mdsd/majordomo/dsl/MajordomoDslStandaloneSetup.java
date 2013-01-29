
package de.altimos.mdsd.majordomo.dsl;

import de.altimos.mdsd.majordomo.impl.MajordomoPackageImpl;
import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class MajordomoDslStandaloneSetup extends MajordomoDslStandaloneSetupGenerated{

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		MajordomoPackageImpl.init();
		return super.createInjectorAndDoEMFRegistration();
	}
	
	public static void doSetup() {
		new MajordomoDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

