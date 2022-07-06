package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter_Stream {

	public static void main(String[] args) {

		List<String> st = Arrays.asList("suresh", "ramesh", "aniket", "sameer", "kalpesh");

		Stream<String> str = st.stream();

		List<String> t = st.stream().sorted().collect(Collectors.toList());
		System.out.println(t);
	}

}
