//Lab01 Problem 05
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

public class Lab01_Problem05_2020360087 {

	public static void main(String[] strings) {
		double kilometers = 14.0;
		double miles = kilometers / 1.6;

		double rate = (45 * 60.0 + 30.0) / (60.0 * 60.0);
		double MilesPerHour = miles / rate;

		System.out.println("Average speed in miles per hour : "+MilesPerHour);
	}
}