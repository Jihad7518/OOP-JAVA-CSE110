package Lab07;

import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Calendar dateCreated;

	public Account() {
		this.id = 0;
		this.balance = 0.0;
		this.annualInterestRate = 0.0;
		this.dateCreated = Calendar.getInstance();
	}
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = Calendar.getInstance();
	}
	public void setId(int id) {
		this.id = id;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public Calendar getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		return annualInterestRate /12;
	}
	public double getMonthlyInterestAmount(){
		return balance * getMonthlyInterestRate();
	}
	public boolean withdraw(double amount){
		if(balance-amount>=0){
			balance = balance-amount;
			return true;
		}
		else{
			System.out.println("insufficient balance");
			return false;
		}
  
	}

	public boolean deposit(double amount){
		if(balance>=0){
			balance = balance+amount;
			return true;
		}
		else{
			System.out.println("Inactive Account");
			return false;
		}
  
	}
	@Override
	public String toString() {
		return "\n Account ID : "+this.getId()
				+ "\n Date Created : "+this.getDateCreated().getTime()
				+ "\n Current balabce : $"+this.getBalance()
				+ "\n Annual Interest rate : "+this.getAnnualInterestRate()+"%"
				+ "\n Monthly Interest Amount : $"+this.getMonthlyInterestAmount();
	}
  
}
