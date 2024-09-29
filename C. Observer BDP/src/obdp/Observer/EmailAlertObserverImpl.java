package obdp.Observer;

import obdp.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

	String emailID;
	StockObservable oberverable;
	
	public EmailAlertObserverImpl(String emailID,StockObservable oberverable) {
		this.emailID = emailID;
		this.oberverable = oberverable;
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMail(emailID,"product is in stock hurry up");
	}
	
	public void sendMail(String emailID,String msg) {
		System.out.println("EMAIL: Mail sent to: " + emailID + " " + msg);	
	}

}
