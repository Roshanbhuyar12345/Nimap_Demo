package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestingMap {
public static void main(String[] args) {
	
	Map<Integer, String> map=new HashMap<Integer, String>();
	
	
	map.put(101, null);
	map.put(null, "heyy");
	map.put(108, "thanks");
	map.put(103, "thank");
	map.put(105, null);
	map.put(106, "heyy");
	
	
	Set<Integer> set=map.keySet();
	
	for(Integer i:set) {
		System.out.println(i+" "+map.get(i));
	}
	
	
	
}
}
