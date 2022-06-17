package com.logicbuilding;

public class MunOfTwoNumOfSumIsHundrede {
	public static void main(String[] args) {

		int a[] = { 80, 60, 10, 50, 30, 100, 0, 50 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 100) {
					System.out.println("sum is " + a[i] + " : " + a[j]);
				}
			}
		}

	}
}
