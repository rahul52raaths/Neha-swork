package com.javabasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
public class DateFormatExcerciseQ3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("start date = "+args[0]);
		System.out.println("End date = "+args[1]);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY") ;
		Date d = (Date) sdf.parse(args[0]);
		Date d1 = (Date) sdf.parse(args[1]);
		if (d.after(d1)) {
			System.out.println("End Date is less than Start date.");
		}else {
			System.out.println("End Date is more than Start date.");
		}
	}

}
