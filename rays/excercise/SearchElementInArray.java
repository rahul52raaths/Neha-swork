package com.rays.excercise;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {12, 58, 65, 47, 35, 72, 99} ;
		int search = 72 ;
		for (int i : arr) {
			if (search == i) {
				System.out.println("Search element found in array");
			}
		}
		
	}

}
