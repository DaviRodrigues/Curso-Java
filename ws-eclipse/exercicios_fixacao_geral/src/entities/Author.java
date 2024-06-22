package entities;

public class Author {
	
	private String name;
	
	private String birthDate;
	
	public Author() {
	}
	
	public Author(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public void displayDetails() {
        System.out.println("Nome do Autor: " + name);
        System.out.println("Data de Nascimento: " + birthDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	
	
}
