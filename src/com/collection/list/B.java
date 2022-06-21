package com.collection.list;

import java.util.ArrayList;

public class B {
	public static void main(String[] args) {
		
		 ArrayList al=new ArrayList<>();
		
		 al.add(1);
		 al.add("roshan");
		 al.add( 15.20);
		 al.add(54852);
		 
		 System.out.println(al);
		 
		 for(int i=0;i<al.size();i++) {
			 
			 System.out.println(al.get(i));
		 }
		 //foreach loop
		 for(Object s:al) {
			 System.out.println(s);
		 }
	}

}
