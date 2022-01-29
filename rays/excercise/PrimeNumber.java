package com.rays.excercise;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, count = 0;
		Scanner n = new Scanner(System.in);
		System.out.println("enter a number = ");
		number = n.nextInt();
		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++ ;
			}
		}
		if (count == 2) {
			System.out.println("Given "+number+" is prime number");
		}
		else {
			System.out.println("Given "+number+" is not prime number");
		}
	}

}
