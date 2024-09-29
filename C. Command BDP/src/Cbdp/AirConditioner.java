package Cbdp;

public class AirConditioner {
	boolean isOn;
	int temperature;
	
	public void turnOnAc() {
		isOn = true;
		System.out.println("turnOnAc");
	}
	
	public void turnOffAc() {
		isOn = false;
		System.out.println("turnOffAc");
	}
	
	public void setTempAc(int temp) {
		temperature = temp;
		System.out.println("setTempAc " + temperature);
	}
}
