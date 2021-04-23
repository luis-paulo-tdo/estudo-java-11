import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numberOne, numberTwo, numberThree, higher;
		
		System.out.println("Greater Than Three");
		System.out.println("===================");
		System.out.println("Enter three numbers");
		
		System.out.print("> ");
		numberOne = scanner.nextInt();
		
		System.out.print("> ");
		numberTwo = scanner.nextInt();
		
		System.out.print("> ");
		numberThree = scanner.nextInt();
		
		higher = max(numberOne, numberTwo, numberThree);
		showResult(higher);
		
		scanner.close();
	}
	
	public static int max(int numberOne, int numberTwo, int numberThree) {
		int higher;
		if (numberOne > numberTwo && numberOne > numberTwo) {
			higher = numberOne;
		} else if (numberTwo > numberThree) {
			higher = numberTwo;
		} else {
			higher = numberThree;
		}
		return higher;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher Number: " + value);
	}
}
