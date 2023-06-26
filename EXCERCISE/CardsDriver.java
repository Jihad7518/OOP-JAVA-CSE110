package Excercise;

import java.util.Scanner;

public class CardsDriver {
	public static void main(String[] args) {
		
		String cardNumber;
		double cardLimit;
		String billPaymentDate;
		double currentOutsdanting;
		
		Scanner input = new Scanner(System.in);
		CreditCards cards[] = new CreditCards[5];
		
		System.out.println("Enter Credit Cards Details : ");
		
		int i=0;
		for(i = 0; i < cards.length; i++) {
			System.out.println("-----------------Credit Card"+(i+1)+"-----------------");
			System.out.println("Enter Credit Cards Number : ");
			cardNumber = input.next();
			System.out.println("Enter Card Limit : ");
			cardLimit = input.nextDouble();
			System.out.println("Enter Last Bill Payment Date : ");
			billPaymentDate = input.next();
			System.out.println("Enter the Current Outsdanting : ");
			currentOutsdanting = input.nextDouble();
			cards[i] = new CreditCards(cardNumber, cardLimit, billPaymentDate, currentOutsdanting);
		}
		
		for(int j = 0; j < i; j++) {
			System.out.println(cards[j].toString());
		}
		
		
		
		
	}
}
