package com.memory_allocatiopn;

public class A {
	public static void main(String[] args) {
		//hear primitive type is used to store simple values and these values
		// are completely independent on each other 
		int a=10;
		int b=a;
		a=20;
		System.out.println(a);
		System.out.println(b);
	}

}
