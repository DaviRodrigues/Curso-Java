
import java.util.Scanner;

public class estrutura_switch_case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int diaSemana = sc.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("Dia da semana: domingo");
			break;
		case 2:
			System.out.println("Dia da semana: segunda");
			break;
		case 3:
			System.out.println("Dia da semana: terça");
			break;
		case 4:
			System.out.println("Dia da semana: quarta");
			break;
		case 5:
			System.out.println("Dia da semana: quinta");
			break;
		case 6:
			System.out.println("Dia da semana: sexta");
			break;
		case 7:
			System.out.println("Dia da semana: sábado");
			break;
		default:
			System.out.println("Dia da semana: valor inválido");
			break;
		}

		sc.close();
	}

}
