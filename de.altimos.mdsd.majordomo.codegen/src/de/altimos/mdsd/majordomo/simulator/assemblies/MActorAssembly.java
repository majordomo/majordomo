package de.altimos.mdsd.majordomo.simulator.assemblies;

import javax.swing.JComponent;
import javax.swing.JTextField;

public abstract class MActorAssembly<T> extends MAbstractAssembly {
	
	private T value;
	
	public MActorAssembly(String name) {
		super(name);
	}
	
	public void setValue(T value) {
		if(this.getValue() != value) {
			setInternalValue(value);
			updateComponent();
		}
	}
	
	public T getValue() {
		return value;
	}
	
	abstract protected void updateComponent();
	
	protected void setInternalValue(T value) {
		this.value = value;
	}
	
	protected JComponent buildAssemblyComponent() {
		return buildActorComponent();
	}
	
	protected JComponent buildActorComponent() {
		return new JTextField(this.getClass().getSimpleName());
	}
}
