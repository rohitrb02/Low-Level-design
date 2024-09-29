package isp;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Waiter waiter = new Waiter(); 
		waiter.serveCustomer();
		waiter.takeOrder();
		
		Chef chef = new Chef();
		chef.cookFood();
		chef.decideMenu();
	}

}
