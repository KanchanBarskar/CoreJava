package com.raystec.interview.thread;

public class TestHelloWithThread {
	
	//This method is executed in a default 'Main' thread  
public static void main(String[] args) {
	
	 //Main thread created threee child thread t1,t2 and t3
	HelloWithThread t1=new HelloWithThread("Kanchan");
	HelloWithThread t2=new HelloWithThread("Rahul");
	HelloWithThread t3=new HelloWithThread("Ritesh");
	
	//thread start
	t1.start();
	t2.start();
	t3.start();
	
	
	//main itself a thread
	for (int i = 0; i < 10; i++) {
		System.out.println(i+" I am main thread");
	}
}
}
