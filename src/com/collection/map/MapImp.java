package com.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapImp {
	public static void main(String[] args) {
		
		Student s1=new Student(101,"satish");
		Student s2=new Student(102,"arun");
		Student s3=new Student(103,"sachin");
		Student s4=new Student(104,"mahi");
		Student s5=new Student(105,"anand");
		Student s6=new Student(106,"anand");
		
		Map<String,Student> map=new HashMap<>();
		
		map.put("first :-",s1);
		map.put("second :-", s2);
		map.put("third :-", s3);
		map.put("fourth :-", s4);
		map.put("fifth :-", s5);
		map.put("sixth :-", s6);
		
		Set<String> st=map.keySet();
		
		for(String s:st) {
			System.out.println(s+" "+map.get(s));
		}
		
		
		
		
	}

}
