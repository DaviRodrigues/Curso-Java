package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Ex7AbaixoDaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int num = sc.nextInt();
		double[] vect = new double[num];
		
		sc.nextLine();
		coletarNumeros(sc, vect);
		
		System.out.println();
		
		realizarMedia(vect);
		
		sc.close();
	}
	
	public static void coletarNumeros(Scanner sc, double[] vect) {
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
	}
	
	public static void realizarMedia(double[] vect) {
		double soma = Arrays.stream(vect).sum();
		double media = soma / vect.length;
		
		System.out.println("MEDIA DO VETOR = " + media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
	}

}
