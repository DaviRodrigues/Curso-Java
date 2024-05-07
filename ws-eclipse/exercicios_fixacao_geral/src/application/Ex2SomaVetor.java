package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex2SomaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int num = sc.nextInt();
		double[] vect = new double[num];
		
		sc.nextLine();
		coletarNumeros(sc, vect);

		sc.nextLine();
		System.out.println();
		mostrarValores(vect);
		
		double sum = somaValores(vect);
		
		mediaValores(sum, vect);
		
		sc.close();
	}

    public static void coletarNumeros(Scanner sc, double[] vect) {
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
    }
    
    public static void mostrarValores(double[] vect) {
    	System.out.print("Valores:");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(" " + vect[i]);
        }
    }
    
    public static double somaValores(double[] vect) {
    	double sum = 0.0;
    	for (int i=0; i<vect.length; i++) {
    		sum += vect[i];
    	}
    	
    	System.out.print("\nSoma: " + sum);
    	
    	return sum;
    }
    
    public static void mediaValores(double sum, double[] vect) {
    	double medium = sum / vect.length;
    	System.out.print("\nMédia: " + medium);
    }
	
}
