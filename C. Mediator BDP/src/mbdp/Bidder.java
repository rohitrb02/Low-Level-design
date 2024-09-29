package mbdp;

public class Bidder implements Colleague{

	AutionMediator auctionMediator;
	String name;
	
	Bidder(AutionMediator auctionMediator, String name){
		this.auctionMediator = auctionMediator;
		this.name = name;
		auctionMediator.addBidder(this);
	}
	@Override
	public void placeBid(int bitAmount) {
		// TODO Auto-generated method stub
		auctionMediator.placeBid(this, bitAmount);
	}

	@Override
	public void recieveBidNotification(int bidAmount) {
		// TODO Auto-generated method stub
		System.out.println(" Bidder " + name + " Got the notification of amount " + bidAmount);
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
