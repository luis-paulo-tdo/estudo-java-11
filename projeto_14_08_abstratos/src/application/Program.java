package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<Shape>();
		int shapeQuantity;
		
		System.out.println("Shapes Manager");
		System.out.println("==========================");
		System.out.print("Enter the number of shapes: ");
		shapeQuantity = scanner.nextInt();
		
		for (int index = 1; index <= shapeQuantity; ++index) {
			
			String color;
			char shapeType;
			
			System.out.println();
			System.out.println("Shape #" + index + " data");
			
			System.out.print("Rectangle or Circle? (r/c) ");
			shapeType = scanner.next().charAt(0);
			scanner.nextLine();
			
			System.out.print("Color (BLACK/RED/BLUE): ");
			color = scanner.nextLine();
			
			if (shapeType == 'r') {
				double width, height;
				System.out.print("Width: ");
				width = scanner.nextDouble();
				System.out.print("Height: ");
				height = scanner.nextDouble();
				shapes.add(new Rectangle(Color.valueOf(color), height, width));
			} else {
				double radius;
				System.out.print("Radius: ");
				radius = scanner.nextDouble();
				shapes.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
		
		scanner.close();
	}

}
