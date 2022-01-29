package com.rays.excercise;

import java.util.Iterator;

public class MissingElementProblem17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {34, 54, 76, 86, 93, 59, 45, 66};
		int b[]= {76, 93, 59, 54, 45, 66, 34};
		
	one: for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] ==  b[j]) {
					continue one ;
				}	
			}
			System.out.print(" "+a[i]);
		}
		
	}

}
