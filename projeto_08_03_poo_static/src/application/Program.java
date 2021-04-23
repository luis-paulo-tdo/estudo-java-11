package application;

import java.util.Locale;
import java.util.Scanner;

import util.SphereGenerator;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		double radius, circumference, volume;
		
		System.out.println("Sphere Creator");
		System.out.println("==================");
		System.out.println("Enter a number");
		
		System.out.print("> ");
		radius = scanner.nextDouble();
		circumference = SphereGenerator.circumference(radius);
		volume = SphereGenerator.volume(radius);
		
		System.out.println();
		System.out.println("Sphere created!");
		System.out.printf("Circumference:\t%.2f\n", circumference);
		System.out.printf("Volume:\t\t%.2f\n", volume);
		System.out.printf("PI Value:\t\t%.2f\n", SphereGenerator.PI);
		
		scanner.close();
	}
}
