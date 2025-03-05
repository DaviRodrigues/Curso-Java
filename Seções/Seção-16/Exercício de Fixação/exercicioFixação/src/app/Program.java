package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static final Scanner sc = new Scanner(System.in);
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static void main(String[] args) {
		
		System.out.println("Entre os dados do contrato: ");
		
		System.out.print("Número: ");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.nextLine(), dtf);
		
		System.out.print("Valor do contrato: ");
		double value = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Entre com o numero de parcelas: ");
		int installmentsQuantity = sc.nextInt();
		sc.nextLine();
		
		Contract contract = new Contract(number, date, value);
		
		ContractService service = new ContractService(new PaypalService());
		
		service.processContract(contract, installmentsQuantity);
		
		System.out.println("Parcelas:");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment.getDueDate() + " - " + installment.getAmount());
		}
		
		sc.close();
	}

}
