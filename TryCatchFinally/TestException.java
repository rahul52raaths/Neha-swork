package com.TryCatchFinally;

public class TestException {
public static void main(String[] args) {
	try {
	String s = "java";
	System.out.println(s.charAt(4));
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	try {
		String s1 = null;
		System.out.println(s1.length());
	}catch(NullPointerException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	try {
		int a[] = {1,4,5,25,7,74};
		System.out.println(a[6]);
	}catch(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
