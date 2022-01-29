package com.rays.excercise;

import java.util.Scanner;
import java.util.Scanner;

public class palindromeNumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number ;
		int reverse= 0, remainder =0 ,temp ;
		Scanner n = new Scanner(System.in);
		System.out.println("enter a number = ");
		number = n.nextInt();
		temp = number ;
		System.out.println("number is ="+number);
		
		while(number!=0) {
			remainder= number% 10;
			reverse= reverse*10 + remainder;
			number= number/10;
		}
		
		System.out.println("reverse of a number is = "+reverse);
		if (reverse == temp) {
			System.out.println(" number is palidrome");
		}
		else {
			System.out.println(" number is palidrome");
		}
	}
}
