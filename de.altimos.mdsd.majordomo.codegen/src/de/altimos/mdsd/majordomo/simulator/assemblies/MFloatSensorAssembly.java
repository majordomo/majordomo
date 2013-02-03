package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.text.DecimalFormat;

import javax.swing.JComponent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MFloatSensorAssembly extends MSensorAssembly<Double> {

	private SpinnerNumberModel spinnerModel = new SpinnerNumberModel(0.0, 0.0, 1.0, 0.05);
	private JSpinner spinner = new JSpinner(spinnerModel);
	
	public MFloatSensorAssembly(String name) {
		super(name, 0.0);

        JSpinner.NumberEditor editor = (JSpinner.NumberEditor)spinner.getEditor();
		DecimalFormat format = editor.getFormat();
        format.setMinimumFractionDigits(2);
        
        getSpinnerModel().setValue(0.0);
		
		getSpinnerModel().addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				setValue(getSpinnerModel().getNumber().doubleValue());
				notifyAssemblyProcessors();
			}
		});
	}
	
	public SpinnerNumberModel getSpinnerModel() {
		return spinnerModel;
	}
	
	protected JComponent getControllerComponent() {
		return spinner;
	}
}
