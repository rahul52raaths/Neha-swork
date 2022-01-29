package com.collectionandframework;
import java.util.ArrayList;
import java.util.Iterator;

public class TestEqualAndHashCode {
public static void main(String[] args) {
	String s1 = "java";
	String  s2 = "java";
	System.out.println(s1.equals(s2));
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	String a = "A";
	String b = "65";
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	
	ArrayList l = new ArrayList<>();
	l.add("one");
	l.add("two");
	String str = (String)l.get(1);
	System.out.println(str);
	Iterator it = l.iterator();
	while (it.hasNext()) {
		String object = (String) it.next();
		System.out.println(object);
	}
	System.out.println(l.equals(l));
	System.out.println(l.hashCode());
	}
}
