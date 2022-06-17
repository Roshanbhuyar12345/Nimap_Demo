package com.logicbuilding;

public class FabonacciSeries {
	public static void main(String[] args) {

		int a1 = 0;
		int a2 = 1;
		int n=10;
		System.out.println(a1+"\n"+a2);
		for (int i = 2; i <= n; i++) {

			int a3=a1+a2;
			System.out.println(a3);
	
			a1=a2;
			a2=a3;
			
		}

	}

}
