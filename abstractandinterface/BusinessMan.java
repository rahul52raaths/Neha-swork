package com.abstractandinterface;

public class BusinessMan implements Richman, SocialWorker{

	public void helpToOthers() {
	System.out.println("help to others");
	}

	public void earnMoney() {
	System.out.println("earn money");
	}

	public void donation() {
	System.out.println("donation");
	}

	public void party() {
	System.out.println("party");
	}
	
	public static void main(String[] args) {
		Richman r = new BusinessMan();
		SocialWorker s = new BusinessMan();
		BusinessMan b = new BusinessMan();
		
		b.helpToOthers();
		b.donation();
		b.earnMoney();
		b.party();
		
		r.donation();
		r.earnMoney();
		r.party();
		
		s.helpToOthers();
		
	}

	
}
