package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex1Negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int num = sc.nextInt();
		int[] vect = new int[num];
		
		sc.nextLine();
		coletarNumeros(sc, vect);
		
		sc.nextLine();
		mostrarNumerosNegativos(vect);
		
		sc.close();
	}
	
    public static void coletarNumeros(Scanner sc, int[] vect) {
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }
    }
	
	public static void mostrarNumerosNegativos(int[] vect) {
		System.out.println("Número Negativos ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
	}

}
