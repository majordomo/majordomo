package de.altimos.mdsd.majordomo.simulator.assemblies;

import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MFloatActorAssembly extends MActorAssembly<Double> {

	private SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0.0, 0.0, 1.0, 0.05);
	private JSpinner spinner = new JSpinner(spinnerModel);
	
	public MFloatActorAssembly(String name) {
		super(name);
		
		spinner.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				setInternalValue(spinnerModel.getNumber().doubleValue());
			}
		});
	}
	
	public SpinnerNumberModel getSpinnerModel() {
		return spinnerModel;
	}

	@Override
	protected void updateComponent() {
		spinnerModel.setValue(getValue());
	}

	protected JComponent buildActorComponent() {
		return spinner;
	}
}
