package com.collection.map;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class LinkeHashMapDemo {
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lm=new LinkedHashMap<Integer, String>();
		
		lm.put(81245,"italy");
		lm.put(1486, "USA");
		lm.put(475,"Uk");
		lm.put(87546, "india");
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>(lm);
		
		
		Set<Integer> set=tm.keySet();
		
		for(Integer s:set) {
			System.out.println(s+" "+tm.get(s));
		}
		
		
		
	}
}
