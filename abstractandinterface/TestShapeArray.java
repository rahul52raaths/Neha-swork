package com.abstractandinterface;

public class TestShapeArray {
public static void main(String[] args) {

	Shape s[] = new Shape[3];
	s[0] = new Circle(4);
	s[1] = new Rectangle(5,6);
	s[2] = new Triangle(5,4);
	
	double totalarea = calArea(s);
	System.out.println(totalarea);
	
	}

private static double calArea(Shape[] s) {
	int totalarea = 0 ;
	for(int i=0 ; i<s.length ; i++) {
		totalarea += s[i].area();
	}
	return totalarea;
}
}
