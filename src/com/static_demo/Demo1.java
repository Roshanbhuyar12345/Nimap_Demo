package com.static_demo;

public class Demo1 {
	
	
	static int a=12;
	static float d=12.01f;
	int b=20;
	static void show() {
		System.out.println(a);
		System.out.println(d);
	}
	
	public void show(int c) {
	   	
		System.out.println(b);
		System.out.println(a);
	}
	
	static {
		System.out.println("here static block get loaded into memory before object creation");
	}
	
	
	public static void main(String[] args) {
		
		
	}
	

}
