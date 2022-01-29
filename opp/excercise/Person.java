package com.opp.excercise;

public abstract class Person {

	private String firstName ;
	private String lastName ;
	
	public Person() {}
	
	public Person(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln ;
	}
	
	public abstract String toString();
}
