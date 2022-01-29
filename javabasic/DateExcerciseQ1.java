package com.javabasic;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateExcerciseQ1 {
	
	private Date dob;
	
public void getDob() {
		System.out.println(dob);
	}
	public void setDob(Date dob) {
		
		this.dob = dob;
	}

public static void main(String[] args) throws ParseException {
	
	/*String dob = "2000" ;
	int dob1 = Integer.parseInt(dob);
	SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
	Date d = new Date();
	String str = sdf.format(d);
	int str1 = Integer.parseInt(str);
	int count = 0 ;
	while (dob1 != str1) {
		dob1++ ;
		count++ ;
	}
	System.out.println("employee age = "+count+" years");
	}
	*/
	 
	DateExcerciseQ1 de= new  DateExcerciseQ1();
	
	SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
	de.setDob((Date) format.parse("05/02/1991"));
	de.getDob();
	

}
}
