package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.awt.Color;

import javax.swing.JComponent;

public abstract class MActorAssembly<T> extends MAbstractAssembly {
	
	private T value;
	private MAssemblyTimer timer;
	
	public MActorAssembly(String name, T value) {
		super(name);
		this.value = value;
		
		timer = new MAssemblyTimer(new Runnable() {
			
			@Override
			public void run() {
				setHighlighted(false);
			}
		});
	}
	
	public void setValue(T value) {
		if(this.getValue() != value) {
			setInternalValue(value);
			updateComponent();
			setHighlighted(true);
			timer.invokeIn(2000);
		}
	}
	
	public T getValue() {
		return value;
	}
	
	abstract protected void updateComponent();

	protected Color getHighlightColor() {
		return Color.RED;
	}
	
	protected Color getDefaultColor() {
		return getActorComponent().getBackground();
	}
	
	protected void setInternalValue(T value) {
		this.value = value;
	}
	
	protected JComponent getAssemblyComponent() {
		return getActorComponent();
	}
	
	abstract protected JComponent getActorComponent();
}
