package com.collection.arraylist;

import java.util.ArrayList;

public class Student {
	
	private int id;
	private int rollno;
	private String name;
	
	
	Student(){
		
	}


	public Student(int id, int rollno, String name) {
		super();
		this.id = id;
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", rollno=" + rollno + ", name=" + name + "]";
	}
	
	

}
