package Excercise;

public class BankAccount {
	public String ownerName;
	public double balance;
	
	public BankAccount() {
		System.out.println("Inside no-arg constructor");
	}
	
	public BankAccount(String ownerName, double balance) {
		System.out.println("Inside constructor with args");
		this.ownerName = new String(ownerName);
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		System.out.println("Inside Deposite method");
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		System.out.println("Inside Withdraw method");
		this.balance -= amount;
	}
	
	public double getbalance() {
		return this.balance;
	}
	
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = new String(ownerName);
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void print() {
		System.out.println("Owner Name : "+this.ownerName);
		System.out.println("Balance : "+this.balance);
	}
	
}
