package com.collectionandframework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedhashset {
public static void main(String[] args) {
	
	LinkedHashSet l = new LinkedHashSet<>();
	l.add(2);
	l.add(6);
	l.add('a');
	l.add("kes");
	l.add(12.5);
	Iterator i = l.iterator();
	while (i.hasNext()) {
		Object object = (Object) i.next();
		System.out.print(" "+object);
	}
	System.out.println();
	System.out.println(l);
	System.out.println(l.remove('a'));
	System.out.println(l);
}
}
