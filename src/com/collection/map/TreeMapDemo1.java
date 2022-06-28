package com.collection.map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo1 {
	public static void main(String[] args) {

		TreeMap<String, String> tm = new TreeMap<String, String>();

		tm.put("tanmay ", "design");
		tm.put("prajit ", "java dev");
		tm.put("suraj  ", "sr java dev");
		tm.put("sanket ", "maneger");

		Set<String> set = tm.keySet();
		for (String s : set) {
			System.out.println(s + " " + tm.get(s));
		}

	}
}
