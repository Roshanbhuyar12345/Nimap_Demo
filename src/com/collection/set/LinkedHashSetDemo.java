package com.collection.set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet<String> ls=new LinkedHashSet<String>();
		
		ls.add("roshan");
		ls.add("naveen");
		ls.add("rajiv");
		ls.add("sameer");
		ls.add("ravish");
		ls.add("roshan");
		ls.add(null);
		ls.add(null);
		
		
		System.out.println(ls.size());
		
		ls.remove("naveen");
		 
		for(String s:ls) {
			System.out.println(s);
		}
		
	}

}
