package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		int[][] mat = new int[n][n];

		for (int l = 0; l < mat.length; l++) {
			for (int c = 0; c < mat[l].length; c++) {
				mat[l][c] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int negativeNumbers = 0;
		for (int l = 0; l < mat.length; l++) {
			int pointerLeft = 0;
			int pointerRight = n - 1;

			while (pointerLeft <= pointerRight) {
				if (mat[l][pointerLeft] < 0)
					negativeNumbers++;
				if (pointerLeft != pointerRight && mat[l][pointerRight] < 0)
					negativeNumbers++;

				pointerLeft++;
				pointerRight--;
			}
		}

		System.out.println("Negative numbers = " + negativeNumbers);

	}

}
