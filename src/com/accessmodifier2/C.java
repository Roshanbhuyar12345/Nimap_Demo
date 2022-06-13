package com.accessmodifier2;

import com.accessmodifier1.A;

public class C extends A {
	public static void main(String[] args) {
		C obj = new C();

		obj.show();
		obj.show("roshan");
		//here we can not access private and default access modifier methodds as well as variables
		System.out.println(obj.a = 10);
		System.out.println(obj.c = 20);
	}

}
