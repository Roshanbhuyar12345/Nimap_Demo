package com.multithreading;

public class ThreadDemo1 extends Thread {
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
			Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		ThreadDemo1 t=new ThreadDemo1();
		RunnableDemo r=new RunnableDemo();
		Thread th=new Thread(r); 
		
		t.start();
		th.start();
		/*System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);*/
	}
	
	
}
