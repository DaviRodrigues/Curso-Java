package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String[] vect = sc.nextLine().split(" ");
		
		try {
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("A posição do Array não existe " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("A posição deve ser um número e não uma letra " + e.getMessage());
		}
		
		sc.close();
	}

}
