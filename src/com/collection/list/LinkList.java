package com.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
	public static void main(String[] args) {
		
		List list=new LinkedList();
		
		list.add(12);
		list.add(13);
		list.add(12);
		list.add(15);
		list.add(16);
		list.add(12);
		list.add(18);
		
		
		
		
		
		System.out.println(list);
		
		System.out.println(list.hashCode());
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
