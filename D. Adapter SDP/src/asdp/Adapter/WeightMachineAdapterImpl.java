package asdp.Adapter;

import asdp.Adaptee.*;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

	WeightMachine weightMachine;
	
	public WeightMachineAdapterImpl(WeightMachine weightMachine) {
		this.weightMachine = weightMachine;
	}
	@Override
	public double getWeightInKg() {
		// TODO Auto-generated method stub
		double weightInPound = weightMachine.getWeightInPound();
		double weightInKg = weightInPound * .45;
		
		return weightInKg;
	}

}
