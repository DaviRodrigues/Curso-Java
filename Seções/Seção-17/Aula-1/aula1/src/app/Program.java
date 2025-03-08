package app;

import java.util.Scanner;

import services.PrintService;


public class Program {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}

		ps.print();
		System.out.println("\nFirst: " + ps.first());
		
		sc.close();

	}

}
