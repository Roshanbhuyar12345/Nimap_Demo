package com.collection.map;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class SortingHashMap {
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		
		hm.put(121,"hello");
		hm.put(54, "hi");
		hm.put(47, "nice");
		hm.put(23, "radha");
		hm.put(48,"thank you");
		
		System.out.println("before sorting");
		
		Set<Integer> set=hm.keySet();
		for(Integer s:set) {
			System.out.println(s+" "+hm.get(s));
		}
		
		System.out.println("after sorting on key");
		
		TreeMap<Integer,String> tm=new TreeMap<Integer, String>(hm);
		
		Set<Integer> st=tm.keySet();
		for(Integer t:st) {
			System.out.println(t+" "+tm.get(t));
		}
		
		
	}

}
