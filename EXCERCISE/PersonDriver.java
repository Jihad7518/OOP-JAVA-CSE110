package Excercise;

import java.util.*;

public class PersonDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar dateofbirth = Calendar.getInstance();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Person's Name : ");
		String name = input.nextLine();
		
		System.out.print("Enter Person's ID : ");
		int id = input.nextInt();
		
		System.out.print("Enter Date of Birth (Day) : ");
		int day = input.nextInt();
		System.out.print("Enter Date of Birth (Month) : ");
		int month = input.nextInt();
		System.out.print("Enter Date of Birth (Year) : ");
		int year = input.nextInt();
		
		System.out.println();
		System.out.println("--------Person's Details---------");
		
		dateofbirth.set(Calendar.DAY_OF_MONTH, day);
		dateofbirth.set(Calendar.MONTH, month);
		dateofbirth.set(Calendar.YEAR, year);
		
		Person p = new Person(id, name, dateofbirth);
		System.out.println(p.toString());
		
		
	}

}
