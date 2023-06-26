package Excercise;

public class RectangleDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(10.0, 5.0);
		Rectangle r2 = new Rectangle(10.0, 8.0);
		
		r1.print();
		System.out.println("Parimeter : "+r1.calcPerimeter());
		System.out.println("Area : "+r1.calcArea());
		
		System.out.println();
		
		r2.print();
		System.out.println("Parimeter : "+r2.calcPerimeter());
		System.out.println("Area : "+r2.calcArea());
		
		Rectangle[] rectangles = new Rectangle[3];
		rectangles[0] = new Rectangle (50, 20);
		double area = calculateArea(rectangles[0]);
		System.out.println("Area : "+area);
		System.out.println("Length : "+rectangles[0].getLength());
		System.out.println("Width : "+rectangles[0].getWidth());
		
		System.out.println("Number of Rectangles = " + Rectangle.getnumberofRectangles());
		
	}
	
	public static double calculateArea(Rectangle r) {
		r.setLength(100);
		r.setWidth(50);
		return r.getLength() * r.getWidth();
	}

}
