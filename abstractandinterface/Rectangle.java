package com.abstractandinterface;

public class Rectangle extends Shape{
	private int length ; 
	private int breath;
	
	public Rectangle(int length , int breath) {
		this.breath = breath ;
		this.length = length ;
	}

	public double area() {
		double a = length*breath;
		return a;
	}
}
