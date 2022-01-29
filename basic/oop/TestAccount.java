package com.basic.oop;

public class TestAccount {

	public static void main(String[] args) {
		Account  a = new Account() ;
		a.setAccountType("saving");
		System.out.println(a.getAccountType());
		a.setNumber("1234");
		System.out.println("account number = "+a.getNumber());
		a.setBalance(2000);
		System.out.println("balance is = "+a.getBalance());
		a.deposit(2000);
		System.out.println(a.getBalance());
		a.fundTransfer(1000);
		System.out.println(a.getBalance());
		a.payBill(500);
		System.out.println(a.getBalance());
		
	}

}
