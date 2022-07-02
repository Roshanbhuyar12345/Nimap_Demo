package com.generics;

public class Consumer extends Thread {

	Compony c;

	public Consumer(Compony c) {
		this.c = c;
	}

	@Override
	public void run() {

		while (true) {
			try {
				this.c.consume_item();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}

}
