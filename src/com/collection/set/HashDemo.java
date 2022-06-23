package com.collection.set;

import java.util.HashSet;

public class HashDemo {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		boolean b1 = set.add("suraj");
		boolean b2 = set.add("prajit");
		boolean b3 = set.add("suraj");

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

		for (String s : set) {
			System.out.println(s);
		}
	}

}
