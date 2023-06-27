package Lab04;

public class Books {
	private int ISBN;
	private String bookTitle;
	private int numberOfPages;
	private static int count = 0;
	
	
	public int getISBN() {
		return ISBN;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public Books() {
		count++;
	}
	public Books(int iSBN, String bookTitle, int numberOfPages) {
		ISBN = iSBN;
		this.bookTitle = bookTitle;
		this.numberOfPages = numberOfPages;
		count++;
	}
	public static int getnumberofbooks() {
		return count;
	}
	
	@Override
	public String toString() {
		String str = new String("ISBN of the Book : " + ISBN + "\n");
		str += new String("Title of the Book : " + bookTitle + "\n");
		str += new String("Number of Pages of the Book : " + numberOfPages + "\n");
		str += new String("----------------------------------------------");
		return str;
	}
	
	public int compareTo(Books B) {
		if(this.getNumberOfPages() > B.getNumberOfPages()) {
			return 1;
		}
		else if(this.getNumberOfPages() == B.getNumberOfPages()) {
			return 0;
		}
		else {
			return -1;
		}
		
	}
	
	
	
	
	
	
	
}
