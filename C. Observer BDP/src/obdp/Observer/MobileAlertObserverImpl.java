package obdp.Observer;

import obdp.Observable.StockObservable;

public class MobileAlertObserverImpl  implements NotificationAlertObserver{

	String userName;
	StockObservable oberverable;
	
	public MobileAlertObserverImpl(String emailID,StockObservable oberverable) {
		this.userName = emailID;
		this.oberverable = oberverable;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMail(userName,"product is in stock hurry up");
	}
	
	public void sendMail(String userName,String msg) {
		System.out.println("MOBILE: Mail sent to: " + userName + " " + msg);	
	}

}
