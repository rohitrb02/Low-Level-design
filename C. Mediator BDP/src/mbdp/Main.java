// A design pattern that defines an object (the mediator) that encapsulates how a set of objects interact. 
//This pattern promotes loose coupling by preventing objects from referring to each other explicitly and allows their interaction to be varied independently.

//ex: Imagine a chat room application where users can send messages to each other. Without a mediator, each user would need to keep track of all other users to send messages, creating a complex network of dependencies.
//ex: In an online auction system, bidders place bids through an auctioneer who manages the bidding process and notifies all bidders about the highest bid.


// It Equivalent to Observer DB and Proxy DB
package mbdp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutionMediator autionMediator = new Auction();
		Colleague bidder1 = new Bidder(autionMediator,"Rohit");
		Colleague bidder2 = new Bidder(autionMediator,"Bharti");
		
		bidder1.placeBid(2000);
		bidder2.placeBid(3000);
		bidder1.placeBid(3001);

	}

}



//--------------------------------------------------------- WHEN TO USE MEDIATOR DESIGN PATTERN ---------------------------------------------------------

// Use the Mediator pattern when you have complex interactions between multiple objects and want to simplify the communication and dependencies between them. 
// It centralizes control, reduces coupling, and enhances maintainability and flexibility in your system.

