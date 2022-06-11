package com.basics_programs;

public class While_Loop {
	public static void main(String[] args) {

		int n = 1, sum = 0;
		while (n <= 10) {
			sum = sum + n;
			n++;
		}
		System.out.println(sum);
	}
}
