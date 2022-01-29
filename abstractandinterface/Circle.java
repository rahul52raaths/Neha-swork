package com.abstractandinterface;

public class Circle extends Shape{
    private int radius;
	
    public Circle() {}

	public Circle(int radius) {
		this.radius = radius;
	}

	public double area() {
		double a= 3.14 *radius*radius ;
		return a;
	}

	
}
