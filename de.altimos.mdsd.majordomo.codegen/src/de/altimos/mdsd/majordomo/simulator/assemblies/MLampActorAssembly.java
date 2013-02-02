package de.altimos.mdsd.majordomo.simulator.assemblies;

public class MLampActorAssembly extends MFloatActorAssembly {

	public MLampActorAssembly(String name) {
		super(name);
		getSpinnerModel().setMaximum(1.0);
		getSpinnerModel().setMinimum(0.0);
		getSpinnerModel().setValue(0.0);
		getSpinnerModel().setStepSize(0.05);
	}

}
