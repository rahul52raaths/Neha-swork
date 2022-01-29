package com.rays.excercise;

public class ReverseOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number= 12345;
		int reverse= 0, remainder =0 ;
		System.out.println("number is ="+number);
		while(number!=0) {
			remainder= number% 10;
			reverse= reverse*10 + remainder;
			number= number/10;
		}
	
		System.out.println("Reverse of the number is ="+reverse);
	}

}
