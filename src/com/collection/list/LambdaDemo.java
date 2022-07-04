package com.collection.list;

import java.util.ArrayList;

public class LambdaDemo {

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(55);
		arr.add(1457);
		arr.add(7894);
		arr.add(7489);
		arr.add(213);
		// lambda expression
		arr.forEach(i -> System.out.println(i));

	}

}
