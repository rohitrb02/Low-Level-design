package WithStrategyBDP;

public class Vehicle {
	IDriveStrategy driveStrategy;
	
	public Vehicle(IDriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}
}
