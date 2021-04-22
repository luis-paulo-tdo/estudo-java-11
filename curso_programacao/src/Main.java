import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int mask = 0b00100000;
		int number;
		
		System.out.println("The 6th bit boolean");
		System.out.println("===================");
		System.out.println("Type a number:");
		System.out.print("> ");
		number = scanner.nextInt();
		
		if ((number & mask) != 0) {
			System.out.println("The 6th bit is true!");
		} else {
			System.out.println("The 6th bit is false!");
		}
		
		scanner.close();
	}
}
