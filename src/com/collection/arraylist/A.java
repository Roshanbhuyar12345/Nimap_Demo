package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class A {
	public static void main(String[] args) {
		
	ArrayList<Integer> 
	list=new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	
		
	
	Iterator<Integer> itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	
	for(Integer s:list) {
		System.out.println(s);
	}
	
	
	System.out.println(list);
	
	ArrayList<String> al=new ArrayList<String>();
	al.add("roshan");
	al.add("prajit");
	al.add("shubham");
	al.add("sanket");
	al.add("suraj");
	System.out.println(al);
	
	Iterator<String> itr1=al.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
	}
}
