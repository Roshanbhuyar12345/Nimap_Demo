package com.collection.set;

import java.util.HashSet;

public class OnlySingleNullValueAllows {
	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		
		hs.add(10254);
		hs.add(25515);
		hs.add(54);
		hs.add(2545);
		hs.add(2544);
		hs.add(2545);
		hs.add(null);
		hs.add(null);
		hs.add(null);
		
		for(Integer i:hs) {
			System.out.println(i);
		}
		
		
	}

}
