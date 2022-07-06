package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Filter_Name {
	public static void main(String[] args) {
		
		List<String> st = Arrays.asList("suresh", "ramesh", "aniket", "sameer", "kalpesh");
        
		List<String> names= st.stream().filter(i->i.startsWith("s")).collect(Collectors.toList());
		
		System.out.println(names);
	}

}
