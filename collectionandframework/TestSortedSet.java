package com.collectionandframework;
import java.util.SortedSet;
import java.util.TreeSet;
public class TestSortedSet {
	
public static void main(String[] args) {
	
	SortedSet s = new TreeSet<>();
	s.add("one");
	s.add("two");
	s.add("three");
	for (Object o : s) {
		System.out.print(" "+o);
	}
	System.out.println("\n"+s.first());
	System.out.println(s.last());
	SortedSet s1 = new TreeSet<>();
	s1.add(12);
	s1.add(465);
	s1.add(3);
	s1.add(6);
	s1.add(74);
	System.out.print(s1);
	System.out.println("\n"+s1.first());
	System.out.println(s1.last());
	
	}
}
