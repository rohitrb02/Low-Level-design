package dsdp.Implementation;

import dsdp.Implementor.BreatheImplementor;

public class Dog extends LivingThings{

	public Dog(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void breatheProcess() {
		// TODO Auto-generated method stub
		breatheImplementor.breathe();
	}

}
