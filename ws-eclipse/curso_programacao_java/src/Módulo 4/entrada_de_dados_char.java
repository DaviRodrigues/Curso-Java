
import java.util.Scanner;

public class entrada_de_dados_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// pega o primeiro caracter da sua string
		char caracter = sc.next().charAt(0);
		
		System.out.println("Você digitou: " + caracter);
		
		sc.close();

	}

}
