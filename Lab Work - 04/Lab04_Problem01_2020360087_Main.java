package Lab04;

import java.util.Scanner;

public class Lab04_Problem01_2020360087_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String company;
		String type;
		double price;
		
		Icecream[] icecreams = new Icecream[5];
		int i=0;
		for(i = 0; i < icecreams.length; i++) {
			System.out.println("Enter IceCream Company : ");
			company = input.next();
			System.out.println("Enter IceCream Type : ");
			type = input.next();
			System.out.println("Enter IceCream Price : ");
			price = input.nextDouble();
			icecreams[i] = new Icecream(company, type, price);
		}
		
		for(int j = 0; j < i; j++) {
			System.out.println(icecreams[j].toString());
		}
	}

}
