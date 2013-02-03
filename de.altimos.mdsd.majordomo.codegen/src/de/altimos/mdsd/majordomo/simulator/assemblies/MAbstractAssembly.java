package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public abstract class MAbstractAssembly implements MAssembly {

	private String name;
	private JPanel ui;
	private TitledBorder border;
	private URL icon;

	public MAbstractAssembly(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setIcon(URL icon) {
		this.icon = icon;
	}
	
	public JPanel getUI() {
		if(ui == null) {
			ui = new JPanel();
			ui.setLayout(new GridLayout(1, 1));
			
			if(icon == null) icon = ClassLoader.getSystemResource("icons/Action.gif");
			border = new IcononicTitledBorder(getName(), 
					new ImageIcon(icon).getImage());
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

	static public class IcononicTitledBorder extends TitledBorder {

		private static final long serialVersionUID = 798207293937530606L;
		private Image img;

		public IcononicTitledBorder(String title, Image img) {
			super("    " + title);
			this.img = img;
		}
		
		@Override
		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) 
		{
			super.paintBorder(c, g, x, y, width, height);
			
			g.drawImage(img, 7, -1, img.getWidth(null), img.getHeight(null), null);
		}
	}
}
