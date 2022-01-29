package com.TryCatchFinally;

public class TestPropagation {
	public static void first() {
		second();
	}
public static void second() {
	try {
		double d = 15/0;
		System.out.println(d);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}
public static void main(String[] args) {
	first();
	}
}
