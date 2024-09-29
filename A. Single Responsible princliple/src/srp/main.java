package srp;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker marker = new Marker("Rohit","Black",2024,100);
		
		Invoice invoice = new Invoice(marker,5);
		
		InvoiceDao invoiceDao = new InvoiceDao(invoice);
		invoiceDao.saveToDB();
		
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
		invoicePrinter.printInvoice();
	}

}
