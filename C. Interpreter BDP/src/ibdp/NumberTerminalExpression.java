package ibdp;

public class NumberTerminalExpression implements AbstractExpression{

	String stringVal;
	
	NumberTerminalExpression(String stringVal){
		this.stringVal = stringVal;
	}
	
	@Override
	public int interpreter(Context context) {
		// TODO Auto-generated method stub
		return context.getValue(stringVal);
	}

}
