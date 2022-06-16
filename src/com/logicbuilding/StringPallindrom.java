package com.logicbuilding;

public class StringPallindrom {
	public static void main(String[] args) {

		String s = "madam";
		String rev = " ";

		char a[] = s.toCharArray();
		for (int i = s.length(); i>=0; i--) {
			rev = rev+a[i];
		}
		System.out.println(rev);
		
		if (rev.equals(s))
			System.out.println("pallindrom");
		else
			System.out.println("not pallindro");

	}
}
