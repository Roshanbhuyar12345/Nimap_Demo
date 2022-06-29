package com.generics;

public class GenericsMethods {

	// write generic before the written types
	public static <T> void add(T[] inputArray) {

		for (T element : inputArray) {
			System.out.println(element);
		}

	}

	public static void main(String[] args) {

		Integer[] a = { 1, 5, 8, 3, 5, 2, 5 };

		Float[] f = { 1.1f, 2.2f, 3.3f, 4.4f, 5.5f };
		System.out.println("1st type");
		add(a);
		System.out.println("2nd type");
		add(f);

	}

}
