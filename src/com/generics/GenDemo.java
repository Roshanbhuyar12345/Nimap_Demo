package com.generics;

public class GenDemo<K,V> {
	
	public void print(K k,V v) {
		
		
		System.out.println(k+"  "+v);
		
	}

	public static void main(String[] args) {
		
		GenDemo<Integer,Integer> gd=new GenDemo<Integer, Integer>();
		
		gd.print(101, 1010);
		gd.print(102, 1020);
		gd.print(103, 1030);
		gd.print(104, 1040);
	
		
	}
	
	
}
