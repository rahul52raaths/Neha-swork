package com.javabasic;

public class Methods {
	
	public void add() {
		System.out.println(10+20);
	}
	public void sub() {
		int a = 20;
		int b = 10;
		int c= a-b ;
		System.out.println(c);
	}
	
	public void div(float a , float b) {
		System.out.println(a/b);
	}
	
	public int multi(int a, int b) {
		return a*b;
	}
	
	public static void mode () {
		int a = 9 ;
		int b = 2 ;
		int c = a % b;
		System.out.println(c);
	}
	public static int module (int a , int b) {
		return a % b;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s = module(9 , 2);
		System.out.println(s);

		Methods t = new Methods();
		t.add();
		
		t.sub();
		
		t.div(15.3F, 3.0F);
		
		int c =t.multi(2, 10);
		System.out.println(c);
		
		mode();
	
	}
	

}
