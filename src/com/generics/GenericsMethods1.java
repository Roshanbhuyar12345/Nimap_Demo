package com.generics;

public class GenericsMethods1 {

	public <T> void disp(Integer i) {

		System.out.println(i);

	}

	public static void main(String[] args) {

		GenericsMethods1 v = new GenericsMethods1();

		v.disp(457);
		v.disp(101);
		v.disp(102);
		v.disp(103);
		v.disp(104);

	}

}
