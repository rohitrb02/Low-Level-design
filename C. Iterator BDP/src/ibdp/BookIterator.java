package ibdp;
import java.util.*;
public class BookIterator implements Iterator{
	
	private List<Book> books;
	private int index = 0;
	
	public BookIterator(List<Book> books) {
		this.books = books;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index <books.size();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(this.hasNext()) {
			return books.get(index++);
		}
		return null;
	}
}
