package com.collection.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet<>();
		ts.add(1245);
		ts.add(5545);
		ts.add(87554);
		ts.add(56255);
		ts.add(1545);
		ts.add(1545);
		
		for(Object s:ts) {
			System.out.println(s);
		}
		
	}

}
