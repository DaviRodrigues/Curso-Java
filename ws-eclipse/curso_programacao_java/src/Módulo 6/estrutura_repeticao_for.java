
import java.util.Scanner;

public class estrutura_repeticao_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			int num = sc.nextInt();
			soma += num;
		}
		
		System.out.printf("Valor da soma é %d", soma);
		
		sc.close();
		
	}

}
