package mbdp;

public interface AutionMediator {
	void addBidder(Colleague bidder);
	void placeBid(Colleague bidder, int bitAmount);
}
