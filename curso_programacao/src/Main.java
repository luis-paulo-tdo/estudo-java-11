import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		int input, sum;
		
		System.out.println("Sum Calc Application");
		System.out.println("========");
		System.out.println("1) Enter a sequence of numbers to calculate the sum");
		System.out.println("2) Enter 0 when you finish");
		System.out.print("> ");
		input = scanner.nextInt();
		sum = input;
		
		while (input != 0) {
			System.out.print("> ");
			input = scanner.nextInt();
			sum += input; 
		}
		
		System.out.println("Sum: " + sum);
		scanner.close();
	}
}
