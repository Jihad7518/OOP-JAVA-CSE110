package Excercise;

public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount("Jihad", 2000);
		
		System.out.println(account1.getOwnerName() + "->" +account1.getbalance());
		System.out.println(account2.getOwnerName() + "->" +account2.getbalance());
		
		account1.setOwnerName("Shakib");
		account1.setBalance(4000);
		
		account1.print();
		
		account1.deposite(2000);
		account2.deposite(1000);
		account1.withdraw(1000);
		account2.withdraw(500);
		
		account1.print();
		account2.print();

	}

}
