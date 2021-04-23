package entities;

public class Triangle {
	
	public double sideA;
	public double sideB;
	public double sideC;
	
	public double area() {
		double perimeter = (sideA + sideB + sideC) / 2.0;
		return Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
	}
}
