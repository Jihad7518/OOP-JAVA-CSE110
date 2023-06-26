package Excercise;

//import java.util.Scanner;

public class IceCreamDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner input = new Scanner(System.in);
		char choice;
		String type, company;
		double price;
		IceCream[] icecreams = new IceCream[10];
		
		int i =0;
		while(true) {
			System.out.println("Do You Want to Create an Icecreame type Object? (y/n)");
			choice = input.next().charAt(0);
			if(choice == 'y') {
				System.out.println("Enter IceCream Type : ");
				type = input.next();
				System.out.println("Enter IceCream Company : ");
				company = input.next();
				System.out.println("Enter IceCream Price : ");
				price = input.nextDouble();
				icecreams[i] = new IceCream(type, company, price);
				i++;
			}
			else {
				break;
			}
			
		}
		
		for(int j = 0; j < i; j++) {
			System.out.println(icecreams[j].toString());
		}
		*/
		
		IceCream i1 = new IceCream("Vanilla", "Zaa'n Zee", 280);
		System.out.println(i1.toString());
		
		IceCream i2 = new IceCream("Chocolate", "Polar", 250);
		System.out.println(i2.toString());
		
		System.out.println(i1.equals(i2));
		
		System.out.println(i1.compareTo(i2));
		
		
	}

}
