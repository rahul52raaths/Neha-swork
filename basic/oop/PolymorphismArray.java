package com.basic.oop;

public class PolymorphismArray {

	public static void main(String[] args) {
	Shape s[]= new Shape[3];
	s[0] = new Circle(5);
	s[1] = new Rectangle(2,6);
	s[2] = new Triangle(6,2);
	double ar = calArea(s);
	System.out.println(ar);
	
	}

	private static double calArea(Shape[] s) {
		double ar = 0;
		for(int i = 0 ; i < s.length ; i++) {
		    ar += s[i].area();
		}
		return ar;
	}

}
