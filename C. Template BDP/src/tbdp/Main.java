// When you want all classes to follow the specific steps to process the task but also Need to provide flexibility that each class can have their own logic in that specific steps. 

package tbdp;

public class Main {
	public static void main(String args []) {
		
		PaymentFlow paymentobj =  new PaytoFriend();
		paymentobj.sendMoney();
		
		PaymentFlow paymentobj1 =  new PaytoMerchent();
		paymentobj1.sendMoney();

	}
}
