package com.constructer;

public class Employee extends Person {

	private String designation;
	
	public Employee() {
		System.out.println("empployee default");
	}
	public Employee(String fn, String ln, String des) {
		
		designation = des;
		System.out.println("employee 3 para "+fname+" "+lname+" "+designation);
	}
	
	
}
