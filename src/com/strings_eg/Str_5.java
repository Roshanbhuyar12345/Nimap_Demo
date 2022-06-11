package com.strings_eg;

public class Str_5 {
	
	public static void main(String[] args) {

		String str = "helloworld ";

		char[] a = str.toCharArray();

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j])

					System.out.println("dupli char is " + a[j]);

			}

		}

	}
}