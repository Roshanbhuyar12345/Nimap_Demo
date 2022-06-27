package com.logicbuilding;

import java.util.Scanner;

public class MultiOfTwoElementWithoutUsingMultiplicationOperator {
	public static void main(String[] args) {

		int a, b;

		System.out.println("enter two values");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value");
		a = sc.nextInt();
		System.out.println("enter second value");
		b = sc.nextInt();
		int res = 0;
		for (int i = 1; i <= a; i++) {
			
			res = res + b;

		}

		System.out.println(res);
	}

}
