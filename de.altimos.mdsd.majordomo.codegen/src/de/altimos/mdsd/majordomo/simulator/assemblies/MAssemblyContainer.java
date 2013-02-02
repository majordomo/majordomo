package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MAssemblyContainer {

	private String name;
	private JPanel ui;

	private JPanel sensorPanel = new JPanel();
	private JPanel actorPanel = new JPanel();
	
	public MAssemblyContainer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public JPanel getUI() {
		if(ui == null) {
			ui = new JPanel();
			ui.setBorder(BorderFactory.createTitledBorder(getName()));
			ui.setLayout(new BorderLayout());
			ui.add(sensorPanel, BorderLayout.NORTH);
			ui.add(actorPanel, BorderLayout.SOUTH);
		}
		return ui;
	}
	
	public void installAssembly(@SuppressWarnings("rawtypes") MSensorAssembly assembly) {
		sensorPanel.add(assembly.getUI());
		sensorPanel.setLayout(new GridLayout(1, sensorPanel.getComponentCount()));
	}
	
	public void installAssembly(@SuppressWarnings("rawtypes") MActorAssembly assembly) {
		actorPanel.add(assembly.getUI());
		actorPanel.setLayout(new GridLayout(1, actorPanel.getComponentCount()));
	}
}
