package com.constructor;

public class Sanket {
	int a;
	int b;
	String s;

	Sanket() {
		System.out.println("default");
	}

	Sanket(int a) {
		System.out.println("one arg");
	}

	Sanket(int a, int b) {
		System.out.println("two arg");
	}

	Sanket(int a, int b, String s) {
		System.out.println("three args");
	}

	public static void main(String[] args) {
		Sanket s = new Sanket(1, 2, "sanket");
	}
}
