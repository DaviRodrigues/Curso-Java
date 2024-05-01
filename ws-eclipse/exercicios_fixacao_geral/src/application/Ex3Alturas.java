package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Altura;

public class Ex3Alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int num = sc.nextInt();
		Altura[] vect = new Altura[num];
		
		sc.nextLine();
		coletarDadosUsuario(sc, vect);
		
		double sum = somaTotalAltura(vect);
		
		alturaMedia(vect, sum);
		
		mostrarMenoresDe16(vect);
		
	}
	
    public static void coletarDadosUsuario(Scanner sc, Altura[] vect) {
    	String nome;
    	int idade;
    	double altura;
 
    	
        for (int i = 0; i < vect.length; i++) {
        	System.out.printf("Dados da %dª pessoa:\n", i+1);
        	System.out.print("Nome: ");
        	nome = sc.nextLine();
        	System.out.print("Idade: ");
        	idade = sc.nextInt();
        	System.out.print("Altura: ");
        	altura = sc.nextDouble();
        	
        	vect[i] = new Altura(nome, idade, altura);
    		sc.nextLine();
        }
    }
    
    public static double somaTotalAltura(Altura[] vect) {
    	double sum = 0.0;
    	for (int i=0; i<vect.length; i++) {
    		sum += vect[i].getHeight();
    	}
    	return sum;
    }
    
	public static void alturaMedia(Altura[] vect, double sum) {
		double media = sum / vect.length;
		System.out.print("\nAltura média: \n" + media);
	}
	
	public static void mostrarMenoresDe16(Altura[] vect) {
	    int countMenoresDe16 = 0;
	    for (Altura pessoa : vect) {
	        if (pessoa.getAge() < 16) {
	            System.out.println("Nome: " + pessoa.getName());
	            countMenoresDe16++;
	        }
	    }
	    double porcentagemMenoresDe16 = (double) countMenoresDe16 / vect.length * 100;
	    System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%\n", porcentagemMenoresDe16);
	}

	
}
