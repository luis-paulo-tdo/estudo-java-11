package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println("New Order:");
		System.out.println(order);
		System.out.println();
		
		System.out.println("Changing Order status to PROCESSING:");
		order.setStatus(OrderStatus.PROCESSING);
		System.out.println(order);
		System.out.println();
		
		System.out.println("Changing Order status to SHIPPED:");
		order.setStatus(OrderStatus.valueOf("SHIPPED"));
		System.out.println(order);
		System.out.println();
	}

}
