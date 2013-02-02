package de.altimos.mdsd.majordomo.simulator.assemblies;

public class MTemperatureSensorAssembly extends MFloatSensorAssembly {

	public MTemperatureSensorAssembly(String name) {
		super(name);
		
		getSpinnerModel().setMinimum(-20.0);
		getSpinnerModel().setMaximum(80.0);
		getSpinnerModel().setStepSize(1.0);
		getSpinnerModel().setValue(10.0);
	}

	public void setValue(Double value) {
		super.setValue(value);
		getSpinnerModel().setValue(value);
	}
}
