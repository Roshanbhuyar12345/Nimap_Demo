package com.multithreading;

public class RunMethod extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread() + " " + i);
		}
	}

	// in the above example 1, when t1 completes its task then t2 and t3 starts
	// execution.
	public static void main(String[] args) {

		RunMethod t1 = new RunMethod();
		RunMethod t2 = new RunMethod();
		RunMethod t3 = new RunMethod();

		t1.start();

		try {
			t1.run();
		} catch (Exception e) {
		}

		t2.start();
		try {
			t2.run();
		} catch (Exception e) {

		}

		t3.start();
	}

}
