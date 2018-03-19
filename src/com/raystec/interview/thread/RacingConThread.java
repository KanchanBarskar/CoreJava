package com.raystec.interview.thread;

public class RacingConThread extends Thread{

	public static Account data=new Account();
	
	public RacingConThread(String name){
		super(name);
	}
	
	public void run(){
		for (int i = 0; i < 10; i++) {
			data.deposit(getName(), 1000);
		}
	}
	
	public static void main(String[] args) {
		RacingConThread t1=new RacingConThread("Kanchan");
		RacingConThread t2=new RacingConThread("Rahul");
		
		t1.start();
		t2.start();
	}
}
