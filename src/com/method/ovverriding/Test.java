package com.method.ovverriding;

public class Test {
	public static void main(String[] args) {
		
		Animal an=new Dog();
		an.speak();
		
		System.out.println("implicite casting");
		short i=10;
		int f=i;
		System.out.println(f);
		System.out.println("explicite casting");
		double s=10.25;
		int n=(int) s;
		
		System.out.println(n);
		
	}

}
