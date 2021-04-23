package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double triOneA, triOneB, triOneC;
		double triTwoA, triTwoB, triTwoC;
		double tOnePerim, tTwoPerim;
		double triOneArea, triTwoArea;
		
		System.out.println("Triangle Area Comparator");
		System.out.println("===================================");
		
		System.out.println("Enter the measures of Triangle One:");
		System.out.print("> ");
		triOneA = scanner.nextDouble();
		System.out.print("> ");
		triOneB = scanner.nextDouble();
		System.out.print("> ");
		triOneC = scanner.nextDouble();
		
		System.out.println("Enter the measures of Triangle Two:");
		System.out.print("> ");
		triTwoA = scanner.nextDouble();
		System.out.print("> ");
		triTwoB = scanner.nextDouble();
		System.out.print("> ");
		triTwoC = scanner.nextDouble();
		
		tOnePerim = (triOneA + triOneB + triOneC) / 2.0;
		tTwoPerim = (triTwoA + triTwoB + triTwoC) / 2.0;
		
		triOneArea = Math.sqrt(tOnePerim * (tOnePerim - triOneA) * (tOnePerim - triOneB) * (tOnePerim - triOneC));
		triTwoArea = Math.sqrt(tTwoPerim * (tTwoPerim - triTwoA) * (tTwoPerim - triTwoB) * (tTwoPerim - triTwoC));
		
		System.out.printf("Triangle One Area: %.4f\n", triOneArea);
		System.out.printf("Triangle Two Area: %.4f\n", triTwoArea);
		
		if (triOneArea > triTwoArea) {
			System.out.println("Triangle One has the larger area!");
		} else {
			System.out.println("Triangle Two has the larger area!");
		}
		
		scanner.close();
	}
}
