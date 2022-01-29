package com.abstractandinterface;

public class TestShape {

	public static void main(String[] args) {
	Shape s = new Circle(7);
	System.out.println("circle area = "+s.area());
	Shape s1 = new Triangle(6,4);
	System.out.println("triangle area = "+s1.area());
	Shape s2 = new Rectangle(4,5);
	System.out.println("rectangle area = "+s2.area());
	}

}
