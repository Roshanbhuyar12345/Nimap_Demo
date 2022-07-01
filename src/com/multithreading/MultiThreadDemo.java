package com.multithreading;

public class MultiThreadDemo extends Thread {

	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 7, 8, 4, 5, 7, 8, 4, 5, 11, 5, 8, 22, 5 };

	@Override
	public void run() {

		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] * 2;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

			System.out.println(Thread.currentThread().getName() + "  " + a[i]);
		}

	}

	public static void main(String[] args) {

		MultiThreadDemo t = new MultiThreadDemo();
		t.start();

	}

}
