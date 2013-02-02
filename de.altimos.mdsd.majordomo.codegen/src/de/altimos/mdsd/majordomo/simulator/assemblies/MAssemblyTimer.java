package de.altimos.mdsd.majordomo.simulator.assemblies;

public class MAssemblyTimer implements Runnable {

	private Runnable runnable;
	private int ms;

	public MAssemblyTimer(Runnable runnable) {
		this.runnable = runnable;
		
		Thread t = new Thread(this);
		t.setDaemon(true);
		t.start();
	}
	
	public void invokeIn(int ms) {
		this.ms = ms;
	}

	@Override
	public void run() {
		while(true) {
			if(this.ms > 0) {
				this.ms -= 10;
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(this.ms);
				
				if(this.ms <= 0) {
					runnable.run();
				}
				
			} else {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
