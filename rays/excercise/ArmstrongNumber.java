package com.rays.excercise;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number= 153;
		int remainder =0, sum =0, temp= number;
		while (temp != 0) {
			remainder= temp % 10;
			sum = sum + (int)Math.pow(remainder, 3);
			temp =temp/ 10;
		}
		if (number == sum) {
			System.out.println("given "+number+" is armstrong number");
		}
		else {
			System.out.println(+number+" is not armstrong number");
		}
	}
}
