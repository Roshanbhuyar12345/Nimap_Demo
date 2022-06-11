package com.arrays;

import java.util.Arrays;

public class Sorting_array {
	public static void main(String[] args) {
		int a[] = { 2, 5, 7, 4, 6, 9, 4, 3, 21, 5, 4, 88, 5, 65, 52, 5, 2, 5 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
