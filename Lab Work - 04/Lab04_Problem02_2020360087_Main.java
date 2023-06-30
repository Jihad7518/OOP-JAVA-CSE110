package Lab04;

import java.util.Scanner;

public class Lab04_Problem02_2020360087_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int ISBN;
		String bookTitle;
		int numberOfPages;
		
		Books[] books = new Books[5];
		
		for(int i = 0; i < books.length; i++) {
			System.out.println("-----------------Book"+(i+1)+"-----------------");
			System.out.print("Enter ISBN of the Book : ");
			ISBN = input.nextInt();
			System.out.print("Enter the Title of the Book : ");
			bookTitle = input.next();
			System.out.print("Enter the Number of Pages of the Book : ");
			numberOfPages = input.nextInt();
			books[i] = new Books(ISBN, bookTitle, numberOfPages);
			
		}
		
		displayAll(books);
		System.out.println(books[0].compareTo(books[1]));
		System.out.println(isHeavier(books[1]));
		System.out.println(Books.getnumberofbooks());
		
		
		
	}
	
	public static void displayAll(Books[] b) {
		for(int i = 0; i<b.length; i++) {
			System.out.println();
			System.out.println(b[i].toString());
		}
	}
	
	
	public static boolean isHeavier(Books b) {
		if(b.getNumberOfPages() > 500) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
