import java.util.Scanner;

public class estruturas_condicionais_encadeadas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas são no momento?");
		hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
		
		sc.close();

	}

}
