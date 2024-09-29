package Cbdp;

public class Main {
	public static void main(String Args [] ) {
		
		AirConditioner airConditioner = new AirConditioner();
		MyRemoteControl myRemoteControl = new MyRemoteControl();
		
		myRemoteControl.setCommand(new TurnOnAcCommand(airConditioner));
		myRemoteControl.pressButton();
		
		//undo the last operation
		myRemoteControl.undo();
	}
}
