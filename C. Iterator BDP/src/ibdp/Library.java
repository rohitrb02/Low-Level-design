package ibdp;
import java.util.*;

public class Library implements Aggregate{
	
	private List<Book> bookList;
	
	public Library(List<Book> bookList) {
		this.bookList = bookList;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new BookIterator(bookList);
	}
	
}
