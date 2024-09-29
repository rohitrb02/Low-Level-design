package ocp;

public class main {
	public static void main(String[] args) {
		
		Marker marker = new Marker("Rohit","Black",2024,1000);
		Invoice invoice = new Invoice(marker,5);
		
		DataBaseInvoiceDao dataBaseInvoiceDao = new DataBaseInvoiceDao();
		dataBaseInvoiceDao.save(invoice);
		
		FileInvoiceDao fileInvoiceDao = new FileInvoiceDao();
		fileInvoiceDao.save(invoice);
	}
}
