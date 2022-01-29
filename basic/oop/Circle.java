package com.basic.oop;

public class Circle extends Shape{
	int radius ;

	public int getRadius() {
		return radius;
	}

	public Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		double circleArea = 3.14*radius*radius ;
		System.out.println("area of circle = "+circleArea);
		return circleArea ;
	}

}
