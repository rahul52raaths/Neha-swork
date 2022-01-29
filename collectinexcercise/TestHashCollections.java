package com.collectinexcercise;

import java.util.HashSet;

public class TestHashCollections {
public static void main(String[] args) {
	HashSet h = new HashSet<>();
	h.add('k');
	h.add(8);
	h.add(12);
	System.out.println(h.equals(h));
	System.out.println(h.equals(null));
	System.out.println(h.hashCode());
	
	}
}
