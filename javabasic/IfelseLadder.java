package com.javabasic;

public class IfelseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method st

		int percentage = 85 ;
		
		if (percentage > 90 && percentage <= 100) {
			System.out.println("Grade is = A++");
			
		}else if (percentage > 80 && percentage <= 90) {
			System.out.println("Grade is = A");
			
		}else if (percentage > 70 && percentage <= 80) {
			System.out.println("Grade is = B++");
			
		}else if (percentage > 60 && percentage <= 70) {
			System.out.println("Grade is = B");
			
		}else if (percentage > 50 && percentage <= 60) {
			System.out.println("Grade is = C");
			
		}else if (percentage > 40 && percentage <= 50) {
			System.out.println("Grade is = D");
			
		}else {
			System.out.println("FAIL");
		}
	}

}
