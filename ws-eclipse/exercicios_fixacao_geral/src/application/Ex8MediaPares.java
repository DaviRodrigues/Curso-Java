package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Ex8MediaPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int num = sc.nextInt();
		int[] vect = new int[num];
		
		sc.nextLine();
		coletarNumeros(sc, vect);
		
		int valores[] = verificarPares(vect);
		
		realizarMediaOuNao(valores);
		
		sc.close();
	}
	
	public static void coletarNumeros(Scanner sc, int[] vect) {
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
			sc.nextLine();
		}
	}
	
	public static int[] verificarPares(int[] vect) {
        int somaPares = 0;
        int quantidadePares = 0;
        
        int[] valores = new int[2];
        
        for (int num : vect) {
        	if (num % 2 == 0) {
        		somaPares += num;
        		quantidadePares++;
        	}
        }
        
        valores[0] = somaPares;
        valores[1] = quantidadePares;
        
        return valores;
	}
	
	public static void realizarMediaOuNao(int[] valores) {
		if (valores[1] > 0) {
			double mediaPares = (double) valores[0] / valores[1];
			System.out.println("MEDIA DOS PARES = " + mediaPares);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
			
	}

}
