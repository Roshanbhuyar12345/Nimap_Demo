package com.generics;

public class Runner {

	public static void main(String[] args) {
		Compony comp = new Compony();

		Consumer c = new Consumer(comp);

		Producer p = new Producer(comp);

		c.start();
		p.start();

	}

}
