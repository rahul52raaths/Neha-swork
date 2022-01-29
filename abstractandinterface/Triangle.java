package com.abstractandinterface;

public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(){}
	public Triangle(int base ,int height) {
		this.base = base ;
		this.height = height ;
	}
	
	public double area() {
		double a = 0.5*base*height ;
		return a;
	}
	

}
