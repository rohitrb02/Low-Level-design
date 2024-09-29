package ocp;

public class FileInvoiceDao implements InvoiceDao{
	public void save(Invoice invoice) {
		System.out.println(invoice.calculateTotal() + "price File");
	}
}
