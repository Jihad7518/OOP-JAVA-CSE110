package Lab07;

import java.util.Calendar;

public class SavingAccount extends Account{
	private long cardNo;
	private Calendar expiryDate;

	public SavingAccount() {
		
	}

	public SavingAccount(int id, double balance, double annualInterestRate,long cardNo) {
		super(id, balance, annualInterestRate);
		this.cardNo = cardNo;
		this.expiryDate = Calendar.getInstance();
		expiryDate.add(Calendar.YEAR, 5); // add 5 years in current date

	}

	public long getCardNo() {
		return cardNo;
	}

	public Calendar getExpiryDate() {
		return expiryDate;
	}
  
	public double getCreditBalance(){
		return 3*getBalance();
	}

	@Override
	public String toString() {
		return "This is Savings Account"+super.toString()
				+ "\n Credit Card Number : "+this.getCardNo()
				+ "\n Card Expiry Date : "+this.getExpiryDate().getTime()
				+ "\n Credit Balance : &"+this.getCreditBalance();
	}
  
}
