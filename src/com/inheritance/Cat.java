package com.inheritance;

public class Cat extends Pet {

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void Speak() {
     System.out.println(this.name +" said meowww, age is :- " + this.age);		
	}

}
