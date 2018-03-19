package com.raystec.interview.thread;

public class PlayerThread extends Thread {

	public PlayerThread(ThreadGroup tg,String name){
		super(tg,name);
	}
	
	public void run(){
		for (int i = 1; i <= 10; i++) {
			System.out.println(getName()+" played match "+i);
		}
	}
	
	public static void main(String[] args) {
		ThreadGroup team=new ThreadGroup("Team India");
		
		PlayerThread t1=new PlayerThread(team, "Virat");
		PlayerThread t2=new PlayerThread(team, "Sachin");
		PlayerThread t3=new PlayerThread(team, "Rahul");
		PlayerThread t4=new PlayerThread(team, "Sourabh");
		
		t1.start();t2.start();t3.start();t4.start();
		
		System.out.println("Thread group information");
		
		System.out.println("Name : "+team.getName());
		
		System.out.println("Parent Group : "+team.getParent());
		
		System.out.println("Active thread : "+team.activeCount());
		
		System.out.println("Active subgroups : "+team.activeGroupCount());
		
	}
}
