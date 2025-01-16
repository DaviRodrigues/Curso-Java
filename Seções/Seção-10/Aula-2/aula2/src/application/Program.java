package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for (int i=0; i < vect.length; i ++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
		}
		
		double sum = Arrays.stream(vect)
				.map(p -> p.getPrice())
				.reduce(0.0, (acl, curr) -> acl + curr);
		
		System.out.printf("AVG Price = %.2f%n", sum / n);
	}

}
