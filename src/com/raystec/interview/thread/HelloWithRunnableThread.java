package com.raystec.interview.thread;

public class HelloWithRunnableThread implements Runnable{

	public String threadName;
	public HelloWithRunnableThread(String threadName){
		this.threadName=threadName;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" Hello Runnable Thread "+threadName);
		}
		
	}
}
