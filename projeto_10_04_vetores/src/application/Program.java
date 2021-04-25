package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		nameList();
	}
	
	public static void nameList() {
		
		System.out.println("Name List");
		System.out.println("=========");
		
		String[] names = new String[] { "Mary", "John", "Eddie" };
		for (String name : names) {
			System.out.println("- " + name);
		}
	}
	
	public static void priceAverage() {
		
		Scanner scanner = new Scanner(System.in);
		Product[] products;
		double sum, average;
		int quantity;
		
		System.out.println("Average Height Calculator");
		System.out.println("=========================");
		
		System.out.println("Enter a number of products:");
		System.out.print("> ");
		quantity = scanner.nextInt();
		products = new Product[quantity];
		
		for (int index = 0; index < products.length; ++index) {
			
			String name;
			double price;
			System.out.println();
			System.out.println("Enter data for Product " + (index + 1));
			
			System.out.print("Name: ");			
			name = scanner.next();
			scanner.nextLine();
			
			System.out.print("Price: ");			
			price = scanner.nextDouble();
			products[index] = new Product(name, price);
		}
		
		sum = 0.0;
		for (Product product : products) {
			sum += product.getPrice();
		}
		
		average = sum / products.length;
		System.out.println();
		System.out.printf("Average Height: %.2f", average);
		scanner.close();
	}
	
	public static void heightAverage() {
		
		Scanner scanner = new Scanner(System.in);
		double[] vector;
		double sum, average;
		int quantity;
		
		System.out.println("Average Height Calculator");
		System.out.println("=========================");
		
		System.out.println("Enter a number of people:");
		System.out.print("> ");
		quantity = scanner.nextInt();
		vector = new double[quantity];
		
		for (int index = 0; index < vector.length; ++index) {
			System.out.print("Enter a height for Person " + (index + 1) + ": "); 
			vector[index] = scanner.nextDouble();
		}
		
		sum = 0.0;
		for (int index = 0; index < vector.length; ++index) {
			sum += vector[index];
		}
		
		average = sum / quantity;
		System.out.printf("Average Height: %.2f", average);

		scanner.close();
	}
}
