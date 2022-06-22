package com.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(101, 1240, "roshan"));
		list.add(new Student(102, 24550, "prajit"));
		list.add(new Student(103, 54580, "ashwin"));
		list.add(new   Student(104, 25560, "nikita"));
		
	    Collections.sort(list);
		
	    for(Student s:list) {
	    	System.out.println(s);
	    }
		
	}


}
