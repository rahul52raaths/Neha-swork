package com.rays.excercise;

public class Table2To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]arr= new int [9][10];
		
	one: for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				for (int m = 2; m <= 10; m++) {
					for (int k = 1; k <= 10; k++) {
						arr[i][j] = m*k ;
						System.out.print("  "+arr[i][j]);
					}
					System.out.println();
				}
				break one ;
			}
		}
		
}

}
