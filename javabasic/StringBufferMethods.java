package com.javabasic;

public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("vijay");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.charAt(2));
		System.out.println(sb.replace(2, 4 , "nn"));
		System.out.println(sb.lastIndexOf("i"));
		System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println(sb.lastIndexOf("i"));
		
		StringBuffer sb1 = new StringBuffer("java");
		System.out.println(sb1.capacity());
	}

}
