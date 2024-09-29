// The Observer Pattern is a behavioral design pattern where an object, known as the subject, maintains a list of its dependents, called observers, and notifies them automatically of any 
// state changes, usually by calling one of their methods. It is mainly used to implement distributed event-handling systems.

// ex: Imagine an Amazon product availability notification system where customers (observers) can subscribe to be notified when a specific product, such as an iPhone, 
// becomes available (subject).

package obdp;

import obdp.Observable.IPhoneObservableImpl;
import obdp.Observable.StockObservable;
import obdp.Observer.EmailAlertObserverImpl;
import obdp.Observer.MobileAlertObserverImpl;
import obdp.Observer.NotificationAlertObserver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockObservable iphoneStockObservable = new IPhoneObservableImpl();
		
		NotificationAlertObserver observer1 =  new EmailAlertObserverImpl("rohit@gmail.com",iphoneStockObservable);
		NotificationAlertObserver observer2 =  new EmailAlertObserverImpl("bharti@gmail.com",iphoneStockObservable);
		NotificationAlertObserver observer3 =  new MobileAlertObserverImpl("bittu@gmail.com",iphoneStockObservable);
		
		iphoneStockObservable.add(observer1);
		iphoneStockObservable.add(observer2);
		iphoneStockObservable.add(observer3);
		
		iphoneStockObservable.setStockCount(10);

	}

}

//--------------------------------------------------------- WHEN TO USE OBSERVER DESIGN PATTERN ---------------------------------------------------------

// Use the Observer Pattern when you need to maintain consistency between related objects without making them tightly coupled. 
// It helps in creating a flexible and reusable design by allowing objects to interact in a loosely coupled manner. 
// However, consider the potential overhead and complexity it might introduce, and ensure it fits the specific requirements and constraints of your application.