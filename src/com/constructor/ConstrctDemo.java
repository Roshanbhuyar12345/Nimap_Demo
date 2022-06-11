package com.constructor;

public class ConstrctDemo {
	int id;
	double salary;
	String name;
	static String compony = "nimap";

	public ConstrctDemo() {

	}

	public ConstrctDemo(int id) {
		this.id = id;
		System.out.println(id + " : " + salary + " : " + name + ": " + compony);
       
	}

	public ConstrctDemo(int id, double salary) {
		this.id = id;
		this.salary = salary;
		System.out.println(id + " : " + salary + " : " + name + ": " + compony);

	}

	public ConstrctDemo(int id, double salary, String name) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		System.out.println(id + " : " + salary + " : " + name + ": " + compony);

	}

	
}
