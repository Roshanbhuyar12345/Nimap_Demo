package com.logicbuilding;

public class ReverseString {
	public static void main(String[] args) {
		
		String s="hello world";
		
		char t[]=s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(t[i]);
		}
		
		
	}
	

}
