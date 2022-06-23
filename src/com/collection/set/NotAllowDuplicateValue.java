package com.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class NotAllowDuplicateValue {
	public static void main(String[] args) {
//does not allow duplicate value
		HashSet<String> hs = new HashSet<String>();

		hs.add("roshan");
		hs.add("prajit");
		hs.add("suraj");
		hs.add("kapil");
		hs.add("roshan");
		hs.add("kapil");

		Iterator<String> itr = hs.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
