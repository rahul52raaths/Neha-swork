package com.abstractandinterface;

public class MethodOverLoading {
	public void m1() {
		System.out.println("addition = "+(2+4));
	}
	public void m1(int a , int b) {
		System.out.println("subtraction = "+(a-b));
	}
	public void m1(int a , float b) {
		System.out.println("multiplication = "+(a*b));
	}
	public void m1(int a , int b,int c) {
		System.out.println("addition = "+(a+b+c));
	}
	public void m1(float a , int b) {
		System.out.println("divide = "+(a/b));
	}
	public void m1(double a , float b) {
		System.out.println("module = "+(a%b));
	}
	
	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading();
		m.m1();
		m.m1(3, 1);
		m.m1(5.5, 3);
		m.m1(6.4f, 3);
		m.m1(5, 4, 1);
		m.m1(2, 3.1f);
	}
}
