package com.raystec.interview.thread;

public class PriorityThread extends Thread {

	public PriorityThread(String threadName){
		super(threadName);
	}
	public void run(){
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName()+" P = "+getPriority());
		}
	}
	
	public static void main(String[] args) {
		PriorityThread t1=new PriorityThread("Thread A");
		PriorityThread t2=new PriorityThread("Thread B");
		PriorityThread t3=new PriorityThread("Thread C");
		
		t1.setPriority(3);
		t2.setPriority(1);
		
		//t3 has the default priority 5
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
