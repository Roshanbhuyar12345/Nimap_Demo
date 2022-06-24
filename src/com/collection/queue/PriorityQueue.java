package com.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {
public static void main(String[] args) {
	
	Queue<Integer> q=new LinkedList<Integer>();
	
	q.add(1245);
	q.add(1245);
	q.add(7845);
	q.add(4789);
	q.add(4512);
	
	System.out.println(q.peek());
	
	System.out.println(q.poll());
	
	
	for(Integer s:q) {
		System.out.println(s+" hi ");
	}
	
	
}
}
