package fdp;

public class ShapeInstanceFactory {

	public IShape getShapeInstance(String val) {
		if(val == "Square") {
			return new Square();
		}
		else if(val == "Circle") {
			return new Circle();
		}
		else
			return null;
	}
}
