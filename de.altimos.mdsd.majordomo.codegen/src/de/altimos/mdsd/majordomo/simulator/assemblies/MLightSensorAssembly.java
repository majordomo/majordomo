package de.altimos.mdsd.majordomo.simulator.assemblies;

public class MLightSensorAssembly extends MFloatSensorAssembly {

	public MLightSensorAssembly(String name) {
		super(name);
		getSpinnerModel().setMaximum(1.0);
		getSpinnerModel().setMinimum(0.0);
		getSpinnerModel().setStepSize(0.05);
		getSpinnerModel().setValue(0.0);
	}

	public void setValue(Double value) {
		super.setValue(value);
		getSpinnerModel().setValue(value);
	}
}
