package com.generics;

public class Producer extends Thread {

	Compony c;

	public Producer(Compony c) {
		this.c = c;
	}

	@Override
	public void run() {
		int i = 1;
		while (true) {
			try {
				this.c.produce_item(i);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(000);
			} catch (Exception e) {
			}
			i++;

		}

	}

}
