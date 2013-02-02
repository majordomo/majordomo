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
	private MLightSensorAssembly light;
	private MRoofWindowActorAssembly window;
	private MRollerActorAssembly roller;
	private MRadiatorActorAssembly radiator;
	private MLampActorAssembly lamp;
	
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

	@SuppressWarnings("rawtypes")
	public void installAssembly(MLightSensorAssembly light) {
		this.light = light;
		installAssembly((MSensorAssembly) light);
	}
	
	@SuppressWarnings("rawtypes")
	public void installAssembly(MRoofWindowActorAssembly window) {
		this.window = window;
		installAssembly((MActorAssembly) window);
	}

	@SuppressWarnings("rawtypes")
	public void installAssembly(MRadiatorActorAssembly radiator) {
		this.radiator = radiator;
		installAssembly((MActorAssembly) radiator);
	}

	@SuppressWarnings("rawtypes")
	public void installAssembly(MRollerActorAssembly roller) {
		this.roller = roller;
		installAssembly((MActorAssembly) roller);
	}

	@SuppressWarnings("rawtypes")
	public void installAssembly(MLampActorAssembly lamp) {
		this.lamp = lamp;
		installAssembly((MActorAssembly) lamp);
	}
	
	public MTemperatureSensorAssembly getTemperatureAssembly() {
		return temp;
	}
	
	public MClockSensorAssembly getClockAssembly() {
		return clock;
	}
	
	public MLightSensorAssembly getLightAssembly() {
		return light;
	}
	
	public void step(double oTemp, double oLight, double oClock) {
		if(temp != null) {
			if(oTemp > temp.readValue()) {
				if(window != null) {
					if(window.getValue()) temp.setValue(temp.readValue() + 0.06);
				}
			} else {
				if(!getName().equals("House")) temp.setValue(temp.readValue() - 0.01);
				
				if(window != null) {
					if(window.getValue()) temp.setValue(temp.readValue() - 0.14);
				}
			}
			
			if(this.roller != null) {
				if(oLight > 0.5 && this.roller.getValue() == false) temp.setValue(temp.readValue() + 0.05);
			}
			
			if(this.light != null) {
				if(!getName().equals("House")) light.setValue(lamp == null ? 0.0 : lamp.getValue());
				if(this.roller != null && !this.roller.getValue())
					light.setValue(Math.min(1.0, light.readValue() + oLight*0.8));
			}
			
			if(radiator != null) {
				if(radiator.getValue()) temp.setValue(temp.readValue() + 0.12);
			}
		}
	}
}
