package WithStrategyBDP;

public class PassengerVehicle extends Vehicle{

	public PassengerVehicle() {
		super(new NormalStrategy());
	}
}
