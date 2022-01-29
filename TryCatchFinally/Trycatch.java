package com.TryCatchFinally;

public class Trycatch {
public static void main(String[] args) {
	try {
		double d = 15/3;
		System.out.println(d);
		String s = "";
		System.out.println(s.length());
		System.out.println(s.charAt(4));
	}catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}catch (Exception e) {
	    System.out.println(e.getMessage());
	}finally {
		System.out.println("i am finally");
	}
}
}
