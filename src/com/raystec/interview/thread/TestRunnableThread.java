package com.raystec.interview.thread;

public class TestRunnableThread {
public static void main(String[] args) {
	
	Thread t1=new Thread(new HelloWithRunnableThread("Kanchan"));
	Thread t2=new Thread(new HelloWithRunnableThread("Rahul"));
	Thread t3=new Thread(new HelloWithRunnableThread("Ritesh"));
	
	t1.start();
	t2.start();
	t3.start();
	
}
}

