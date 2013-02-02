package de.altimos.mdsd.majordomo.simulator.assemblies;

public class MLightSensorAssembly extends MFloatSensorAssembly {

	public MLightSensorAssembly(String name) {
		super(name);
		getSpinnerModel().setMaximum(1);
		getSpinnerModel().setMinimum(0);
		getSpinnerModel().setStepSize(0.05);
		getSpinnerModel().setValue(0.5);
	}

}