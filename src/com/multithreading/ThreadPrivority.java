package com.multithreading;

public class ThreadPrivority extends Thread {

	@Override
	public void run() {
       
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				
			}
			System.out.println("thread "+Thread.currentThread().getName()+" "+i);
		}
	}
	
	
	public static void main(String[] args) {
		
		ThreadPrivority t1=new ThreadPrivority();
		ThreadPrivority t2=new ThreadPrivority();
		ThreadPrivority t3=new ThreadPrivority();

		System.out.println("first thread 1 :-"+t1.MAX_PRIORITY);
		System.out.println("second thread :-"+t2.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
