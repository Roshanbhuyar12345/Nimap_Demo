package com.collection.set;

public class Cricketer {

	String name;
	int run;
	public Cricketer(String name, int run) {
		super();
		this.name = name;
		this.run = run;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", run=" + run + "]";
	}
	
	

}
