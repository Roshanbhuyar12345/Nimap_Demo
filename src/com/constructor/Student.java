package com.constructor;

public class Student {
	
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		
		Student st=new Student(101,"rahul");
		Student st1=new Student(102,"prajit");
		
		
		System.out.println(st);
		System.out.println(st1);

		
	}

}
