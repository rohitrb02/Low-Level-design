package crbdp;

public class ErrorLogProcessor extends LogProcessor{

	ErrorLogProcessor(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
		// TODO Auto-generated constructor stub
	}

	public void log(int loglevel,String message) {
		if(loglevel == ERROR) {
			System.out.println("ERROR " + message);
		} else {
			super.log(loglevel, message);
		}
	}
}
