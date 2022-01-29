package com.collectionandframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
public static void main(String[] args) {
	
	TreeSet t = new TreeSet<>();  //ascending order 
	t.add(2);
	t.add(52);
	t.add(3);
	t.add(865);
	t.add(32);
	t.add(665);
	Iterator i = t.iterator();
	while (i.hasNext()) {
		Object object = (Object) i.next();
		System.out.print(" "+object);
	}
	System.out.println("\n");
	System.out.println(t);
	System.out.println(t.size());
	System.out.println(t.ceiling(4));
	System.out.println(t.ceiling(2));
}
}
