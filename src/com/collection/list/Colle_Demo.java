package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Colle_Demo {
	
	public static void main(String[] args) {
		
		List<Collect> list=new ArrayList<>();
		
		list.add(new Collect(102, "akash"));
		list.add(new Collect(15, "prajit"));
		list.add(new Collect(478, "sahil"));
		list.add(new Collect(145,"kalpak"));
		list.add(new Collect(125,"sagar"));
		
		Comparator<Collect> comp=new Comparator<Collect>() {
			
			@Override
			public int compare(Collect o1, Collect o2) {
				if(o1.id>o2.id) 
					return 1;
			    else 
			    	return -1;
				
			}
		};
		
		Collections.sort(list,comp);
		
		for(Collect d:list) {
			System.out.println(d);
		}
		
	}

}
