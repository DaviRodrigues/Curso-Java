package app;

import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}

}
