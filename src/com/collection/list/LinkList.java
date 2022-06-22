package com.collection.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList();
		
		list.add(12);
		list.add(14);
		list.add(13);
		list.add(15);
		list.add(16);
		list.add(12);
		list.add(18);
		
		//comparator 
		Comparator<Integer> c=new Comparator<Integer>() {
			public int compare(Integer i,Integer j) {
				if(i%10>j%10)
					return 1;
				else 
					return -1;
			}
		};
		
	Collections.sort(list,c);
	
	for(Integer s:list) {
		System.out.println(s);
	}
		
		
}
}