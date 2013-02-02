package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MClockSensorAssembly extends MSensorAssembly<Double> {
	
	private JPanel panel = new JPanel();
	private SpinnerNumberModel hourModel = new SpinnerNumberModel(5, 0, 23, 1);
	private SpinnerNumberModel minModel = new SpinnerNumberModel(0, 0, 59, 1);
	
	public MClockSensorAssembly(String name) {
		super(name, 0.0);
		
		panel.setLayout(new GridLayout(1, 2));
		panel.add(new JSpinner(hourModel));
		panel.add(new JSpinner(minModel));

		hourModel.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				notifyAssemblyProcessors();
			}
		});
		
		minModel.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				notifyAssemblyProcessors();
			}
		});
	}

	@Override
	public Double readValue() {
		return hourModel.getNumber().doubleValue() + (minModel.getNumber().doubleValue() * 0.01);
	}
	
	protected JComponent getControllerComponent() {
		return panel;
	}

	public void step() {
		int mins = minModel.getNumber().intValue() + 5;
		if(mins > 59) {
			minModel.setValue(mins - 60);
			if(hourModel.getNumber().intValue() == 23) {
				hourModel.setValue(0);
			} else {
				hourModel.setValue(hourModel.getNumber().intValue() + 1);
			}
		} else {
			minModel.setValue(mins);
		}
	}
}
