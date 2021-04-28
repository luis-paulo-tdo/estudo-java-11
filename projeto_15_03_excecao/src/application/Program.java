package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] vector;
		int position;
		
		try {
			System.out.println("Type some text:");
			System.out.print("> ");
			vector = scanner.nextLine().split(" ");
			
			System.out.print("Type a position to access the text: ");
			position = scanner.nextInt();
			System.out.println("Vector on [" + position + "]: " + vector[position]);
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Error: Invalid position!");
		} catch (InputMismatchException exception) {
			System.out.println("Error: Invalid input!");
		}
		
		System.out.println("End of Program.");
		scanner.close();
	}

}
