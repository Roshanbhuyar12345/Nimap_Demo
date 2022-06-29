package com.generics;

public class Employee<T> {
 
	public void display(T t) {
		System.out.println(t);
	}
	
	
	public static void main(String[] args) {
		
		Employee<String> emp=new Employee<String>();
		
		
		emp.display("roshan");
		emp.display("prajit");
		emp.display("ashwin");
		emp.display("rahul");
		
		
	}
	
	
}
