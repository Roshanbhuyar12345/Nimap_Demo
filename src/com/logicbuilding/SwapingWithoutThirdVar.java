package com.logicbuilding;

public class SwapingWithoutThirdVar {
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
       a=a+b;  //a=30
       b=a-b;  //b=10
       a=a-b;   //a=20


		System.out.println("a is ="+a);
		System.out.println("b is ="+b);
		
		
	}

}