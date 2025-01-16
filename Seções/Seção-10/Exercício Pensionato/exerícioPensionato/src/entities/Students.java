package entities;

public class Students {
	
	public static boolean validateName(String name) {
		return name.matches("^[A-Za-zÀ-ÖØ-öø-ÿ ]+$");
	}
	
	public static boolean validateEmail(String email) {
		return email.contains("@") && email.contains(".com");
	}
	
	private String name;
	private String email;
	private int roomNumber;
	
	public Students(String name, String email, int roomNumber) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null or empty.");
		}
		if (email == null || email.isEmpty() || !validateEmail(email)) {
			throw new IllegalArgumentException("Invalid email format.");
		}
		if (roomNumber < 0) {
			throw new IllegalArgumentException("Room number cannot be negative.");
		}
		
		this.name = name;
		this.email = email;
		this.roomNumber = roomNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
}
