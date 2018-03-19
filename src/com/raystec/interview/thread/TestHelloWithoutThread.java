package com.raystec.interview.thread;

public class TestHelloWithoutThread {
public static void main(String[] args) {
	HelloWithoutThread t1=new HelloWithoutThread("Kanchan");
	HelloWithoutThread t2=new HelloWithoutThread("Rahul");
	HelloWithoutThread t3=new HelloWithoutThread("Ritesh");
	
	t1.run();
	t2.run();
	t3.run();
	
	//In normal case (without thread), 
	//until first statement t1.run()execution is finished control can not be transferred to next statement t2.run().
	//That shows sequential execution.
}
}
