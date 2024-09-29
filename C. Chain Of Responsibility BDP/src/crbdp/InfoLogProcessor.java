package crbdp;

public class InfoLogProcessor extends LogProcessor{

	InfoLogProcessor(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
		// TODO Auto-generated constructor stub
	}

	public void log(int loglevel,String message) {
		if(loglevel == INFO) {
			System.out.println("INFO " + message);
		} else {
			super.log(loglevel, message);
		}
	}
}
