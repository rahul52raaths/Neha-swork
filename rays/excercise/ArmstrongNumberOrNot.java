package com.rays.excercise;
import java.util.Scanner;

public class ArmstrongNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number ,remainder =0, sumarm =0 , count =0;
		Scanner n= new Scanner(System.in);
		System.out.println("enter a number = ");
		number = n.nextInt();
		int temp =number;
		
		while (temp != 0) {
			temp = temp / 10;
			count++ ;
		}
		temp = number;
	while (temp != 0) {
		remainder = temp % 10;
		sumarm = sumarm + (int)Math.pow(remainder, count); 
		temp = temp / 10;
	}
	
	if (number == sumarm) {
		System.out.println(number+" is armstrong number");
	}
	else {
		System.out.println(number+" is not armstrong number");
	}
	}

}
