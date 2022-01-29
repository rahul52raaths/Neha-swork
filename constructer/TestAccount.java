package com.constructer;

public class TestAccount {

	public static void main(String[] args) {
		
		SavingAccount s = new SavingAccount();
		Account a = new Account();
		Account as  = new SavingAccount();
		
		System.out.println(s.getAmount());
		System.out.println(a.getAmount());
		System.out.println(as.getAmount());
	}
}
