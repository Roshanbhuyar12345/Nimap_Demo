package com.arrays;

public class Even_Odd {
 public static void main(String[] args) {
	int a[]= {1,3,5,78,4,6,5,4,8,4,485,5,84,5,5};
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0)
			System.out.println("even number is "+ a[i]);
		else 
			System.out.println("odd number is "+a[i]);
	}
}
}
