
import java.util.Scanner;

public class entrada_de_dados_string {

	public static void main(String[] args) {
		// cria o scanner de entrada de dados
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		
		System.out.println("Você digitou: " + nome);
		
		
		// libera processamento e memória fechando o scanner
		sc.close();

	}

}
