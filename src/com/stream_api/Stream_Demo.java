package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Demo {
	
	public static void main(String[] args) {
		
		List num=Arrays.asList(2,5,48,7,5,5,8,7,4,5);
		
		Stream<Integer> st=num.stream();
		
		List<Integer> t= st.filter(i ->i%2==0).collect(Collectors.toList());
		
		System.out.println("even no is : " + t);
		
	}

}
