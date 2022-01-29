package com.basic.oop;

public class Rectangle extends Shape{

	private int length ;
	private int breath ;
	public int getLength() {
		return length;
	}
	public Rectangle() {
	}
	
	public Rectangle(int length, int breath) {
	this.breath = breath;
	this.length = length;
	}
	
	public int getBreath() {
		return breath;
	}
	public double area() {
		int recArea = length*breath ;
		System.out.println("area of rectangle = "+recArea);
		return recArea;
	}
}
