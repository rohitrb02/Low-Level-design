package crbdp;

public class DebugLogProcessor extends LogProcessor{

	DebugLogProcessor(LogProcessor nextLogProcessor) {
		super(nextLogProcessor);
		// TODO Auto-generated constructor stub
	}

	public void log(int loglevel,String message) {
		if(loglevel == DEBUG) {
			System.out.println("DEBUG " + message);
		} else {
			super.log(loglevel, message);
		}
	}
}
