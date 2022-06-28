package com.generics;

public class Box<T> {

	private T t;
	public void add(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
	
	public static void main(String[] args) {
		
		Box<Integer> box=new Box<Integer>();
		
		Box<String> box1=new Box<String>();
		
		box.add(1245);
		
		
		box1.add("hi");
		
	
		System.out.println(box.get());
		System.out.println(box1.get());
	}
	
}
