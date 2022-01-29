package com.rays.excercise;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {34, 54, 76, 86, 93, 59, 45, 66};
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
	System.out.println("largest element in array is = "+max);
	
	}

}
