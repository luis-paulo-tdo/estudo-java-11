import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double valueOne = 3.0;
		double valueTwo = 4.0;
		double valueThree = -5.0;
		double resultOne, resultTwo, resultThree;
		
		System.out.println("VALUES");
		System.out.println("One:\t" + valueOne);
		System.out.println("Two:\t" + valueTwo);
		System.out.println("Three:\t" + valueThree);
		System.out.println();
		
		resultOne = Math.sqrt(valueOne);
		resultTwo = Math.sqrt(valueTwo);
		resultThree = Math.sqrt(25.0);
		System.out.println("SQUARE ROOTS");
		System.out.println("One:\t" + resultOne);
		System.out.println("Two:\t" + resultTwo);
		System.out.println("25.0:\t" + resultThree);
		System.out.println();
		
		resultOne = Math.pow(valueOne, valueTwo);
		resultTwo = Math.pow(valueOne, 2.0);
		resultThree = Math.pow(5.0, 2.0);
		System.out.println("SQUARE ROOTS");
		System.out.println("One of Two:\t" + resultOne);
		System.out.println("Two of 2.0:\t" + resultTwo);
		System.out.println("5.0 of 2.0:\t" + resultThree);
		System.out.println();
		
		resultTwo = Math.abs(valueTwo);
		resultThree = Math.abs(valueThree);
		System.out.println("ABSOLUTES");
		System.out.println("Two:\t" + resultTwo);
		System.out.println("Three:\t" + resultThree);
	}
}
