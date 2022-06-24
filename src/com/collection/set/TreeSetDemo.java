package com.collection.set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {

		TreeSet<String> ts = new TreeSet<>();

		ts.add("prajit");
		ts.add("roshan");
		ts.add("akash");
		ts.add("suraj");

		for (String s : ts) {
			System.out.println(s);
		}

	}

}
