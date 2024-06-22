package entities;

public class Book {
	
	private String title;
	
	private Author author;
	
	private String publicationDate;
	
	public Book() {
	}
	
	public Book(String title, Author author, String publicationDate) {
		this.title = title;
		this.author = author;
		this.publicationDate = publicationDate;
	}

	public void displayDetails() {
        System.out.println("Título: " + title);
        author.displayDetails();
        System.out.println("Data de Publicação: " + publicationDate);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
}
