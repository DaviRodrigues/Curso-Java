
import java.util.Scanner;

public class estrutura_do_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String opcao;
		// poderia ser char opcao;
		
		do {
			System.out.println("Digite a temperatura em Celsius:");
			
			double temperatura = sc.nextDouble();
			double temp_fahrenheit = ((9 * temperatura) / 5) + 32;
			
			System.out.println("A temperatura em Fahrenheit é: " + temp_fahrenheit);
			
			System.out.println("Deseja repetir o programa? (S|N)");
			
			opcao = sc.next();
			
		} while(opcao.equalsIgnoreCase("S") || opcao.equalsIgnoreCase("s"));
		// ou opcao.charAt(0) == 'S' || opcao.charAt(0) == 's'
		
		System.out.println("Programa finalizado");
		
		sc.close();
	}

}
