package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = Arrays.stream(vect).reduce(0.0, (ac, current) -> ac + current);
		
        System.out.printf("AVG: %.2f%n", sum / n);
        
        sc.close();
	}

}
