package com.raystec.interview.thread;

public class DaemonThread extends Thread{
	
public void run(){
	System.out.println("Daemon Thread started "+Thread.currentThread());
	
	while(true){
		try {
			Thread.sleep(500);
			System.out.println("DAemon thread : Woke up again");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public static void main(String[] args) {
	System.out.println("main started");
	
	DaemonThread t=new DaemonThread();
	t.setDaemon(true);
	t.start();
	
	try {
		Thread.sleep(3000);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Leaving main thread");
	System.out.println("Now JVM will exit");
}
}
