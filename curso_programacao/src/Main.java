import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		String inputText;
		int inputInt;
		char inputChar;
		double inputDouble;
		
		
		System.out.println("Type some Inputs");
		System.out.println("Order: Start Text, Integer, Double and Final Text");
		
		inputText = scanner.next();
		inputInt = scanner.nextInt();
		inputDouble = scanner.nextDouble();
		inputChar = scanner.next().charAt(0);
		
		System.out.printf("\n");
		System.out.println("Start Text:\t\t\t" + inputText);
		System.out.println("Integer:\t\t\t" + inputInt);
		System.out.println("Double:\t\t\t\t" + inputDouble);
		System.out.println("End Text's First Character:\t" + inputChar);
		scanner.close();
	}
}
