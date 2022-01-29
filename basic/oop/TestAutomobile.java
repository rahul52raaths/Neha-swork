package com.basic.oop;

public class TestAutomobile {

	public static void main(String[] args) {
		Automobile a = new Automobile() ;
		a.setColor("black");
		System.out.println(a.getColor());
		a.setMake("2020");
		System.out.println(a.getMake());
		a.setSpeed(60);
		System.out.println("speed = "+a.getSpeed());
		a.accelerator(10);
		System.out.println(a.getSpeed());
		a.applyBreak(40);
		System.out.println(a.getSpeed());
		
	}

}
