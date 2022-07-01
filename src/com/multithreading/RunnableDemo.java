package com.multithreading;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("even num is " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}

	}

}
