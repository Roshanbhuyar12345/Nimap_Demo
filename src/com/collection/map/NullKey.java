package com.collection.map;

import java.util.HashMap;
import java.util.Set;

public class NullKey {
	public static void main(String[] args) {

		HashMap<Integer,String> map=new HashMap<Integer,String>();
		//take only one null value for key
		//take multiple null values for value
		// insertion order does not maintain
		map.put(null, "null value");
		map.put(null,"roshan");
		map.put(108, "dolly");
		map.put(1403, "hello");
		map.put(107, "sushil");
		map.put(15, "dolly");
		map.put(106, "dolly");
		
		Set<Integer> set=map.keySet();
		
		for(Integer s:set) {
			System.out.println(s+"  "+map.get(s));
		}
		
	}
}
