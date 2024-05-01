package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Registro;

public class DesafioPensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = 10;
		Registro[] vect = new Registro[num];
		
		System.out.print("How many rooms will be rented? ");
		int rent = sc.nextInt();
		
		sc.nextLine();
		coletarDados(sc, vect, rent);
		
		System.out.println();
		
		mostrarDados(vect);

	}
	
	public static void coletarDados(Scanner sc, Registro[] vect, int rent) {
		String nome;
		String email;
		int quarto;
		
		for (int i=0; i<rent; i++) {
			System.out.print("\nRent #" + (i+1));
			System.out.print("\nName: ");
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			quarto = sc.nextInt();
			
			sc.nextLine();
			
			vect[quarto] = new Registro(nome, email, quarto);
		}
		
	}
	
	public static void mostrarDados(Registro[] vect) {
		System.out.println("Busy rooms: ");
		for (int i=0; i<vect.length; i++) {
			if (vect[i] != null) {
				System.out.printf("%d: %s, %s\n", vect[i].getQuarto(), vect[i].getNome(), vect[i].getEmail());
			}
		}
	}

}
