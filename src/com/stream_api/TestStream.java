package com.stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(48);
		list.add(87);
		list.add(44);
		list.add(79);
		list.add(49);
		list.add(48);

		System.out.println("====*using simple list*====");
		
		System.out.println(list);

		List<Integer> evenList = new ArrayList<Integer>();

		System.out.println("====*using for each loop*====");

		for (Integer i : list) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}
		System.out.println(evenList);

		System.out.println("====*using stream api*====");

		Stream<Integer> stream = list.stream();
		List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);

	}

}
