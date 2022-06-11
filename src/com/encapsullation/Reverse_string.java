package com.encapsullation;

public class Reverse_string {
	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev))
			System.out.println("string pallindrom");
		else
			System.out.println("not pallindrom");

	}

}
