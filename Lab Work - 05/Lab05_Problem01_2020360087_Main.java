package Lab05;

import java.util.Scanner;

public class Lab05_Problem01_2020360087_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x1, y1, x2, y2;
		
		System.out.println("Enter x1 for 1st Line : ");
		x1 = input.nextInt();
		
		System.out.println("Enter y1 for 1st Line : ");
		y1 = input.nextInt();
		
		System.out.println("Enter x2 for 1st Line : ");
		x2 = input.nextInt();
		
		System.out.println("Enter y2 for 1st Line : ");
		y2 = input.nextInt();
		
		Line l1 = new Line(x1, y1, x2, y2);
		
		
		
		System.out.println("Enter x1 for 2nd Line : ");
		x1 = input.nextInt();
		
		System.out.println("Enter y1 for 2nd Line : ");
		y1 = input.nextInt();
		
		System.out.println("Enter x2 for 2nd Line : ");
		x2 = input.nextInt();
		
		System.out.println("Enter y2 for 2nd Line : ");
		y2 = input.nextInt();
		
		Line l2 = new Line(x1, y1, x2, y2);

		System.out.println(isInersecting(l1, l2));
		
		
	}
	
	public static boolean isInersecting(Line l1, Line l2) {
		if(l1.findSlope() == l2.findSlope()) {
			return false;
		}
		else {
			return true;
		}
	}

}
