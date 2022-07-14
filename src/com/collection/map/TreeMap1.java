package com.collection.map;

import java.util.Set;
import java.util.TreeMap;

public final class TreeMap1 {
	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("sameer ", 25512);
		tm.put("string ", 1245);
		tm.put("raju ", 45587);
		tm.put("kalpesh", 1245);

		Set<String> set = tm.keySet();
		for (String s : set) {
			System.out.println(s + " " + tm.get(s));
		}

	}
}
