package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex5MaiorPosicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int num = sc.nextInt();
		double[] vect = new double[num];
		
		sc.nextLine();
		coletarNumeros(sc, vect);
		
		double valor = mostrarMaiorNumero(vect);
		
		encontrarPosicao(vect, valor);
		
	}
	
	public static void coletarNumeros(Scanner sc, double[] vect) {
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sc.nextLine();
		}
	}
	
	public static double mostrarMaiorNumero(double[] vect) {
		double aux = vect[0];
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] > aux) {
				aux = vect[i];
			}
		}
		
		System.out.println();
		System.out.println("Maior valor = " + aux);
		
		return aux;
	}
	
	public static void encontrarPosicao(double[] vect, double valor) {
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] == valor) {
                System.out.print("Posicao do maior valor = " + i);
                break;
            }
        }
	}

}
