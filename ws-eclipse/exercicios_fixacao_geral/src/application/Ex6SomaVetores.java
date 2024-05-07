package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex6SomaVetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int num = sc.nextInt();
		int[] vect1 = new int[num];
		int[] vect2 = new int[num];
		int[] vect3 = new int[num];
		
		sc.nextLine();
		coletarNumeros(sc, vect1, vect2);
		
		somarValores(sc, vect1, vect2, vect3);
		
	}

	public static void coletarNumeros(Scanner sc, int[] vectA, int[] vectB) {
		System.out.println("Digite os valores do vetor A:");
		for (int i=0; i<vectA.length; i++) {
			vectA[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Digite os valores do vetor B:");
		for (int i=0; i<vectB.length; i++) {
			vectB[i] = sc.nextInt();
			sc.nextLine();
		}
	}
	
	public static void somarValores(Scanner sc, int[] vectA, int[] vectB, int[] vectC) {
		int soma = 0;
		System.out.println("VETOR RESULTANTE:");
		for (int i=0; i<vectC.length; i++) {
			soma = vectA[i] + vectB[i];
			System.out.println(soma);
		}
	}
	
}
