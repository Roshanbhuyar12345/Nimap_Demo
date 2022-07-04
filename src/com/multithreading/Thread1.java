package com.multithreading;

public class Thread1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i + " " + "Start Thread");
		}
	}

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();

		// The join() method of thread class waits for a thread to die.
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
		}
		// after dieing first thread second and fourth thread will be started
		Thread1 t2 = new Thread1();
		t2.start();
		Thread1 t3 = new Thread1();
		t3.start();
	}
}
