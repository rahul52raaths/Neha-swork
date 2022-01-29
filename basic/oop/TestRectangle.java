package com.basic.oop;

public class TestRectangle {

	public static void main(String[] args) {
		 Rectangle r = new Rectangle(2,4);
		 
		 r.setBorderWidth(2);
		 System.out.println(r.getBorderWidth());
		 r.setColor("red");
	     System.out.println(r.getColor());
	     
	     System.out.println(r.getLength());
	     System.out.println(r.getBreath());
	     r.area();
	     
	}
}
