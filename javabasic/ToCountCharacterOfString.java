package com.javabasic;


public class ToCountCharacterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "vijay dinanath chouhan" ;
		char a[] = name.toCharArray() ;
		int count = 0 ;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'a') {
				count++ ;
			}
		}	
		System.out.println("n character in String = "+count);
		
	}

}
