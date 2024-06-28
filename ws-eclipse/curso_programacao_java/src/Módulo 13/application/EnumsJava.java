package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class EnumsJava {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // esse método ira servir em casos de que usuário precise dar informação ou ela venha de uma API
		
		System.out.println(os1);
		
		System.out.println(os2);
		
	}

}
