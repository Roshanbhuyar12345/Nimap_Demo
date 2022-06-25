package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateKey {
	public static void main(String[] args) {
		// try to add duplicate key

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(1, "duplicate key");
		//it will take updated value for store an element

		map.remove(3);
		
		Set<Integer> st = map.keySet();

		for (Integer s : st) {
			System.out.println(s+" "+map.get(s));
		}

	}

}
