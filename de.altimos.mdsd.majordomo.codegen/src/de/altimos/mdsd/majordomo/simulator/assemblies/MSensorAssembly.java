package de.altimos.mdsd.majordomo.simulator.assemblies;

import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JComponent;

public abstract class MSensorAssembly<T> extends MAbstractAssembly {
	
	private List<WeakReference<MAssemblyProcessor>> registeredProcessors = 
			new LinkedList<WeakReference<MAssemblyProcessor>>();
	
	private T value;
	
	public MSensorAssembly(String name, T defaultValue) {
		super(name);
		this.value = defaultValue;
	}
	
	public void registerAssemblyProcessor(MAssemblyProcessor mAssemblyProcessor) {
		registeredProcessors.add(new WeakReference<MAssemblyProcessor>(mAssemblyProcessor));
	}
	
	public T readValue() {
		return value;
	}
	
	protected void setValue(T value) {
		this.value = value;
	}
	
	protected void notifyAssemblyProcessors() {
		MAssemblyProcessor assemblyProcessor;
		for(WeakReference<MAssemblyProcessor> assemblyProcessorReference : registeredProcessors) {
			if((assemblyProcessor = assemblyProcessorReference.get()) != null) {
				assemblyProcessor.invoke();
			} else {
				registeredProcessors.remove(assemblyProcessorReference);
			}
		}
	}
	
	protected JComponent getAssemblyComponent() {
		return getControllerComponent();
	}
	
	abstract protected JComponent getControllerComponent();
}
