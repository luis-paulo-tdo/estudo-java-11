import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		char repeat;
		double temperatureCelsius, temperatureFahrenheit;
		
		System.out.println("Celsius-Fahrenheit Converter");
		System.out.println("================================");
		
		do {
			System.out.println("Enter the temperature in Celsius");
			System.out.print("> ");
			temperatureCelsius = scanner.nextDouble();
			
			temperatureFahrenheit = 9.0 * temperatureCelsius / 5.0 + 32.0;
			System.out.printf("Equivalent temperature in Fahrenheit: %.1f°F\n", temperatureFahrenheit);
			
			System.out.println("Do you want to repeat? (s/n)");
			System.out.print("> ");
			repeat = scanner.next().charAt(0);
		} while (repeat != 'n');
		
		System.out.println("Ending Program!");
		scanner.close();
	}
}
