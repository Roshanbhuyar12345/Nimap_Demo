package com.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSort {
	public static void main(String[] args) {
     
		List<Integer> list=new ArrayList<>();
		List<Integer> list1=new ArrayList<>();

		list.add(2544);
		list.add(458);
		list.add(4578);
		list.add(4225);
		
		list1.add(124);
		list1.add(58);
		list1.add(5487);
		list1.add(7889);
		list1.add(789);
		list1.add(7895);
		
		Stream<Integer> stream=list1.stream();
		Stream<Integer> stream1=list.stream();
		//sorting of list
		stream.sorted().forEach(System.out::println);
		
		System.out.println("=*=*=*=*=*=");
		
		//max no. of list
		Integer i=stream1.max((x,y)->x.compareTo(y)).get();
        System.out.println(i);
	//	List<Integer> newList= stream.filter(i->i>1011).collect(Collectors.toList());
	//	System.out.println(newList);
		
	 
		
		
		
	}

}
