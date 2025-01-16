package application;

import java.util.Scanner;

import entities.Students;

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	
	public static String validateEmail() {
		String email;
		do {
            System.out.print("Email: ");
            email = sc.nextLine();
            
			if (!Students.validateEmail(email)) {
				System.out.println("Invalid email! Please enter a valid email with '@' and '.com'.");
			}
		} while(!Students.validateEmail(email));
		
		return email;
	}
	
	public static String validateName() {
		String name;
		do {
			System.out.print("Name: ");
			name = sc.nextLine();
			
			if (!Students.validateName(name)) {
				System.out.println("Invalid name! Please enter a name with letters only.");
			}
		} while(!Students.validateName(name));
		
		return name;
	}
	
	public static int validateRoomNumber(Students[] rooms) {
		int roomNumber;
		do {
			System.out.print("Room (0-9): ");
			roomNumber = sc.nextInt();
			sc.nextLine();
			
			if (roomNumber < 0 || roomNumber >= 10) {
				System.out.println("Invalid room number! Please enter a number between 0 and 9.");
			} else if (rooms[roomNumber] != null) {
				System.out.println("Room already occupied! Please choose another room.");
			}
		} while (roomNumber < 0 || roomNumber >= 10 || rooms[roomNumber] != null);
		
		return roomNumber;
	}

	public static void main(String[] args) {
		
		Students rooms[] = new Students[10];
		
		System.out.print("How many rooms will be rented? ");
		int quantityRooms = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i < quantityRooms; i++) {
			System.out.println("Rent #" + (i + 1) );
			
			String email = Program.validateEmail();
			String name = Program.validateName();
			int roomNumber = Program.validateRoomNumber(rooms);
			
			rooms[roomNumber] = new Students(name, email, roomNumber);
		}
		
		System.out.println("Busy rooms:");
		for (Students s : rooms) { 
			if (s != null) {
				System.out.println(
						s.getRoomNumber() 
						+ ": "
						+ s.getName()
						+ ", "
						+ s.getEmail()
						); 
			}
		}
		
		sc.close();
	}

}
