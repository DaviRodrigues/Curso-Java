package application;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, count = 0;
		n = sc.nextInt();
		int[][] mat = new int[n][n]; // instancia a matriz na memória

		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("Main diagonal:");

		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		System.out.println("Negative numbers = " + count);
		
		sc.close();
	}

}
