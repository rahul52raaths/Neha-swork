package com.basic.oop;

public class Triangle extends Shape{

	private int base ;
	private int height ;
	public Triangle() {
	}
	public Triangle(int base, int height) {
	this.base =	base;
	this.height = height;
	}
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	public double area() {
		double triArea = 0.5*(base*height) ;
		System.out.println("area of triangle = "+triArea);
		return triArea;
	}
}
