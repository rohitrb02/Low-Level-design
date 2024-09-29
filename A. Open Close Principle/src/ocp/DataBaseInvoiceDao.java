package ocp;

public class DataBaseInvoiceDao implements InvoiceDao{
	
	public void save(Invoice invoice) {
		System.out.println(invoice.calculateTotal() + "price  DataBase");
	}
}
