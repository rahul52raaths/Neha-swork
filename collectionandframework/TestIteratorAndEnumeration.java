package com.collectionandframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class TestIteratorAndEnumeration {
public static void main(String[] args) {
	Vector v = new Vector<>(5);
	v.add(12);
	v.add(42);
	v.add(32.25);
	v.add('s');
	v.add("ram");
	v.add(85);
	Enumeration e = v.elements();
	v.add(3.5);
	System.out.println("size : "+v.size());
	System.out.println("capacity : "+v.capacity());
	while (e.hasMoreElements()) {
		Object object = (Object) e.nextElement();
		System.out.println(object);
	//	System.out.println(e.nextElement());
		
	}
	/*
	ArrayList a = new ArrayList<>();
	a.add(42);
	a.add('k');
	a.add("ram");
	Iterator it = a.iterator();
	while (it.hasNext()) {
		Object o= (Object)it.next();
		System.out.println(o);
	}
	
	HashMap m = new HashMap<>();
	m.put(1, 45);
	m.put(12, 78);
	m.put(3, 74);
	Iterator i = (Iterator) m.get("k");
	Set Keys = m.keySet();
	Collection value = m.values();
	System.out.println(value);
	
	*/
	}
}
