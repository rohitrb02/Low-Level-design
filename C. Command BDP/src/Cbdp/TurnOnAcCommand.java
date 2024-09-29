package Cbdp;

public class TurnOnAcCommand implements ICommand {

	AirConditioner airConditioner;
	
	public TurnOnAcCommand(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		airConditioner.turnOnAc();
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		airConditioner.turnOffAc();
	}

}
