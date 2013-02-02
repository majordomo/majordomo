package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MAssemblyContainer {

	private String name;
	private JPanel ui;

	private JPanel sensorPanel = new JPanel();
	private JPanel actorPanel = new JPanel();
	
	private MClockSensorAssembly clock;
	private MTemperatureSensorAssembly temp;
	
	private List<MBooleanActorAssembly> windows = new LinkedList<MBooleanActorAssembly>();
	private List<MBooleanActorAssembly> radiators = new LinkedList<>();
	
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
	
	@SuppressWarnings("rawtypes")
	public void installAssembly(MClockSensorAssembly clock) {
		this.clock = clock;
		installAssembly((MSensorAssembly) clock);
	}

	@SuppressWarnings("rawtypes")
	public void installAssembly(MTemperatureSensorAssembly temp) {
		this.temp = temp;
		installAssembly((MSensorAssembly) temp);
	}
	
	public void registerWindowAssembly(MBooleanActorAssembly window) {
		windows.add(window);
	}
	
	public void registerRadiatorAssembly(MBooleanActorAssembly radiator) {
		radiators.add(radiator);
	}
	
	public MTemperatureSensorAssembly getTemperatureAssembly() {
		return temp;
	}
	
	public void step(double outTemp) {
		if(clock != null) clock.step();
		if(temp != null) {
			if(outTemp > temp.readValue()) {
				for(MBooleanActorAssembly window : windows) {
					if(window.getValue()) temp.setValue(temp.readValue() + 0.06);
				}
			} else {
				if(!getName().equals("House")) temp.setValue(temp.readValue() - 0.01);
				
				for(MBooleanActorAssembly window : windows) {
					if(window.getValue()) temp.setValue(temp.readValue() - 0.14);
				}
			}
			
			for(MBooleanActorAssembly radiator : radiators) {
				if(radiator.getValue()) temp.setValue(temp.readValue() + 0.12);
			}
		}
	}
}
