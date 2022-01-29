package com.basic.oop;

public class TestCircle {

	public static void main(String[] args) {
		Circle c = new Circle ();
		c.setBorderWidth(2);
		System.out.println(c.getBorderWidth());
		c.setColor("black");
		System.out.println(c.getColor());
		
		System.out.println("radius = "+c.getRadius());
		c.area();
	
	}
}
