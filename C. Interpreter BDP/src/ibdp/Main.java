// The Interpreter Pattern is a behavioral design pattern that defines a way to evaluate sentences or expressions in a language. 
// It involves defining a grammar and using an interpreter to process and evaluate sentences according to that grammar. 
// This pattern is useful for designing simple language interpreters or for processing expressions in applications.
// ex: Suppose you want to interpret simple mathematical expressions like "2 3 +", which means (2 + 3).
package ibdp;

public class Main {
	public static void main(String args []) {
		Context context = new Context();
		context.put("a",2);
		context.put("b",4);
		context.put("c",6);
		context.put("d",8);
		
		// (a * b)
		AbstractExpression expression1 = new MultiplyNonTerminalExpression(
				new NumberTerminalExpression("a"), new NumberTerminalExpression("b"));
		
		System.out.println(expression1.interpreter(context));
		
		
		//(a * b) + (c * d)
		AbstractExpression expression2 = new SumNonTerminalExpression(
				new MultiplyNonTerminalExpression(
						new NumberTerminalExpression("a"), new NumberTerminalExpression("b")),
				new MultiplyNonTerminalExpression(
						new NumberTerminalExpression("c"), new NumberTerminalExpression("d"))
				);
		
		System.out.println(expression2.interpreter(context));
	}
}
