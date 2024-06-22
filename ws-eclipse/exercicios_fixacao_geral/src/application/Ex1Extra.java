package application;

import entities.Author;
import entities.Book;
import entities.Library;

public class Ex1Extra {

	public static void main(String[] args) {
		Book book = new Book("Harry Potter e a Pedra Filosofal", new Author("J.K. Rowling", "31/07/1965"), "26/06/1997");
		
		Library library = new Library();
		
		library.addBook(book);
		
		library.listBooks();
	}

}
