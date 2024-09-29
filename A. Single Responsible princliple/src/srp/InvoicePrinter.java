package srp;

public class InvoicePrinter {
	private Invoice invoice;
	
	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void printInvoice() {
		System.out.println(this.invoice.calculateTotal() + "Print Invoice");
	}
}
