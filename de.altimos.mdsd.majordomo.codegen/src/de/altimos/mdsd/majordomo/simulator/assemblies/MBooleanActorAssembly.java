package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComponent;

public class MBooleanActorAssembly extends MActorAssembly<Boolean> {

	private JCheckBox checkBox = new JCheckBox("Active");
	
	public MBooleanActorAssembly(String name) {
		super(name, false);
		
		checkBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				setInternalValue(checkBox.isSelected());
			}
		});
	}

	@Override
	protected void updateComponent() {
		checkBox.setSelected(getValue());
	}

	protected JComponent getActorComponent() {
		return checkBox;
	}

}
