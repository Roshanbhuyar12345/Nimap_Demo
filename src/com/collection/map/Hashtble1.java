package com.collection.map;

import java.util.Hashtable;
import java.util.Set;

public class Hashtble1 {
	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		
		ht.put(101, "hello");
		ht.put(102, "world");
		ht.put(103, "india");
		ht.put(104, "rusia");
		ht.put(105, "france");
		ht.put(107, "thanks");
		ht.put(0, "mobile");
		Set<Integer> set=ht.keySet();
		
		for(Integer h:set) {
			System.out.println(h+" "+ht.get(h));
		}
		
		
		
	}

}
