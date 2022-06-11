package com.encapsullation;

import java.util.Scanner;

public class Employee {
	private String name;
	private int age;
	private long sal;
	private int extraHr;
	private int hourlywage=500;
	
	Employee(String name){
		this.name=name;
		

	}
	public void display()
	{
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		age=sc.nextInt();
		sal=sc.nextLong();
		extraHr=sc.nextInt();
	    
	}
	public void wagages() {
		long total=sal+(extraHr*hourlywage);
		System.out.println(total);
	}
	
	}
	
	
	


