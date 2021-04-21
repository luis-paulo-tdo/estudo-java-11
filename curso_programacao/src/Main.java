import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String productOne = "Computer";
		String productTwo = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'M';
		
		double priceOne = 2100.0;
		double priceTwo = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $%.2f\n", productOne, priceOne);
		System.out.printf("%s, which price is $%.2f\n\n", productTwo, priceTwo);
		
		System.out.printf("Record: %d years old, code %d and gender: %c\n\n", age, code, gender);
		
		System.out.printf("Measure with eight decimal places: %.8f\n", measure);
		System.out.printf("Measure with three decimal places: %.3f\n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("Measure with US decimal point: %.3f\n", measure);
	}
}
