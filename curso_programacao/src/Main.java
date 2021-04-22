import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many minutes of phone did you use?");
		int minutes = scanner.nextInt();
		double bill = 50.0;
		
		if (minutes > 100) {
			bill += (minutes - 100) * 2.0;
		}
		System.out.printf("Telephone bill value: $%.2f", bill);
		scanner.close();
	}
}
