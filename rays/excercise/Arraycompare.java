package com.rays.excercise;

import java.util.Iterator;

public class Arraycompare {
	public void num(int number) {
	  System.out.println(number);
	}
	public void arrnum() {
		int numberarray1[] = {15,13,12,9,6,4,1} ;
		for (int i = 0; i < numberarray1.length; i++) {
			System.out.print(numberarray1[i]+" "); 
		}
		
	}
	public static void main(String[] args) {
		Arraycompare t =new Arraycompare() ;
		t.num(12);
		t.arrnum();
		
	}

}
