package com.multithreading;

public class ThreadNaming extends Thread {

	@Override
	public void run() {
      
		System.out.println(Thread.currentThread().getName()+" "+"start task 01");
		
	}
	
	public static void main(String[] args) {
		
		ThreadNaming tn=new ThreadNaming();
		tn.setName("roshan");
		//System.out.println(tn.getName());
		tn.start();
	}
	
}
