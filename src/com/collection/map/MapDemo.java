package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
 public static void main(String[] args) {
	
	 Map<Integer, String> map=new HashMap<Integer, String>();
	 map.put(1,"roshan");
	 map.put(102, "akash");
	 map.put(103, "rahul");
	 
	 Set<Integer> set=map.keySet();
	 for(Integer i:set) {
	 
	 System.out.println(i+" "+map.get(i));
	 }
	}
}

