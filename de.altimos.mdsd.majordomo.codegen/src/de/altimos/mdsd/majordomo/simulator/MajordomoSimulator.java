package de.altimos.mdsd.majordomo.simulator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;

import de.altimos.mdsd.majordomo.simulator.assemblies.MAssemblyContainer;
import de.altimos.mdsd.majordomo.simulator.assemblies.MTemperatureSensorAssembly;

public class MajordomoSimulator extends JFrame {

	private static final long serialVersionUID = -3121504439011367966L;
	
	private HashMap<Long, MAssemblyContainer> containers = new HashMap<Long, MAssemblyContainer>();
	private List<MAssemblyContainer> containerList = new LinkedList<MAssemblyContainer>();
	private MConfiguration config;
	
	private Simulation sim;
	private JToolBar toolbar = new JToolBar();
	JToggleButton button = new JToggleButton("Run Simulation");
	
	public static void main(String[] args) {
		new MajordomoSimulator().setVisible(true);
	}

	public MajordomoSimulator() {
		config = new MConfiguration();
		config.buildAssemblies(this);
		
		toolbar.add(button);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sim.running = button.isSelected();
			}
		});
		
		setLayout(new BorderLayout());
		add(toolbar, BorderLayout.NORTH);
		
		JPanel p = new JPanel();
		
		p.setLayout(new GridLayout((int)Math.floor((containerList.size() / 2) + 1), 2));
		for(MAssemblyContainer panel : containerList) {
			p.add(panel.getUI());
		}
		
		add(p);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Majordomo Simulator");
		setPreferredSize(new Dimension(1000, (int)Math.floor((containerList.size() / 2) + 1) * 150));
		pack();
		
		config.buildAssemblyProcessors();
		config.setupAssemblies();
		config.initAssemblies();
		
		sim = new Simulation();
		Thread t = new Thread(sim);
		t.setDaemon(true);
		t.start();
	}
	
	public MAssemblyContainer createAssemblyContainer(long id, String name) {
		if(!containers.containsKey(id)) {
			MAssemblyContainer panel = new MAssemblyContainer(name);
			containers.put(id, panel);
			containerList.add(panel);
		}
		return containers.get(id);
	}
	
	private class Simulation implements Runnable {
		
		public boolean running = false;
		private MTemperatureSensorAssembly outTemp;
		
		public Simulation() {
			MAssemblyContainer c = containers.get(0l);
			if(c != null) {
				outTemp = c.getTemperatureAssembly();
			} else {
				System.err.println("Cannot find global TemperatureSensorAssembly.");
			}
		}

		public void step() {
			for(MAssemblyContainer container : containerList) {
				container.step(outTemp == null ? 18.0 : outTemp.readValue());
			}
		}
		
		@Override
		public void run() {
			while(true) {
				if(running) {
					step();
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
