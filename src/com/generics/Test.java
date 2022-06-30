package com.generics;

public class Test {

	static <T> void diplayElement(T element) {

		System.out.println(element.getClass().getName() + "  " + element);
	}

	public static void main(String[] args) {

		Test test = new Test();

		test.diplayElement(101);
		test.diplayElement("hello");
		test.diplayElement(10.2);
		test.diplayElement(824725455252277L);
	}

}
