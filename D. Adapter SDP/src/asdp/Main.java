//The Adapter Design Pattern is a structural pattern that allows objects with incompatible interfaces to work together. 
//The adapter acts as a bridge between two different interfaces, enabling them to communicate without altering their original implementation.

package asdp;

import asdp.Adaptee.*;
import asdp.Adapter.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
		System.out.println(weightMachineAdapter.getWeightInKg() + " KG");
	}

}


//--------------------------------------------------------- WHEN TO USE ADAPTER DESIGN PATTERN ---------------------------------------------------------

//The Adapter Design Pattern is particularly useful in scenarios where you need to integrate or interact with systems, classes, or components that have incompatible interfaces. 
//Here are some common situations when you should consider using the Adapter Pattern.
//1. Incompatible Interfaces
//2. Reusing Existing Classes
//3. Working with Legacy Code
//4. Interface Conversion
//5. Simplifying Client Interaction
//6. Decoupling Systems
//7. Bridging New and Old Components
//8. Multiple Implementations