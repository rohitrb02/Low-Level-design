// It is used when all the object creation and its business logic we need to keep at one place.
// The Factory pattern defines an interface or abstract class for creating an object, but lets subclasses alter the type of objects that will be created. 
// It helps in creating objects without specifying the exact class of object that will be created.

// ex: the ShapeFactory class centralizes the creation of shape objects. 
// Clients use the factory to create shapes without knowing the exact class being instantiated, promoting flexibility and encapsulation.
package fdp;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeInstanceFactory shapeInstanceFactoty = new ShapeInstanceFactory(); 
		
		IShape circleObj = shapeInstanceFactoty.getShapeInstance("Circle");
		circleObj.computeArea();
		
		IShape squareObj = shapeInstanceFactoty.getShapeInstance("Square");
		squareObj.computeArea();
		
//		IShape nullObj = shapeInstanceFactoty.getShapeInstance("Test");
//		nullObj.computeArea();
	}

}


//--------------------------------------------------------- WHEN TO USE Factory DESIGN PATTERN ---------------------------------------------------------
