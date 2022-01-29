package com.TryCatchFinally;

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
	public void withdrawal(double b) throws InsaficientFoundException {
		
		if ((balance >= 500) && ((balance-b)>=500)) {
			setBalance(balance-b);
			}else {
				throw new InsaficientFoundException();
			}
		
	
	
	}

}
