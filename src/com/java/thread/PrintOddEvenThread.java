package com.java.thread;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintOddEvenThread {
	List<Integer> list = List.of(1, 2, 5, 4, 7, 6);
	int index = 0;

	public synchronized void printEvenNumbers() {

		while (index < list.size()) {
			while (list.get(index)%2 != 0) {

				try {
					wait(); // Wait for odd thread to print
				} catch (InterruptedException e) {
					// TODO: handle exception
					Thread.currentThread().interrupt();
				}

			}
			System.out.println("Even Number: " + list.get(index));
			index++;
			notifyAll();

		}

	}

	public synchronized void printOddNumbers() {

		while (index < list.size()) {
			while (list.get(index)%2== 0) {

				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					Thread.currentThread().interrupt();
				}
			}
			System.out.println("Odd Number: " + list.get(index));
			index++;
			notifyAll();
		}

	}

	public static void main(String[] args) {

		PrintOddEvenThread printer = new PrintOddEvenThread();

		//Thread oddThread = new Thread((Runnable) printer::printOddNumbers);

		//Thread evenThread = new Thread((Runnable) printer::printEvenNumbers);

//		oddThread.start();
//		evenThread.start();
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(printer::printOddNumbers);
		executorService.submit(printer::printEvenNumbers);
		
		executorService.shutdown();

	}
}
