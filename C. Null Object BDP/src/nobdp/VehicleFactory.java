package nobdp;

public class VehicleFactory {

	public static IVehicle getVehicleObject(String val) {
		if("Car".equals(val)) {
			return new Car();
		}	
		return new NullVehicle();
	}
}
