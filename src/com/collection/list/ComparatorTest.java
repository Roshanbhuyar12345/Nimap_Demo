package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest  {
	public static void main(String[] args) {

		List<CompareDemo> ls = new ArrayList<CompareDemo>();

		ls.add(new CompareDemo(101, 85, "soham"));
		ls.add(new CompareDemo(102, 75, "kartik"));
		ls.add(new CompareDemo(103, 86, "kalpesh"));
		ls.add(new CompareDemo(104, 95, "mayur"));
		ls.add(new CompareDemo(105, 48, "satish"));
		ls.add(new CompareDemo(107, 65, "atish"));
		ls.add(new CompareDemo(108, 78, "soham"));

		
		Comparator<CompareDemo> comp=new Comparator<CompareDemo>() {
			
			public int compare(CompareDemo o1,CompareDemo o2) {
				if(o1.marks<o2.marks)
					return 1;
				else
					return -1;
			}
			
		};
		//add object of compator interface
		Collections.sort(ls,comp );
		
		for(CompareDemo s:ls) {
			System.out.println(s);
		}
	}
}