package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program_ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Rectangle measures = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		measures.width = sc.nextDouble();
		measures.height = sc.nextDouble();

		System.out.print(measures);

		sc.close();
	}

}
