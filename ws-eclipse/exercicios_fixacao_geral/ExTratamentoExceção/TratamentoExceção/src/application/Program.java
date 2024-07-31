package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter account data");
		
		try {
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			
			try {
				System.out.print("Enter amount for withdraw: ");
				double amount = sc.nextDouble();
				
				account.withdraw(amount);
				
				System.out.printf("New balance: %.2f%n", account.getBalance());
			
			} catch (DomainException e) {
				System.err.println(e.getMessage());
			}
			
		} catch (Exception e) {
			System.err.println(e);
		}
		
		sc.close();
	}

}
