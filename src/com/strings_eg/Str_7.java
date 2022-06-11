package com.strings_eg;

import java.util.Scanner;

public class Str_7 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter string :-");
		String str=sc.next();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch + " ");
		}

	}

}
