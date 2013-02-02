package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComponent;

public class MBooleanSensorAssembly extends MSensorAssembly<Boolean> {

	private JCheckBox checkBox = new JCheckBox("Active");
	
	public MBooleanSensorAssembly(String name) {
		super(name, false);
		
		checkBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				setValue(checkBox.isSelected());
				notifyAssemblyProcessors();
			}
		});
	}
	
	protected JComponent getControllerComponent() {
		return checkBox;
	}

}
