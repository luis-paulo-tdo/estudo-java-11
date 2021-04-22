import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int quantity, sum;
		
		System.out.println("Sum Calc Application (For)");
		System.out.println("========================================================");
		System.out.println("Enter the numbers quantity you want to calculate the sum");
		System.out.print("> ");
		quantity = scanner.nextInt();
		sum = 0;
		
		System.out.println("Enter the sequence of " + quantity + " numbers");
		for (int index = 0; index < quantity; index++) {
			System.out.print("> ");
			int input = scanner.nextInt();
			sum += input;
		}
		
		System.out.println("Sum: " + sum);
		scanner.close();
	}
}
