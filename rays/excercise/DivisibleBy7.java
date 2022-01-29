package com.rays.excercise;

public class DivisibleBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for (int i = 100; i <=200; i++) {
			if (i % 7 == 0) {
				sum = i +sum;
			}
		}
		System.out.println("sum of number divisible by 7 between 100 and 200 is = "+sum);
	}

}
