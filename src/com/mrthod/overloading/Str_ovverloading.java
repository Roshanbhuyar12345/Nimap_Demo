package com.mrthod.overloading;

public class Str_ovverloading {

	int id;
	int no;
	String name;

	public String Emp(String name) {
		return name;
	}

	public int Emp(int id, int no) {
		return id + no;
	}

	public void Emp(int id, int no, String name) {
		System.out.println(no + " : " + id + " : " + name);
	}

	public static void main(String[] args) {

		Str_ovverloading str = new Str_ovverloading();

		System.out.println(str.Emp("roshan"));

		System.out.println(str.Emp(101, 10230));
		
		str.Emp(30, 12520, "prajit");

	}
}
