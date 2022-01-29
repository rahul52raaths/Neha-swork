package com.basic.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		Person t = new Person() ;
		
		t.setName("neha");
		System.out.println(t.getName());
		t.setAddress("mhow indore");
		System.out.println(t.getAddress());
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ;
		
		
		System.out.println(t.getAge(30));
		
	}

}
