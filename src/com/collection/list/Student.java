package com.collection.list;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
	
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
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", rollno=" + rollno + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Student o) {
       
    if(this.rollno>o.rollno)
    	return 1;
    else 
    	return -1;

	}
	
	

}
