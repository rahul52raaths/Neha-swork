package com.TryCatchFinally;

public class TestAccount {
public static void main(String[] args){
	
	Account a = new Account();
	a.setAccountType("saving");
	System.out.println("account type = "+a.getAccountType());
	a.setNumber("ac1234");
	System.out.println("account number = "+a.getNumber());
	a.setBalance(1000);
	System.out.println("balance is = "+a.getBalance());
	try {
		a.withdrawal(700);
	} catch (InsaficientFoundException e) {
		System.err.println(e.getMessage());
	}
	System.out.println("balance is = "+a.getBalance());
	
  }
}
