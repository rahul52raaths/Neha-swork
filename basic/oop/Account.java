package com.basic.oop;

public class Account {

	private String number ;
	private String accountType ;
	private double balance ;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double a) {
		double c = balance + a ;
		setBalance(c);
	}	
	public void withdrawal(double b) {
		if ((balance >= 1000) && ((balance-b)>=1000)) {
			setBalance(balance-b);
		} else
		{
		System.out.println("minimum balance should be 1000");
		}
	}
	public void fundTransfer(double c) {
		if ((balance >= 1000) && ((balance-c)>=1000)) {
			setBalance(balance-c);
			System.out.println("fund transfer successful.");
		} else
		{
		System.out.println("minimum balance should be 1000");
		}
	}
	public void payBill(double e) {
		if ((balance >= 1000) && ((balance-e)>=1000)) {
			setBalance(balance-e);
			System.out.println("bill is paid.");
		} else
		{
		System.out.println("minimum balance should be 1000");
		}
	}

}
	

