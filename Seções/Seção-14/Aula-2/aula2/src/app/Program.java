package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		method1();
		
		System.out.println("End");
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		String[] vect = sc.nextLine().split(" ");
		
		try {
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("A posição do Array não existe " + e.getMessage());
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("A posição deve ser um número e não uma letra " + e.getMessage());
			e.printStackTrace();
			sc.next();
		}
		
		sc.close();
		System.out.println("***METHOD2 END***");
	}

}
