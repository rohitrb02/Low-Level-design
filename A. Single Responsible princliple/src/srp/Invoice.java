package srp;

public class Invoice {
	Marker marker;
	private int quantity;
	
	public Invoice(Marker marker,int quantity) {
		this.marker = marker;
		this.quantity = quantity;
	}
	
	
	public int calculateTotal() {                    		// 1 reason to change
		int price = ((marker.price) * quantity);
		return price;
	}
}

