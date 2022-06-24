package com.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {

		Queue<String> q = new PriorityQueue<String>();

		q.add("hello");
		q.add("satish");
		q.add("ramesh");
		q.add("world");
		q.add("sameer");
		
		
		for (String s : q) {
			System.out.println(s);
		}

	}
}
