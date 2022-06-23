package com.collection.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SeiImp {
	public static void main(String[] args) {
		
		int a[]= {12,45,8,5,25,4,56,4,52,58,21,54,86,78};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
			
		}
		System.out.println(set);
		
		Set<Integer> s=new TreeSet<Integer>(set);
		System.out.println(s);
		
	}

}
