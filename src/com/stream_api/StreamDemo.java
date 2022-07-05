package com.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> values=new ArrayList<Integer>();
		for(int i=1;i<=100;i++) {
			values.add(i);
		}

        System.out.println(values);
        
        Stream<Integer> stream=values.stream();
        Stream<Integer> stream1=values.stream();
        
        List<Integer> lt=stream.filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(lt);
		
        List<Integer> t=stream1.filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println(t);
	}

}
