package com.inheritancedemo;

import java.util.Scanner;

public class Bank {
	int id;
	String name;
	long acc_no;
	
	public Bank(int id,String name,long acc_no) {
		this.id=id;
		this.name=name;
		this.acc_no=acc_no;
		System.out.println(id+" : "+ name+" : "+acc_no);
	}

	
	
	void Account() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter deposite amt");
		int dept=sc.nextInt();
		System.out.println("enter withdwal amt");
		int withd=sc.nextInt();
		if(dept>=0&&withd>=0) {
			
			int amount=dept-withd;
			
			System.out.println("amount is  :-"+amount);
		}
	    else{
	    	
		System.out.println("please enter positive integer");	
	    	}
		
	}
	

}
