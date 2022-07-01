package com.multithreading;

public class ThreadDemo extends Thread {

	@Override
	public void run() {
		try {
		System.out.println( Thread.currentThread().getName());
		}catch(Exception e) {
			System.out.println("exception is catch");
		}
	}
	
	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<=n;i++) {
		ThreadDemo obj=new ThreadDemo();
		obj.start();
		}
	}
	
}
