package com.collectinexcercise;

import java.util.Iterator;
import java.util.Stack;

public class StackAToZ {

	public static void main(String[] args) {
		Stack s = new Stack();
		for (char i ='a'; i <= 'z'; i++) {
		System.out.print(" "+s.push(i));
		}
		System.out.println();
		Stack s1 = new Stack<>();
		for (char i ='a'; i <= 'z'; i++) {
			Object o = s.pop();
			System.out.print(" "+s1.push(o));
		}
		System.out.println();
		for (char i ='a';  i<= 'z'; i++) {
			System.out.print(" "+s1.pop());
		}
	
		
	}
}
