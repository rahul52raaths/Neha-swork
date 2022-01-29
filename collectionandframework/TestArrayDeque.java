package com.collectionandframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
public static void main(String[] args) {
	
	ArrayDeque d = new ArrayDeque<>();
	
	d.add(45);
	d.addFirst(23);
	d.addLast(74);
	d.add(8);
	d.addFirst(65);
	System.out.println(d);
	//System.out.println(d.getFirst());
	//System.out.println(d.getLast());
	
	//System.out.println(d.removeFirst());
	//System.out.println(d);
	System.out.println(d.offerFirst(45));
	System.out.println(d.offerLast(12));
	System.out.println(d);
	System.out.println(d.pollFirst());
	System.out.println(d.pollLast());
	System.out.println(d.peekFirst());
	System.out.println(d.peekLast());
	
	}
}
