
import java.util.Scanner;

public class entrada_de_dados_texto {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] strings = new String[3]; // Cria um array de strings com tamanho 3

		for (int i = 0; i < strings.length; i++) {
			System.out.println("Digite a linha " + (i + 1) + ":");
			strings[i] = sc.nextLine(); // Armazena a linha de entrada no array
			// nextLine deve ser utilizado com outros, pois caso mude para outro ele da quebra de linha
			// para voce resolver essa questão você pode dar um nextLine extra
		}

		System.out.println("Dados digitados: ");

		for (int i = 0; i < strings.length; i++) {
			System.out.println((i + 1) + ":" + strings[i]);
		}

		sc.close();
	}
}
