import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int valueOne = 32;
		double valueTwo = 10.35784;
		
		String name = "Lemmy";
		int age = 70;
		double earnings = 4000.0;
		
		System.out.println("Hello World!");
		System.out.println("Integer: " + valueOne);
		System.out.println("Double: " + valueTwo);
		System.out.printf("Double (Precision 2): %.2f%n", valueTwo);
		System.out.printf("Double (Precision 4): %.4f\n", valueTwo);
		
		Locale.setDefault(Locale.US);
		System.out.printf("Double with US Locale: %.4f%n", valueTwo);
		System.out.printf("%s is %d and earns $%.2f.", name, age, earnings);
	}
}
