package Excercise;

public class CreditCards {
	private String cardNumber;
	private double cardLimit;
	private String billPaymentDate;
	private double currentOutsdanting;
	
	public String getCardNumber() {
		return cardNumber;
	}
	public double getCardLimit() {
		return cardLimit;
	}
	public String getBillPaymentDate() {
		return billPaymentDate;
	}
	public double getCurrentOutsdanting() {
		return currentOutsdanting;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public void setCardLimit(double cardLimit) {
		this.cardLimit = cardLimit;
	}
	public void setBillPaymentDate(String billPaymentDate) {
		this.billPaymentDate = billPaymentDate;
	}
	public void setCurrentOutsdanting(double currentOutsdanting) {
		this.currentOutsdanting = currentOutsdanting;
	}
	
	public CreditCards() {
		super();
	}
	public CreditCards(String cardNumber, double cardLimit, String billPaymentDate, double currentOutsdanting) {
		super();
		this.cardNumber = cardNumber;
		this.cardLimit = cardLimit;
		this.billPaymentDate = billPaymentDate;
		this.currentOutsdanting = currentOutsdanting;
	}
	
	@Override
	public String toString() {
		return "CreditCards [cardNumber=" + cardNumber + ", cardLimit=" + cardLimit + ", billPaymentDate="
				+ billPaymentDate + ", currentOutsdanting=" + currentOutsdanting + "]";
	}
	
	
	
	
	
	
}
