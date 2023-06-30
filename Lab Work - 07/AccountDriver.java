package Lab07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AccountDriver {
public static void main(String args[]){
// Defining an Array/ArrayList of Account type objects in Main method
ArrayList<Account> listAccount= new ArrayList<Account>();//Creating arraylist of Account class
int id = 100;
double balance;
double annualInterestRate = 4.5;
double overdraft;
int accountNo=0;
do{

System.out.println("Press (1) for creating a Checking Account");
System.out.println("Press (2) for creating a Savings Account");
Scanner sc = new Scanner(System.in);
System.out.print("Enter Choice : ");
int choice = sc.nextInt();
switch(choice){   

case 1:
accountNo++;
id++;
System.out.print("Enter the Balance : ");
balance = sc.nextDouble();
System.out.print("Enter the overdraft limits : ");
overdraft = sc.nextDouble();
CheckingAccount obj1 = new CheckingAccount(id,balance,annualInterestRate,overdraft);
listAccount.add(obj1);
break;

case 2:
accountNo++;
id++;
Random rnd = new Random();
long smallest = 1000_0000_0000_0000L;
long biggest = 9999_9999_9999_9999L;
long cardNo = ThreadLocalRandom.current().nextLong(smallest, biggest+1);
System.out.print("Enter the Balance : ");
balance = sc.nextDouble();
SavingsAccount obj = new SavingsAccount(id,balance,annualInterestRate,cardNo);
listAccount.add(obj);
break;
}
System.out.println("");
}while(accountNo<4);

// print the details of each Account :
for(int i = 0;i<listAccount.size();i++){
System.out.println("\n****************************************************************************************");
System.out.println(listAccount.get(i));
System.out.println("****************************************************************************************");
  
}
//perform one deposit and one withdraw operation for each account.
for(int i = 0;i<listAccount.size();i++){
listAccount.get(i).deposit(200);
listAccount.get(i).withdraw(500);
}
System.out.println("\nAccounts Details after perform one deposit(200) and one withdraw(500)operation for each account\n");
// print the details of each Account :
for(int i = 0;i<listAccount.size();i++){
System.out.println("\n****************************************************************************************");
System.out.println(listAccount.get(i));
System.out.println("****************************************************************************************");
  
}
  
}
  
}
