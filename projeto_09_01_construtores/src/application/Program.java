package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Product product;
		String name;
		double price;
		int quantity;
		
		System.out.println("Stock Product Management");
		System.out.println("=====================================================");
		System.out.println("Enter product data");
		
		System.out.print("Name: ");
		name = scanner.next();
		
		System.out.print("Price: ");
		price = scanner.nextDouble();
		
		product = new Product(name, price);
		System.out.println("Product Data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(scanner.nextInt());
		
		System.out.println("Updated Data: " + product);
		System.out.println();
		
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(scanner.nextInt());
		
		System.out.println("Updated Data: " + product);
		
		scanner.close();
	}
}
