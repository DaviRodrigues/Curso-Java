package app;

import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

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
		validateDateTime(start);
		
		System.out.print("Retorno (dd/MM/yyyy hh:mm)");
		String finish = sc.nextLine();
		validateDateTime(finish);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(modelCar));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(cr);

		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		sc.close();
	}

}
