package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program_ex2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee data = new Employee();
		
		System.out.print("Name: ");
		data.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		data.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		data.tax = sc.nextDouble();
		
		System.out.printf("Employee: " + data);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percent = sc.nextDouble();
		data.increaseSalary(percent);
		
		System.out.println();
		System.out.print("Updated data: " + data);

		sc.close();
	}

}
