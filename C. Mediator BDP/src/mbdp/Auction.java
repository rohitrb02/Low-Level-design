package mbdp;
import java.util.*;
public class Auction implements AutionMediator{
	
	List<Colleague> colleagues = new ArrayList<>();

	@Override
	public void addBidder(Colleague bidder) {
		// TODO Auto-generated method stub
		colleagues.add(bidder);
		
	}

	@Override
	public void placeBid(Colleague bidder, int bitAmount) {
		// TODO Auto-generated method stub
		
		for(Colleague colleague : colleagues) {
			if(!colleague.getName().equals(bidder.getName())) {
				colleague.recieveBidNotification(bitAmount);
			}
		}
		
	}

}
