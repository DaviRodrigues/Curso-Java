package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class ExFixacaoLista {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int employees = sc.nextInt();

		list = insertEmployees(employees, sc, list);

		setSalaryIdEmployee(list, sc);

		listEmployees(list);

		sc.close();
	}

	public static List<Funcionario> insertEmployees(int employees, Scanner sc, List<Funcionario> list) {
		for (int i = 0; i < employees; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");

			int id;
			do {
				System.out.print("Id: ");
				id = sc.nextInt();
				if (idExists(list, id)) {
					System.out.println("Id already taken! Try again.");
				}
			} while (idExists(list, id));
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			list.add(new Funcionario(id, name, salary));
		}

		return list;
	}

	public static boolean idExists(List<Funcionario> list, int id) {
		return list.stream().anyMatch(x -> x.getId() == id);
	}

	public static void setSalaryIdEmployee(List<Funcionario> list, Scanner sc) {
		Funcionario emp;
		System.out.println();
		do {
			System.out.print("Enter the employee id that will have salary increase: ");
			int idSalaryIncrease = sc.nextInt();
			emp = list.stream().filter(x -> x.getId() == idSalaryIncrease).findFirst().orElse(null);

			if (emp == null) {
				System.out.println("This id does not exist! Try again.");
			}
		} while (emp == null);

		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		emp.setSalary(emp.getSalary() * (1 + percentage / 100));
	}

	public static void listEmployees(List<Funcionario> list) {
		System.out.println();
		System.out.println("List of employees:");

		for (Funcionario obj : list) {
			System.out.println(obj);
		}
	}
}
