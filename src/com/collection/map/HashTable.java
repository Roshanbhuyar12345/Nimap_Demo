package com.collection.map;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.abstraction_prog.Main;

public class HashTable {
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		// does not allow null value as well as null key

		ht.put(1068, "ramesh");
		ht.put(102, "roshan");
		ht.put(108, "kalpesh");
		ht.put(104, "suraj");
		ht.put(214, "sanjay");
		ht.put(1084, "suraj");

		Set<Integer> set=ht.keySet();
		for(Integer s:set) {
			System.out.println(s+" "+ht.get(s));
		}
		System.out.println("***sorting***");
		TreeMap<Integer,String> tm=new TreeMap<Integer, String>(ht);
		
		Set<Integer> set1=tm.keySet();
		for(Integer t:set1) {
			System.out.println(t+" "+tm.get(t));
		}

	}
}
