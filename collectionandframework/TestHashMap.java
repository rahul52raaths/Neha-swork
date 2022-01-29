package com.collectionandframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestHashMap {
public static void main(String[] args) {
	HashMap m = new HashMap<>();
	m.put("k1", 546);
	m.put("k2", 6565);
	m.put("k4", 65);
	m.put("k3", 865);
	m.put("k6", 963);
	Set keys = m.keySet();
	Collection value = m.values();
	System.out.println(keys);
	System.out.println(value);
	Iterator i = (Iterator) m.get("12");
	System.out.println(i);
	
	}
}
