package com.mrthod.overloading;

public class Vararrg {

	void show(int a) {
		System.out.println("int method");
	}
	void show(int... a) {
		System.out.println("varargg");
	}
	public static void main(String[] args) {
		Vararrg vrr=new Vararrg();
		//vrr.show(2);
		vrr.show(20,5,2,4,2,5,1);
	}
}
