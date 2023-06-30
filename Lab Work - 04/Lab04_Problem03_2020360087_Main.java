package Lab04;

public class Lab04_Problem03_2020360087_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction(1, 4);
		
		Fraction f2 = new Fraction(3, 5);
		
		f1.add(f2);
		System.out.println("Addition on Fraction 1 : " +f1);
		
		Fraction f3 = new Fraction(2,7);
		
		f1.sub(f3);
		System.out.println("Substraction on Fraction 1 : " + f1);
		
		Fraction f4 = new Fraction(5,6);
		
		f1.multipication(f4);
		System.out.println("Multification on Fraction 1 : " + f1);
		
		Fraction f5 = new Fraction(2,3);
		
		f1.divison(f5);
		System.out.println("Division on Fraction 1 : " + f1);
		
		
	}

}
