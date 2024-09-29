// It is a BDP that allows you to access elements of a collection one by one without showing how the collection is structured.
package ibdp;
import java.util.*;

public class Main {
	public static void main(String args []) {
		
		List<Book> bookList = Arrays.asList (
				new Book(100,"Science"),
				new Book(200,"Maths"),
				new Book(300,"History"),
				new Book(400,"IT")
		);
		
		Library library = new Library(bookList);
		Iterator iterator = library.createIterator();
		
		while(iterator.hasNext()) {
			Book book =(Book) iterator.next();
			System.out.println(book.getName() +"- Rs: " + book.getPrice());
		}
	}
}
