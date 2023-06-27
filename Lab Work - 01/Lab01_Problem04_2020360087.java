//Lab01_Problem04
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad


import java.util.*;


public class Lab01_Problem04_2020360087 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double perimeter, area, radius;
        
        System.out.print("Enter the radius of the Circle : ");
        radius = input.nextInt();
        
	perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;

	System.out.println("Perimeter of the Circle : "+perimeter);
        System.out.println("Area of the Circle : "+area);
        
    } 
}