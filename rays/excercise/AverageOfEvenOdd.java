package com.rays.excercise;

import java.util.Iterator;

public class AverageOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 12 ,sumeven = 0, sumodd =0, countEven= 0, countOdd =0;
		double averageEven =0, averageOdd =0;
		
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				sumeven = sumeven + i ;
				countEven++;
			}
			else {
		        sumodd = sumodd + i;
		        countOdd++;
			}
		}
		averageEven =sumeven / countEven ;
		averageOdd =sumodd / countOdd ;
		
		System.out.println("Average of even numbers = "+averageEven);
		System.out.println("Average of odd numbers = "+averageOdd);
	
	}

}
