package com.typecasting;

public class Implicite1 {
	public static void main(String[] args) {
//here compiler convert int to char automatically by implicitely	
		//loss of data
		
		int x='a';
		System.out.println(x);
		
		double d=100;
		System.out.println(d);
	}

}
