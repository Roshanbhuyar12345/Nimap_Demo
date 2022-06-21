package com.collection.list;

import java.util.Collections;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(12);
		v.add(6);
		v.add(71);
		v.add(8);
		v.add(9);
		v.add(10);
		v.add(11);
		
		Collections.sort(v);
		
		System.out.println(v.capacity());
		
        System.out.println("*=*=*=*");
        
        for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
        
		
	}

}
