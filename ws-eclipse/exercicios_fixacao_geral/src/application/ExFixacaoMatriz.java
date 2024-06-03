package application;

import java.util.Scanner;

public class ExFixacaoMatriz {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n]; 

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (i > 0) {
                        System.out.println("Top: " + mat[i-1][j]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Bottom: " + mat[i+1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]); 
                    }
                    if (j < mat[i].length -1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                }
            }
        }

        sc.close();
    }
}
