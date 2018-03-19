package com.raystec.interview.basic;

public class Memory2 {
public static void main(String[] args) {
	Memory m1=new Memory();
	Memory m2=new Memory();
	m1=m2;
	System.gc();
	//Runtime.getRuntime().gc();
}
}
