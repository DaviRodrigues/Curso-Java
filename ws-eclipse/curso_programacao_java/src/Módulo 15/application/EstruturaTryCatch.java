package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EstruturaTryCatch {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of program");
		
		sc.close();
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
		}
		
		System.out.println("***METHOD2 END***");
	}

}
