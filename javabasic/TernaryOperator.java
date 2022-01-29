package com.javabasic;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		//binary  operators.
		System.out.println(((2<3)&&(0<++i)));
		System.out.println("I = "+i);
		System.out.println(((2>3)||(0<++i)));
		System.out.println("I = "+i);
		
		//ternary operator.
		String s = (2>3)?"true":"false" ;
		System.out.println("ternary operator = "+s);
		
		System.out.println((5>8)?5:8);
	}

}
