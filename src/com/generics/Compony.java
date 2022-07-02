package com.generics;

public class Compony  {

	int n;
	boolean f=false;
	
	synchronized public void produce_item(int n) throws Exception {
		
		if(f) {
			wait();
		}
		this.n=n;
		System.out.println("item is produced"+this.n);
		 f=true;
		 notify();
		
		
	}
	
	synchronized public void consume_item() throws Exception {
		if(!f) {
			wait();
		}
		System.out.println("itom is consumed"+this.n);
		 
		f=false;
		notify();
	}
	
}
