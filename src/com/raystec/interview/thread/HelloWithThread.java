package com.raystec.interview.thread;

public class HelloWithThread extends Thread {
	public String threadName;
	
	public HelloWithThread(String threadName){
		this.threadName=threadName;
	}

	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println(i+" Hello Thread "+threadName);
		}
	}
}
