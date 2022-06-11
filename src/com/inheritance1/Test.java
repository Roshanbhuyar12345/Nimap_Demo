package com.inheritance1;

public class Test {
	public static void main(String[] args) {
		VeryAdvCal cal=new VeryAdvCal();
		
		
		//multilevel inheritance is achieve here
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(20, 10));
		System.out.println(cal.mul(5, 4));
		System.out.println(cal.div(50,5));
		
	}

}
