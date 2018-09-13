package com.threads;

class ThreadA extends Thread
{
	public void run() {
		System.out.println("Calling ThreadA");
		ThreadB tb = new ThreadB();
		tb.start();
	}
	
}

class ThreadB extends Thread
{
	public void run() {
		System.out.println("Calling ThreadB");
		ThreadA tb = new ThreadA();
		tb.start();
	}
	
	
}

/**
 *  Creating Thread Deadlock
 * @author raghu
 *
 */

public class ThreadDeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ta.start();
		tb.start();
		
		
		

	}

}
