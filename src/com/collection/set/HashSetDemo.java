package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(104);  
		set.add(104);
		set.add(102);
		set.add(null);
		set.add(null);
		set.add(null);
		
		for(Integer s:set) {
			System.out.println(s);
		}
		
		
		
		
	}

}
