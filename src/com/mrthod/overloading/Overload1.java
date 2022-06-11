package com.mrthod.overloading;

public class Overload1 {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public float add(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {
		Overload1 overload = new Overload1();
		System.out.println(overload.add(1.5f, 45.21f));
		System.out.println(overload.add(24, 70));
		System.out.println(overload.add(24, 40, 10));
	}
}
