package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class C {
public static void main(String[] args) {
       
	ArrayList<Integer> al=new ArrayList<>();
	//duplicate values allows
	//multiple null value allows
	al.add(12);
	al.add(12);
	al.add(13);
	al.add(14);
	al.add(15);
	al.add(16);
	al.add(null);
	al.add(null);
	al.add(null);
	
	
	
	System.out.println(al);
	
	
	
	
}
}
