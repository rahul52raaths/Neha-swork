package com.TryCatchFinally;

public class TestTryCatch {
public static void main(String[] args) {
	 try {
			double d = 15/3;
			System.out.println(d);
			String s = "java";
			System.out.println(s.length());
			System.out.println(s.charAt(2));
		}catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}catch (Exception e) {
		    System.err.println(e.getMessage());
		}finally {
			
			System.out.println("i am finally");
		}
	
/*
   try {
		double d = 15/3;
		System.out.println(d);
		String s = "java";
		System.out.println(s.length());
		System.out.println(s.charAt(4));
	}catch(ArithmeticException e) {
		System.err.println(e.getMessage());
	}catch (Exception e) {
	    System.err.println(e.getMessage());
	    System.exit(0);
	}finally {
		
		System.out.println("i am finally");
	}
*/   
   
 }
}
