package ibdp;

public class MultiplyNonTerminalExpression implements AbstractExpression{

	AbstractExpression leftExpression;
	AbstractExpression rightExpression;
	
	MultiplyNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression){
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}
	@Override
	public int interpreter(Context context) {
		// TODO Auto-generated method stub
		return leftExpression.interpreter(context) * rightExpression.interpreter(context);
	}

}
