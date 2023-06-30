package Lab07;

import java.util.Calendar;

class CheckingAccount extends Account{
private double overdraft;

public CheckingAccount() {
super();
overdraft = 0.0;
}

public CheckingAccount(int id, double balance, double annualInterestRate,double overdraft) {
super(id, balance, annualInterestRate);
this.overdraft = overdraft;
}

public double getOverdraft() {
return overdraft;
}

public void setOverdraft(double overdraft) {
this.overdraft = overdraft;
}
  
@Override
public String toString() {
return "This is Checking Account" +super.toString()
+"\n Overdraft Limit : $"+ this.getOverdraft();
}
  
  
}
