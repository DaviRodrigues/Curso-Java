package app;

import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;

public class Program {

	public static final Scanner sc = new Scanner(System.in);
	private static final String DATE_TIME_REGEX = "^([0-2]\\d|3[0-1])/(0\\d|1[0-2])/\\d{4} ([0-1]\\d|2[0-3]):[0-5]\\d$";
	
    private static void validateDateTime(String dateTime) {
        if (!dateTime.matches(DATE_TIME_REGEX)) {
            System.err.println("Erro: Formato inválido! Use dd/MM/yyyy HH:mm.");
            System.exit(1);
        }
    }
	
	public static void main(String[] args) {
		
		System.out.println("Entre com dados do alguel");
		
		System.out.print("Modelo do carro: ");
		String modelCar = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm)");
		String start = sc.nextLine();
		
		System.out.print("Retorno (dd/MM/yyyy hh:mm)");
		String finish = sc.nextLine();
		
		CarRental cr = new CarRental(start, finish, new Vehicle(modelCar));
		
		sc.close();
	}

}
