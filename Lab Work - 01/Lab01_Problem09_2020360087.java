//Lab01 Problem 09
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import java.util.*;
public class Lab01_Problem09_2020360087 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter minutes : ");
		int minutes = input.nextInt();

		int years = minutes / 525600;

		int days = (minutes % 525600) / 1440;

		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	}
}