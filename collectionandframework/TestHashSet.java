package com.collectionandframework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
public static void main(String[] args) {
	HashSet h = new HashSet<>();
	h.add(1);
	h.add(2);
	h.add('a');
	h.add("kes");
	h.add(12.5);
	Iterator it = h.iterator();
	while (it.hasNext()) {
		Object object = (Object) it.next();
		System.out.print(" "+object);
	}
	System.out.println("\n");
	System.out.println(h.size());
	System.out.println(h);
	h.remove(1);
	System.out.println(h);
	
	}
}