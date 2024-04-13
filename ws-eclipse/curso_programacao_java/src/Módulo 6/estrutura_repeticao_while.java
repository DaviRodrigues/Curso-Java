
import java.util.Scanner;

public class estrutura_repeticao_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		int x = sc.nextInt();
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.printf("Valor da soma é %d", soma);
		
		sc.close();
	}

}
