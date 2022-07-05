package com.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingOnTheBasisOfName {
	public static void main(String[] args) {
		
		List<String> list= new ArrayList<String>();
		list.add("satish");
		list.add("kalpak");
		list.add("sameer");
		list.add("ramesh");
		list.add("kamlesh");
		
		
		Stream<String> stream=list.stream();
		
	    List<String> list1=stream.filter(i->i.startsWith("s")).collect(Collectors.toList());
		
	    System.out.println(list1);
	}

}
