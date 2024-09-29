// It decoupled an abstraction from its implementation so that the two can vary independtly.

// Similar to Strategy DP
package dsdp;

import dsdp.Implementation.*;
import dsdp.Implementor.*;

public class Main {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		LivingThings livingThingsobj1 = new Dog(new LandBreatheImplementor());
		livingThingsobj1.breatheProcess();
		
		LivingThings livingThingsobj2 = new Fish(new WaterBreatheImplementor());
		livingThingsobj2.breatheProcess();
		
		
		LivingThings livingThingsobj3 = new Tree(new TreeBreatheImplementor());
		livingThingsobj3.breatheProcess();
	}

}

//--------------------------------------------------------- WHEN TO USE BRIDGE DESIGN PATTERN ---------------------------------------------------------

//The Bridge Design Pattern is a structural design pattern used to decouple an abstraction from its implementation so that the two can vary independently. 
//This pattern is particularly useful when you want to avoid a permanent binding between an abstraction and its implementation. 
//Here are scenarios when you should consider using the Bridge Design Pattern:
//	1. Decoupling Abstraction from Implementation
//	2. Avoiding Class Explosion
//	3. Supporting Platform Independence
//	4. Changing Implementations at Runtime
//	5. Working with Diverse and Complex Objects
//	6. Need for Extensibility
//	7. Reducing Complexity of Code Maintenance
//	8. Supporting Parallel Hierarchies


//---------------------------------------------------------Strategy DP vs Bridge DP ---------------------------------------------------------

//Strategy Pattern is about choosing an algorithm at runtime and swapping it in and out easily.
//Bridge Pattern is about separating an abstraction from its implementation to allow them to be developed independently.
//Use Strategy when you need different variations of an algorithm or behavior, and Bridge when you want to separate and independently vary both abstraction and implementation in a complex system.
	