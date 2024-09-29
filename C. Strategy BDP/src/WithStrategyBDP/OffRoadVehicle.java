package WithStrategyBDP;

public class OffRoadVehicle extends Vehicle{

	public OffRoadVehicle() {
		super(new SportStrategy());
	}
}
