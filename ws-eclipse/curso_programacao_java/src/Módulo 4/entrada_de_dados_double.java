
import java.util.Scanner;
import java.util.Locale;

public class entrada_de_dados_double {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		System.out.println("Você digitou: " + num);
		
		sc.close();

	}

}