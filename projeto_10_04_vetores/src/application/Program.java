package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
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
		
		for (int index = 0; index < quantity; ++index) {
			System.out.print("Enter a height for Person " + (index + 1) + ": "); 
			vector[index] = scanner.nextDouble();
		}
		
		sum = 0.0;
		for (int index = 0; index < quantity; ++index) {
			sum += vector[index];
		}
		
		average = sum / quantity;
		System.out.printf("Average Height: %.2f", average);

		scanner.close();
	}
}
