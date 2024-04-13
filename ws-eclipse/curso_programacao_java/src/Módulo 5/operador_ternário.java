
import java.util.Scanner;

public class operador_ternário {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.printf("O preço do desconto é %.3f", desconto);
		
		sc.close();
		
	}

}
