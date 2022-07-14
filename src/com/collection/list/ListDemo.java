package com.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1111);
		list.add(2222);
		list.add(3333);
		list.add(4444);
		list.add(5555);
		list.add(6666);

		// Using lambda expression
		list.forEach(e -> {
			System.out.println(e);
		});
		System.out.println("--------------------");
		// listIterator
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("---------****-----------");
		// travercing element in reverse
		ListIterator<Integer> litr = list.listIterator(list.size());

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

}
