package com.inheritance;

public class Dog extends Pet {

	public Dog(String name, int age) {
		super(name, age);
			}

	@Override
	public void Speak() {
		System.out.println(this.name + " said barks, age is :-" +this.age);
		
	}
	 
	
	
	
}
