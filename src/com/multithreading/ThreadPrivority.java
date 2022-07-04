package com.multithreading;

public class ThreadPrivority extends Thread {

	@Override
	public void run() {
       //single operation by multiple thread
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			}catch (Exception e) {
				
			}
			System.out.println("thread "+Thread.currentThread().getName()+" "+"Hiiiii");
		}
	}
	
	
	public static void main(String[] args) {
		
		ThreadPrivority t1=new ThreadPrivority();
		ThreadPrivority t2=new ThreadPrivority();
		ThreadPrivority t3=new ThreadPrivority();

		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
