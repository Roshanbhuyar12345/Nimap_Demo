package com.logicbuilding;

public class ReverseString {
	public static void main(String[] args) {

		String s = "MADAM";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			char t = s.charAt(i);
			rev = rev + t;

		}

		if (s.equals(rev)) {
			System.out.println(s + " is a palindrome string");

		} else {
			System.out.println(s + " is not palindrome String");

		}

	}

}
