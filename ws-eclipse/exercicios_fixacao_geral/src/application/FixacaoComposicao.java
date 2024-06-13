package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.ProductItem;
import entities.enums.OrderStatus;

public class FixacaoComposicao {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private static DateTimeFormatter fmtDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Client client = clientData();
		
		Order order = orderData(client);
	
		orderSummary(order, client);
		
		sc.close();
	}
	
	public static Client clientData() {
		System.out.println("Enter Client data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (dd/MM/yyyy): ");
		LocalDate birth = LocalDate.parse(sc.next(), fmt);
		sc.nextLine();
		
		return new Client(name, email, birth);
	}
	
	public static Order orderData(Client client) {
		System.out.println("Enter order data:");
		
		System.out.print("Status: ");
		String statusString = sc.nextLine();
		OrderStatus status = OrderStatus.valueOf(statusString.toUpperCase());
		
		Order order = new Order(LocalDateTime.now(), status, client);
		
		System.out.print("How many items to this order? ");
		int quantityItems = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < quantityItems; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			
			System.out.print("Product name: ");
			String nameProduct = sc.nextLine();
			
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			sc.nextLine();
			
			OrderItem orderItem = new OrderItem(quantity, price, new ProductItem(nameProduct, price));
			order.addItem(orderItem);
		}
		
		return order;
	}
	
	public static void orderSummary(Order order, Client client) {
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		
		System.out.println("Order moment: " + order.getMoment().format(fmtDateTime));
		System.out.println("Order status: " + order.getStatus());
		System.out.println("Client: " + client.getName() + " (" + client.getBirthDate().format(fmt) + ") - " + client.getEmail());
		
		System.out.println("Order items:");
		for (OrderItem item : order.getOrderItems()) {
			System.out.println(item.getProduct().getName() + ", $" + String.format("%.2f", item.getPrice())
				+ ", Quantity: " + item.getQuantity()
				+ ", Subtotal: $" + String.format("%.2f", item.subTotal()));
		}
		
		System.out.println("Total price: $" + String.format("%.2f", order.total()));
	}
}
