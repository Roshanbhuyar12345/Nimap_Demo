package com.collection.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class TestingHashtable {
	public static void main(String[] args) {
		
		Map<Integer, String> map=new Hashtable<Integer, String>();
		
		map.put(101, "python");
		map.put(102, "rooby");
		map.put(103, "java");
		map.put(104, "android");
		
		Set<Integer> set=map.keySet();
		
		for(Integer s:set) {
			System.out.println(s+" "+map.get(s));
		}
		
		
	}

}
