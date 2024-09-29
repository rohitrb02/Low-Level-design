package Cbdp;

public class TurnOffAcCommand implements ICommand{
	
	AirConditioner airConditioner; 
	
	public TurnOffAcCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		airConditioner.turnOffAc();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		airConditioner.turnOnAc();
	}

}
