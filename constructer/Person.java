package com.constructer;

public class Person {

	protected String fname ;
	protected String lname;
	protected String address;
	
	public Person() {
		System.out.println("person default");
	}

	public Person(String fn , String ln) {
	
    fname = fn ;
    lname = ln ;
    System.out.println("person 2 para "+fname+" "+lname);
    }
	
	public Person(String fn , String ln , String add) {
	    this(fn, ln);
	    address = add ;
	    System.out.println("person 3 para "+fname+" "+lname+" "+address);
	    }
	
}
