package com.basic.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class Person {

	private String name ;
	private Date dob ;
	private String address ;
	public static int AVG_AGE ;
	
	public void setName(String name) {
		this.name = name ;
	}
	public String getName(){
		return name ;
	}
	public void setAddress(String address) {
		this.address = address ;
	}
	public String getAddress(){
		return address ;
	}
	public void setDob(Date dob) {
		this.dob = dob ;
	}
	public Date getDob() {
		return dob ;
	}
	public int getAge(int AVG_AGE) {
		return AVG_AGE ;
	}
	
}
