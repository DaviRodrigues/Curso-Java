package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program_ex3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3;
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		
		student.notaSemestre(nota1, nota2, nota3);

		sc.close();
	}

}
