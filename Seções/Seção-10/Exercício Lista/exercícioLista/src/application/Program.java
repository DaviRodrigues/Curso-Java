package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int getId() {
		System.out.print("Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		return id;
	}
	
	public static String getName() {
		System.out.print("Name: ");
		String name = sc.nextLine();
		return name.trim();
	}
	
	public static double getSalary() {
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		return salary;
	}
	
	public static void increaseSalary(List<Employee> employeesList) {
		while (true) {
			System.out.print("\nEnter the employee id that will have salary increase: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			Employee employeeObj = employeesList.stream()
					.filter(x -> x.getId() == id)
					.findFirst()
					.orElse(null);
			
			if (employeeObj == null) {
				System.out.println("This employee id already not exists, try another one");
				continue;
			}
			
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			sc.nextLine();
			
			if (percentage <= 0) {
				System.out.println("The percentage cannot be below or equal to zero");
				continue;
			}
			
			employeeObj.increaseSalaryPerPercentage(percentage);
			
			System.out.print("Do you want to add any more employee salaries? (Y|N)");
			String option = sc.nextLine().toUpperCase();
			
			if (!option.equalsIgnoreCase("Y")) { break; }
		}
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Employee> employeesList = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int quantityEmployees = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= quantityEmployees; i++) {
			System.out.println("\nEmployee " + i);
			
			while (true) {
				int id = getId();
				if (employeesList.stream().anyMatch(x -> x.getId() == id)) {
					System.out.println("This employee id already exists, try another one");
					continue;
				}
				
				String name = getName();
				if (name.isBlank()) {
					System.out.println();
					continue;
				}
				
				double salary = getSalary();
				if (salary <= 0) {
					System.out.println();
					continue;
				}
				
				employeesList.add(new Employee(id, name, salary));
				break;
			}
			
		}
			
		increaseSalary(employeesList);
		
		System.out.println("List of employees:");
		for (Employee employee : employeesList) {
			System.out.println(employee);
		}
		
		sc.close();
	}

}
