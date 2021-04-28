package entities;

import entities.enums.Color;

public class Rectangle extends Shape {
	
	private Double height;
	private Double width;
	
	public Rectangle() {
		super();
	}

	public Rectangle(Color color, double height, double width) {
		super(color);
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		return height * width;
	}
	
	public String toString() {
		return "Rectangle: " + String.format("%.2f", area());
	}
}
