package com.collectionandframework;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {
public static void main(String[] args) {
	
	List l = new ArrayList();
	l.add(12);
	l.add('k');
	l.add("ram");
	l.add(12.5);
	l.add(12.5f);
	l.add(true);
	System.out.println(l.size());
	System.out.println(l);
	for (Object object : l) {
		System.out.print(" "+object);
	}
	System.out.println();
	
	List l1 = new ArrayList();
	l1.add(5);
	l1.add('n');
	l1.add("ram");
	l1.add(2.5);
	l1.add(22.5f);
	l1.add(false);
	
	System.out.println(l1);
	for (Object object : l1) {
		System.out.print(" "+object);
	}
	/*
	
	System.out.println("size = "+l1.size());
	System.out.println("isempty = "+l.isEmpty());
	System.out.println("contains = "+l.contains('k'));
	System.out.println("containsAll = "+l.containsAll(l));
	System.out.println("remove = "+l.remove(2));
	*/
	
	System.out.println("\n retainAll = "+l.retainAll(l));
	System.out.println(l.retainAll(l1));
	//System.out.println(l.retainAll(null));
	System.out.println(l.removeAll(l));
	System.out.println(l.size());
	l1.clear();
	System.out.println(l1.size());
	
}
}
