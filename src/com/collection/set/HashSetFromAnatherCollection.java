package com.collection.set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetFromAnatherCollection {
	public static void main(String[] args) {
		
	ArrayList<Integer> arr=new ArrayList<Integer>();
	
	arr.add(1254);
	arr.add(2451);
	arr.add(25);
	arr.add(25);
	arr.add(5445);
	
	HashSet<Integer> hs=new HashSet<Integer>(arr);
	
	hs.add(4651);
	
	for(Integer h:hs) {
		System.out.println(h);
	}
		
		
	}

}
