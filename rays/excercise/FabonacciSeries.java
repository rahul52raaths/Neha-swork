package com.rays.excercise;

public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 0, b= 1, c;
		int number= 8;
				
		for (int i = 1; i <= number; i++) {
			System.out.print("  "+a);
			c= a + b;
			a= b;
			b= c;
		}
	}

}
