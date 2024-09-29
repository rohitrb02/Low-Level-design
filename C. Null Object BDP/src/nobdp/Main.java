//The Null Object Pattern is a design pattern that provides a default, do-nothing implementation of an interface. 
//Instead of using null to indicate the absence of an object, a null object is used, which conforms to the expected interface but performs no operations or returns default values. 
//This pattern helps avoid null checks and NullPointerException errors, leading to cleaner and more maintainable code.
package nobdp;
public class Main {
	public static void main(String args []) {
		IVehicle vehicle = VehicleFactory.getVehicleObject("Car");
		System.out.println(vehicle.getSeatCapicity());
		System.out.println(vehicle.getTankCapicity());
	}
}
