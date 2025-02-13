package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Alex", 0.0);
		acc1.withdraw(200.0);
		
		System.out.println(acc1.getBalance());
		
	}
}
