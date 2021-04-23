package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Triangle triangleOne = new Triangle();
		Triangle triangleTwo = new Triangle();
		double triangleOneArea, triangleTwoArea;
		
		System.out.println("Triangle Area Comparator");
		System.out.println("===================================");
		
		System.out.println("Enter the measures of Triangle One:");
		System.out.print("> ");
		triangleOne.sideA = scanner.nextDouble();
		System.out.print("> ");
		triangleOne.sideB = scanner.nextDouble();
		System.out.print("> ");
		triangleOne.sideC = scanner.nextDouble();
		
		System.out.println("Enter the measures of Triangle Two:");
		System.out.print("> ");
		triangleTwo.sideA = scanner.nextDouble();
		System.out.print("> ");
		triangleTwo.sideB = scanner.nextDouble();
		System.out.print("> ");
		triangleTwo.sideC = scanner.nextDouble();
		
		triangleOneArea = triangleOne.area();
		triangleTwoArea = triangleTwo.area();
		
		System.out.printf("Triangle One Area: %.4f\n", triangleOneArea);
		System.out.printf("Triangle Two Area: %.4f\n", triangleTwoArea);
		
		if (triangleOneArea > triangleTwoArea) {
			System.out.println("Triangle One has the larger area!");
		} else {
			System.out.println("Triangle Two has the larger area!");
		}
		
		scanner.close();
	}
}
