import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Purchase Price");
		System.out.print("> ");
		double priceInput = scanner.nextDouble();
		double price = priceInput > 20.0 ? priceInput * 0.05 : priceInput * 0.1	;
		
		if (priceInput > 20.0) {
			System.out.println("Discount applied!");
		}
		System.out.printf("Price: $%.2f", price);
		scanner.close();
	}
}
