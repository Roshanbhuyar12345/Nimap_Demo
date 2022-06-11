package com.strings_eg;

public class Reverse_string {
	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(str);
		System.out.println(rev);
		if (str.equals(rev))
			System.out.println("string is pallindrom");
		else
			System.out.println("not pallindrom");

	}

}
