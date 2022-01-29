package com.opp.excercise;

public class TestRichman {
public static void main(String[] args) {
	BussinessMan b = new BussinessMan();
	Student s = new Student();
	Richman rb = new BussinessMan();
	Richman rs = new Student();
	System.out.println("BussinessMan :");
	b.donation();
	b.party();
	System.out.println("student :");
	s.donation();
	s.party();
	System.out.println("richman bussinessman :");
	rb.donation();
	rb.party();
	System.out.println("richman student :");
	rs.donation();
	rs.party();
	
	}
}
