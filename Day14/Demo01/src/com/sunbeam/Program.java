package com.sunbeam;

import java.util.concurrent.Delayed;

public class Program {

	private static void delaye(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		class MyThread extends Thread {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("My " + i);
					delaye(1000);
				}
			}
		}

		MyThread th1 = new MyThread();

		class YourThread implements Runnable {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("you " + i);
					delaye(1000);
				}

			}

		}

		Thread th2 = new Thread(new YourThread());

		th1.start();
		th2.start();

		for (int i = 1; i <= 10; i++) {
			System.out.println("main" + i);
			delaye(1000);

		}

	}

}
