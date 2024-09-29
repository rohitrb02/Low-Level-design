package lsp;

public class Bicycle implements Bike{

	@Override
	public void turnOnEngine() {
		// TODO Auto-generated method stub
		throw new AssertionError("there is no engine");
	}

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("accelerate");
	}

}
