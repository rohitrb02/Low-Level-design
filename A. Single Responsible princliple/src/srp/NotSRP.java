package srp;

public class NotSRP {
	private Marker marker;
	private int quantity;
	
	public NotSRP(Marker marker,int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}
	
	
	public int calculateTotle() {                                  // 1 reason to change
		int price = ((marker.price) * quantity);
		return price;
	}
	
	public void printInvoice() {                                  // 2 reason to change
		System.out.println("Print Invoice");
	}
	
	public void saveToDB() {                                        // 3 reason to change
		System.out.println("saveToDB");

	}
}



//  NOT FOLLWING SRP    xxxxxxxxx