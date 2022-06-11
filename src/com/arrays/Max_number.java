package com.arrays;

public class Max_number {
	public static void main(String[] args) {
		int a[] = { 1, 25, 4, 86, 87, 65, 98, 4 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					temp = a[j];
				}
				}
		        }
		for (int i = 0; i < 1; i++) {
			System.out.println(a[i]);
		}


	}

}
