// Provides an ability to revert an Object to previous state. i.e: UNDO capability.
// And It does not expose the object internal implementation.
// Also know as SnapShot design Pattern.
// 1.Originator(object)  2.Memento(holds the state of object)  3.CareTaker(list of state)

// ex: Imagine a text editor where users can type text, and you want to implement undo functionality using the Memento Pattern.

package mebsp;

public class Main {
	public static void main(String args []) {
		
		ConfigurationCareTaker careTakerObj = new ConfigurationCareTaker();
		
		//Initial state of the Originator
		ConfigurationOriginator  OriginatorObj = new ConfigurationOriginator(5,10);
		
		//Save it
		ConfigurationMemento snapshot1 = OriginatorObj.createMemento();
		
		//add it to the history
		careTakerObj.addMemento(snapshot1);
		
		//Originator  changing to new state
		OriginatorObj.setHeight(6);
		OriginatorObj.setWidth(12);
		
		//Save it
		ConfigurationMemento snapshot2 = OriginatorObj.createMemento();
		
		//add it to the history
		careTakerObj.addMemento(snapshot2);
		
		
		OriginatorObj.setHeight(7);
		OriginatorObj.setWidth(14);
		
		//UNDO
		ConfigurationMemento restoreStateMementoObj =  careTakerObj.undo();
		OriginatorObj.restoreMemento(restoreStateMementoObj);
		
		System.out.println("Height: " + OriginatorObj.height  + ", Width: " + OriginatorObj.width);

	}
}

//--------------------------------------------------------- WHEN TO USE MEMENTO DESIGN PATTERN ---------------------------------------------------------

// Use the Memento Pattern when you need to capture and restore an object's state without exposing its internal structure, 
// such as in undo/redo functionality, state restoration, and managing temporary changes. 
// This pattern helps maintain encapsulation and provides a straightforward way to revert to previous states.