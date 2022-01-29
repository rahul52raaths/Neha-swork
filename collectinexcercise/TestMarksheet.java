package com.collectinexcercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class TestMarksheet {
public static void main(String[] args){
	ArrayList m1 = new ArrayList<>();
	m1.add(new Marksheet("r1","ram","chouhan",85,65,54));
	m1.add(new Marksheet("r4","syam","verma",85,65,54));
	m1.add(new Marksheet("r5","monika","shrma",85,65,54));
	m1.add(new Marksheet("r7","hema","patel",85,65,54));
	m1.add(new Marksheet("r3","jay","pal",85,65,54));
	m1.add(new Marksheet("r9","vijay","gupta",85,65,54));
	m1.add(new Marksheet("r2","ram","rathor",85,65,54));
	
	Collections.sort(m1);
	Iterator i = m1.iterator();
	while (i.hasNext()) {
		Object o = (Object) i.next();
		System.out.println(o);
	}
//	Collections.sort(m1);
//	Iterator i = m1.iterator();
//	while (i.hasNext()) {
//		Object o = (Object) i.next();
//		System.out.println(o);
//	}
	
	}
}
