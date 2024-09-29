// The Chain of Responsibility design pattern is a behavioral pattern that allows a request to be passed along a chain of handlers,
// where each handler decides whether to process the request or pass it to the next handler in the chain. 
// This pattern promotes decoupling between the sender and receivers of a request, enabling a flexible and dynamic way to handle different types of requests without tightly coupling the
// request sender to the specific handler logic. 
// For example, in a customer support system, a complaint might go through various support levels (frontline, technical support, manager) until it is resolved, 
// with each level deciding if it can handle the complaint or pass it along.
package crbdp;

public class Main {
	public static void main(String args []) {
		
		LogProcessor logObj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
		logObj.log(LogProcessor.ERROR,"exception happens");
		logObj.log(LogProcessor.DEBUG,"debugging");
		logObj.log(LogProcessor.INFO,"information");

	}
}
