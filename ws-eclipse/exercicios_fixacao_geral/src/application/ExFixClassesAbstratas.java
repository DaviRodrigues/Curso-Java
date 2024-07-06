package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class ExFixClassesAbstratas {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.printf("Enter the number of tax payers: ");
		int numberTaxPayers = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < numberTaxPayers; i++) {
			System.out.println("Tax payer " + (i+1) + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			
			TaxPayer taxpayer = null;
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual Income: ");
			double income = sc.nextDouble();
			sc.nextLine();
			
			if ('i' == option) {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, income, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, income, numberOfEmployees));
			}
			
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxPayer tp: list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}
