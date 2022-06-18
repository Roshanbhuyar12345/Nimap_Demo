package com.logicbuilding;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter to check string is pallindom or not");
		String s = sc.nextLine();
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
