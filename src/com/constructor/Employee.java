package com.constructor;

public class Employee {
	int id;
	long sal;
	String name;
	int Exthr;
	int hrlyrate=520;
	
	static String cname="nimap info";
	
	public Employee(int id, long sal,String name) {
		this.id=id;
		this.sal=sal;
		this.name=name;
		System.out.println(id +" : "+sal+" : "+name +" :"+cname);
		
	}
    
	public void calculateWage9(int Exthr) {
		
		sal=sal+(Exthr*hrlyrate);
		System.out.println(sal);
		
	}
  

	
}
