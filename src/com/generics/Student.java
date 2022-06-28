package com.generics;

public class Student<T> {
	
	private T t;
	
	
	public void add(T t) {
		this.t=t;
	}
	
	public T get() {
		return t;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Student<Integer> st=new Student<Integer>();
		


		st.add(5457);
	
		System.out.println(st.get());
		
	}
	

}
