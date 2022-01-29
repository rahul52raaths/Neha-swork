package com.basic.oop;

public class TestTriangle {

	public static void main(String[] args) {
		
		Triangle t = new Triangle(3,4);
		t.setBorderWidth(2);
		System.out.println(t.getBorderWidth());
		t.setColor("blue");
		System.out.println(t.getColor());
	
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		t.area();
		
	}

}
