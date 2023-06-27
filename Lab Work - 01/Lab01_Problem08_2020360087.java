//Lab01 Problem 08
//Student ID: 2020-3-60-087
//Student Name: Md. Jihad

import java.util.*;
public class Lab01_Problem08_2020360087 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print ("Enter Any Number : ");
		int num = input.nextInt();

		if ((num % 2 == 0 || num % 3 == 0) && !(num % 2 == 0 && num % 3 == 0)){
			System.out.println (" TRUE ");
		}
		else{
			System.out.println (" FALSE ");
		}
	}
}