package com.raystec.interview.thread;

public class HelloWithoutThread {

	public String threadName;
	
	public HelloWithoutThread(String threadname){
		this.threadName=threadname;
	}
	
	public void run(){
	for (int i = 0; i < 10; i++) {
		System.out.println(i+" Hello Thread "+threadName);
	}
	}
	
}
