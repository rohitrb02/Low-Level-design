package WithStrategyBDP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new GoodVehicle();
		vehicle.drive();
		
		Vehicle vehicle2 = new PassengerVehicle();
		vehicle2.drive();
	}

}
