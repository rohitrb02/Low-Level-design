package tbdp;

public abstract class PaymentFlow {
	
	public abstract void validateRequest();
	public abstract void calculateFess();
	public abstract void debitCard();
	public abstract void creditAmount();
	
	//this is template method: which defines the order of steps execut the task.
	public final void sendMoney() {
		//step-1
		validateRequest();
		
		//step-2
		calculateFess();
		
		//step-3
		debitCard();
		
		//step-4
		creditAmount();
		
	}
}
