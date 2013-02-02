package de.altimos.mdsd.majordomo.simulator;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import de.altimos.mdsd.majordomo.simulator.assemblies.MAssemblyContainer;

public class MajordomoSimulator extends JFrame {

	private static final long serialVersionUID = -3121504439011367966L;
	
	private HashMap<Long, MAssemblyContainer> panels = new HashMap<Long, MAssemblyContainer>();
	private List<MAssemblyContainer> panelList = new LinkedList<MAssemblyContainer>();
	private MConfiguration config;
	
	public static void main(String[] args) {
		new MajordomoSimulator().setVisible(true);
	}

	public MajordomoSimulator() {
		config = new MConfiguration();
		config.buildAssemblies(this);
		
		setLayout(new GridLayout((int)Math.floor((panels.size() / 2) + 1), 2));
		for(MAssemblyContainer panel : panelList) {
			add(panel.getUI());
		}
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Majordomo Simulator");
		setPreferredSize(new Dimension(1000, (int)Math.floor((panels.size() / 2) + 1) * 130));
		pack();
		
		config.buildAssemblyProcessors();
		config.setupAssemblies();
		config.initAssemblies();
	}
	
	public MAssemblyContainer createAssemblyContainer(long id, String name) {
		if(!panels.containsKey(id)) {
			MAssemblyContainer panel = new MAssemblyContainer(name);
			panels.put(id, panel);
			panelList.add(panel);
		}
		return panels.get(id);
	}
}
