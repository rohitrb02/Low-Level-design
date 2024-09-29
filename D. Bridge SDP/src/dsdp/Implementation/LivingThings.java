package dsdp.Implementation;

import dsdp.Implementor.BreatheImplementor;

public abstract class LivingThings {
	
	BreatheImplementor breatheImplementor;
	
	public LivingThings(BreatheImplementor breatheImplementor) {
		this.breatheImplementor = breatheImplementor;
	}
	abstract public void breatheProcess();
}
