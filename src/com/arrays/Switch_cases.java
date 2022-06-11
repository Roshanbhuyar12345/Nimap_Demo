package com.arrays;

import java.util.Scanner;

public class Switch_cases {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		switch(a) {
		case 1:
		{
			System.out.println("1st switch case is here ");
			break;
			
		}
		case 2:
		{
			System.out.println("here is 2nd switch statment");
            break;			
		}
		case 3:
		{
			System.out.println("here is 3rd switch statment");
			break;
		}
		default:
		{
			System.out.println("please pass the valid argument");
		}
		}
		
		
	}

}
