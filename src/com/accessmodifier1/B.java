package com.accessmodifier1;

public class B {
	
	
	public static void main(String[] args) {
		
		A obj=new A();
		
		obj.show();
		obj.show(1);
		obj.show("roshan");
		//here we can not access privte method and variable 
		
		System.out.println(obj.a=10);
		System.out.println(obj.b=20);
		System.out.println(obj.c=30);
	}

}
