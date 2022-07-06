package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.arrays.Arrays_;

public class Stream_Map {
	public static void main(String[] args) {
		
       List<Integer> num=Arrays.asList(1,2,3,4,5,7);
       
       Stream<Integer> stream=num.stream();
       
       List<Integer> st= stream.map(i->i*i).collect(Collectors.toList());
		
       System.out.println(st);
	}

}
