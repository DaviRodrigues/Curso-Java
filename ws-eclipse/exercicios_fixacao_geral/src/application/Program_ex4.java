package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program_ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double price, dollars;
		
		System.out.print("What is the dollar price? ");
		price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		dollars = sc.nextDouble();
		
		double total = CurrencyConverter.calcTotal(price, dollars);
		
		CurrencyConverter.calcImpost(total);

		sc.close();
	}

}
