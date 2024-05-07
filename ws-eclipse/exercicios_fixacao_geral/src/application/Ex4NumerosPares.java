package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex4NumerosPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int num = sc.nextInt();
		int[] vect = new int[num];
		
		sc.nextLine();
		coletarNumeros(sc, vect);
		
		mostrarNumerosPares(vect);

		sc.close();
	}
	
	public static void coletarNumeros(Scanner sc, int[] vect) {
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			sc.nextLine();
		}
	}
	
	public static void mostrarNumerosPares(int[] vect) {
		int count = 0;
		System.out.println("Numeros pares:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i]%2 == 0) {
				System.out.print(vect[i] + " ");
				
				count++;
			}
		}
		System.out.print("\nQuantidade de pares = " + count);
	}

}
