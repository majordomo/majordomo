package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public abstract class MAbstractAssembly implements MAssembly {

	private String name;
	private JPanel ui;
	private TitledBorder border;

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
			
			border = BorderFactory.createTitledBorder(getName());
			ui.setBorder(border);
			
			ui.add(getAssemblyComponent());
		}
		return ui;
	}
	
	public void setHighlighted(boolean high) {
		if(high) {
			border.setTitleColor(Color.RED);
		} else {
			border.setTitleColor(Color.DARK_GRAY);
		}
		ui.repaint();
	}
	
	abstract protected JComponent getAssemblyComponent();

}
