package com.strings_eg;

public class Str_4 {
	public static void main(String[] args) {
		// WAP to print consonant
		int count = 0;
		String s = "hi welcome to india";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u')
				System.out.println("this is consonant " + s.charAt(i));
			else
				System.out.println("these are vovels " + s.charAt(i));
		}

	}

}
