package com.basics_programs;

import java.util.Scanner;

public class Interview_Que {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str1 = "roshan gopalrao bhuyar";
		String str = sc.nextLine();
		String[] st = str1.split(" ");

		if (str1.equalsIgnoreCase(str)) {

			String firstName = st[0];
			String middleName = st[1];
			String lastName = st[2];
			System.out.println("Middle Name>>" + middleName);
			System.out.println("First Name>>" + firstName);
			System.out.println("lLastName>>" + lastName);
		System.out.println("valid Arguments");
		}
		
		
		else {
			System.out.println("invalid arguments");
		}
		
		
		
		
		}

	}


