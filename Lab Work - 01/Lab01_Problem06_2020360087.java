//Lab01 Problem 06
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import java.util.*;
public class Lab01_Problem06_2020360087 {
	public static void main(String[] strings) {
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter kilometers : ");
		double kilometers = input.nextDouble();

		System.out.print ("Enter minutes : ");
		int minutes = input.nextInt();

		System.out.print ("Enter seconds : ");
		int seconds = input.nextInt();

		double miles = kilometers / 1.6;
		double rate = (minutes * 60.0 + seconds) / (60.0 * 60.0);
		double MilesPerHour = miles / rate;
		
		System.out.println("Average speed in miles per hour : "+MilesPerHour);
	}
}