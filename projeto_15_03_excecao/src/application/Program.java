package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Start of Program.");
		callNavigate();
		System.out.println("End of Program.");
	}
	
	public static void callNavigate() {
		System.out.println("====> Call Navigate Start <====");
		navigateOnText();
		System.out.println("====> Call Navigate End <====");
	}
	
	public static void navigateOnText() {
		
		System.out.println("====> Navigate On Text Start <====");
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
			exception.printStackTrace();
			scanner.next();
		} catch (InputMismatchException exception) {
			System.out.println("Error: Invalid input!");
			exception.printStackTrace();
			scanner.next();
		}
		
		scanner.close();
		System.out.println("====> Navigate On Text End <====");
	}
}
