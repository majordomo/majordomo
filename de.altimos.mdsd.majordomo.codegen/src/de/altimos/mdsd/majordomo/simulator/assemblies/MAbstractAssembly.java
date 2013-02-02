package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;

public abstract class MAbstractAssembly implements MAssembly {

	private String name;
	private JPanel ui;

	public MAbstractAssembly(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public JPanel getUI() {
		if(ui == null) {
			ui = new JPanel();
			ui.setLayout(new GridLayout(1, 1));
			ui.setBorder(BorderFactory.createTitledBorder(getName()));
			ui.add(buildAssemblyComponent());
		}
		return ui;
	}
	
	abstract protected JComponent buildAssemblyComponent();

}
