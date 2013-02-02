package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MNumberSensorAssembly extends MSensorAssembly<Double> {
	
	private JPanel panel = new JPanel();
	private JButton button = new JButton(">");
	private SpinnerNumberModel model = new SpinnerNumberModel(0, -20, 100, 1);
	
	public MNumberSensorAssembly(String name) {
		super(name, 0.0);
		
		panel.setLayout(new BorderLayout());
		panel.add(new JSpinner(model));
		panel.add(button, BorderLayout.EAST);
		
		button.setToolTipText("ENTER");

		button.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				notifyAssemblyProcessors();
			}
		});
	}

	@Override
	public Double readValue() {
		return model.getNumber().doubleValue();
	}
	
	protected JComponent getControllerComponent() {
		return panel;
	}

}
