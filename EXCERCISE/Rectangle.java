package Excercise;

public class Rectangle {
	private double length;
	private double width;
	private static int numberOfRectangles =0;
	
	public Rectangle() {
		System.out.println("Inside no-arg constructor");
		numberOfRectangles++;
	}
	
	public Rectangle(double length, double width) {
		System.out.println("Inside constructor with args");
		this.length = length;
		this.width = width;
		numberOfRectangles++;
	}
	
	static int getnumberofRectangles() {
		return numberOfRectangles;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	double calcPerimeter() {
		return 2*(this.length + this.width);
	}
	
	double calcArea() {
		return this.length * this.width;
	}
	
	public void print() {
		System.out.println("Length = "+this.length);
		System.out.println("Width = "+this.width);
	}
	
}
