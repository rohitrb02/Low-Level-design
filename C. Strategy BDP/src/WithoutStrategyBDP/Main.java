package WithoutStrategyBDP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassengerVehicle passengerVehicle =  new PassengerVehicle();
		passengerVehicle.drive();
		
		SportVehicle sportVehicle = new SportVehicle();
		sportVehicle.drive();
		
		GoodVehicle goodVehicle = new GoodVehicle();
		goodVehicle.drive();
	}

}
