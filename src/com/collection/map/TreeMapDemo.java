package com.collection.map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {

		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.put("india", 91);
		tm.put("shree lanka", 92);
		tm.put("bhutan", 93);
		tm.put("pakistan", 94);
		tm.put("iran", 95);
		tm.put("afganistan", 96);

		Set<String> set = tm.keySet();

		for (String s : set) {
			System.out.println(s + " " + tm.get(s));
		}

	}
}
