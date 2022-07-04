package com.multithreading;

public class TestRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i=0;i<=20;i++) {
			
			try{
				Thread.sleep(1000);
			}catch (Exception e) {
			}
			
			if(i%2==0) {
				System.out.println("even num " +" "+ i);
			}
			else 
				System.out.println("odd no "+ " "+ i);
		}
	}

	public static void main(String[] args) {
		
		TestRunnable tr=new TestRunnable();
		 Thread t1=new Thread(tr);
		 t1.start();
		 try{t1.join();}catch (Exception e) {}
		 Thread t2=new Thread(tr);
         t2.start();
		
		
	}
	
	
	
}
