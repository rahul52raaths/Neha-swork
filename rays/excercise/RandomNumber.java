package com.rays.excercise;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i =1 ; i <= 5; i++) {
			int n= (int)(Math.random()*100);
			System.out.print("  "+n);
		}
	}

}
