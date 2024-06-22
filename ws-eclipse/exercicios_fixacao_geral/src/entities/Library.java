package entities;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	private List<Book> books = new ArrayList<>();
	
	public Library() {
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public void removeBook(Book book) {
		books.remove(book);
	}
	
	public void listBooks() {
		for (Book book: books) {
			book.displayDetails();
		}
	}
	
	
	
}
