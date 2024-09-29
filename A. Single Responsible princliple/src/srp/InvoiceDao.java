package srp;

public class InvoiceDao {

	private Invoice invoice;
	
	public InvoiceDao(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void saveToDB() {
		System.out.println(this.invoice.calculateTotal() + "Save to DB");
		System.out.println(this.invoice.marker.name + "Save to DB");

	}
}
