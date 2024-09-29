package WithStrategyBDP;

public class GoodVehicle extends Vehicle{

	public GoodVehicle() {
		super(new SportStrategy());
	}
}
