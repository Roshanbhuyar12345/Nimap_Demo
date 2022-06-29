package com.generics;

public class GenericsDemo<T1,T2>{
	
	public void display(T1 var1,T2 var2) {
		
		System.out.println(var1+"  "+var2);
		
	}
	
	public static void main(String[] args) {
		
		GenericsDemo<String, String> gd=new GenericsDemo<String, String>();
		
		gd.display("hi", "roshan");
		gd.display("hi", "rahul");
		gd.display("hi", "shyam");
		
		
		
	}

}
